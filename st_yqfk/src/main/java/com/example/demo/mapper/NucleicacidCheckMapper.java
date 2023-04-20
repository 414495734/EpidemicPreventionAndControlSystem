package com.example.demo.mapper;

import com.example.demo.pojo.Doctor;
import com.example.demo.pojo.NucleicacidCheck;
import com.example.demo.pojo.NucleicacidCheckExample;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 核算记录
 */
@Mapper
public interface NucleicacidCheckMapper {
    int countByExample(NucleicacidCheckExample example);

    int deleteByExample(NucleicacidCheckExample example);

    int deleteByPrimaryKey(Integer nid);

    int insert(NucleicacidCheck record);

    int insertSelective(NucleicacidCheck record);

    List<NucleicacidCheck> selectByExample(NucleicacidCheckExample example);

    NucleicacidCheck selectByPrimaryKey(Integer nid);

    int updateByExampleSelective(@Param("record") NucleicacidCheck record, @Param("example") NucleicacidCheckExample example);

    int updateByExample(@Param("record") NucleicacidCheck record, @Param("example") NucleicacidCheckExample example);

    int updateByPrimaryKeySelective(NucleicacidCheck record);

    int updateByPrimaryKey(NucleicacidCheck record);

    /*查询核算记录所有信息(分页)*/
    List<NucleicacidCheck> selectNucleicacidCheckPage(NucleicacidCheck nucleicacidCheck);
   /*微信查询核算记录所有信息*/
    public List<NucleicacidCheck> WeiXinselectNucleicacidCheckPage(String pCardLike);

    int getToDayCheckCount(NucleicacidCheck n);

    /** 根据管ID修改检测时间 */
    int updateCheckResultDateByTid(NucleicacidCheck check);

    List<NucleicacidCheck> getNucleicacidCheckListByInfo(NucleicacidCheck check);
}