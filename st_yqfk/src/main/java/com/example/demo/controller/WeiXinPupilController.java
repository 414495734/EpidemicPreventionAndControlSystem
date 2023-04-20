package com.example.demo.controller;

import com.example.demo.pojo.College;
import com.example.demo.pojo.Pupil;
import com.example.demo.service.CollegeService;
import com.example.demo.service.WeiXinPupilService;
import com.example.demo.util.QRCodeUtil;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.github.pagehelper.PageInfo;
import io.swagger.annotations.ApiOperation;
import lombok.extern.log4j.Log4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AnonymousAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.util.FastByteArrayOutputStream;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import springfox.documentation.spring.web.json.Json;

import javax.imageio.ImageIO;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.security.Principal;
import java.util.Base64;
import java.util.HashMap;
import java.util.List;

@Log4j
@Controller
public class WeiXinPupilController {


    @Autowired
    WeiXinPupilService weiXinPupilService;


    /*根据学生证 电话 名字查询是否密接和是否确诊*/
    @ApiOperation("微信端根据学生证 电话 名字查询是否密接和是否确诊")
    @ResponseBody
    @RequestMapping("/pCardSelect")
    public Pupil pCardSelect(Pupil pupil) {
        log.info("微信端根据学生证 电话 名字查询是否密接和是否确诊");
        return weiXinPupilService.pCardSelect(pupil);
    }





    /*根据性别身份证手机号返回二维码*/
    @ApiOperation("根据性别身份证手机号返回二维码")
    @ResponseBody
    @RequestMapping("/returnImg")
    public String returnImg(String pname, String pcard, String pphone) {
        log.info("根据性别身份证手机号返回二维码");
        // 二维码内容
        Pupil pupil = new Pupil();
        pupil.setPname(pname);
        pupil.setPcard(pcard);
        pupil.setPphone(pphone);
        String s = null;

        ObjectMapper objectMapper = new ObjectMapper();
        try {
            s = objectMapper.writeValueAsString(pupil);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        System.out.println(s);
        // 生成二维码并指定宽高
        BufferedImage generate = null;
        try {
            generate = QRCodeUtil.getBufferImage(s, 200, 200);
        } catch (Exception e) {
            e.printStackTrace();
        }
        // 转换流信息写出
        FastByteArrayOutputStream os = new FastByteArrayOutputStream();
        try {
            ImageIO.write(generate, "jpg", os);
        } catch (IOException e) {
            return e.getMessage();
        }
        //如果二维码要在前端显示需要转成Base64
        String base64 = "data:image/jpg;base64,";
        String encode = Base64.getEncoder().encodeToString(os.toByteArray());
        return base64 + encode;

    }


    @ApiOperation("小程序端添加信息")
    @ResponseBody
    @RequestMapping("/WXinsertPupil")
    public String insertPupil(String pname, String psex, String pcard, String plocation, boolean touch, String pphone, Integer tid) {
        Pupil pupil = new Pupil();
        if (touch == false) {
            pupil.setTouch("是");
        } else {
            pupil.setTouch("否");
        }
        pupil.setInfectionSource("否");
        pupil.setDiagnosis("否");

        pupil.setPsex(psex);
        pupil.setPname(pname);
        pupil.setPcard(pcard);
        pupil.setPlocation(plocation);
        pupil.setPphone(pphone);
        pupil.setTid(tid);
        pupil.setActive("1");
        log.info("小程序端添加信息");
        int i = weiXinPupilService.insertPupil(pupil);
        if (i == 1) {
            return "添加成功";
        } else {
            return "添加失败";
        }

    }


    @RequestMapping("/Test2")
    public String pCardSelect2(HttpServletRequest request, HttpServletResponse response) {
        response.setHeader("Access-Control-Allow-Origin", "*");
        response.setHeader("Cache-Control", "no-cache");

        return "Test2";
    }


    @ResponseBody
    @RequestMapping("/Test")
    public String pCardSelect(HttpServletRequest request, HttpServletResponse response) {
        response.setHeader("Access-Control-Allow-Origin", "*");
        response.setHeader("Cache-Control", "no-cache");

        String currentUser = "";
        Object principal = SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        if(principal instanceof UserDetails){
            currentUser = ((UserDetails) principal).getUsername();
        }else {
            currentUser = principal.toString();
        }
        return "配太华以为刀兮、长四读以为佩. ----"+currentUser;



    }
}