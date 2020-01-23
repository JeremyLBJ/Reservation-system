package com.lhd.service;

import java.util.List;

import com.lhd.entity.Classificationofgoods;

public interface IndexService {
	
	List<Classificationofgoods> findAll();
	
	List<Classificationofgoods> findType () ;
	
}
