package com.nnljfl.controller;


import static org.hamcrest.CoreMatchers.nullValue;

import java.util.ArrayList;
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
import com.nnljfl.bean.Msg;
import com.nnljfl.bean.Rubbish;
import com.nnljfl.service.RubbishService;

@Controller
@RequestMapping("/rubbish")
public class RubbishController {
	
	@Autowired
	private RubbishService rubbishService;
	
	/***
	 * 更新
	 * @param rubbish
	 * @return
	 */
	@RequestMapping(value="/edit/{rubbishId}",method=RequestMethod.PUT)
	@ResponseBody
	public Msg editRubbish(Rubbish rubbish){
		System.out.println(rubbish);
		rubbishService.updateRubbish(rubbish);
		return Msg.success();
	}
	
	@RequestMapping(value="/delete/{ids}",method=RequestMethod.DELETE)
	@ResponseBody
	public Msg deleteById(@PathVariable("ids")String ids){
		//批量删除
		if(ids.contains("-")){
			List<Integer> del_ids = new ArrayList<>();
			String [] str_ids =ids.split("-");
			for (String string : str_ids) {
				del_ids.add(Integer.parseInt(string));
			}
			
			rubbishService.deleteBatch(del_ids);
		}else {
			//单个删除
			Integer id = Integer.parseInt(ids);
			rubbishService.deleteRubbish(id);
		}
		
		return Msg.success();
	}
	
	@RequestMapping(value="/getAll/{id}",method=RequestMethod.GET)
	@ResponseBody
	public Msg getAll(@PathVariable("id")Integer id){
		Rubbish rubbish = rubbishService.getAll(id);
		return Msg.success().add("rubbish", rubbish);
	}
	
	@RequestMapping("/getRubbish")
	@ResponseBody
	public Rubbish getRubbish(String name){
		
		System.out.println(name);
		Rubbish rubbish=rubbishService.queryRubbishByName(name);
		System.out.println(rubbish);
		return rubbish;
	}
	
	@RequestMapping(value="/saverubbish",method=RequestMethod.POST)
	@ResponseBody
	public Msg saveRubbish(Rubbish rubbish){
		rubbishService.saveRubbish(rubbish);
		
		return Msg.success();
	}
	
	@RequestMapping("/adrubbish")
	@ResponseBody
	public Msg getRubbishWithJson(@RequestParam(value="pn",defaultValue="1")Integer pn,Model model){
		
		//分页查询
				PageHelper.startPage(pn,10);
				List<Rubbish> rubbishs = rubbishService.pageQuery();
				//System.out.println(rubbishs);
				PageInfo page = new PageInfo(rubbishs,10);
				return Msg.success().add("pageInfo", page);
	}
	/***
	 * 垃圾首页
	 * @param pageno
	 * @param pagesize
	 * @return
	 */
	@RequestMapping("/index")
	public String rubbish(@RequestParam(value="pn",defaultValue="1") Integer pn,Model model){
		
		//分页查询
		PageHelper.startPage(pn,5);
		List<Rubbish> rubbishs = rubbishService.pageQuery();
		PageInfo page = new PageInfo(rubbishs,10);
		model.addAttribute("pageinfo", page);
		return "rubbish/rubbish";
	}

}
