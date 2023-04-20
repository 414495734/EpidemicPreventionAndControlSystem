package com.example.demo.pojo;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import lombok.ToString;

import java.util.Date;

/**
 * 教师
 */
@Data
@ToString
public class Teacher {
    private  int  tId;//教师ID(主键)
    private  int  tSn;//教师编号(类似学生学号)
    private String tName;//教师姓名
    private String tText;//教师简介
    private String tSex;//教师性别
    private String tCard;//教师身份证号
    private String tPhone;//手机号
    private String tLocation;//校内住址(书院房间号 箕城A-308)
    private String tAddress;//校外住址(省市县 山西省-运城市-盐湖区)
    private String touch;//是否密接(0:否 1:是)
    private String diagnosis;//是否确诊(0:否 1:是)
    private String infectionSource;//感染源(0:无 1:校内感染 2:外出感染)
    private Integer hId;//医院业务ID(外键)
    private Integer hdId;//部门业务ID(外键)
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd hh:mm:ss")
    private Date tStartTime;//隔离开始时间
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd hh:mm:ss")
    private Date tEndTime;//隔离结束时间
    private String active;//删除状态(0:已删除 1:未删除)'
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd hh:mm:ss")
    private Date create_date;//创建时间
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd hh:mm:ss")
    private Date last_date;//修改时间
    private String file1;//扩展字段1
    private String file2;//扩展字段2
    private String file3;//扩展字段3
    private String file4;//扩展字段4
    private Department department;
}
