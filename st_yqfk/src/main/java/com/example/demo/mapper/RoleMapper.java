package com.example.demo.mapper;

import com.example.demo.pojo.Role;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface RoleMapper {

    int updateRole(@Param("RID") Integer rid,@Param("ROLENAME") String roleName);

    int deleteRole(@Param("RID") Integer rid);

    int addRole(@Param("ROLENAME") String roleName);
/*增加 角色 和 权限 中间表*/
    int insertRolePermission(@Param("PID") Integer pid,@Param("RID") Integer rid);

      /*查询 中间表是否已经存在*/
    Integer selectPidAndRid(@Param("PID")Integer pid, @Param("RID")Integer rid);

    int deleteRoleAndP(@Param("PID") Integer pid,@Param("RID") Integer rid);
}
