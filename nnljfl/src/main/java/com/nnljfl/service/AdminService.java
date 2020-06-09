package com.nnljfl.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nnljfl.bean.Admin;
import com.nnljfl.dao.AdminMapper;

@Service
public class AdminService {

	@Autowired
	private AdminMapper adminMapper;

	public Admin queryAdmin(String phone, String password) {
	
		return adminMapper.selectByExampleWithPhoneAndPassword(phone, password);
	}

	public Admin queryAdminById(Integer adminId) {
		return adminMapper.selectByPrimaryKey(adminId);
	}

	public void updateAdmin(Admin admin) {
		adminMapper.updateByPrimaryKeySelective(admin);
	}
}
