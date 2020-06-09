package com.nnljfl.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.nnljfl.bean.Msg;
import com.nnljfl.bean.TypeModel;
import com.nnljfl.service.TypeModelService;

@Controller
@RequestMapping("/typemodel")
public class TypeModelController {

	@Autowired
	private TypeModelService typeModelService;
	
	@RequestMapping("/getType")
	@ResponseBody
	public List<TypeModel> getType(){
		List<TypeModel> typeModels = typeModelService.queryAll();
		return typeModels;
	}
	
	
	@RequestMapping("/getmodel")
	@ResponseBody
	public Msg getModel(){
		List<TypeModel> list = typeModelService.queryAll();
		return Msg.success().add("typemodel", list);
	}
}
