package com.example.demo.mapper;


import com.example.demo.pojo.Department;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * 部门
 */
@Mapper
public interface DepartmentMapper {

    /*获取部门列表*/
    public List<Department> selectDepartment();

    /*查询部门所有信息(分页)*/
    public List<Department> selectDepartmentPage(String dNameLike);
    /*添加部门信息*/
    public int addDepartment(Department department);
    /*修改部门信息*/
    int updateDepartment(Department department);
    /*删除部门信息*/
    int deleteDepartment(Department department);
}
