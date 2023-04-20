package com.example.demo.service.impl;

import com.example.demo.mapper.CollegeMapper;
import com.example.demo.mapper.DepartmentMapper;
import com.example.demo.pojo.College;
import com.example.demo.pojo.Department;
import com.example.demo.service.DepartmentService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/**
 * 部门
 */
@Service
public class DepartmentServiceImpl implements DepartmentService {

    @Autowired
    DepartmentMapper departmentMapperMapper;

    @Override
    public List<Department> selectDepartment() {
        return departmentMapperMapper.selectDepartment();
    }

    /*查询部门所有信息(分页)*/
    @Override
    public PageInfo<Department> selectDepartmentPage(int pageNum, int pageSize,String dNameLike) {
        /*分页数,每页几条*/
        PageHelper.startPage(pageNum, pageSize);
        dNameLike = dNameLike==null ? "%%" : "%"+dNameLike+"%";
        /*查询所有部门信息*/
        List<Department> departments = departmentMapperMapper.selectDepartmentPage(dNameLike);
        /*封装到pageInfo*/
        PageInfo<Department> departmentPageInfo = new PageInfo<>(departments);
        return departmentPageInfo;
    }

    /*添加部门信息*/
    @Override
    public int addDepartment(Department department) {
        department.setActive("1");
        Date date=new Date();
        department.setCreate_date(date);
        department.setLast_date(date);
        return departmentMapperMapper.addDepartment(department);
    }

    /*修改 部门信息*/
    @Override
    public int updateDepartment(Department college) {
        Date date=new Date();
        college.setLast_date(date);
        return departmentMapperMapper.updateDepartment(college);
    }
    /*删除 部门信息*/
    @Override
    public int deleteDepartment(Department college) {
        college.setActive("0");
        Date date=new Date();
        college.setLast_date(date);
        return departmentMapperMapper.deleteDepartment(college);
    }
}
