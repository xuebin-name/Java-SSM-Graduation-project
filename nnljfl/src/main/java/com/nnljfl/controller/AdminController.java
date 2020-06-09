package com.nnljfl.controller;





import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.nnljfl.bean.AJAXResult;
import com.nnljfl.bean.Admin;
import com.nnljfl.service.AdminService;


@Controller
@RequestMapping("/user")
public class AdminController {

	@Autowired
	private AdminService adminService;

	@RequestMapping("/main")
	
	public String main(Integer adminId,HttpSession session){
		AJAXResult result = new AJAXResult();
		//System.out.println(adminId);
		Admin admin =adminService.queryAdminById(adminId);
		if(admin!=null){
			System.out.println(admin);
			
			session.setAttribute("admin", admin);
			//System.out.println(model);
			result.setSuccess(true);
		}else {
			result.setSuccess(false);
		}
		
		return "admin/admin_list";
	}
	
	@RequestMapping("/update")
	@ResponseBody
	public Object update(Admin admin){
		//System.out.println(admin);
		AJAXResult result = new AJAXResult();
		try {
			adminService.updateAdmin(admin);
			result.setSuccess(true);
		} catch (Exception e) {
			e.printStackTrace();
			result.setSuccess(false);
		}
		
		return result;
	}
	
	@RequestMapping("/list")
	public String index(){
		System.out.println("进入功能");
		return "admin/admin_list";
	}
}
