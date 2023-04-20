package com.example.demo.controller;

import com.example.demo.pojo.Permission;
import com.example.demo.pojo.Role;
import com.example.demo.service.AdminService;

import io.swagger.annotations.ApiOperation;
import lombok.extern.log4j.Log4j;
import lombok.extern.log4j.Log4j2;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.annotation.Secured;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

@Log4j
@Controller
public class AdminController {

    @Autowired
    AdminService adminService;

    private static Logger logger = Logger.getLogger(AdminController.class);


    /*跳转登录页面*/
    @ApiOperation("跳转登录页面")
    @RequestMapping("/login")
    public String login(){

        log.info("跳转登录页面");
        return "adminLogin";
    }
   /*跳转登录失败页面*/
    @ApiOperation("跳转登录失败页面")
    @RequestMapping("/loginFail")
    public String fail(){
        log.warn("跳转登录失败页面");
        return "loginFail";
    }
   /*跳转权限不足页面*/
    @ApiOperation("跳转权限不足页面")
    @RequestMapping("/permissionFail")
    public String rolefail(){
        log.info("跳转权限不足页面");
        return "permissionFail";
    }

   /*跳转 权限管理页面*/
    @ApiOperation("跳转权限管理页面")
    @Secured("ROLE_updateadmin")
    @RequestMapping("/permissionTable")
    public String student(){
        log.info("跳转权限管理页面");
        return "permissionTable";
    }
   /*跳转首页*/
    @ApiOperation("跳转主页面")
    @RequestMapping("/main")
    public String main(HttpServletRequest request, HttpServletResponse response){
        response.setHeader("Access-Control-Allow-Origin", "*");
        response.setHeader("Cache-Control","no-cache");
        log.info("跳转主页面");
        return "main";
    }

    /*跳转首页*/
    @ApiOperation("跳转主页面")
    @RequestMapping("/mains")
    public String mains(HttpServletRequest request, HttpServletResponse response){
        response.setHeader("Access-Control-Allow-Origin", "*");
        response.setHeader("Cache-Control","no-cache");
        log.info("跳转主页面");
        return "main";
    }

    /*跳转首页*/
    @ApiOperation("跳转主页面")
    @RequestMapping("/mainTwo")
    public String mainTwo(HttpServletRequest request, HttpServletResponse response){
        response.setHeader("Access-Control-Allow-Origin", "*");
        response.setHeader("Cache-Control","no-cache");
        log.info("跳转主页面");
        return "mainTwo";
    }


    /*跳转首页*/
    @ApiOperation("跳转主页面")
    @RequestMapping("/mainThree")
    public String mainThree(HttpServletRequest request, HttpServletResponse response){
        response.setHeader("Access-Control-Allow-Origin", "*");
        response.setHeader("Cache-Control","no-cache");
        log.info("跳转主页面");
        return "mainThree";
    }



    /*获取角色信息*/
    @ApiOperation(value = "获取角色所有信息")
    @ResponseBody
    @RequestMapping("/selectRole")
    public List<Role> selectRole(){
        log.info("获取角色信息");
        List<Role> roles = adminService.selectRole();
        return roles;
    }

    /*获取权限信息*/
    @ApiOperation("获取权限信息")
    @ResponseBody
   @RequestMapping("/selectPermission")
    public List<Permission> selectPermission(){
        log.info("获取权限信息");
        List<Permission> permissions = adminService.selectPermissionAll();
        System.out.println(permissions);
        return permissions;
    }
    /*根据角色id 查询权限信息*/
    @ApiOperation("根据角色id 查询权限信息")
    @ResponseBody
    @RequestMapping("/selectRidPermission")
    public List<Permission> selectRidPermission(int Rid){
        log.info("根据角色id 查询权限信息");
        List<Permission> permissions = adminService.selectRidPermissionAll(Rid);

        return permissions;
    }


    /*根据权限id 修改权限信息*/
    @ApiOperation("根据权限id 修改权限信息")
    @ResponseBody
    @RequestMapping("/updetePermission")
    public int updetePermission(int Pid,String permissionName,String permissionDesc){
        log.info("根据权限id 修改权限信息");
        Permission permission = new Permission();
        permission.setPid(Pid);
        permission.setPermissionName(permissionName);
        permission.setPermissionDesc(permissionDesc);
        int a = adminService.updetePermission(permission);

        return a;
    }



   /* 根据角色id 修改权限信息*/
   @ApiOperation("根据角色id 修改权限信息")
    @ResponseBody
    @RequestMapping("/deletePermission")
    public int deletePermission(int Pid){
       log.info("根据角色id 修改权限信息");
        return adminService.deletePermission(Pid);
    }

    @ApiOperation("添加权限信息")
    @ResponseBody
    @RequestMapping("/addPermission")
    public int addPermission(String permissionName,String permissionDesc,int Rid){
        log.info("添加权限信息");
        Permission permission = new Permission();
        permission.setPermissionName(permissionName);
        permission.setPermissionDesc(permissionDesc);
         permission.setActive("1");
        /*添加权限信息*/
        int i = adminService.addPermission(permission);
        /*根据返回的主键PID 和已有的Rid 添加中间表信息*/
        System.out.println("添加成功返回1:"+i);

        System.out.println("返回的权限id为:"+permission.getPid());

        return adminService.addRolePermission(Rid, permission.getPid());
    }


}
