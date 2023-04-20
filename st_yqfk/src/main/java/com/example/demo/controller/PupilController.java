package com.example.demo.controller;

import com.example.demo.pojo.Pupil;
import com.example.demo.service.PupilService;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.util.JSONPObject;
import com.github.pagehelper.PageInfo;

import io.swagger.annotations.ApiOperation;
import lombok.extern.log4j.Log4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.json.JacksonJsonParser;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.io.IOException;
import java.util.List;
import java.util.Map;

@Log4j
@Controller
public class PupilController {

  @Autowired
    PupilService pupilService;


    /*跳转用户管理界面*/
    @ApiOperation(value = "跳转用户管理界面")
    @RequestMapping("/pupilTable")
    public String addPupil(){
        return "pupilTable";
    }


  /*大数据学院 总人数*/
  @ApiOperation(value = "大数据学院 总人数")
  @ResponseBody
  @RequestMapping("/getCount")
  public int getCount(){

      return pupilService.dataCollegePupilCount();
  }

  /*根据班id 查询学生信息*/
    @ApiOperation(value = "根据班id 查询学生信息")
    @ResponseBody
    @RequestMapping("/selectPupil")
    public PageInfo<Pupil> selectPupil(int bid,int pageNum,int pageSize){
      System.out.println(bid);
      PageInfo<Pupil> pupils = pupilService.selectPupil(bid,pageNum,pageSize);
      return pupils;
    }


    /*查询所有 学生信息*/
    @ApiOperation(value = "查询所有 学生信息")
    @ResponseBody
    @RequestMapping("/selectPupilPage")
    public PageInfo<Pupil> selectPupilPage(int pageNum,int pageSize){
        PageInfo<Pupil> pupilPageInfo = pupilService.selectPupilPage(pageNum, pageSize);
        return pupilPageInfo;

    }

  /*添加 学生信息*/
  @ApiOperation(value = "添加学生信息")
  @ResponseBody
  @RequestMapping("/addPupil")
  public int addPupil(Pupil pupil){

    return pupilService.addPupil(pupil);

  }


  /*修改 学生信息*/
  @ApiOperation(value = "修改 学生信息")
  @ResponseBody
  @RequestMapping("/updatePupil")
  public int updatePupil(Pupil pupil){

    return pupilService.updatePupil(pupil);

  }

  /*根据 pid 删除 学生信息*/
  @ApiOperation(value = "根据 pid 删除 学生信息")
  @ResponseBody
  @RequestMapping("/deletePupil")
  public int deletePupil(int pid){

    return pupilService.deletePupil(pid);

  }


  /*Excel导入*/
  @ApiOperation(value = "Excel导入")
  @ResponseBody
  @RequestMapping("/addIntPupil")
  public int addIntPupil(String list, Integer bid){
    log.info("导入"+list+"---"+bid);
    ObjectMapper mapper = new ObjectMapper();
     List<Pupil> pupils;
    try {
      pupils= mapper.readValue(list,new TypeReference<List<Pupil>>(){});
      System.out.println(pupils);
      for (Pupil a:
           pupils) {
        a.setTid(bid);
      }
      int i = pupilService.addIntPupil(pupils);
      System.out.println("添加成功失败:"+i);
      return i;
    } catch (IOException e) {
      e.printStackTrace();
    }



      return 0;

  }



}
