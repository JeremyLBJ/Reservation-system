package com.lhd.service.Imp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lhd.dao.ClassificationofGoodsItemMapper;
import com.lhd.entity.ClassificationofGoodsItem;
import com.lhd.service.DetailService;

@Service("DetailService")
public class DetailServiceImpl implements DetailService {
	
	@Autowired
	private ClassificationofGoodsItemMapper classificationofGoodsItemMapper ;
	
	//查询商品分类中所关联的商品
	public List<ClassificationofGoodsItem> findItemById (Integer id) {
		List<ClassificationofGoodsItem> findShopInfoById = classificationofGoodsItemMapper.findShopInfoById(id) ;
		return findShopInfoById ; 
	}

	@Override
	public ClassificationofGoodsItem findById(Integer id) {
		ClassificationofGoodsItem item = classificationofGoodsItemMapper.selectByPrimaryKey(id) ;
		return item;
	}

}
