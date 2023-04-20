package com.example.demo.mapper;

import com.example.demo.pojo.College;
import com.example.demo.pojo.Pupil;
import com.example.demo.pojo.Team;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface CollegeMapper {


    /*获取院表信息*/
    public List<College> selectCollege();


    public List<College> selectCollegeInfoList();
    /*查询学院所有信息(分页)*/
    public List<College> selectCollegePage(String cnameLike);
    /*添加学院信息*/
    public int addCollege(College college);
    /*修改学院信息*/
    int updateCollege(College college);
    /*删除学院信息*/
    int deleteCollege(College college);
}
