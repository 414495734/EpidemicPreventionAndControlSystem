package com.example.demo.service.impl;

import com.example.demo.mapper.RoleMapper;
import com.example.demo.pojo.Role;
import com.example.demo.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoleServiceImpl implements RoleService {

    @Autowired
    RoleMapper roleMapper;

    @Override
    public int updateRole(Integer rid, String roleName) {
        return roleMapper.updateRole(rid,roleName);
    }

    @Override
    public int deleteRole(Integer rid) {
        return roleMapper.deleteRole(rid);
    }

    @Override
    public int addRole(String roleName) {
        return roleMapper.addRole(roleName);
    }

    @Override
    public int insertRolePermission(Integer pid, Integer rid) {
        int i1=0;
        Integer i = roleMapper.selectPidAndRid(pid, rid);
        System.out.println("查找到数据:"+i);
         if(i==null){
             i1 = roleMapper.insertRolePermission(pid, rid);
         }else{
             return i;
         }
        return i1;
    }

    @Override
    public int deleteRoleAndP(Integer pid, Integer rid) {
        return roleMapper.deleteRoleAndP(pid,rid);
    }
}
