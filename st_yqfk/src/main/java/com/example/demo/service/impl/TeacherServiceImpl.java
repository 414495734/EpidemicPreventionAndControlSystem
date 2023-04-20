package com.example.demo.service.impl;


import com.example.demo.mapper.TeacherMapper;
import com.example.demo.pojo.Teacher;
import com.example.demo.service.TeacherService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

/**
 * 教师
 */
@Service
public class TeacherServiceImpl implements TeacherService {

    @Autowired
    TeacherMapper teacherMapper;

    @Override
    public List<Teacher> selectTeacher() {
        return teacherMapper.selectTeacher();
    }

    /*查询教师所有信息(分页)*/
    @Override
    public PageInfo<Teacher> selectTeacherPage(int pageNum, int pageSize, String tSnLike,String tNameLike,String tCardLike,String hdId) {
        /*分页数,每页几条*/
        PageHelper.startPage(pageNum, pageSize);
        tNameLike = tNameLike==null ? "%%" : "%"+tNameLike+"%";
        Teacher t = new Teacher();
        t.setTName(tNameLike);
        t.setTCard(tCardLike);
        if(tSnLike!=null&&tSnLike!=""){
            if(Integer.parseInt(tSnLike)!=0 || Integer.parseInt(tSnLike)>0) {
                t.setTSn(Integer.parseInt(tSnLike));
            }
        }
        if(tCardLike!=null&&tCardLike!=""){
                t.setTCard(tCardLike);
        }
        if(hdId!=null&&hdId!=""){
            if(Integer.parseInt(hdId)!=0 || Integer.parseInt(hdId)>0) {
                t.setHdId(Integer.parseInt(hdId));
            }
        }
        /*查询所有教师信息*/
        List<Teacher> teachers = teacherMapper.selectTeacherPage(t);
        /*封装到pageInfo*/
        PageInfo<Teacher> teacherPageInfo = new PageInfo<>(teachers);
        return teacherPageInfo;
    }

    /*添加教师信息*/
    @Override
    public int addTeacher(Teacher teacher) {
        teacher.setActive("1");
        Date date=new Date();
        teacher.setCreate_date(date);
        teacher.setLast_date(date);
        return teacherMapper.addTeacher(teacher);
    }

    /*修改 教师信息*/
    @Override
    public int updateTeacher(Teacher teacher) {
        Date date=new Date();
        teacher.setLast_date(date);
        return teacherMapper.updateTeacher(teacher);
    }
    /*删除 教师信息*/
    @Override
    public int deleteTeacher(Teacher teacher) {
        teacher.setActive("0");
        Date date=new Date();
        teacher.setLast_date(date);
        return teacherMapper.deleteTeacher(teacher);
    }

    @Override
    public int getCount() {
        return teacherMapper.getCount();
    }
}
