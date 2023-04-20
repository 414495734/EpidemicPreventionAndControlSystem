package com.example.demo.service.impl;

import com.example.demo.mapper.WeiXinPupilMapper;
import com.example.demo.pojo.Pupil;
import com.example.demo.service.WeiXinPupilService;
import lombok.extern.log4j.Log4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Log4j
@Service
public class WeiXinPupilServiceImpl implements WeiXinPupilService {


    @Autowired
    WeiXinPupilMapper weiXinPupilMapper;

    @Override
    public Pupil pCardSelect(Pupil pupil) {
        return weiXinPupilMapper.pCardSelect(pupil);
    }

    @Override
    public int insertPupil(Pupil pupil) {
        Pupil pupil1 = weiXinPupilMapper.pCardSelect(pupil);
         if(pupil1!=null){
              log.info("已存在");
             System.out.println("已存在");
           return  weiXinPupilMapper.updetePupil(pupil);
         }
        log.info("不存在");
        System.out.println("不存在");
        return weiXinPupilMapper.insertPupil(pupil);

    }
}
