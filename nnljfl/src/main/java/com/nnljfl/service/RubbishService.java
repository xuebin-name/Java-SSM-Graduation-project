package com.nnljfl.service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nnljfl.bean.Rubbish;
import com.nnljfl.bean.RubbishExample;
import com.nnljfl.bean.RubbishExample.Criteria;
import com.nnljfl.dao.RubbishMapper;

@Service
public class RubbishService {

	@Autowired
	private RubbishMapper rubbishMapper;

	public Rubbish queryRubbishByName(String name) {
		
		return rubbishMapper.selectByExampleWithType(name);
	}

	public List<Rubbish> queryAll() {
		return rubbishMapper.selectByExample(null);
	}

	public List<Rubbish> pageQuery() {
		return rubbishMapper.selectByExampleAll(null);
	}

	/***
	 * À¬»ø±£´æ
	 * @param rubbish
	 */
	public void saveRubbish(Rubbish rubbish) {
		// TODO Auto-generated method stub
		rubbishMapper.insertSelective(rubbish);
	}

	public Rubbish getAll(Integer id) {
		// TODO Auto-generated method stub
		Rubbish rubbish = rubbishMapper.selectByPrimaryKey(id);
		return rubbish;
	}

	public void updateRubbish(Rubbish rubbish) {
		// TODO Auto-generated method stub
		rubbishMapper.updateByPrimaryKeySelective(rubbish);
	}

	public void deleteRubbish(Integer id) {
		rubbishMapper.deleteByPrimaryKey(id);
	}

	public void deleteBatch(List<Integer> ids) {
		// TODO Auto-generated method stub
		RubbishExample rubbishExample = new RubbishExample();
		Criteria criteria = rubbishExample.createCriteria();
		criteria.andRubbishIdIn(ids);
		rubbishMapper.deleteByExample(rubbishExample);
	}
	
}
