package com.example.demo.controller;

import com.example.demo.pojo.Team;
import com.example.demo.service.TeamService;
import com.github.pagehelper.PageInfo;
import io.swagger.annotations.ApiOperation;
import lombok.extern.log4j.Log4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.annotation.Secured;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import java.util.List;
@Log4j
@Controller
public class TeamController {

    @Autowired
    TeamService teamService;


    /*根据 系id 查询班信息*/
    @ApiOperation("根据 系id 查询班信息")
    @ResponseBody
    @RequestMapping("/selectTeam")
    public List<Team> selectTeam(int xid){
        log.info("根据 系id 查询班信息");
        return teamService.selectTeam(xid);
    }
    /*查询班级信息*/
    @ApiOperation("查询班级信息")
    @ResponseBody
    @RequestMapping("/selectTeamAll")
    public List<Team> selectTeamAll(){
        log.info("查询班级信息");
        return teamService.selectTeamAll();
    }

    /*跳转班级管理界面*/
    @ApiOperation("跳转班级管理界面")
    @RequestMapping("/teamTable")
    @Secured("ROLE_college")
    public String teamTable(){
        log.info("跳转班级管理界面");
        return "teamTable";
    }

    /*查询班级所有信息(分页)*/
    @ApiOperation("查询班级所有信息(分页)")
    @ResponseBody
    @RequestMapping("/selectTeamPage")
    public PageInfo<Team> selectTeamPage(int pageNum, int pageSize, String tnameLike, String sId){
        log.info("查询班级所有信息(分页)");
        PageInfo<Team> teamPageInfo = teamService.selectTeamPage(pageNum, pageSize ,tnameLike,sId);
        return teamPageInfo;
    }

    /*添加 班级信息*/
    @ApiOperation("添加 班级信息")
    @ResponseBody
    @RequestMapping("/addTeam")
    public int addTeam(Team team){
        log.info("添加 班级信息");
        return teamService.addTeam(team);
    }

    /*修改 班级信息*/
    @ApiOperation("修改 班级信息")
    @ResponseBody
    @RequestMapping("/updateTeam")
    public int updateTeam(Team team){
        log.info("修改 班级信息");
        return teamService.updateTeam(team);
    }

    /*删除 班级信息*/
    @ApiOperation("删除 班级信息")
    @ResponseBody
    @RequestMapping("/deleteTeam")
    public int deleteTeam(Team team){
        log.info("删除 班级信息");
        return teamService.deleteTeam(team);
    }

}
