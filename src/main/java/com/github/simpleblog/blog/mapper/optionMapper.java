package com.github.simpleblog.blog.mapper;

import com.github.simpleblog.blog.entity.option;
import com.github.simpleblog.blog.entity.optionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface optionMapper {
    long countByExample(optionExample example);

    int deleteByExample(optionExample example);

    int deleteByPrimaryKey(String id);

    int insert(option record);

    int insertSelective(option record);

    List<option> selectByExampleWithBLOBs(optionExample example);

    List<option> selectByExample(optionExample example);

    option selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") option record, @Param("example") optionExample example);

    int updateByExampleWithBLOBs(@Param("record") option record, @Param("example") optionExample example);

    int updateByExample(@Param("record") option record, @Param("example") optionExample example);

    int updateByPrimaryKeySelective(option record);

    int updateByPrimaryKeyWithBLOBs(option record);

    int updateByPrimaryKey(option record);
}