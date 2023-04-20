package com.example.demo.service.impl;

import com.example.demo.config.DateUtil;
import com.example.demo.mapper.TubeCodeMapper;
import com.example.demo.pojo.NucleicacidCheck;
import com.example.demo.pojo.TubeCode;
import com.example.demo.service.TubeCodeService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

/**
 * 采样管上面贴的二维码
 */
@Service
public class TubeCodeServiceImpl implements TubeCodeService {

    @Autowired
    TubeCodeMapper tubeCodeMapper;

    @Override
    public PageInfo<TubeCode> selectTubeCodePage(int pageNum, int pageSize, String codeLike) {
        /*分页数,每页几条*/
        PageHelper.startPage(pageNum, pageSize);
        TubeCode t = new TubeCode();
        codeLike = codeLike==null ? "%%" : "%"+codeLike+"%";
        t.setCode(codeLike);
        /*查询所有二维码信息*/
        List<TubeCode> tubeCodes = tubeCodeMapper.selectTubeCodePage(t);
        /*封装到pageInfo*/
        PageInfo<TubeCode> tubeCodePageInfo = new PageInfo<>(tubeCodes);
        return tubeCodePageInfo;
    }

    @Override
    public int addTubeCode(int number) {
        Date date = new Date();
        Date dayStartTime = DateUtil.getDayStartTime(date);
        Date dayEndTime = DateUtil.getDayEndTime(date);
        TubeCode t = new TubeCode();
        t.setStatus("未使用");
        t.setActive("1");
        t.setCreateDate(dayStartTime);
        t.setLastDate(dayEndTime);
        for(int i = 0;i<number;i++){
            int count = tubeCodeMapper.getTodayCreateTubecodeNumber(t);
            String newCode = "JZXX"+DateUtil.getDateYear(date)+DateUtil.getDateMonthString(date)+DateUtil.getDateDayString(date)+String.format("%06d", count+1);
            t.setCode(newCode);
            tubeCodeMapper.insertSelective(t);
        }
        return number;
    }

    @Override
    public int updateTubeCode(TubeCode tubeCode) {
        Date date=new Date();
        tubeCode.setLastDate(date);
        tubeCode.setStatus("已使用");
        return tubeCodeMapper.updateByPrimaryKeySelective(tubeCode);
    }
}
