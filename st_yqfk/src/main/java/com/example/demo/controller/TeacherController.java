package com.example.demo.controller;
import com.example.demo.pojo.Teacher;
import com.example.demo.service.TeacherService;
import com.github.pagehelper.PageInfo;
import io.swagger.annotations.ApiOperation;
import lombok.extern.log4j.Log4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.annotation.Secured;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * 教师控制层
 */
//@RequestMapping("/teacher")
@Log4j
@Controller
public class TeacherController {


    @Autowired
    TeacherService teacherService;


    @ApiOperation("查询教师信息")
    @ResponseBody
    @RequestMapping("/selectTeacher")
    public List<Teacher> selectTeacher(){
        log.info("查询教师信息");
        return teacherService.selectTeacher();
    }

    /*跳转 教师管理界面*/
    @ApiOperation("跳转 教师管理界面")
    @RequestMapping("/teacherTable")
    @Secured("ROLE_department")
    public String teacherTable(){
        log.info("跳转 教师管理界面");
        return "teacherTable";
    }

    /*查询 教师所有信息(分页)*/
    @ApiOperation("查询 教师所有信息(分页)")
    @ResponseBody
    @RequestMapping("/selectTeacherPage")
    public PageInfo<Teacher> selectTeacherPage(int pageNum, int pageSize, String tSnLike,String tNameLike,String tCardLike,String hdId){
        log.info("查询 教师所有信息(分页)");
        PageInfo<Teacher> departmentPageInfo = teacherService.selectTeacherPage(pageNum, pageSize ,tSnLike, tNameLike, tCardLike, hdId);
        return departmentPageInfo;
    }

    /*添加 教师信息*/
    @ApiOperation("添加 教师信息")
    @ResponseBody
    @RequestMapping("/addTeacher")
    public int addTeacher(Teacher teacher){
        log.info("添加 教师信息");
        return teacherService.addTeacher(teacher);
    }

    /*修改 教师信息*/
    @ApiOperation("修改 教师信息")
    @ResponseBody
    @RequestMapping("/updateTeacher")
    public int updateTeacher(Teacher teacher){
        log.info("修改 教师信息");
        return teacherService.updateTeacher(teacher);
    }

    /*删除 教师信息*/
    @ApiOperation("删除 教师信息")
    @ResponseBody
    @RequestMapping("/deleteTeacher")
    public int deleteTeacher(Teacher teacher){
        log.info("删除 教师信息");
        return teacherService.deleteTeacher(teacher);
    }
}
