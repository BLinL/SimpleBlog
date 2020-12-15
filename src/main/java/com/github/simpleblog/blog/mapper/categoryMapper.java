package com.github.simpleblog.blog.mapper;

import com.github.simpleblog.blog.entity.category;
import com.github.simpleblog.blog.entity.categoryExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface categoryMapper {
    long countByExample(categoryExample example);

    int deleteByExample(categoryExample example);

    int deleteByPrimaryKey(String id);

    int insert(category record);

    int insertSelective(category record);

    List<category> selectByExampleWithBLOBs(categoryExample example);

    List<category> selectByExample(categoryExample example);

    category selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") category record, @Param("example") categoryExample example);

    int updateByExampleWithBLOBs(@Param("record") category record, @Param("example") categoryExample example);

    int updateByExample(@Param("record") category record, @Param("example") categoryExample example);

    int updateByPrimaryKeySelective(category record);

    int updateByPrimaryKeyWithBLOBs(category record);

    int updateByPrimaryKey(category record);
}