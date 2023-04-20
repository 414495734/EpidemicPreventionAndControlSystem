package com.example.demo.controller;

import com.example.demo.pojo.Log;
import com.example.demo.service.LogService;
import com.github.pagehelper.PageInfo;
import io.swagger.annotations.ApiOperation;
import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Log4j
@Controller
public class LogController {

    @Autowired
    LogService logService;

    @ApiOperation("跳转日志管理页面")
    @RequestMapping("/logTable")
    public String logTable(){
        log.info("跳转日志管理页面");
        return "logTable";
    }

  /*根据输入框的值搜索日志*/
  @ApiOperation("根据输入框的值搜索日志")
    @ResponseBody
    @RequestMapping("/selectLogAll")
    public PageInfo<Log> selectLogAll(String value,int pageNum ,int pageSize){
      log.info("根据输入框的值搜索日志");
        return logService.selectLogAll(value,pageNum, pageSize);
    }
    /* 根据id 删除 */
    @ApiOperation("根据id 删除日志")
    @ResponseBody
    @RequestMapping("/deleteLog")
    public int deleteLog(int lid){
        log.info("根据id 删除日志");
        return  logService.deleteLog(lid);
    }




}
