package com.example.demo.controller;
import com.example.demo.pojo.Doctor;
import com.example.demo.service.DoctorService;
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
 * 医生控制层
 */
//@RequestMapping("/doctor")
@Log4j
@Controller
public class DoctorController {


    @Autowired
    DoctorService doctorService;
    @ApiOperation("查询医生人员信息")
    @ResponseBody
    @RequestMapping("/selectDoctor")
    public List<Doctor> selectDoctor(){
        log.info("查询医生人员信息");
        return doctorService.selectDoctor();
    }

    /*跳转 医生管理界面*/
    @ApiOperation("跳转 医生管理界面")
    @RequestMapping("/doctorTable")
    @Secured("ROLE_hospital")
    public String doctorTable(){
        log.info("跳转 医生管理界面");
        return "doctorTable";
    }

    /*查询 医生所有信息(分页)*/
    @ApiOperation("查询 医生所有信息(分页)")
    @ResponseBody
    @RequestMapping("/selectDoctorPage")
    public PageInfo<Doctor> selectDoctorPage(int pageNum, int pageSize, String dNameLike,String dCardLike,String hid){
        log.info("查询 医生所有信息(分页)");
        PageInfo<Doctor> doctorPageInfo = doctorService.selectDoctorPage(pageNum, pageSize ,dNameLike, dCardLike, hid);
        return doctorPageInfo;
    }

    /*添加 医生信息*/
    @ApiOperation("添加 医生信息")
    @ResponseBody
    @RequestMapping("/addDoctor")
    public int addDoctor(Doctor doctor){
        log.info("添加 医生信息");
        return doctorService.addDoctor(doctor);
    }

    /*修改 医生信息*/
    @ResponseBody
    @ApiOperation("修改 医生信息")
    @RequestMapping("/updateDoctor")
    public int updateDoctor(Doctor doctor){
        log.info("修改 医生信息");
        return doctorService.updateDoctor(doctor);
    }

    /*删除 医生信息*/
    @ApiOperation("删除 医生信息")
    @ResponseBody
    @RequestMapping("/deleteDoctor")
    public int deleteDoctor(Doctor doctor){
        log.info("删除 医生信息");
        return doctorService.deleteDoctor(doctor);
    }
}
