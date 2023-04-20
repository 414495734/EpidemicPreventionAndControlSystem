package com.example.demo.pojo;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import lombok.ToString;

import java.util.Date;

@Data
@ToString
public class Hospital {
    private Integer hid;

    private String hname;

    private String htext;

    private String hlocation;

    private String hdetailedLocation;

    private String hphone;

    private String active;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd hh:mm:ss")
    private Date createDate;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd hh:mm:ss")
    private Date lastDate;

    private String file1;

    private String file2;

    private String file3;

    private String file4;
}