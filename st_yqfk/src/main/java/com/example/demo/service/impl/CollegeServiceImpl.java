package com.example.demo.service.impl;

import com.example.demo.mapper.CollegeMapper;
import com.example.demo.pojo.College;
import com.example.demo.pojo.Pupil;
import com.example.demo.pojo.Team;
import com.example.demo.service.CollegeService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;

@Service
public class CollegeServiceImpl implements CollegeService {

    @Autowired
    CollegeMapper collegeMapper;

    SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.getDefault());
    @Override
    public List<College> selectCollege() {
        return collegeMapper.selectCollege();
    }

    /*查询学院所有信息(分页)*/
    @Override
    public PageInfo<College> selectCollegePage(int pageNum, int pageSize,String cnameLike) {
        /*分页数,每页几条*/
        PageHelper.startPage(pageNum, pageSize);
        cnameLike = cnameLike==null ? "%%" : "%"+cnameLike+"%";
        /*查询所有学院信息*/
        List<College> colleges = collegeMapper.selectCollegePage(cnameLike);
        System.out.println(colleges);
        /*封装到pageInfo*/
        PageInfo<College> collegePageInfo = new PageInfo<>(colleges);
        return collegePageInfo;
    }

    /*添加学院信息*/
    @Override
    public int addCollege(College college) {
        college.setActive("1");
        Date date=new Date();
        String time=simpleDateFormat.format(date);
        college.setCreate_data(time);
        college.setLast_data(time);
        return collegeMapper.addCollege(college);
    }

    /*修改 学院信息*/
    @Override
    public int updateCollege(College college) {
        Date date=new Date();
        String time=simpleDateFormat.format(date);
        college.setLast_data(time);
        return collegeMapper.updateCollege(college);
    }
    /*删除 学院信息*/
    @Override
    public int deleteCollege(College college) {
        college.setActive("0");
        Date date=new Date();
        String time=simpleDateFormat.format(date);
        college.setLast_data(time);
        return collegeMapper.deleteCollege(college);
    }
}
