package com.example.demo.pojo;

import lombok.Data;
import lombok.ToString;

import javax.management.relation.Role;
import java.util.List;
/*管理员用户*/
@Data
@ToString
public class Admin {
    private  Integer aid;   //管理员id  *
    private String username;  //管理员账号 *
    private String password;  //管理员密码  *
    private String email;       //管理员 邮箱
    private String phoneNum;  //管理员电话
    private String sex;  //管理员 性别
    private String active;  // 激活状态  *
    private String rid; //管理员角色
    private List<Role> roles;
}
