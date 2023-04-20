package com.example.demo.service.impl;

import com.example.demo.mapper.AdminMapper;
import com.example.demo.pojo.Admin;
import com.example.demo.pojo.Permission;
import com.example.demo.pojo.Role;
import com.example.demo.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AdminServiceImpl implements AdminService {

    @Autowired
    AdminMapper adminMapper;

    /*获取角色信息*/
    @Override
    public List<Role> selectRole() {
        return adminMapper.selectRole();
    }
    /*根据 当前登录对象 查询权限*/
    @Override
     public List<Permission> selectPermission(Admin admin){
         return adminMapper.selectPermission(admin);
     }
    /*查询所有权限*/
    @Override
    public List<Permission> selectPermissionAll() {

        return adminMapper.selectPermissionAll();
    }
   /*根据角色id 查询 权限*/
    @Override
    public List<Permission> selectRidPermissionAll(int Rid) {
        return adminMapper.selectRidPermissionAll(Rid);
    }

    /*根据 权限id  修改 权限信息*/
    @Override
    public int updetePermission(Permission permission) {
        return adminMapper.updetePermission(permission);
    }

    @Override
    public int deletePermission(int Pid) {
        return adminMapper.deletePermission(Pid);
    }
    /*添加权限信息 返回主键*/
    @Override
    public int addPermission(Permission permission) {
        return adminMapper.addPermission(permission);
    }
     /*添加 角色和权限表的中间表信息*/
    @Override
    public int addRolePermission(int rid, int pid) {
        return adminMapper.addRolePermission(rid,pid);
    }


}
