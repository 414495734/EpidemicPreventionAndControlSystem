package com.example.demo.pojo;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import lombok.ToString;

import java.util.Date;


/**
 * 部门
 */
@Data
@ToString
public class Department {
    private  int  dId;
    private String dName;
    private String dText;
    private String active;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd hh:mm:ss")
    private Date create_date;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd hh:mm:ss")
    private Date last_date;
    private String file1;
    private String file2;
    private String file3;
    private String file4;
}
