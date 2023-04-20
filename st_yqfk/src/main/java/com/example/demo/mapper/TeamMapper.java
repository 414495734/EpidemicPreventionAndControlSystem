package com.example.demo.mapper;

import com.example.demo.pojo.System;
import com.example.demo.pojo.Team;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface TeamMapper {

    /*获取班 信息*/
    public List<Team> selectTeam(@Param("SID") int xid);
    /*查询班级所有信息*/
    public List<Team> selectTeamAll();

    List<Team> selectTeamPage(Team team);

    int addTeam(Team team);

    int updateTeam(Team team);

    int deleteTeam(Team team);
}
