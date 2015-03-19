package com.keepthinker.dao.support;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.keepthinker.dao.CityDao;
import com.keepthinker.dao.DaoService;

@Service
public class DaoServiceImpl implements DaoService{
	@Autowired
	private CityDao cityDao;
	public void printlnByCityId(int id){
		System.out.println(cityDao.findById(10));
	}
	public DaoServiceImpl(){
		System.out.println("DaoServiceImpl ");
	}
}
