package com.nnljfl.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.nnljfl.bean.Goods;
import com.nnljfl.bean.Msg;
import com.nnljfl.bean.Rubbish;
import com.nnljfl.service.GoodsService;

@Controller
@RequestMapping("/goods")
public class GoodsController {

	@Autowired
	private GoodsService goodsService;
	
	
	@RequestMapping(value="/update/{id}",method=RequestMethod.PUT)
	@ResponseBody
	public Msg updateGoods(@PathVariable("id")Integer id){
		System.out.println(id);
		goodsService.updateState(id);
		return Msg.success();
	}
	
	@RequestMapping("/getorder")
	@ResponseBody
	public Msg getOrder(@RequestParam(value="pn",defaultValue="1")Integer pn,Model model){
		PageHelper.startPage(pn,10);
		List<Goods> gList = goodsService.pageQuery();
		PageInfo page = new PageInfo(gList,10);
		return Msg.success().add("pageInfo", page);
	}
	
	@RequestMapping("/index")
	public String index(){
		return "admin/goods";
	}
}
