package com.example.demo.service.impl;


import com.example.demo.mapper.AdminMapper;
import com.example.demo.pojo.Admin;
import com.example.demo.pojo.Permission;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.servlet.server.Session;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;


import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Service
public class MyUserDetailService implements UserDetailsService {
   @Autowired
    AdminMapper adminMapper;

    /* doLogin*/
    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
        /*从数据库查询*/
        Admin admin = adminMapper.selectAdmin(s);
        List<Permission> list = adminMapper.selectPermission(admin);
        List<GrantedAuthority> grantedAuthorities=null;
        List<String> m = new ArrayList<>();
        for (Permission p:
             list) {
            String permissionDesc = p.getPermissionDesc();
              m.add(permissionDesc);
        }

        String s1 = m.toString();
        s1= s1.replace("[","");
        s1 = s1.replace("]", "");
        grantedAuthorities = AuthorityUtils.commaSeparatedStringToAuthorityList(s1);
        System.out.println(grantedAuthorities.toString());

        UserDetails userDetails = User.withUsername(admin.getUsername())
                .password(admin.getPassword())
                .authorities(grantedAuthorities)
                .build();




        return userDetails;


    }
}
