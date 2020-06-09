package com.nnljfl.service;

import org.springframework.stereotype.Service;

import com.nnljfl.bean.TiMu;
import com.nnljfl.dao.TiMuMapper;

@Service
public class TimuService {

	private TiMuMapper tiMuMapper;


	public TiMu querybyid(Integer csId,Integer typeId) {
		//tiMuMapper.selectByTwoid(csId,typeId);
		return tiMuMapper.selectByPrimaryKey(1);
	}
	
	
}
