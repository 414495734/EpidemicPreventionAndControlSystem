package com.example.demo.mapper;

import com.example.demo.pojo.Pupil;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface PupilMapper {
  /*大数据学院 学生总数*/
    public int dataCollegePupilCount();
    /*根据班id 搜索学生信息*/
  public List<Pupil>  selectPupil(@Param("TID") int bid);
  /*查询所有学生信息*/
   public List<Pupil> selectPupilAll();
  /*添加学生信息*/
  public int addPupil(Pupil pupil);
 /*修改学生信息*/
    int updatePupil(Pupil pupil);
/*根据pid 删除学生信息*/
    int deletePupil(@Param("PID") int pid);
  /*导入*/
    int addIntPupil(List<Pupil> list);

    /*根据身份证查询 学生信息*/
    Pupil selectPupilByCard(String pCard);

    int getCount();

    int updateByPrimaryKeySelective(Pupil pupil);
}
