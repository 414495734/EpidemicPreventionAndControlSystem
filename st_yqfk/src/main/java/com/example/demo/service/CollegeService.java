package com.example.demo.service;

import com.example.demo.pojo.College;
import com.example.demo.pojo.Pupil;
import com.example.demo.pojo.Team;
import com.github.pagehelper.PageInfo;

import java.util.List;

public interface CollegeService {


    public List<College> selectCollege();

    /*查询学院所有信息(分页)*/
    public PageInfo<College> selectCollegePage(int pageNum, int pageSize, String cnameLike);

    /*添加 学院信息*/
    public int addCollege(College college);
    /*修改 学院信息*/
    int updateCollege(College college);
    /*删除 学院信息*/
    int deleteCollege(College college);
}
