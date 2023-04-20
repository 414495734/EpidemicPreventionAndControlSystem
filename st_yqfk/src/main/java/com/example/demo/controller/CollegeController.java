package com.example.demo.controller;

import com.example.demo.pojo.College;
import com.example.demo.service.CollegeService;
import com.github.pagehelper.PageInfo;
import io.swagger.annotations.ApiOperation;
import io.swagger.models.Info;
import lombok.extern.log4j.Log4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.annotation.Secured;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
@Log4j
@Controller
public class CollegeController {


    @Autowired
    CollegeService collegeService;

    @ApiOperation("根据选中的 院id 查系信息")
    @ResponseBody
    @RequestMapping("/selectCollege")
    public List<College> selectCollege(){
        /*根据选中的 院id 查系信息*/
        log.info("根据选中的 院id 查系信息");
        return collegeService.selectCollege();
    }

    /*跳转学院管理界面*/
    @ApiOperation("跳转学院管理界面")
    @Secured("ROLE_college")
    @RequestMapping("/collegeTable")
    public String collegeTable(){
        log.info("根据选中的 院id 查系信息");
        return "collegeTable";
    }

    /*查询学院所有信息(分页)*/
    @ApiOperation("查询学院所有信息(分页)")
    @ResponseBody
    @RequestMapping("/selectCollegePage")
    public PageInfo<College> selectCollegePage(int pageNum, int pageSize, String cnameLike){
        log.info("查询学院所有信息(分页)");
        PageInfo<College> collegePageInfo = collegeService.selectCollegePage(pageNum, pageSize ,cnameLike);
        return collegePageInfo;
    }

    /*添加 学院信息*/
    @ApiOperation("添加 学院信息")
    @ResponseBody
    @RequestMapping("/addCollege")
    public int addCollege(College college){
        log.info("添加 学院信息");
        return collegeService.addCollege(college);
    }

    /*修改 学院信息*/
    @ApiOperation("修改 学院信息")
    @ResponseBody
    @RequestMapping("/updateCollege")
    public int updateCollege(College college){
        log.info("修改 学院信息");
        return collegeService.updateCollege(college);
    }

    /*删除 学院信息*/
    @ApiOperation("删除 学院信息")
    @ResponseBody
    @RequestMapping("/deleteCollege")
    public int deleteCollege(College college){
        log.info("删除 学院信息");
        return collegeService.deleteCollege(college);
    }

}
