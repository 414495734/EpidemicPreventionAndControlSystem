package com.example.demo.service.impl;

import com.example.demo.config.DateUtil;
import com.example.demo.mapper.NucleicacidCheckMapper;
import com.example.demo.mapper.PupilMapper;
import com.example.demo.pojo.NucleicacidCheck;
import com.example.demo.pojo.Pupil;
import com.example.demo.service.NucleicacidCheckService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

/**
 * 核算记录
 */
@Service
public class NucleicacidCheckServiceImpl implements NucleicacidCheckService {

    //医院业务ID默认
    private int hid = 1;

    @Autowired
    NucleicacidCheckMapper nucleicacidCheckMapper;

    @Autowired
    PupilMapper pupilMapper;

    @Override
    public PageInfo<NucleicacidCheck> selectNucleicacidCheckPage(int pageNum, int pageSize, String pCardLike) {
        /*分页数,每页几条*/
        PageHelper.startPage(pageNum, pageSize);
        NucleicacidCheck n = new NucleicacidCheck();
        pCardLike = pCardLike==null ? "%%" : "%"+pCardLike+"%";
        n.setFile1(pCardLike);
//        if(pCardLike!=null&&pCardLike!=""){
//            n.setFile1(pCardLike);
//        }
        /*查询所有核算记录信息*/
        List<NucleicacidCheck> nucleicacidChecks = nucleicacidCheckMapper.selectNucleicacidCheckPage(n);
        /*封装到pageInfo*/
        PageInfo<NucleicacidCheck> nucleicacidCheckPageInfo = new PageInfo<>(nucleicacidChecks);
        return nucleicacidCheckPageInfo;
    }


    @Override
    public List<NucleicacidCheck> WeiXinselectNucleicacidCheckPage(String pCardLike) {
        NucleicacidCheck n = new NucleicacidCheck();
        pCardLike = pCardLike==null ? "%%" : "%"+pCardLike+"%";
        n.setFile1(pCardLike);
//        if(pCardLike!=null&&pCardLike!=""){
//            n.setFile1(pCardLike);
//        }
        /*查询所有核算记录信息*/
        List<NucleicacidCheck> nucleicacidChecks = nucleicacidCheckMapper.selectNucleicacidCheckPage(n);
        return nucleicacidChecks;
    }


    /*添加 核算记录信息*/
    @Override
    public int addNucleicacidCheck(NucleicacidCheck nucleicacidCheck) {
        Pupil pupil = pupilMapper.selectPupilByCard(nucleicacidCheck.getFile1());
        nucleicacidCheck.setActive("1");
        Date date=new Date();
        nucleicacidCheck.setPid(pupil.getPid());
        nucleicacidCheck.setPtype("1");
        nucleicacidCheck.setHid(hid);
        nucleicacidCheck.setResult("未检测");
        nucleicacidCheck.setCheckDate(date);
        nucleicacidCheck.setCreateDate(date);
        nucleicacidCheck.setLastDate(date);
        return nucleicacidCheckMapper.insertSelective(nucleicacidCheck);
    }

    /*修改 核算记录信息*/
    @Override
    public int updateNucleicacidCheck(NucleicacidCheck nucleicacidCheck) {
        Date date=new Date();
        nucleicacidCheck.setLastDate(date);
        return nucleicacidCheckMapper.updateByPrimaryKeySelective(nucleicacidCheck);
    }

    @Override
    public int getToDayCheckCount() {
        NucleicacidCheck n = new NucleicacidCheck();
        Date date = new Date();
        Date dayStartTime = DateUtil.getDayStartTime(date);
        Date dayEndTime = DateUtil.getDayEndTime(date);
        n.setCreateDate(dayStartTime);
        n.setLastDate(dayEndTime);
        return nucleicacidCheckMapper.getToDayCheckCount(n);
    }
}
