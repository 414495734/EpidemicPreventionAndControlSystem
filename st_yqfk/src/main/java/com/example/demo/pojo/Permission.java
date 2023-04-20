package com.example.demo.pojo;

import lombok.Data;
import lombok.ToString;
//权限
@Data
@ToString
public class Permission {
    private Integer pid;
    private String permissionName; // 权限名
    private String permissionDesc;//权限详情
    private String active;//状态
}
