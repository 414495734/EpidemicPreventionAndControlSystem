package com.example.demo.mapper;


import com.example.demo.pojo.Teacher;
import org.apache.ibatis.annotations.Mapper;
import java.util.List;

/**
 * 教师
 */
@Mapper
public interface TeacherMapper {
    /*获取教师列表*/
    public List<Teacher> selectTeacher();
    /*查询教师所有信息(分页)*/
    public List<Teacher> selectTeacherPage(Teacher teacher);
    /*添加教师信息*/
    public int addTeacher(Teacher teacher);
    /*修改教师信息*/
    int updateTeacher(Teacher teacher);
    /*删除教师信息*/
    int deleteTeacher(Teacher teacher);

    int getCount();
}
