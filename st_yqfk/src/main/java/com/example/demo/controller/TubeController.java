package com.example.demo.controller;
import com.example.demo.pojo.Pupil;
import com.example.demo.pojo.Tube;
import com.example.demo.service.TubeService;
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
 * 采样管控制层
 */
//@RequestMapping("/tube")
@Log4j
@Controller
public class TubeController {

    @Autowired
    TubeService tubeService;

    /*跳转 采样管管理界面*/
    @ApiOperation("跳转 采样管管理界面")
    @Secured("ROLE_hospital")
    @RequestMapping("/tubeTable")
    public String tubeTable(){
        log.info("跳转 采样管管理界面");
        return "tubeTable";
    }

    /*查询 采样管所有信息(分页)*/
    @ApiOperation("查询 采样管所有信息(分页)")
    @ResponseBody
    @RequestMapping("/selectTubePage")
    public PageInfo<Tube> selectTubePage(int pageNum, int pageSize, String codeLike, String hid, String did){
        log.info("查询 采样管所有信息(分页)");
        PageInfo<Tube> tubePageInfo = tubeService.selectTubePage(pageNum, pageSize ,codeLike, hid, did);
        return tubePageInfo;
    }

    /*添加 采样管信息*/
    @ApiOperation("添加 采样管信息")
    @ResponseBody
    @RequestMapping("/addTube")
    public String addTube(Tube tube){
        log.info("添加 采样管信息");
        return tubeService.addTube(tube);
    }

    /*修改 采样管信息*/
    @ResponseBody
    @ApiOperation("修改 采样管信息")
    @RequestMapping("/updateTube")
    public int updateTube(Tube tube){
        log.info("修改 采样管信息");
        return tubeService.updateTube(tube);
    }

}
