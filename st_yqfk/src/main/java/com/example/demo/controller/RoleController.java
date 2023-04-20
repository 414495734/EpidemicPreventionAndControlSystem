package com.example.demo.controller;

import com.example.demo.pojo.Role;
import com.example.demo.service.RoleService;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponses;
import io.swagger.models.auth.In;
import lombok.extern.log4j.Log4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.annotation.Secured;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Log4j
@Controller
public class RoleController {


    @Autowired
    RoleService roleService;



    /*跳转角色管理页面*/
    @ApiOperation("跳转角色管理页面")
    @Secured("ROLE_updateadmin")
    @RequestMapping("/roleTable")
    public String roleTable(){
        log.info("跳转角色管理页面");
        return "roleTable";
    }

   /*修改角色名*/
    @ApiOperation("修改角色名")
    @ResponseBody
    @RequestMapping("/updateRole")
    public int updateRole(Integer rid,String roleName){
       log.info("修改角色名");
        return    roleService.updateRole(rid,roleName);
    }


    /*删除角色信息*/
    @ApiOperation("删除角色信息")
    @ResponseBody
    @RequestMapping("/deleteRole")
    public int deleteRole(Integer rid){
        log.info("删除角色信息");
        return    roleService.deleteRole(rid);
    }


    /*添加角色信息*/
    @ApiOperation("添加角色信息")
    @ResponseBody
    @RequestMapping("/addRole")
    public int addRole(String roleName){
        log.info("添加角色信息");
        return    roleService.addRole(roleName);
    }

    /*权限id和角色id存入中间表,为角色添加权限*/
    @ApiOperation("权限id和角色id存入中间表,为角色添加权限")
    @ResponseBody
    @RequestMapping("/insertRolePermission")
    public int addRole(Integer pid,Integer rid){
        log.info("权限id和角色id存入中间表,为角色添加权限");
        return  roleService.insertRolePermission(pid,rid);
    }

    /*权限id和角色id溢出中间表,消减角色权限*/
    @ApiOperation("权限id和角色id溢出中间表,消减角色权限")
    @ResponseBody
    @RequestMapping("/deleteRoleAndP")
    public int deleteRoleAndP(Integer pid,Integer rid){
        log.info("权限id和角色id溢出中间表,消减角色权限,要删除的权限id为"+pid+"---要删除的角色id为"+rid);
        return  roleService.deleteRoleAndP(pid,rid);
    }
}
