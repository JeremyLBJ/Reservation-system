package com.lhd.user;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.lhd.ReservationSystemAppliction;
import com.lhd.entity.ClassificationType;
import com.lhd.entity.ClassificationofGoodsItem;
import com.lhd.service.DetailService;
import com.lhd.service.ShopInfoService;
import com.lhd.service.ShopItemsService;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = ReservationSystemAppliction.class)
@MapperScan("com.lhd.dao")
public class ShopInfoTest {
	
	@Autowired
	private ShopInfoService shopInfoService ;
	
	@Autowired
	private DetailService detailService ;
	
	@Autowired
	private ShopItemsService shopItemsService ;
	
	@Test
	public void shop () {
		ClassificationType findById = shopInfoService.findById(1);
		
		System.out.println(findById+"::::findById");
	}
	
	/**
	 * 模糊查询
	 */
	@Test
	public void shopTest () {
		List<ClassificationofGoodsItem> list = shopItemsService.seachShop("安踏");
		System.out.println(list+":::::list");
	}
	
	@Test
	public void shopInfo () {
		List<ClassificationofGoodsItem> list = detailService.findItemById(1) ;
		System.out.println(list+":::::list");
	}
	
	@Test
	public void shopFindById () {
		ClassificationType findById = shopInfoService.findById(16);
		System.out.println(findById.getName()+"::::");
	}

}
