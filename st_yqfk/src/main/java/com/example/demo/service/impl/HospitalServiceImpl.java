package com.example.demo.service.impl;

import com.example.demo.mapper.HospitalMapper;
import com.example.demo.pojo.Hospital;
import com.example.demo.service.HospitalService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class HospitalServiceImpl implements HospitalService {

    @Autowired
    HospitalMapper hospitalMapper;

    @Override
    public List<Hospital> selectHospital() {
        return hospitalMapper.selectHospital();
    }

    /*查询医院所有信息(分页)*/
    @Override
    public PageInfo<Hospital> selectHospitalPage(int pageNum, int pageSize,String hnameLike) {
        /*分页数,每页几条*/
        PageHelper.startPage(pageNum, pageSize);
        hnameLike = hnameLike==null ? "%%" : "%"+hnameLike+"%";
        /*查询所有医院信息*/
        List<Hospital> hospitals = hospitalMapper.selectHospitalPage(hnameLike);
        System.out.println(hospitals);
        /*封装到pageInfo*/
        PageInfo<Hospital> hospitalPageInfo = new PageInfo<>(hospitals);
        return hospitalPageInfo;
    }

    /*添加医院信息*/
    @Override
    public int addHospital(Hospital hospital) {
        hospital.setActive("1");
        Date date=new Date();
        hospital.setCreateDate(date);
        hospital.setLastDate(date);
        return hospitalMapper.insertSelective(hospital);
    }

    /*修改 医院信息*/
    @Override
    public int updateHospital(Hospital hospital) {
        Date date=new Date();
        hospital.setLastDate(date);
        return hospitalMapper.updateByPrimaryKeySelective(hospital);
    }
    /*删除 医院信息*/
    @Override
    public int deleteHospital(Hospital hospital) {
        hospital.setActive("0");
        Date date=new Date();
        hospital.setLastDate(date);
        return hospitalMapper.updateByPrimaryKeySelective(hospital);
    }
}
