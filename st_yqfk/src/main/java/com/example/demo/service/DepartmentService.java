package com.example.demo.service;

import com.example.demo.pojo.Department;
import com.github.pagehelper.PageInfo;

import java.util.List;

/**
 * 部门
 */
public interface DepartmentService {

    /*获取部门列表*/
    public List<Department> selectDepartment();
    /*查询部门所有信息(分页)*/
    public PageInfo<Department> selectDepartmentPage(int pageNum, int pageSize, String dNameLike);
    /*添加部门信息*/
    public int addDepartment(Department department);
    /*修改部门信息*/
    int updateDepartment(Department department);
    /*删除部门信息*/
    int deleteDepartment(Department department);
}
