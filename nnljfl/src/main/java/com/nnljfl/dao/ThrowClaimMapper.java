package com.nnljfl.dao;

import com.nnljfl.bean.ThrowClaim;
import com.nnljfl.bean.ThrowClaimExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ThrowClaimMapper {
    long countByExample(ThrowClaimExample example);

    int deleteByExample(ThrowClaimExample example);

    int deleteByPrimaryKey(Integer throwId);

    int insert(ThrowClaim record);

    int insertSelective(ThrowClaim record);

    List<ThrowClaim> selectByExample(ThrowClaimExample example);

    ThrowClaim selectByPrimaryKey(Integer throwId);

    int updateByExampleSelective(@Param("record") ThrowClaim record, @Param("example") ThrowClaimExample example);

    int updateByExample(@Param("record") ThrowClaim record, @Param("example") ThrowClaimExample example);

    int updateByPrimaryKeySelective(ThrowClaim record);

    int updateByPrimaryKey(ThrowClaim record);
}