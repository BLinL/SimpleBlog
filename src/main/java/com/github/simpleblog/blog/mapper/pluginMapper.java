package com.github.simpleblog.blog.mapper;

import com.github.simpleblog.blog.entity.plugin;
import com.github.simpleblog.blog.entity.pluginExample;
import com.github.simpleblog.blog.entity.pluginWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface pluginMapper {
    long countByExample(pluginExample example);

    int deleteByExample(pluginExample example);

    int deleteByPrimaryKey(String id);

    int insert(pluginWithBLOBs record);

    int insertSelective(pluginWithBLOBs record);

    List<pluginWithBLOBs> selectByExampleWithBLOBs(pluginExample example);

    List<plugin> selectByExample(pluginExample example);

    pluginWithBLOBs selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") pluginWithBLOBs record, @Param("example") pluginExample example);

    int updateByExampleWithBLOBs(@Param("record") pluginWithBLOBs record, @Param("example") pluginExample example);

    int updateByExample(@Param("record") plugin record, @Param("example") pluginExample example);

    int updateByPrimaryKeySelective(pluginWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(pluginWithBLOBs record);

    int updateByPrimaryKey(plugin record);
}