package com.lhd.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.lhd.entity.ClassificationType;
import com.lhd.entity.ClassificationofGoodsItem;
import com.lhd.entity.Classificationofgoods;
import com.lhd.service.DetailService;
import com.lhd.service.IndexService;
import com.lhd.service.ShopInfoService;
/**
 * 详情
 * @author ASUS
 *
 */
@Controller
@RequestMapping("/Detail")
public class DetailController {
	
	@Autowired
	private IndexService indexService ; 
	
	@Autowired
	private DetailService detailService ;
	
	@Autowired
	private ShopInfoService shopInfoService ;
	
	
	@RequestMapping("/detail")
	public String detail (Model model) {
		List<Classificationofgoods> list = indexService.findAll();
		model.addAttribute("fList", list);
		return "Detail" ;
	}
	
	/**
	 * 根据classification_type id查询数据   详情页面(查看所有的商品信息)
	 * @param id
	 * @param model
	 * @return
	 */
	@RequestMapping("/shopInfos")
	public String shopInfos ( Integer id , Model model ) {
		ClassificationType findById = shopInfoService.findById(id) ;
		model.addAttribute("slist", findById) ;
		/*List<ClassificationofGoodsItem> list = detailService.findItemById(id) ;
		System.out.println(list);
		if ( list != null && list.size() > 0 ) {
			model.addAttribute("slist", list) ;
		} */
		return "List" ; 
		
	}
	
	/**
	 * 根据classification_type id查询数据   详情页面(查看所有的商品信息)
	 * @param id
	 * @param model
	 * @return
	 */
	@RequestMapping("/shopInfo")
	public String shopInfo ( Integer id , Model model ) {
			// TODO: handle exception
		 ClassificationofGoodsItem item = detailService.findById(id) ;
		 model.addAttribute("iList", item) ;
		return "Detail" ; 
		
	}
	
	@RequestMapping("/detailList")
	public String DetailList (Model model) {
		List<Classificationofgoods> list = indexService.findAll();
		model.addAttribute("fList", list);
		return "List";
	}

}
