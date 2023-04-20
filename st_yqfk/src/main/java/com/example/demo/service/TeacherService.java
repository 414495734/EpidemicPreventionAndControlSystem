package com.example.demo.service;

import com.example.demo.pojo.Department;
import com.example.demo.pojo.Teacher;
import com.github.pagehelper.PageInfo;

import java.util.List;

/**
 * 教师
 */
public interface TeacherService {

    /*获取教师列表*/
    public List<Teacher> selectTeacher();
    /*查询教师所有信息(分页)*/
    public PageInfo<Teacher> selectTeacherPage(int pageNum, int pageSize, String tSnLike,String tNameLike,String tCardLike,String hdId);
    /*添加教师信息*/
    public int addTeacher(Teacher teacher);
    /*修改教师信息*/
    int updateTeacher(Teacher teacher);
    /*删除教师信息*/
    int deleteTeacher(Teacher teacher);

    int getCount();
}
