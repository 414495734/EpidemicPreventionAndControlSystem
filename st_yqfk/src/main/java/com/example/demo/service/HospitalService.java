package com.example.demo.service;

import com.example.demo.pojo.Hospital;
import com.github.pagehelper.PageInfo;

import java.util.List;

public interface HospitalService {


    public List<Hospital> selectHospital();

    /*查询 医院所有信息(分页)*/
    public PageInfo<Hospital> selectHospitalPage(int pageNum, int pageSize, String hnameLike);

    /*添加 医院信息*/
    public int addHospital(Hospital hospital);
    /*修改 医院信息*/
    int updateHospital(Hospital hospital);
    /*删除 医院信息*/
    int deleteHospital(Hospital hospital);
}
