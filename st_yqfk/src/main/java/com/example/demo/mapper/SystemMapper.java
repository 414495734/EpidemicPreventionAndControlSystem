package com.example.demo.mapper;

import com.example.demo.pojo.System;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

@Mapper
public interface SystemMapper {
    /*获取系 信息*/
    public List<System> selectSystem(@Param("CID") int yid);

    public List<System> selectSystemList();

    List<System> selectSystemPage(System system);

    int addSystem(System system);

    int updateSystem(System system);

    int deleteSystem(System system);
}
