package com.example.demo.controller;
import com.example.demo.pojo.NucleicacidCheck;
import com.example.demo.pojo.TubeCode;
import com.example.demo.service.NucleicacidCheckService;
import com.example.demo.service.PupilService;
import com.example.demo.service.TubeCodeService;
import com.github.pagehelper.PageInfo;
import io.swagger.annotations.ApiOperation;
import lombok.extern.log4j.Log4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.annotation.Secured;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


/**
 * 二维码控制层
 */
//@RequestMapping("/tubeCode")
@Log4j
@Controller
public class TubeCodeController {

    @Autowired
    TubeCodeService tubeCodeService;

    /*跳转 二维码管理界面*/
    @ApiOperation("跳转 二维码管理界面")
    @RequestMapping("/tubeCodeTable")
    @Secured("ROLE_hospital")
    public String tubeCodeTable(){
        log.info("跳转 二维码管理界面");
        return "tubeCodeTable";
    }

    /*查询 二维码所有信息(分页)*/
    @ApiOperation("查询 二维码所有信息(分页)")
    @ResponseBody
    @RequestMapping("/selectTubeCodePage")
    public PageInfo<TubeCode> selectTubeCodePage(int pageNum, int pageSize, String codeLike){
        log.info("查询 二维码所有信息(分页)");
        PageInfo<TubeCode> tubeCodePageInfo = tubeCodeService.selectTubeCodePage(pageNum, pageSize ,codeLike);
        return tubeCodePageInfo;
    }

    /*添加 二维码信息*/
    @ApiOperation("添加二维码信息")
    @ResponseBody
    @RequestMapping("/addTubeCode")
    public int addTubeCode(int number){
        log.info("添加 二维码信息");
        return tubeCodeService.addTubeCode(number);
    }

    /*修改 二维码信息*/
    @ResponseBody
    @ApiOperation("修改 二维码信息")
    @RequestMapping("/updateTubeCode")
    public int updateTubeCode(TubeCode tubeCode){
        log.info("修改 二维码信息");
        return tubeCodeService.updateTubeCode(tubeCode);
    }
}
