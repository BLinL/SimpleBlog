package com.github.simpleblog.blog.mapper;

import com.github.simpleblog.blog.entity.tagArticle;
import com.github.simpleblog.blog.entity.tagArticleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface tagArticleMapper {
    long countByExample(tagArticleExample example);

    int deleteByExample(tagArticleExample example);

    int deleteByPrimaryKey(String id);

    int insert(tagArticle record);

    int insertSelective(tagArticle record);

    List<tagArticle> selectByExample(tagArticleExample example);

    tagArticle selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") tagArticle record, @Param("example") tagArticleExample example);

    int updateByExample(@Param("record") tagArticle record, @Param("example") tagArticleExample example);

    int updateByPrimaryKeySelective(tagArticle record);

    int updateByPrimaryKey(tagArticle record);
}