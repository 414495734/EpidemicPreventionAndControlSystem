package com.example.demo.service;

import com.example.demo.pojo.System;
import com.example.demo.pojo.Team;
import com.github.pagehelper.PageInfo;

import java.util.List;

public interface TeamService {

    public List<Team> selectTeam( int xid);

    public List<Team> selectTeamAll();

    /*查询班级所有信息(分页)*/
    public PageInfo<Team> selectTeamPage(int pageNum, int pageSize, String tnameLike,String sId);

    /*添加 班级信息*/
    public int addTeam(Team team);
    /*修改 班级信息*/
    int updateTeam(Team team);
    /*删除 班级信息*/
    int deleteTeam(Team team);
}
