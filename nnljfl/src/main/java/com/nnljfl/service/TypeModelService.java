package com.nnljfl.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nnljfl.bean.TypeModel;
import com.nnljfl.dao.TypeModelMapper;



@Service
public class TypeModelService {

	@Autowired
	private TypeModelMapper typeModelMapper;


	public List<TypeModel> queryAll() {
		List<TypeModel> list = typeModelMapper.selectByExampleWithThrow(null);
		return list;
	}
	
}
