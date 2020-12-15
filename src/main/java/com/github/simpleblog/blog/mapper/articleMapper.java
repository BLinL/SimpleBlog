package com.github.simpleblog.blog.mapper;

import com.github.simpleblog.blog.entity.article;
import com.github.simpleblog.blog.entity.articleExample;
import com.github.simpleblog.blog.entity.articleWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface articleMapper {
    long countByExample(articleExample example);

    int deleteByExample(articleExample example);

    int deleteByPrimaryKey(String id);

    int insert(articleWithBLOBs record);

    int insertSelective(articleWithBLOBs record);

    List<articleWithBLOBs> selectByExampleWithBLOBs(articleExample example);

    List<article> selectByExample(articleExample example);

    articleWithBLOBs selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") articleWithBLOBs record, @Param("example") articleExample example);

    int updateByExampleWithBLOBs(@Param("record") articleWithBLOBs record, @Param("example") articleExample example);

    int updateByExample(@Param("record") article record, @Param("example") articleExample example);

    int updateByPrimaryKeySelective(articleWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(articleWithBLOBs record);

    int updateByPrimaryKey(article record);
}