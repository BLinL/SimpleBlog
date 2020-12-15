package com.github.simpleblog.blog.mapper;

import com.github.simpleblog.blog.entity.page;
import com.github.simpleblog.blog.entity.pageExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface pageMapper {
    long countByExample(pageExample example);

    int deleteByExample(pageExample example);

    int deleteByPrimaryKey(String id);

    int insert(page record);

    int insertSelective(page record);

    List<page> selectByExample(pageExample example);

    page selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") page record, @Param("example") pageExample example);

    int updateByExample(@Param("record") page record, @Param("example") pageExample example);

    int updateByPrimaryKeySelective(page record);

    int updateByPrimaryKey(page record);
}