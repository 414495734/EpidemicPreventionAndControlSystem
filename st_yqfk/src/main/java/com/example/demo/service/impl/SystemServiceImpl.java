package com.example.demo.service.impl;

import com.example.demo.mapper.SystemMapper;
import com.example.demo.pojo.College;
import com.example.demo.pojo.System;
import com.example.demo.service.SystemService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.*;

@Service
public class SystemServiceImpl implements SystemService {

    @Autowired
    SystemMapper systemMapper;

    SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.getDefault());

    @Override
    public List<System> selectSystem(int yid) {
        return systemMapper.selectSystem(yid);
    }

    @Override
    public List<System> selectSystemList() {
        return systemMapper.selectSystemList();
    }
    /*查询 院系所有信息(分页)*/
    @Override
    public PageInfo<System> selectSystemPage(int pageNum, int pageSize, String snameLike, String cId) {
        /*分页数,每页几条*/
        PageHelper.startPage(pageNum, pageSize);
        snameLike = snameLike==null ? "%%" : "%"+snameLike+"%";
//        Map param = new HashMap();
//        param.put("snameLike", snameLike);
//        param.put("cId", Integer.parseInt(cId));

        System s = new System();
        s.setSname(snameLike);
        if(cId!=null&&cId!=""){
            if(Integer.parseInt(cId)!=0 || Integer.parseInt(cId)>0) {
                s.setCid(Integer.parseInt(cId));
            }
        }
        /*查询所有院系信息*/
        List<System> systems = systemMapper.selectSystemPage(s);
        /*封装到pageInfo*/
        PageInfo<System> systemPageInfo = new PageInfo<>(systems);
        return systemPageInfo;
    }

    /*添加 院系信息*/
    @Override
    public int addSystem(System system) {
        system.setActive("1");
        Date date=new Date();
        system.setCreate_date(date);
        system.setLast_date(date);
        return systemMapper.addSystem(system);
    }

    /*修改 院系信息*/
    @Override
    public int updateSystem(System system) {
        Date date=new Date();
        system.setLast_date(date);
        return systemMapper.updateSystem(system);
    }
    /*删除 院系信息*/
    @Override
    public int deleteSystem(System system) {
        system.setActive("0");
        Date date=new Date();
        system.setLast_date(date);
        return systemMapper.deleteSystem(system);
    }
}
