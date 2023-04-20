package com.example.demo.service;

import com.example.demo.pojo.Doctor;
import com.example.demo.pojo.NucleicacidCheck;
import com.github.pagehelper.PageInfo;

import java.util.List;

/**
 * 核算记录
 */
public interface NucleicacidCheckService {

    /*查询核算记录所有信息(分页)*/
    PageInfo<NucleicacidCheck> selectNucleicacidCheckPage(int pageNum, int pageSize, String pCardLike);
    /*添加核算记录信息*/
    int addNucleicacidCheck(NucleicacidCheck nucleicacidCheck);
    /*修改核算记录信息*/
    int updateNucleicacidCheck(NucleicacidCheck nucleicacidCheck);
    /*微信根据身份证查询所有核酸记录*/
    public List<NucleicacidCheck> WeiXinselectNucleicacidCheckPage(String pCardLike);

    int getToDayCheckCount();

}
