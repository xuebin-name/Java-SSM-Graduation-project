package com.nnljfl.controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


import com.nnljfl.bean.Goods;
import com.nnljfl.bean.Msg;


import com.nnljfl.service.GoodsService;




@Controller
@RequestMapping("/queryorder")
public class OrderController {

	@Autowired
	private GoodsService goodsService;
	
	@RequestMapping("/add")
	@ResponseBody
	public Msg add(Goods goods){
		System.out.println(goods);
		goodsService.insertOrder(goods);
		
		return Msg.success();
	}
	
	@RequestMapping("/login")
	public void login(String code){
		System.out.println(code);
	}
	
}
