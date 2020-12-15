package com.github.simpleblog.blog.mapper;

import com.github.simpleblog.blog.entity.tag;
import com.github.simpleblog.blog.entity.tagExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface tagMapper {
    long countByExample(tagExample example);

    int deleteByExample(tagExample example);

    int deleteByPrimaryKey(String id);

    int insert(tag record);

    int insertSelective(tag record);

    List<tag> selectByExample(tagExample example);

    tag selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") tag record, @Param("example") tagExample example);

    int updateByExample(@Param("record") tag record, @Param("example") tagExample example);

    int updateByPrimaryKeySelective(tag record);

    int updateByPrimaryKey(tag record);
}