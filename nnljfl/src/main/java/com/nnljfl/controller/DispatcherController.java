package com.nnljfl.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.nnljfl.bean.AJAXResult;
import com.nnljfl.bean.Admin;
import com.nnljfl.service.AdminService;



@Controller
public class DispatcherController {
	
	@Autowired
	AdminService AdminService;
	
	@RequestMapping("/login")
	public String login(){
		return "login";
	}
	@RequestMapping("/index")
	public String Index(){
		return "index";
	}
	

	@RequestMapping("/dologin")
	@ResponseBody
	public Object dologin(String phone,String password,HttpSession session){
			AJAXResult result = new AJAXResult();
			Admin dbAdmin = AdminService.queryAdmin(phone,password);
			if (dbAdmin!=null) {
				session.setAttribute("admin", dbAdmin);
				result.setSuccess(true);
			}else {
				result.setSuccess(false);
			}
			System.out.println("进入登陆功能");
			return result;
		
	}
}
