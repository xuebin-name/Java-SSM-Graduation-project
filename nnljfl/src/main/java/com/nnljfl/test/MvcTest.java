package com.nnljfl.test;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mock.web.MockHttpServletRequest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;


import com.github.pagehelper.PageInfo;
import com.nnljfl.bean.Rubbish;

@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
@ContextConfiguration(locations={"classpath:applicationContext.xml","file:src/main/webapp/WEB-INF/dispatcherServlet-servlet.xml"})
public class MvcTest {

	@Autowired
	WebApplicationContext context;
	MockMvc mockMvc;
	
	@Before
	public void initmockmvc(){
		
		mockMvc = MockMvcBuilders.webAppContextSetup(context).build();
	}
	@Test
	public void testPage() throws Exception{
		//第13个视频
		MvcResult result =	mockMvc.perform(MockMvcRequestBuilders.get("/rubbish/index").param("pn", "1")).andReturn();
		MockHttpServletRequest request = result.getRequest();
		PageInfo pi =	(PageInfo)request.getAttribute("pageinfo");
		System.out.println("当前页码："+pi.getPageNum());
		System.out.println("总页码："+pi.getPages());
		System.out.println("总记录数："+pi.getTotal());
		System.out.println("连续页码：");
		int [] nums = pi.getNavigatepageNums();
		for(int i:nums){
			System.out.println(" "+i);
		}
		List<Rubbish> list=pi.getList();
		for (Rubbish rubbish : list) {
			System.out.println("id"+rubbish.getRubbishId()+"==========>name"+rubbish.getRubbishName());
		}
	}
	
}
