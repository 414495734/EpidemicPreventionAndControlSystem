package com.example.demo.service;

import com.example.demo.pojo.TubeCode;
import com.github.pagehelper.PageInfo;

/**
 * 采样管上面贴的二维码
 */
public interface TubeCodeService {

    /*查询二维码所有信息(分页)*/
    PageInfo<TubeCode> selectTubeCodePage(int pageNum, int pageSize, String codeLike);
    /*添加二维码信息*/
    int addTubeCode(int number);
    /*修改二维码信息*/
    int updateTubeCode(TubeCode tubeCode);

}
