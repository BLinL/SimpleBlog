package com.github.simpleblog.blog.mapper;

import com.github.simpleblog.blog.entity.archivedateArticle;
import com.github.simpleblog.blog.entity.archivedateArticleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface archivedateArticleMapper {
    long countByExample(archivedateArticleExample example);

    int deleteByExample(archivedateArticleExample example);

    int deleteByPrimaryKey(String id);

    int insert(archivedateArticle record);

    int insertSelective(archivedateArticle record);

    List<archivedateArticle> selectByExample(archivedateArticleExample example);

    archivedateArticle selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") archivedateArticle record, @Param("example") archivedateArticleExample example);

    int updateByExample(@Param("record") archivedateArticle record, @Param("example") archivedateArticleExample example);

    int updateByPrimaryKeySelective(archivedateArticle record);

    int updateByPrimaryKey(archivedateArticle record);
}