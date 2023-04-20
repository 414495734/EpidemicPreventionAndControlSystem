package com.example.demo.mapper;

import com.example.demo.pojo.Admin;
import com.example.demo.pojo.Permission;
import com.example.demo.pojo.Role;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface AdminMapper {
      /*查询admin 账号密码*/
      public Admin selectAdmin(@Param("USERNAME") String username);
      /*根据 admin 查询权限*/
      public List<Permission> selectPermission(Admin admin);
      /*查询角色*/
      public List<Role> selectRole();
      /*查询权限*/
      public List<Permission> selectPermissionAll();
      /*根据角色id 查询权限集合*/
      public List<Permission> selectRidPermissionAll(@Param("RID") int Rid);

      /*根据权限pid 修改权限信息*/
      public int  updetePermission(Permission permission);
      /*根据 权限pid 删除权限信息*/
      public int deletePermission(@Param("PID") int Pid);
      /* 添加权限 返回主键 */
       public int addPermission(Permission permission);
      /* 添加角色RID 和 权限PID 的中间表信息*/
       public int addRolePermission(@Param("RID") int rid,@Param("PID") int pid);
}
