package com.example.demo.pojo;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import lombok.ToString;

import java.util.Date;
import java.util.List;

/**
 * 采样管
 */
@Data
@ToString
public class Tube {
    private Integer tid;

    private String code;
  //医院id
    private Integer hid;
   //医生id
    private Integer did;

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

    private Hospital hospital;

    private Doctor doctor;

    private List<Pupil> listPuil;


}