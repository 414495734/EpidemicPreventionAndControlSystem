package com.example.demo.mapper;

import com.example.demo.pojo.Pupil;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface WeiXinPupilMapper {


    Pupil pCardSelect(Pupil pupil);

    int insertPupil(Pupil pupil);

    int updetePupil(Pupil pupil);
}
