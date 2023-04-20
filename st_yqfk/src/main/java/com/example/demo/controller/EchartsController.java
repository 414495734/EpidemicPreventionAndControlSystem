package com.example.demo.controller;

import com.example.demo.pojo.ResponseJzxxEcharts;
import com.example.demo.service.NucleicacidCheckService;
import com.example.demo.service.PupilService;
import com.example.demo.service.TeacherService;
import io.swagger.annotations.ApiOperation;
import lombok.extern.log4j.Log4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 统计图控制层
 */
//@RequestMapping("/echarts")
@Log4j
@Controller
public class EchartsController {

    @Autowired
    PupilService pupilService;

    @Autowired
    TeacherService teacherService;

    @Autowired
    NucleicacidCheckService nucleicacidCheckService;


    /*跳转山西省统计图页面*/
    @ApiOperation("跳转统计图页面")
    @RequestMapping("/cityEchartsTable")
    public String cityEchartsTable(HttpServletRequest request, HttpServletResponse response){
        response.setHeader("Access-Control-Allow-Origin", "*");
        response.setHeader("Cache-Control","no-cache");
        log.info("跳转统计图页面");
        return "cityEchartsTable";
    }

    /*跳转学校统计图页面*/
    @ApiOperation("跳转学校统计图页面")
    @RequestMapping("/jzxxEchartsTable")
    public String jzxxEchartsTable(HttpServletRequest request, HttpServletResponse response){
        response.setHeader("Access-Control-Allow-Origin", "*");
        response.setHeader("Cache-Control","no-cache");
        log.info("跳转学校统计图页面");
        return "jzxxEchartsTable";
    }

    /*学校当天核酸人数(已做/未做)统计*/
    @ApiOperation("学校当天核酸人数(已做/未做)统计")
    @RequestMapping("/jzxxEchartsInfo")
    @ResponseBody
    public List<ResponseJzxxEcharts> jzxxEchartsInfo(HttpServletRequest request, HttpServletResponse response){
        response.setHeader("Access-Control-Allow-Origin", "*");
        response.setHeader("Cache-Control","no-cache");
        log.info("学校当天核酸人数(已做/未做)统计");
        int pupilCount = pupilService.getCount();
        int teacherCount = teacherService.getCount();
        int toDayCheckCount = nucleicacidCheckService.getToDayCheckCount();
        int count = pupilCount+teacherCount;
        int toDaySurplusCheckCount = count-toDayCheckCount;
        List<ResponseJzxxEcharts> list = new ArrayList<ResponseJzxxEcharts>();
        ResponseJzxxEcharts e1 = new ResponseJzxxEcharts();
        ResponseJzxxEcharts e2 = new ResponseJzxxEcharts();
        e1.setName("已做人数");e1.setValue(toDayCheckCount);
        e2.setName("未做人数");e2.setValue(toDaySurplusCheckCount);
        list.add(e1);
        list.add(e2);
        return list;
    }



}
