package com.lhd.service;

import java.util.List;

import com.lhd.entity.ClassificationType;
import com.lhd.entity.ClassificationofGoodsItem;

public interface ShopInfoService {
	
	    //根据id查询
	 ClassificationType  findById  ( Integer id ) ;
	 
	 //classificationof表中的ID关联查询
	 List<ClassificationofGoodsItem> goodsItemsById ( Integer id ) ;
	 
	 //根据价格和品牌筛选
	 List<ClassificationofGoodsItem> searchByBrandAndMoney ( String brand , Integer moneyOne , Integer moneyTow ) ;

}
