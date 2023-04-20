package com.example.demo.service.impl;

import com.example.demo.mapper.LogMapper;
import com.example.demo.pojo.Log;
import com.example.demo.service.LogService;
import com.example.demo.util.FormatDate;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LogServiceImpl implements LogService {

    @Autowired
    LogMapper logMapper;

    @Override
    public PageInfo<Log> selectLogAll(String value,int pageNum ,int pageSize) {
        PageHelper.startPage(pageNum,pageSize);
        List<Log> logs = logMapper.selectLogAll(value);

        System.out.println(logs.toString());
        PageInfo<Log> objectPageInfo = new PageInfo<Log>(logs);


        return objectPageInfo;
    }

    @Override
    public int deleteLog(int lid) {
        return logMapper.deleteLog(lid);
    }
}
