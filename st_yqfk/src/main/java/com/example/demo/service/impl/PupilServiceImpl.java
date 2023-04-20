package com.example.demo.service.impl;

import com.example.demo.mapper.PupilMapper;
import com.example.demo.pojo.Pupil;
import com.example.demo.service.PupilService;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PupilServiceImpl implements PupilService {

    @Autowired
    PupilMapper pupilMapper;
  /*查询人的总数*/
    @Override
    public int dataCollegePupilCount() {
        int count = pupilMapper.dataCollegePupilCount();
        return count;
    }
 /*根据 班级id 查询人员信息*/
    @Override
    public PageInfo<Pupil> selectPupil(int bid ,int pageNum,int pageSize ) {
        PageInfo<Pupil> pupilPageInfo;
          if(bid==0){

              PageHelper.startPage(pageNum,pageSize);
              /*查询所有学生信息*/
              List<Pupil> pupils = pupilMapper.selectPupilAll();
              /*封装到pageInfo*/
              pupilPageInfo = new PageInfo<>(pupils);
          }else{
              PageHelper.startPage(pageNum,pageSize);
              List<Pupil> pupils = pupilMapper.selectPupil(bid);
               pupilPageInfo = new PageInfo<>(pupils);
          }


        return pupilPageInfo;
    }
   /*查询人员信息*/
    @Override
    public PageInfo<Pupil> selectPupilPage(int pageNum, int pageSize) {
        /*分页数,每页几条*/
         PageHelper.startPage(pageNum, pageSize);
         /*查询所有学生信息*/
        List<Pupil> pupils = pupilMapper.selectPupilAll();
        /*封装到pageInfo*/
        PageInfo<Pupil> pupilPageInfo = new PageInfo<>(pupils);
        return pupilPageInfo;
    }
   /*添加学生信息*/
    @Override
    public int addPupil(Pupil pupil) {
        pupil.setActive("1");
        Pupil pupil1 = pupilMapper.selectPupilByCard(pupil.getPcard());
        if(pupil1!=null){
            return pupilMapper.updatePupil(pupil);
        }
        return pupilMapper.addPupil(pupil);
    }

    @Override
    public int updatePupil(Pupil pupil) {
        pupil.setActive("1");
        return pupilMapper.updatePupil(pupil);
    }

    @Override
    public int deletePupil(int pid) {
        return pupilMapper.deletePupil(pid);
    }

    @Override
    public int addIntPupil(List<Pupil> list) {
        for (Pupil a:
             list) {
             a.setActive("1");
            System.out.println(a);
        }

        return pupilMapper.addIntPupil(list);
    }

    @Override
    public int getCount() {
        return pupilMapper.getCount();
    }


}
