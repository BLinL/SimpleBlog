package com.github.simpleblog.blog.mapper;

import com.github.simpleblog.blog.entity.link;
import com.github.simpleblog.blog.entity.linkExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface linkMapper {
    long countByExample(linkExample example);

    int deleteByExample(linkExample example);

    int deleteByPrimaryKey(String id);

    int insert(link record);

    int insertSelective(link record);

    List<link> selectByExample(linkExample example);

    link selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") link record, @Param("example") linkExample example);

    int updateByExample(@Param("record") link record, @Param("example") linkExample example);

    int updateByPrimaryKeySelective(link record);

    int updateByPrimaryKey(link record);
}