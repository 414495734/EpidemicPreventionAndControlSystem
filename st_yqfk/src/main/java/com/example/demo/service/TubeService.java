package com.example.demo.service;

import com.example.demo.pojo.Tube;
import com.github.pagehelper.PageInfo;

import java.util.List;

/**
 * 采样管
 */
public interface TubeService {

    /*查询采样管所有信息(分页)*/
    public PageInfo<Tube> selectTubePage(int pageNum, int pageSize, String codeLike,String hid,String did);
    /*添加采样管信息*/
    String addTube(Tube tube);
    /*修改采样管信息*/
    int updateTube(Tube tube);
    /*删除采样管信息*/
    int deleteTube(Tube tube);

    String updateTubeStatus(String code,String result);
}
