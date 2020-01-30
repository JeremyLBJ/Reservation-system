package com.lhd.controller;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.github.pagehelper.PageHelper;
import com.lhd.common.Result;
import com.lhd.entity.ClassificationType;
import com.lhd.entity.ClassificationofGoodsItem;
import com.lhd.entity.Imginfo;
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
	
	private Logger logger = LoggerFactory.getLogger(getClass());
	
	//根据类型表中的id查出商品详情表中数据
	@RequestMapping("/shopsInfo")
	public String shopsInfo ( Integer id , Model model) {
		ClassificationType findById = shopInfoService.findById(id) ;
		model.addAttribute("findById", findById) ;
		return "Carts" ; 
	}
	
	@RequestMapping("/shopTypeInfo")
	public String shopTypeInfo ( Integer id , String name , Model model  ) {
		List<ClassificationofGoodsItem> goodsItemsById = shopInfoService.goodsItemsById(id) ;
		List<String> bList = new ArrayList<String>();
		//品牌名称可能相同 在此处把品牌重新存入新集合中
		if ( goodsItemsById.size() > 0 ) {
			for ( int i = 0 ; i < goodsItemsById.size() ; i++ ) {
				String brand = goodsItemsById.get(i).getBrand();
				if ( ! bList.contains(brand) ) {
					bList.add(brand) ;
				}
			}
		}
		model.addAttribute("bList", bList) ;
		model.addAttribute("gList", goodsItemsById ) ;
		return "shopTypeInfo" ;
	}
	
	//根据品牌和价格动态查询
	@RequestMapping("/searchBrandOrMoney")
	@ResponseBody
	public Result searchByBrandOrMoney ( String brand , Integer moneyOne , Integer moneyTow) {
		logger.info("-------根据品牌和价格动态查询------"+ShopInfoController.class.getSimpleName());
		List<ClassificationofGoodsItem> list = shopInfoService.searchByBrandAndMoney(brand, moneyOne, moneyTow) ;
		System.out.println(list);
		if ( list.size() == 0 ) {
			return new Result (0 , "暂时没有此商品" ) ;
		} else {
			return new Result ( 1 , "成功" , list) ;
		}
	}
	
/*	
	//熱賣
	@RequestMapping("/buy")
	public Result buy () {
		PageHelper.startPage(0, 30) ;
		List<ClassificationofGoodsItem> hotBuy = classificationofGoodsItemMapper.hotBuy() ;
		if ( hotBuy.size() > 0 ) {
			List<Imginfo> findImgPath =  new ArrayList<Imginfo>() ;
			List<List<Imginfo>> imgList = new ArrayList<>() ;
			for ( int i = 0 ; i < hotBuy.size() ; i++) {
				Integer id =  hotBuy.get(i).getId() ;
			     List<Imginfo> findImgPaths = ImginfoMapper.findImgPaths(id);
			     hotBuy.get(i).setImginfos(findImgPaths);
			}
			System.out.println(findImgPath);
		}
		System.out.println(hotBuy);
	}
*/
	
}
