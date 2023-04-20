package com.example.demo.controller;
import com.example.demo.pojo.NucleicacidCheck;
import com.example.demo.service.NucleicacidCheckService;
import com.example.demo.service.PupilService;
import com.github.pagehelper.PageInfo;
import io.swagger.annotations.ApiOperation;
import lombok.extern.log4j.Log4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.annotation.Secured;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


/**
 * 核算记录控制层
 */
//@RequestMapping("/nucleicacidCheck")
@Log4j
@Controller
public class NucleicacidCheckController {

    @Autowired
    NucleicacidCheckService nucleicacidCheckService;

    @Autowired
    PupilService pupilService;


    /*跳转 核算记录管理界面*/
    @ApiOperation("跳转 核算记录管理界面")
    @RequestMapping("/nucleicacidCheckTable")
    @Secured("ROLE_hospital")
    public String nucleicacidCheckTable(){
        log.info("跳转 核算记录管理界面");
        return "nucleicacidCheckTable";
    }

    /*查询 核算记录所有信息(分页)*/
    @ApiOperation("查询 核算记录所有信息(分页)")
    @ResponseBody
    @RequestMapping("/selectNucleicacidCheckPage")
    public PageInfo<NucleicacidCheck> selectNucleicacidCheckPage(int pageNum, int pageSize, String pCardLike){
        log.info("查询 核算记录所有信息(分页)");
        PageInfo<NucleicacidCheck> nucleicacidCheckPageInfo = nucleicacidCheckService.selectNucleicacidCheckPage(pageNum, pageSize ,pCardLike);
        return nucleicacidCheckPageInfo;
    }

    /*添加核算记录信息*/
    @ApiOperation("添加 核算记录信息")
    @ResponseBody
    @RequestMapping("/addNucleicacidCheck")
    public int addNucleicacidCheck(NucleicacidCheck nucleicacidCheck){
        log.info("添加 核算记录信息");
        return nucleicacidCheckService.addNucleicacidCheck(nucleicacidCheck);
    }

    /*修改 核算记录信息*/
    @ResponseBody
    @ApiOperation("修改 核算记录信息")
    @RequestMapping("/updateNucleicacidCheck")
    public int updateNucleicacidCheck(NucleicacidCheck nucleicacidCheck){
        log.info("修改 核算记录信息");
        return nucleicacidCheckService.updateNucleicacidCheck(nucleicacidCheck);
    }
}
