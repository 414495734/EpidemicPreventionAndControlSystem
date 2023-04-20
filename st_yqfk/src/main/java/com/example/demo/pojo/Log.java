package com.example.demo.pojo;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import lombok.ToString;

import  java.util.Date;

@ToString
@Data
public class Log {
    private Integer lid;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd hh:mm:ss")
    private Date logDate;
    private String logLevel;
    private String location;
    private String message;
    private String active;
}
