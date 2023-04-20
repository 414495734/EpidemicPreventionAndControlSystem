package com.example.demo.controller;

import com.example.demo.pojo.Hospital;
import com.example.demo.service.HospitalService;
import com.github.pagehelper.PageInfo;
import io.swagger.annotations.ApiOperation;
import lombok.extern.log4j.Log4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.annotation.Secured;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

//@RequestMapping("/hospital")
@Log4j
@Controller
public class HospitalController {


    @Autowired
    HospitalService hospitalService;

    @ApiOperation("查询医院信息")
    @ResponseBody
    @RequestMapping("/selectHospital")
    public List<Hospital> selectHospital(){
        log.info("查询医院信息");
        return hospitalService.selectHospital();
    }

    /*跳转医院管理界面*/
    @ApiOperation("跳转医院管理界面")
    @RequestMapping("/hospitalTable")
    @Secured("ROLE_hospital")
    public String hospitalTable(){
        log.info("跳转医院管理界面");
        return "hospitalTable";
    }

    /*查询医院所有信息(分页)*/
    @ApiOperation("查询医院所有信息(分页)")
    @ResponseBody
    @RequestMapping("/selectHospitalPage")
    public PageInfo<Hospital> selectHospitalPage(int pageNum, int pageSize, String hnameLike){
        log.info("查询医院所有信息(分页)");
        PageInfo<Hospital> hospitalPageInfo = hospitalService.selectHospitalPage(pageNum, pageSize ,hnameLike);
        return hospitalPageInfo;
    }

    /*添加 医院信息*/
    @ApiOperation("添加 医院信息")
    @ResponseBody
    @RequestMapping("/addHospital")
    public int addHospital(Hospital hospital){
        log.info("添加 医院信息");
        return hospitalService.addHospital(hospital);
    }

    /*修改 医院信息*/
    @ApiOperation("修改 医院信息")
    @ResponseBody
    @RequestMapping("/updateHospital")
    public int updateHospital(Hospital hospital){
        log.info("修改 医院信息");
        return hospitalService.updateHospital(hospital);
    }

    /*删除 医院信息*/
    @ApiOperation("删除 医院信息")
    @ResponseBody
    @RequestMapping("/deleteHospital")
    public int deleteHospital(Hospital hospital){
        log.info("删除 医院信息");
        return hospitalService.deleteHospital(hospital);
    }

}
