package com.nnljfl.controller;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.fasterxml.jackson.annotation.ObjectIdGenerators.StringIdGenerator;
import com.nnljfl.bean.CeShi;
import com.nnljfl.bean.Msg;
import com.nnljfl.bean.TiMu;
import com.nnljfl.service.CeShiService;
import com.nnljfl.service.TimuService;

@Controller
@RequestMapping("/ceshi")
public class CeShiController {

	@Autowired
	private CeShiService ceshiService;

	@RequestMapping("/getTimu")
	@ResponseBody
	public List<CeShi> getTimu(){
		//获取题目
		List<CeShi> ceShis = ceshiService.queryCeShiAll();		
		return ceShis;
	}
	
	@RequestMapping("/query")
	@ResponseBody
	public Msg yanzheng(Integer csId,Integer typeId){
		System.out.println(csId);
		System.out.println(typeId);
		CeShi ceShi = ceshiService.queryResult(csId,typeId);
		System.out.println(ceShi);
		if (ceShi==null) {
			return Msg.fail();
		}else {
			return Msg.success();
		}
		
	}
	
}
