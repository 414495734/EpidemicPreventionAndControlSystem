package com.example.demo.controller;

import com.example.demo.pojo.NucleicacidCheck;
import com.example.demo.service.NucleicacidCheckService;
import com.github.pagehelper.PageInfo;
import io.swagger.annotations.ApiOperation;
import lombok.extern.log4j.Log4j;
import org.codehaus.jackson.map.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.io.IOException;
import java.util.List;

@Log4j
@Controller
public class WeiXinNucleicacidCheckController {

    @Autowired
    NucleicacidCheckService nucleicacidCheckService;


    /*微信查询核算记录所有信息*/
    @ApiOperation("微信查询核算记录所有信息")
    @ResponseBody
    @RequestMapping("/WeiXinselectNucleicacidCheckPage")
    public String selectNucleicacidCheckPage( String pCardLike){
        String s=null;
        log.info("微信查询核算记录所有信息");
        List<NucleicacidCheck> nucleicacidCheckPageInfo = nucleicacidCheckService.WeiXinselectNucleicacidCheckPage(pCardLike);
        ObjectMapper objectMapper = new ObjectMapper();
        try {
            s = objectMapper.writeValueAsString(nucleicacidCheckPageInfo);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return s;
    }
}
