package com.example.demo.pojo;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import lombok.ToString;

import java.util.Date;

/**
 * 核算记录
 */
@Data
@ToString
public class NucleicacidCheck {
    private Integer nid;

    private Integer pid;

    private String ptype;

    private Integer hid;

    private Integer did;

    private Integer tid;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd hh:mm:ss")
    private Date samplingDate;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd hh:mm:ss")
    private Date checkDate;

    private String result;

    private String active;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd hh:mm:ss")
    private Date createDate;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd hh:mm:ss")
    private Date lastDate;

    private String file1;

    private String file2;

    private String file3;

    private String file4;

    private Pupil pupil;

    private Hospital hospital;

}