package com.lhd.controller;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RestController;

import com.lhd.entity.ClassificationofGoodsItem;
import com.lhd.service.ShopItemsService;

@Controller
@RestController("/shopItems")
public class ShopItemsController {
	
	@Autowired
	private ShopItemsService shopItemsService ;
	
	/**
	 * 搜索框
	 * @param name
	 * @param model
	 */
	public void  seachShopItems (@Param("name") String name , Model model) {
		List<ClassificationofGoodsItem> list = shopItemsService.seachShop(name) ;
		model.addAttribute("sList", list) ;
	}

}
