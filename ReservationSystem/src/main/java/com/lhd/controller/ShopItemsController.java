package com.lhd.controller;

import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import com.lhd.entity.ClassificationofGoodsItem;
import com.lhd.service.ShopItemsService;

@Controller
@RequestMapping("/shopItems")
public class ShopItemsController {
	
	@Autowired
	private ShopItemsService shopItemsService ;
	
	/**
	 * 搜索框
	 * @param name
	 * @param model
	 */
	@RequestMapping("/search")
	public String  seachShopItems (@Param("name") String name , Model model) {
		List<ClassificationofGoodsItem> list = shopItemsService.seachShop(name) ;
		List<String> bList = new ArrayList<String>();
		//品牌名称可能相同 在此处把品牌重新存入新集合中
		if ( list.size() > 0 ) {
			model.addAttribute("seList", list) ;
			for ( int i = 0 ; i < list.size() ; i++ ) {
				String brand = list.get(i).getBrand();
				if ( ! bList.contains(brand) ) {
					bList.add(brand) ;
				}
			}
			model.addAttribute("bList", bList) ;
			return "searchList" ;
		} else {
			return "Error" ;
		}
	}

}
