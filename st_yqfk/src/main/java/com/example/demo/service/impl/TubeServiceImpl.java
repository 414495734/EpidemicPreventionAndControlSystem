package com.example.demo.service.impl;

import com.example.demo.mapper.*;
import com.example.demo.pojo.*;
import com.example.demo.service.TubeService;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import lombok.extern.log4j.Log4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/**
 * 采样管
 */
@Log4j
@Service
public class TubeServiceImpl implements TubeService {

    @Autowired
    TubeMapper tubeMapper;

    @Autowired
    TubeCodeMapper tubeCodeMapper;


    @Autowired
    DoctorMapper doctorMapper;

    @Autowired
    PupilMapper pupilMapper;

    @Autowired
    NucleicacidCheckMapper nucleicacidCheckMapper;

    SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.getDefault());


    /*查询采样管所有信息(分页)*/
    @Override
    public PageInfo<Tube> selectTubePage(int pageNum, int pageSize, String codeLike,String hid,String did) {
        /*分页数,每页几条*/
        PageHelper.startPage(pageNum, pageSize);
        codeLike = codeLike==null ? "%%" : "%"+codeLike+"%";
        Tube t = new Tube();
        t.setCode(codeLike);
        if(hid!=null&&hid!=""){
            if(Integer.parseInt(hid)!=0 || Integer.parseInt(hid)>0) {
                t.setHid(Integer.parseInt(hid));
            }
        }
        if(did!=null&&did!=""){
            if(Integer.parseInt(did)!=0 || Integer.parseInt(did)>0) {
                t.setDid(Integer.parseInt(did));
            }
        }
        /*查询所有采样管信息*/
        List<Tube> tubes = tubeMapper.selectTubePage(t);
        /*封装到pageInfo*/
        PageInfo<Tube> tubePageInfo = new PageInfo<>(tubes);
        return tubePageInfo;
    }

    /*添加采样管信息*/
    @Override
    public String addTube(Tube tube) {
        try {
            List<Tube>  tubeList = tubeMapper.selectCodeListByCode(tube.getCode());
            if(tubeList.size()>0){
                return "失败,采样管已被使用";
            }else{
                Doctor d = doctorMapper.selectByPrimaryKey(tube.getDid());
                   log.info("查询到的医生信息"+d);
                Date date=new Date();
                tube.setHid(d.getHid());
                tube.setDid(d.getDid());
                tube.setResult("未检测");
                tube.setActive("1");
                tube.setSamplingDate(date);
                tube.setCreateDate(date);
                tube.setLastDate(date);
                int i = tubeMapper.insertSelective(tube);
                log.info("添加管信息是否成功:"+i);
                Tube t = tubeMapper.selectByCode(tube.getCode());
                 log.info("返回管信息对象:"+t);

                List<Pupil> list = tube.getListPuil();
                for (Pupil  p :list) {
                    NucleicacidCheck check = new NucleicacidCheck();
                    Pupil pupil = pupilMapper.selectPupilByCard(p.getPcard());
                    log.info("通过身份证查询的学生信息:"+pupil);
                    check.setTid(t.getTid());
                    check.setActive("1");
                    check.setPid(pupil.getPid());
                    check.setPtype("1");
                    check.setHid(d.getHid());
                    check.setDid(d.getDid());
                    check.setResult("未检测");
                    check.setSamplingDate(date);
                    check.setCreateDate(date);
                    check.setLastDate(date);
                    int i1 = nucleicacidCheckMapper.insertSelective(check);
                    log.info("核酸采样信息是否添加成功:--->核酸记录---"+i1);
                }

                TubeCode c = tubeCodeMapper.selectByCode(tube.getCode());
                c.setStatus("已使用");
                c.setLastDate(date);
                int i2 = tubeCodeMapper.updateByPrimaryKeySelective(c);
                log.info("核酸采样信息是否添加成功--->二维码信息:"+c+"---修改条数"+i2);
                return "成功";
            }
        } catch (Exception e) {
            e.printStackTrace();
            return "失败";
        }
    }

    /*修改 采样管信息*/
    @Override
    public int updateTube(Tube tube) {
        try {
            Date date=new Date();
            tube.setLastDate(date);
            tube.setCheckDate(date);
            tubeMapper.updateByPrimaryKeySelective(tube);

            NucleicacidCheck check = new NucleicacidCheck();
            check.setTid(tube.getTid());
            check.setResult(tube.getResult());
            check.setLastDate(date);
            check.setCheckDate(date);
            nucleicacidCheckMapper.updateCheckResultDateByTid(check);

            if(tube.getResult().equals("阳性")){//阳性去修改信息
                List<NucleicacidCheck> listInfo = nucleicacidCheckMapper.getNucleicacidCheckListByInfo(check);
                for (NucleicacidCheck c:listInfo) {
//                    if(c.getPtype().equals('1')){
                    //默认修改学生信息
                    Pupil p = new Pupil();
                    p.setPid(c.getPid());
                    p.setTouch("是");
                    p.setDiagnosis("是");
                    p.setInfectionSource("校内感染");
                    p.setPstart_time(simpleDateFormat.format(date));
                    pupilMapper.updateByPrimaryKeySelective(p);
//                    }
                }
            }
            return 1;
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }
    /*删除 采样管信息*/
    @Override
    public int deleteTube(Tube tube) {
        tube.setActive("0");
        Date date=new Date();
        tube.setLastDate(date);
        return tubeMapper.updateByPrimaryKeySelective(tube);
    }

    /*修改 采样管状态*/
    @Override
    public String updateTubeStatus(String code,String result) {
        try {
            Tube t = tubeMapper.selectByCode(code);
            if(t!=null&&t.getTid()>0){
                Date date=new Date();
                t.setCheckDate(date);
                t.setResult(result);
                t.setLastDate(date);
                tubeMapper.updateByPrimaryKeySelective(t);

                NucleicacidCheck check = new NucleicacidCheck();
                check.setTid(t.getTid());
                check.setResult(result);
                check.setLastDate(date);
                check.setCheckDate(date);
                int number = nucleicacidCheckMapper.updateCheckResultDateByTid(check);
                return "成功";
            }else{
                return "失败,二维码信息不存在!";
            }
        } catch (Exception e) {
            e.printStackTrace();
            return "失败";
        }
    }
}
