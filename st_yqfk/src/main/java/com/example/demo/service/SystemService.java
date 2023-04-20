package com.example.demo.service;

import com.example.demo.pojo.College;
import com.example.demo.pojo.System;
import com.github.pagehelper.PageInfo;

import java.util.List;

public interface SystemService {

    public List<System> selectSystem(int yid);

    public List<System> selectSystemList();

    /*查询院系所有信息(分页)*/
    public PageInfo<System> selectSystemPage(int pageNum, int pageSize, String snameLike, String cId);

    /*添加 院系信息*/
    public int addSystem(System system);
    /*修改 院系信息*/
    int updateSystem(System system);
    /*删除 院系信息*/
    int deleteSystem(System system);
}
