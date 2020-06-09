package com.nnljfl.dao;

import com.nnljfl.bean.TypeModel;
import com.nnljfl.bean.TypeModelExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TypeModelMapper {
    long countByExample(TypeModelExample example);

    int deleteByExample(TypeModelExample example);

    int deleteByPrimaryKey(Integer typeId);

    int insert(TypeModel record);

    int insertSelective(TypeModel record);

    List<TypeModel> selectByExample(TypeModelExample example);

    TypeModel selectByPrimaryKey(Integer typeId);

    int updateByExampleSelective(@Param("record") TypeModel record, @Param("example") TypeModelExample example);

    int updateByExample(@Param("record") TypeModel record, @Param("example") TypeModelExample example);

    int updateByPrimaryKeySelective(TypeModel record);

    int updateByPrimaryKey(TypeModel record);

    List<TypeModel> selectByExampleWithThrow(TypeModelExample example);

}