package com.example.demo.pojo;

import lombok.Data;
import lombok.ToString;

import java.util.List;

// 角色
@Data
@ToString
public class Role {
    private Integer rid;
    private String roleName; // 角色名
    private List<Permission> permissions;// 权限集合
}