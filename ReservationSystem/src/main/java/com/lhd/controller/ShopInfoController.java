package com.lhd.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.lhd.entity.ClassificationType;
import com.lhd.service.ShopInfoService;
/**
 * 商品数据管理
 * @author 
 *
 */
@Controller
@RequestMapping("/shopInfo")
public class ShopInfoController {
	
	@Autowired
	private ShopInfoService shopInfoService ;
	
	//根据类型表中的id查出商品详情表中数据
	@RequestMapping("/shopsInfo")
	public void shopsInfo (Integer id , Model model) {
		ClassificationType findById = shopInfoService.findById(id) ;
		model.addAttribute("findById", findById) ;
		
	}
	

}
