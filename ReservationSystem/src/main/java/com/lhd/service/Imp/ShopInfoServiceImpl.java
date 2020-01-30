package com.lhd.service.Imp;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lhd.dao.ClassificationTypeMapper;
import com.lhd.dao.ClassificationofGoodsItemMapper;
import com.lhd.entity.ClassificationType;
import com.lhd.entity.ClassificationofGoodsItem;
import com.lhd.service.ShopInfoService;

@Service("ShopInfoService")
public class ShopInfoServiceImpl implements ShopInfoService{
	@Autowired
	private ClassificationTypeMapper classificationTypeMapper ;
	
	@Autowired
	private ClassificationofGoodsItemMapper classificationofGoodsItemMapper ;
	
	public ClassificationType  findById (Integer id) {
		ClassificationType classificationType = classificationTypeMapper.selectByPrimaryKey(id) ;
		return classificationType ;
	}

	@Override
	public List<ClassificationofGoodsItem> goodsItemsById(Integer id) {
		List<ClassificationofGoodsItem> goodsItemsById = classificationofGoodsItemMapper.goodsItemsById(id) ;
		return goodsItemsById;
	}

	/**
	 * 根据品牌和价格搜索
	 */
	@Override
	public List<ClassificationofGoodsItem> searchByBrandAndMoney(String brand, Integer moneyOne, Integer moneyTow) {
		List<ClassificationofGoodsItem> list = new ArrayList<ClassificationofGoodsItem>() ;
		if ( moneyOne == null && moneyTow == null ) {
			 list = classificationofGoodsItemMapper.searchByBrandsOrPrice(brand, null, null) ;
		} else {
			list = classificationofGoodsItemMapper.searchByBrandsOrPrice(brand, moneyOne, moneyTow) ;
		}
		return list;
	}


}
