package com.nnljfl.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nnljfl.bean.CeShi;
import com.nnljfl.dao.CeShiMapper;

@Service
public class CeShiService {

	@Autowired
	private CeShiMapper ceShiMapper;

	public List<CeShi> queryCeShiAll() {
	
		return ceShiMapper.selectByExample(null);
	}

	public CeShi queryResult(Integer csId, Integer typeId) {
		return ceShiMapper.selectResult(csId,typeId);
		
	}

	

	
	
}
