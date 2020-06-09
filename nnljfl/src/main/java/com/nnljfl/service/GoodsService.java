package com.nnljfl.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nnljfl.bean.Goods;
import com.nnljfl.dao.GoodsMapper;

@Service
public class GoodsService {
	@Autowired
	private GoodsMapper goodsMapper;
	
	public void insertOrder(Goods goods) {
		// TODO Auto-generated method stub
		goodsMapper.insertSelective(goods);
	}

	public List<Goods> pageQuery() {
		return goodsMapper.selectByExample(null);
	}

	public void updateState(Integer id) {
		goodsMapper.updateOrderState(id);
	}

}
