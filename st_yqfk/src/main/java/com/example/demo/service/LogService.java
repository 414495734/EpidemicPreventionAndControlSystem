package com.example.demo.service;

import com.example.demo.pojo.Log;
import com.github.pagehelper.PageInfo;

import java.util.List;

public interface LogService {


    PageInfo<Log> selectLogAll(String value,int pageNum , int pageSize);

    int deleteLog(int lid);
}
