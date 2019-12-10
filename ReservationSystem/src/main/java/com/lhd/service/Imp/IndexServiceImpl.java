package com.lhd.service.Imp;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lhd.dao.ClassificationofgoodsMapper;
import com.lhd.entity.Classificationofgoods;
import com.lhd.service.IndexService;

@Service("IndexService")
public class IndexServiceImpl implements IndexService{
	
	private Logger logger = LoggerFactory.getLogger(getClass());	
	
	@Autowired
	private ClassificationofgoodsMapper classificationofgoodsMapper;
	
	public List<Classificationofgoods> findAll () {
		
		logger.info("synchroEnterprises.start =====>> ");
		
		List<Classificationofgoods> list = classificationofgoodsMapper.selectByExample(null);
		return list;
	}

}
