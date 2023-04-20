package com.example.demo.controller;

import com.example.demo.pojo.System;
import com.example.demo.service.CollegeService;
import com.example.demo.service.SystemService;
import com.github.pagehelper.PageInfo;
import io.swagger.annotations.ApiOperation;
import lombok.extern.log4j.Log4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.annotation.Secured;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
@Log4j
@Controller
public class SystemController {

    @Autowired
    SystemService systemService;


    /*根据 院id 查询系信息*/
    @ApiOperation("根据 院id 查询系信息")
    @ResponseBody
    @RequestMapping("/selectSystem")
    public List<System> selectSystem(int yid){
        log.info("根据 院id 查询系信息");
        java.lang.System.out.println(yid);
        return systemService.selectSystem(yid);
    }

    @ApiOperation("查询系信息")
    @ResponseBody
    @RequestMapping("/selectSystemList")
    public List<System> selectSystemList(){
        log.info("查询系信息");
        return systemService.selectSystemList();
    }

    /*跳转院系管理界面*/
    @ApiOperation("跳转院系管理界面")
    @RequestMapping("/systemTable")
    @Secured("ROLE_college")
    public String systemTable(){
        log.info("跳转院系管理界面");
        return "systemTable";
    }

    /*查询院系所有信息(分页)*/
    @ApiOperation("查询院系所有信息(分页)")
    @ResponseBody
    @RequestMapping("/selectSystemPage")
    public PageInfo<System> selectSystemPage(int pageNum, int pageSize, String snameLike, String cId){
        log.info("查询院系所有信息(分页)");
        PageInfo<System> systemPageInfo = systemService.selectSystemPage(pageNum, pageSize ,snameLike,cId);
        return systemPageInfo;
    }

    /*添加院系信息*/
    @ApiOperation("添加院系信息")
    @ResponseBody
    @RequestMapping("/addSystem")
    public int addSystem(System system){
        log.info("添加院系信息");
        return systemService.addSystem(system);
    }

    /*修改院系信息*/
    @ApiOperation("修改院系信息")
    @ResponseBody
    @RequestMapping("/updateSystem")
    public int updateSystem(System system){
        log.info("修改院系信息");
        return systemService.updateSystem(system);
    }

    /*删除院系信息*/
    @ApiOperation("删除院系信息")
    @ResponseBody
    @RequestMapping("/deleteSystem")
    public int deleteSystem(System system){
        log.info("删除院系信息");
        return systemService.deleteSystem(system);
    }

}
