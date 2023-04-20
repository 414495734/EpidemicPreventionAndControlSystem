package com.example.demo.service;

import com.example.demo.pojo.Doctor;
import com.example.demo.pojo.Teacher;
import com.github.pagehelper.PageInfo;

import java.util.List;

/**
 * 医生
 */
public interface DoctorService {

    /*获取医生列表*/
    public List<Doctor> selectDoctor();
    /*查询医生所有信息(分页)*/
    public PageInfo<Doctor> selectDoctorPage(int pageNum, int pageSize, String dNameLike,String dCardLike,String hid);
    /*添加医生信息*/
    public int addDoctor(Doctor doctor);
    /*修改医生信息*/
    int updateDoctor(Doctor doctor);
    /*删除医生信息*/
    int deleteDoctor(Doctor doctor);
   /*根据手机号查询医生信息*/
    Doctor wxDoctorPhoneSelect(String dphone);
}
