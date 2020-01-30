package com.lhd.user;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.lhd.ReservationSystemAppliction;
import com.lhd.dao.ClassificationofGoodsItemMapper;
import com.lhd.dao.ImginfoMapper;
import com.lhd.entity.ClassificationType;
import com.lhd.entity.ClassificationofGoodsItem;
import com.lhd.entity.Imginfo;
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
	
	@Autowired
	private ClassificationofGoodsItemMapper classificationofGoodsItemMapper ;
	
	@Autowired
	private ImginfoMapper ImginfoMapper ;
	
	@Test
	public void shop () {
		ClassificationType findById = shopInfoService.findById(1);
		
		System.out.println(findById+"::::findById");
	}
	
	//熱賣功能測試
	@Test
	public void hotShop () {
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
	
	//根据品牌和价格进行查询
	@Test
	public void searchByBrandOrMoney () {
		List<ClassificationofGoodsItem> list = classificationofGoodsItemMapper.searchByBrandsOrPrice("安踏", null, null) ;
		System.out.println(list);
	}
	
	//分页
	@Test
	public void page () {
		Page<Object> page = PageHelper.startPage(0,2) ;
		List<ClassificationofGoodsItem> list = classificationofGoodsItemMapper.selectByExample(null) ;
		System.out.println(list+""+page.getPages()+page.getTotal());
	}
	
	@Test
	public void classificationofGoodsItemMapper () {
		List<ClassificationofGoodsItem> goodsItemsById = classificationofGoodsItemMapper.goodsItemsById(2) ;
		System.out.println(goodsItemsById);
	}
	
	
	/**
	 * 模糊查询....
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
