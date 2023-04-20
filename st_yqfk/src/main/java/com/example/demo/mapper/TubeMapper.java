package com.example.demo.mapper;

import com.example.demo.pojo.Tube;
import com.example.demo.pojo.TubeCode;
import com.example.demo.pojo.TubeExample;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 采样管
 */
@Mapper
public interface TubeMapper {
    int countByExample(TubeExample example);

    int deleteByExample(TubeExample example);

    int deleteByPrimaryKey(Integer tid);

    int insert(Tube record);

    int insertSelective(Tube record);

    List<Tube> selectByExample(TubeExample example);

    Tube selectByPrimaryKey(Integer tid);

    int updateByExampleSelective(@Param("record") Tube record, @Param("example") TubeExample example);

    int updateByExample(@Param("record") Tube record, @Param("example") TubeExample example);

    int updateByPrimaryKeySelective(Tube record);

    int updateByPrimaryKey(Tube record);

    List<Tube> selectTubePage(Tube t);

    Tube selectByCode(@Param("CODE") String code);

    List<Tube> selectCodeListByCode(String code);
}