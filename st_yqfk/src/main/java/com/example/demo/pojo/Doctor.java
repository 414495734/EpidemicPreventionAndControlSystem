package com.example.demo.pojo;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import lombok.ToString;

import java.util.Date;

@Data
@ToString
public class Doctor {
    private Integer did;

    private String dname;

    private String dtext;

    private String dsex;

    private String dcard;

    private String dphone;

    private String dlocation;

    private String daddress;

    private String touch;

    private String diagnosis;

    private String infectionSource;

    private Integer hid;

    private String active;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd hh:mm:ss")
    private Date createDate;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd hh:mm:ss")
    private Date lastDate;

    private String file1;

    private String file2;

    private String file3;

    private String file4;

    private Hospital hospital;
}