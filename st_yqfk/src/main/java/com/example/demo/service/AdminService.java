package com.example.demo.service;

import com.example.demo.pojo.Admin;
import com.example.demo.pojo.Permission;
import com.example.demo.pojo.Role;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface AdminService {

    public List<Role> selectRole();

    public List<Permission> selectPermission(Admin admin);

    public List<Permission> selectPermissionAll();

    public List<Permission> selectRidPermissionAll(int Rid);

    public int updetePermission(Permission permission);

    public int deletePermission( int Pid);

    public int addPermission(Permission permission);

    public int addRolePermission( int rid, int pid);
}
