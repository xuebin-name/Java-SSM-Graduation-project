package com.nnljfl.dao;

import com.nnljfl.bean.CeShi;
import com.nnljfl.bean.CeShiExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CeShiMapper {
    long countByExample(CeShiExample example);

    int deleteByExample(CeShiExample example);

    int deleteByPrimaryKey(Integer csId);

    int insert(CeShi record);

    int insertSelective(CeShi record);

    List<CeShi> selectByExample(CeShiExample example);

    CeShi selectByPrimaryKey(Integer csId);

    int updateByExampleSelective(@Param("record") CeShi record, @Param("example") CeShiExample example);

    int updateByExample(@Param("record") CeShi record, @Param("example") CeShiExample example);

    int updateByPrimaryKeySelective(CeShi record);

    int updateByPrimaryKey(CeShi record);

	CeShi selectResult(@Param("csId")Integer csId, @Param("typeId")Integer typeId);
}