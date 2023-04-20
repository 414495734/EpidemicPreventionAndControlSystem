package com.example.demo.pojo;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import lombok.ToString;

import java.util.Date;

/**
 * 采样管上面贴的二维码
 */
@Data
@ToString
public class TubeCode {
    private Integer tcid;

    private String code;

    private String status;

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