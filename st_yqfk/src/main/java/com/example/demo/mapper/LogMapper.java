package com.example.demo.mapper;

import com.example.demo.pojo.Log;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface LogMapper {


    List<Log> selectLogAll(@Param("value") String value);

    int deleteLog(@Param("LID") int lid);
}
