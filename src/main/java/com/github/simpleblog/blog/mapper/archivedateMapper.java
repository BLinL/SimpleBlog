package com.github.simpleblog.blog.mapper;

import com.github.simpleblog.blog.entity.archivedate;
import com.github.simpleblog.blog.entity.archivedateExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface archivedateMapper {
    long countByExample(archivedateExample example);

    int deleteByExample(archivedateExample example);

    int deleteByPrimaryKey(String id);

    int insert(archivedate record);

    int insertSelective(archivedate record);

    List<archivedate> selectByExample(archivedateExample example);

    archivedate selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") archivedate record, @Param("example") archivedateExample example);

    int updateByExample(@Param("record") archivedate record, @Param("example") archivedateExample example);

    int updateByPrimaryKeySelective(archivedate record);

    int updateByPrimaryKey(archivedate record);
}