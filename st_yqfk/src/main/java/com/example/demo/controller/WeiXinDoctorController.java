package com.example.demo.controller;

import com.example.demo.pojo.Doctor;
import com.example.demo.service.DoctorService;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class WeiXinDoctorController {

    @Autowired
    DoctorService doctorService;



    /*根据手机号查询工作人员信息*/
    @ResponseBody
    @RequestMapping("/wxDoctorPhoneSelect")
    public String wxDoctorPhoneSelect(String dphone ){

        Doctor doctor = doctorService.wxDoctorPhoneSelect(dphone);
        if(doctor!=null){
            ObjectMapper objectMapper = new ObjectMapper();

            String s=null;
            try {
                s = objectMapper.writeValueAsString(doctor);
            } catch (JsonProcessingException e) {
                e.printStackTrace();
            }

            return s;
        }else{
            return "没有此人";
        }

    }

}
