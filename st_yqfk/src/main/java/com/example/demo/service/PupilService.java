package com.example.demo.service;

import com.example.demo.mapper.PupilMapper;
import com.example.demo.pojo.Pupil;
import com.github.pagehelper.PageInfo;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface PupilService {

    public int dataCollegePupilCount();

    public PageInfo<Pupil> selectPupil(int bid,int pageNum,int pageSize);

    public PageInfo<Pupil> selectPupilPage(int pageNum,int pageSize);

    public int addPupil(Pupil pupil);

    int updatePupil(Pupil pupil);

    int deletePupil(int pid);

    int addIntPupil(List<Pupil> list);

    int getCount();
}
