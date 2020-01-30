
$(function () {
	//定义一个全局变量接收参数
	var brand = null ;
	var moneyOne = null ;
	var moneyTow = null ;

	//品牌筛选
	    $('.brand').on('click', function() {
		brand = $(this).attr("data-id");
		$.post("../../shopInfo/searchBrandOrMoney", {
			brand : brand,
			moneyOne : moneyOne,
			moneyTow : moneyTow
		}, function(data) {
			if (data != null){
				if (data.code == 1) {
					alert(data.msg);
				} else {
					alert(data.msg);
				}
			} else {
				alert("暂无此商品") ;
			}
		})
	})
    
    //价格区间筛选   因为后面有个 人民币符号 要对值进行两次切割
    $('.money').on('click',function(){
    	var price =  $(this).attr("data-id");
    	var prices = spilt(price , "-");
    	var pricestow = spilt(prices[1] , "￥");
    	//第一个区间
    	moneyOne = prices[0] ; 
    	//第二个区间
    	moneyTow = pricestow[0] ;
    	
    	//价格和品牌同时筛选
    	$.post("../../shopInfo/searchBrandOrMoney", {
			brand : brand,
			moneyOne : moneyOne,
			moneyTow : moneyTow
		}, function(data) {
			if (data != null){
				if (data.code == 1) {
					alert(data.msg);
				} else {
					alert(data.msg);
				}
			} else {
				alert("暂无此商品") ;
			}
		})
    })
    
    
    //分页  上一页
    $('#prev').on('click',function(){
    	var pages = $('.fengYe').html();
    	var mun = spilt(pages , "/");
    	alert(mun[0]);
    })
    
    
    //下一页
    $('#next').on('click',function(){
    	var pages = $('.fengYe').html();
    	var mun = spilt(pages , "/");
    	alert(mun[1]);
    })
    
    //推見 熱賣...
    $('.shopTitle').on('click',function(){
    	var title = $(this).attr("data-id");
    	alert(title);
    })
    
    

})
	//按照 / 切割数据  小数字
	function spilt ( muns , str) {
		var num =  muns.trim().split(str);
		return num ; 
	}

	/**
	 * 根据品牌和价格进行关联筛选 分几种情况 (分点击前后顺序)
	 * 1.根据品牌
	 * 2.根据价格
	 * 3.根据品牌和价格
	 */

