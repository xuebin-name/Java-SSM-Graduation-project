package com.nnljfl.dao;

import com.nnljfl.bean.Rubbish;
import com.nnljfl.bean.RubbishExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RubbishMapper {
    long countByExample(RubbishExample example);

    int deleteByExample(RubbishExample example);

    int deleteByPrimaryKey(Integer rubbishId);

    int insert(Rubbish record);

    int insertSelective(Rubbish record);

    List<Rubbish> selectByExample(RubbishExample example);

    Rubbish selectByPrimaryKey(Integer rubbishId);

    int updateByExampleSelective(@Param("record") Rubbish record, @Param("example") RubbishExample example);

    int updateByExample(@Param("record") Rubbish record, @Param("example") RubbishExample example);

    int updateByPrimaryKeySelective(Rubbish record);

    int updateByPrimaryKey(Rubbish record);
    
	Rubbish selectByExampleWithType(String name);

	List<Rubbish> selectByExampleAll(RubbishExample example);
}