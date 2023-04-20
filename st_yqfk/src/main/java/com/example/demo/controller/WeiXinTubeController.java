package com.example.demo.controller;

import com.alibaba.fastjson.JSON;
import com.example.demo.pojo.Pupil;
import com.example.demo.pojo.Tube;
import com.example.demo.service.TubeService;
import io.swagger.annotations.ApiOperation;
import lombok.extern.log4j.Log4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Log4j
@Controller
public class WeiXinTubeController {

    @Autowired
    TubeService tubeService;



    /*添加 采样管信息*/
    @ApiOperation("微信添加采样管信息")
    @ResponseBody
    @RequestMapping("/WxaddTube")
    public String addTube(String code,Integer did,Integer hid,String listPuil){
        List<Pupil> myObjectList = JSON.parseArray(listPuil , Pupil.class);
        log.info("微信添加采样管信息--->>>"+code+"---"+did+"-----"+hid+"------"+myObjectList);
        Tube tube = new Tube();
          tube.setDid(did);
          tube.setCode(code);
          tube.setHid(hid);
          tube.setListPuil(myObjectList);
        return tubeService.addTube(tube);
    }

    /*修改 采样管信息*/
    @ApiOperation("微信添加采样管信息")
    @ResponseBody
    @RequestMapping("/WxupdateTubeStatus")
    public String updateTubeStatus(String code,String result){
        log.info("微信修改采样管信息--->>>二维码:"+code+"---->核酸结果:"+result);
        return tubeService.updateTubeStatus(code,result);
    }
}
