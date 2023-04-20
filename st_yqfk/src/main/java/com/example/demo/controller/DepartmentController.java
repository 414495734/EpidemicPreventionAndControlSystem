package com.example.demo.controller;

import com.example.demo.pojo.College;
import com.example.demo.pojo.Department;
import com.example.demo.service.CollegeService;
import com.example.demo.service.DepartmentService;
import com.github.pagehelper.PageInfo;
import io.swagger.annotations.ApiOperation;
import lombok.extern.log4j.Log4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.annotation.Secured;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.logging.Logger;

/**
 * 部门控制层
 */
//@RequestMapping("/department")
@Log4j
@Controller
public class DepartmentController {


    @Autowired
    DepartmentService departmentService;

    @ApiOperation("查询部门信息")
    @ResponseBody
    @RequestMapping("/selectDepartment")
    public List<Department> selectDepartment(){
      log.info("查询部门信息");

        return departmentService.selectDepartment();
    }

    /*跳转部门管理界面*/
    @ApiOperation("跳转部门管理界面")
    @Secured("ROLE_department")
    @RequestMapping("/departmentTable")
    public String departmentTable(){
        log.info("跳转部门管理界面");
        return "departmentTable";
    }

    /*查询部门所有信息(分页)*/
    @ApiOperation("查询部门所有信息(分页)")
    @ResponseBody
    @RequestMapping("/selectDepartmentPage")
    public PageInfo<Department> selectDepartmentPage(int pageNum, int pageSize, String dNameLike){
        log.info("查询部门所有信息(分页)");
        PageInfo<Department> departmentPageInfo = departmentService.selectDepartmentPage(pageNum, pageSize ,dNameLike);
        return departmentPageInfo;
    }

    /*添加 部门信息*/
    @ApiOperation("添加部门信息")
    @ResponseBody
    @RequestMapping("/addDepartment")
    public int addDepartment(Department department){
        log.info("添加部门信息");
        return departmentService.addDepartment(department);
    }

    /*修改 部门信息*/
    @ApiOperation("修改 部门信息")
    @ResponseBody
    @RequestMapping("/updateDepartment")
    public int updateDepartment(Department department){
        log.info("修改 部门信息");
        return departmentService.updateDepartment(department);
    }

    /*删除 部门信息*/
    @ApiOperation("删除 部门信息")
    @ResponseBody
    @RequestMapping("/deleteDepartment")
    public int deleteDepartment(Department department){
        log.info("删除 部门信息");
        return departmentService.deleteDepartment(department);
    }
}
