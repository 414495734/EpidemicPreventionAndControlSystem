package com.example.demo.service.impl;


import com.example.demo.mapper.DoctorMapper;
import com.example.demo.pojo.Doctor;
import com.example.demo.service.DoctorService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

/**
 * 医生
 */
@Service
public class DoctorServiceImpl implements DoctorService {

    @Autowired
    DoctorMapper doctorMapper;

    @Override
    public List<Doctor> selectDoctor() {
        return doctorMapper.selectDoctor();
    }

    /*查询医生所有信息(分页)*/
    @Override
    public PageInfo<Doctor> selectDoctorPage(int pageNum, int pageSize, String dNameLike,String dCardLike,String hid) {
        /*分页数,每页几条*/
        PageHelper.startPage(pageNum, pageSize);
        dNameLike = dNameLike==null ? "%%" : "%"+dNameLike+"%";
        Doctor d = new Doctor();
        d.setDname(dNameLike);
        if(dCardLike!=null&&dCardLike!=""){
            d.setDcard(dCardLike);
        }
        if(hid!=null&&hid!=""){
            if(Integer.parseInt(hid)!=0 || Integer.parseInt(hid)>0) {
                d.setHid(Integer.parseInt(hid));
            }
        }
        /*查询所有医生信息*/
        List<Doctor> doctors = doctorMapper.selectDoctorPage(d);
        /*封装到pageInfo*/
        PageInfo<Doctor> doctorPageInfo = new PageInfo<>(doctors);
        return doctorPageInfo;
    }

    /*添加医生信息*/
    @Override
    public int addDoctor(Doctor doctor) {
        doctor.setActive("1");
        Date date=new Date();
        doctor.setCreateDate(date);
        doctor.setLastDate(date);
        return doctorMapper.insertSelective(doctor);
    }

    /*修改 医生信息*/
    @Override
    public int updateDoctor(Doctor doctor) {
        Date date=new Date();
        doctor.setLastDate(date);
        return doctorMapper.updateByPrimaryKeySelective(doctor);
    }
    /*删除 医生信息*/
    @Override
    public int deleteDoctor(Doctor doctor) {
        doctor.setActive("0");
        Date date=new Date();
        doctor.setLastDate(date);
        return doctorMapper.updateByPrimaryKeySelective(doctor);
    }

    @Override
    public Doctor wxDoctorPhoneSelect(String dphone) {
        return doctorMapper.wxDoctorPhoneSelect(dphone);
    }
}
