package com.github.simpleblog.blog.mapper;

import com.github.simpleblog.blog.entity.categoryTag;
import com.github.simpleblog.blog.entity.categoryTagExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface categoryTagMapper {
    long countByExample(categoryTagExample example);

    int deleteByExample(categoryTagExample example);

    int deleteByPrimaryKey(String id);

    int insert(categoryTag record);

    int insertSelective(categoryTag record);

    List<categoryTag> selectByExample(categoryTagExample example);

    categoryTag selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") categoryTag record, @Param("example") categoryTagExample example);

    int updateByExample(@Param("record") categoryTag record, @Param("example") categoryTagExample example);

    int updateByPrimaryKeySelective(categoryTag record);

    int updateByPrimaryKey(categoryTag record);
}