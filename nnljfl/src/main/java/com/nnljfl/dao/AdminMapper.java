package com.nnljfl.dao;

import com.nnljfl.bean.Admin;
import com.nnljfl.bean.AdminExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AdminMapper {
    long countByExample(AdminExample example);

    int deleteByExample(AdminExample example);

    int deleteByPrimaryKey(Integer adminId);

    int insert(Admin record);

    int insertSelective(Admin record);

    List<Admin> selectByExample(AdminExample example);

    Admin selectByPrimaryKey(Integer adminId);
//selectByExampleWithPhoneAndPassword
    Admin selectByExampleWithPhoneAndPassword(@Param("phone")String phone,@Param("password")String password);
    int updateByExampleSelective(@Param("record") Admin record, @Param("example") AdminExample example);

    int updateByExample(@Param("record") Admin record, @Param("example") AdminExample example);

    int updateByPrimaryKeySelective(Admin record);

    int updateByPrimaryKey(Admin record);

	void updateAdmin(Admin admin);

	
}