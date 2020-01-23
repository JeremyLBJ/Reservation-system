package com.lhd.service;

import java.util.List;

import com.lhd.entity.ClassificationofGoodsItem;

public interface DetailService {
	// 关联查询 classification_type 
	List<ClassificationofGoodsItem> findItemById (Integer id) ;
	
	//查询商品表中商品详细信息
	ClassificationofGoodsItem findById (Integer id) ;

}
