package com.example.demo.service;

import com.example.demo.pojo.Role;

import java.util.List;

public interface RoleService {


    int updateRole(Integer rid, String roleName);

    int deleteRole(Integer rid);

    int addRole(String roleName);

    int insertRolePermission(Integer pid, Integer rid);

    int deleteRoleAndP(Integer pid, Integer rid);
}
