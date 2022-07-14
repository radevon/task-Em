package com.beloil.spring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.beloil.spring.dao.TextMapper;
import com.beloil.spring.model.Text;

@Service("textService")
public class TextService implements ITextService {

	@Autowired
	private TextMapper textDao;
	
	public int add(Text entity) {
		// TODO Auto-generated method stub
		return textDao.add(entity);
	}


	public int delete(int id) {
		// TODO Auto-generated method stub
		return textDao.delete(id);
	}


	public int update(Text entity) {
		// TODO Auto-generated method stub
		return textDao.update(entity);
	}


	public List<Text> getAll() {
		// TODO Auto-generated method stub
		return textDao.getAll();
	}


	public Text getById(int id) {
		// TODO Auto-generated method stub
		return textDao.getById(id);
	}

}
