package com.nnljfl.dao;

import com.nnljfl.bean.TiMu;
import com.nnljfl.bean.TiMuExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TiMuMapper {
    long countByExample(TiMuExample example);

    int deleteByExample(TiMuExample example);

    int deleteByPrimaryKey(Integer tmId);

    int insert(TiMu record);

    int insertSelective(TiMu record);

    List<TiMu> selectByExample(TiMuExample example);

    TiMu selectByPrimaryKey(Integer tmId);

    int updateByExampleSelective(@Param("record") TiMu record, @Param("example") TiMuExample example);

    int updateByExample(@Param("record") TiMu record, @Param("example") TiMuExample example);

    int updateByPrimaryKeySelective(TiMu record);

    int updateByPrimaryKey(TiMu record);

	TiMu selectByTwoid(Integer csId, Integer typeId);
}