package com.lhd.service.Imp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lhd.dao.ClassificationTypeMapper;
import com.lhd.entity.ClassificationType;
import com.lhd.service.ShopInfoService;

@Service("ShopInfoService")
public class ShopInfoServiceImpl implements ShopInfoService{
	@Autowired
	private ClassificationTypeMapper classificationTypeMapper ;
	
	public ClassificationType  findById (Integer id) {
		ClassificationType classificationType = classificationTypeMapper.selectByPrimaryKey(id) ;
		return classificationType ;
	}
	
	
	

}
