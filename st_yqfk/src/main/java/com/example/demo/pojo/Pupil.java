package com.example.demo.pojo;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import lombok.ToString;

import java.util.Date;

//学生
@Data
@ToString
public class Pupil{
    private Integer pid;  //学生id
    private String pname;  //学生名字
    private String psex;   //学生性别
    private String pcard; //身份证
    private String plocation; //学生地址
    private String active; //激活状态
    private String touch;//是否密接
    private String diagnosis; //是否确诊
    private String infectionSource;// 感染源
    private Integer hid;//医院主键
    private String pphone;//电话
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd hh:mm:ss")
    private String pstart_time; //隔离开始时间
    private Integer tid; //班级主键

}
