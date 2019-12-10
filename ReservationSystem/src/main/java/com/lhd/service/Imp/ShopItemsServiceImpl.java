package com.lhd.service.Imp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lhd.dao.ClassificationofGoodsItemMapper;
import com.lhd.entity.ClassificationofGoodsItem;
import com.lhd.service.ShopItemsService;

@Service("ShopItemsService")
public class ShopItemsServiceImpl implements ShopItemsService{
	
	@Autowired
	private ClassificationofGoodsItemMapper classificationofGoodsItemMapper ;
	
	public List<ClassificationofGoodsItem> seachShop (String name) {
		List<ClassificationofGoodsItem> fuzzyQuery = classificationofGoodsItemMapper.fuzzyQuery(name);
		return fuzzyQuery ; 
	}

}
