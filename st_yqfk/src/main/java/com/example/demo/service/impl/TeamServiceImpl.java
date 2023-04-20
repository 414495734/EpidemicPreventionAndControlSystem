package com.example.demo.service.impl;

import com.example.demo.mapper.TeamMapper;
import com.example.demo.pojo.Team;
import com.example.demo.service.TeamService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;

@Service
public class TeamServiceImpl implements TeamService {


    @Autowired
    TeamMapper teamMapper;

    SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.getDefault());

    @Override
    public List<Team> selectTeam(int xid) {
        return teamMapper.selectTeam(xid);
    }

    public List<Team> selectTeamAll(){
        return teamMapper.selectTeamAll();
    }

    /*查询班级所有信息(分页)*/
    @Override
    public PageInfo<Team> selectTeamPage(int pageNum, int pageSize, String tnameLike, String sId) {
        /*分页数,每页几条*/
        PageHelper.startPage(pageNum, pageSize);
        tnameLike = tnameLike==null ? "%%" : "%"+tnameLike+"%";
//        Map param = new HashMap();
//        param.put("snameLike", snameLike);
//        param.put("cId", Integer.parseInt(cId));

        Team t = new Team();
        t.setTname(tnameLike);
        if(sId!=null&&sId!=""){
            if(Integer.parseInt(sId)!=0 || Integer.parseInt(sId)>0) {
                t.setSid(Integer.parseInt(sId));
            }
        }
        /*查询所有班级信息*/
        List<Team> teams = teamMapper.selectTeamPage(t);
        /*封装到pageInfo*/
        PageInfo<Team> teamPageInfo = new PageInfo<>(teams);
        return teamPageInfo;
    }

    /*添加 班级信息*/
    @Override
    public int addTeam(Team team) {
        team.setActive("1");
        Date date=new Date();
        team.setCreate_date(date);
        team.setLast_date(date);
        return teamMapper.addTeam(team);
    }

    /*修改 班级信息*/
    @Override
    public int updateTeam(Team team) {
        Date date=new Date();
        team.setLast_date(date);
        return teamMapper.updateTeam(team);
    }
    /*删除 班级信息*/
    @Override
    public int deleteTeam(Team team) {
        team.setActive("0");
        Date date=new Date();
        team.setLast_date(date);
        return teamMapper.deleteTeam(team);
    }
}
