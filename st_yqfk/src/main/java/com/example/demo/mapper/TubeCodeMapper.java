package com.example.demo.mapper;

import com.example.demo.pojo.TubeCode;
import com.example.demo.pojo.TubeCodeExample;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 采样管上面贴的二维码
 */
@Mapper
public interface TubeCodeMapper {
    int countByExample(TubeCodeExample example);

    int deleteByExample(TubeCodeExample example);

    int deleteByPrimaryKey(Integer tcid);

    int insert(TubeCode record);

    int insertSelective(TubeCode record);

    List<TubeCode> selectByExample(TubeCodeExample example);

    TubeCode selectByPrimaryKey(Integer tcid);

    int updateByExampleSelective(@Param("record") TubeCode record, @Param("example") TubeCodeExample example);

    int updateByExample(@Param("record") TubeCode record, @Param("example") TubeCodeExample example);

    int updateByPrimaryKeySelective(TubeCode record);

    int updateByPrimaryKey(TubeCode record);

    List<TubeCode> selectTubeCodePage(TubeCode t);

    int getTodayCreateTubecodeNumber(TubeCode t);

    TubeCode selectByCode(String code);
}