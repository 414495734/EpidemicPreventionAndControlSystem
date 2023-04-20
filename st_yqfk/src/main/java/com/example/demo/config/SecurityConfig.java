package com.example.demo.config;

import com.spring4all.swagger.EnableSwagger2Doc;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.security.oauth2.client.EnableOAuth2Sso;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
@Configuration
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    //权限不足
    @Autowired
    PermissionFail permissionFail;

    @Override
    protected void configure(HttpSecurity http) throws Exception {

        //登录接口  和需要查询的账号密码    成功的接口 失败的接口  提交表单的接口
        http.formLogin()
                .loginPage("/login")
                .usernameParameter("username")
                .passwordParameter("password")
                .successForwardUrl("/main")
                .failureForwardUrl("/loginFail")
                .loginProcessingUrl("/DoLogin");

        http.authorizeRequests()
                .antMatchers("/login").permitAll()
                .anyRequest().authenticated();


        //登出的接口
        http.logout()
                .logoutUrl("/logout")
                .logoutSuccessUrl("/login");

        //关闭 csrf防护
        http.csrf().disable();

        //展示权限不足页面
        http.exceptionHandling()
                .accessDeniedHandler(permissionFail);


        http.authorizeRequests().and().cors();



    }

    @Override
    public void configure(WebSecurity web) throws Exception {
        web.ignoring().antMatchers("/css/**",
                "/bootstrap/**",
                "/login/**",
                "/assets/**",
                "/pCardSelect",
                "/permissionFail",
                "/returnImg",
                "WXinsertPupil",
                "/WXinsertPupil",
                "/Test",
                "/selectTeamAll",
                "/Test2",
                "/wxDoctorPhoneSelect",
                "/css/**/*",
                "/WxaddTube",
                "/WXImgQxkyTwo",
                "/WXImgQxkyOne",
                "/static/**/**/**",
                "static/**",
                "/WeiXinselectNucleicacidCheckPage"

        );
    }


    @Bean
    public PasswordEncoder passwordEncoder(){

        return NoOpPasswordEncoder.getInstance();
    }


}
