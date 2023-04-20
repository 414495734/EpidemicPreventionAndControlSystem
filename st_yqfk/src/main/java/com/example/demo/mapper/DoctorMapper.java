package com.example.demo.mapper;

import com.example.demo.pojo.Doctor;
import com.example.demo.pojo.DoctorExample;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface DoctorMapper {
    int countByExample(DoctorExample example);

    int deleteByExample(DoctorExample example);

    int deleteByPrimaryKey(Integer did);

    int insert(Doctor record);

    int insertSelective(Doctor record);

    List<Doctor> selectByExample(DoctorExample example);

    Doctor selectByPrimaryKey(Integer did);

    int updateByExampleSelective(@Param("record") Doctor record, @Param("example") DoctorExample example);

    int updateByExample(@Param("record") Doctor record, @Param("example") DoctorExample example);

    int updateByPrimaryKeySelective(Doctor record);

    int updateByPrimaryKey(Doctor record);

    /*获取医生列表*/
    public List<Doctor> selectDoctor();
    /*查询医生所有信息(分页)*/
    public List<Doctor> selectDoctorPage(Doctor doctor);

    Doctor wxDoctorPhoneSelect(@Param("DPHONE") String dphone);
}