<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>首页</title>
<script
	src="${pageContext.request.contextPath}../js/jquery-1.11.1.min.js"></script>
<script src="${pageContext.request.contextPath}../js/index.js"></script>
<link rel="icon"
	href="${pageContext.request.contextPath}../images/asset-favicon.ico">
<link rel="stylesheet"
	href="${pageContext.request.contextPath}../css/base.css">
<link rel="stylesheet"
	href="${pageContext.request.contextPath}../css/index.css">
<link rel="stylesheet"
	href="${pageContext.request.contextPath}../css/iconfont.css">

</head>
<body>

	<div class="header">
		<div class="header-content">

			<div class="header-content-zuo">
				<span><a href="#">欢迎来到 B 商城</a></span> <span><a
					href="${pageContext.request.contextPath}../Login/login">请登录</a> | <a href="sign.html">免费注册</a></span>
			</div>
			<div class="header-content-you">
				<ul>
					<li><a href="#">我的多商</a></li>
					<li><a href="#">我的收藏</a></li>
					<li><a href="#">客户服务</a></li>
					<li><a href="#">手机多商</a></li>
				</ul>
			</div>
		</div>
	</div>
	<div class="sousuo">
		<div class="sousuo-content">
			<h1>
				<a href="#"><img src="../images/index/h1.png" alt=""></a>
			</h1>
			<div class="sousuo-content-center">
				<div class="center-sr">
					<img
						src="${pageContext.request.contextPath}../images/index/sousuo.jpg"
						alt=""><input type="" placeholder="搜索 商品/品牌/店铺" /> <img
						src="${pageContext.request.contextPath}../images/index/xiangji.jpg"
						alt="">
				</div>

				<div class="center-rm">
					<dl>
						<dd>热门搜索：</dd>
						<dt>打底衫</dt>
						<dt>童装裙裤</dt>
						<dt>连体衣</dt>
						<dt>童装T恤</dt>
						<dt>奴曼伦N19香芬香</dt>
						<dt>T恤女</dt>
					</dl>
				</div>
			</div>
			<div class="sousuo-content-cy">
				<img
					src="http://cdn.img.ecduo.cn/ecduo/Uploads/Picture/2018-10/5bbf17f099a13.png"
					alt=""> <img
					src="http://cdn.img.ecduo.cn/ecduo/Uploads/Picture/2018-10/5bbf17f13431c.png">
			</div>
		</div>
	</div>
	<div class="nav-shang">
		<div class="nav-shang-content">
			<div class="shan-content-zuo">
				<a href="#"><span class="iconfont icon-suoyou"></span>所有分类</a>
				<ul>
					<c:forEach items="${fList}" var="f" varStatus="stat">
						<li><a><span
								class="iconfont icon-style${stat.count }"></span> ${f.ctypename }></a>
							<div class="nvzhuang-nav tong">
								<c:forEach items="${f.classificationof}" var="cL">
									<dl>
										<dt>${cL.cOfName }：</dt>
										<c:forEach items="${cL.classificationtype }" var="cT">
											<dd>
												<a href="${pageContext.request.contextPath}../shopInfo/shopsInfo?id=${cT.id}">${cT.name }</a>
											</dd>
										</c:forEach>
									</dl>
								</c:forEach>
							</div></li>
					</c:forEach>

				</ul>
			</div>
			<ol>
				<li><a href="#">首页</a></li>
				<li><a href="#">报活动</a></li>
				<li><a href="#">9.9专区</a></li>
				<li><a href="#">拼多多爆款</a></li>
				<li><a href="#">品牌馆</a></li>
				<li><a href="#">自媒体专区</a></li>
				<li><a href="#">实体专供</a></li>
				<li><a href="#">微商代发</a></li>
			</ol>
		</div>
	</div>
	<div class="nav-xia">
		<div class="nav-content">
			<div class="nav-content-lunbotu">
				<ul>
					<li><img
						src="${pageContext.request.contextPath}../images/index/lunbotu/lunbotu1.jpg"
						alt=""></li>
					<li><img
						src="${pageContext.request.contextPath}../images/index/lunbotu/lunbotu2.jpg"
						alt=""></li>
					<li><img
						src="${pageContext.request.contextPath}../images/index/lunbotu/lunbotu3.jpg"
						alt=""></li>
					<li><img
						src="${pageContext.request.contextPath}../images/index/lunbotu/lunbotu4.png"
						alt=""></li>
				</ul>
				<div class="left"><</div>
				<div class="right">></div>
			</div>
			<div class="nav-content-yonghu">
				<div class="yonghu-a">
					<img
						src="${pageContext.request.contextPath}../images/index/touxiang.jpg"
						alt=""> <span><em>Hi!欢迎来到多商！</em>您还未登录哦~</span> <span>
						<a href="sign.html" class="a">注册</a> <a href="Login.html">登录</a>
					</span>
				</div>
				<div class="yonghu-b">
					待付款<span>0</span><b>|</b> 代发货<span>0</span><b>|</b> 已完成<span>0</span><b>|</b>
				</div>
				<div class="yonghu-c">
					<div class="yonghu-c-nav">
						<a href="#" class="a-yangshi">公告</a> <a href="#">保障</a>
					</div>
					<ul>
						<li><a href="#" class="li-a-yangshi"><img
								src="../images/index/text_ico_org_3.png" alt="">淘宝活动实战：美妆网店如何日销千单
						</a></li>
						<li><a href="#" class="li-a-yangshi"><img
								src="${pageContext.request.contextPath}../images/index/text_ico_org_3.png"
								alt="">"一天之钻"9、9包邮 </a></li>
						<li><a href="#"><img
								src="${pageContext.request.contextPath}../images/index/text_ico_org_3.png"
								alt="">"B商助理"订购说明</a></li>
						<li><a href="#"><img
								src="${pageContext.request.contextPath}../images/index/text_ico_org_3.png"
								alt="">淘宝数据包上传教程</a></li>
					</ul>
					<ol>
						<li><a href="#" class="li-a-yangshi"><img
								src="${pageContext.request.contextPath}../images/index/text_ico_org_3.png"
								alt="">常见问题</a></li>
						<li><a href="#" class="li-a-yangshi"><img
								src="${pageContext.request.contextPath}../images/index/text_ico_org_3.png"
								alt="">售后服务</a></li>
						<li><a href="#"><img
								src="${pageContext.request.contextPath}../images/index/text_ico_org_3.png"
								alt="">违规处理</a></li>
						<li><a href="#"><img
								src="${pageContext.request.contextPath}../images/index/text_ico_org_3.png"
								alt="">安全支付保障</a></li>
					</ol>

				</div>
				<div class="yonghu-d">
					<div>
						<span class="iconfont icon-qian"></span>源头价
					</div>
					<div>
						<span class="iconfont icon-wodehuoyuan"></span>好货源
					</div>
					<div>
						<span class="iconfont icon-tab_baozhang"></span>有保障
					</div>
				</div>
				<div class="yonghu-e">
					<h3>分销商代销流程</h3>
					<span class="iconfont icon-dui"></span><span
						class="iconfont icon-dui"></span><span class="iconfont icon-dui"></span><span
						class="iconfont icon-dui"></span>
					<ul>
						<li>注册多商会员</li>
						<li>选择合适的产品</li>
						<li>一键上架到淘宝店</li>
						<li>成功代销</li>
					</ul>
				</div>
			</div>
		</div>
	</div>
	<div class="maosha">
		<div class="maosha-content">
			<h2>多商秒杀</h2>
			<b>距离结束</b>
			<!-- <div id="flipcountdownbox1">
            <div class="xdsoft_flipcountdown xdsoft_size_md"><div class="xdsoft_digit" style="background-position: 0px -625px;"></div><div class="xdsoft_digit" style="background-position: 0px -313px;"></div><div class="xdsoft_digit xdsoft_separator"></div><div class="xdsoft_digit" style="background-position: 0px -1px;"></div><div class="xdsoft_digit" style="background-position: 0px -313px;"></div><div class="xdsoft_digit xdsoft_separator"></div><div class="xdsoft_digit" style="background-position: 0px -1249px;"></div><div class="xdsoft_digit" style="background-position: 0px -313px;"></div><div class="xdsoft_clearex"></div></div>
        </div> -->
			<div class="maosha-content-lunbotu">
				<ul>
					<li><a href="#"><img
							src="${pageContext.request.contextPath}../images/index/miaosha1.jpg"
							alt="">
							<div class="maosha-xq">
								<p>【活动款】东方龙崛起 时尚休闲裤 1858</p>
								<div>
									<p></p>
									<span>已售80%</span>
								</div>
								<p>已抢4件</p>
								<p>
									秒杀价 <em>￥99.90</em><i>￥114.00</i>
								</p>
							</div> </a></li>
					<li><a href="#"><img
							src="${pageContext.request.contextPath}../images/index/miaosha2.jpg"
							alt="">
							<div class="maosha-xq">
								<p>ANAN 春夏高低扣九分萝卜裤 8601</p>
								<div>
									<p></p>
									<span>已售60%</span>
								</div>
								<p>已抢3件</p>
								<p>
									秒杀价 <em>￥29.90</em><i>￥79.00</i>
								</p>
							</div> </a></li>
					<li><a href="#"><img
							src="${pageContext.request.contextPath}../images/index/miaosha3.jpg"
							alt="">
							<div class="maosha-xq">
								<p>ANAN 新款韩版宽松显瘦大口袋萝卜裤女裤 8616</p>
								<div>
									<p></p>
									<span>已售100%</span>
								</div>
								<p>已抢5件</p>
								<p>
									秒杀价 <em>￥29.90</em><i>￥99.00</i>
								</p>
							</div> </a></li>
				</ul>
			</div>

		</div>
	</div>
	<div class="main-nvzhnag">
		<div class="main-nvzhnag-content">
			<p>
				女装货源<i> </i>
			</p>
			<div class="nvzhang-zuo">
				<img
					src="${pageContext.request.contextPath}../images/index/nvzhuanghuoyuan/nvzhuang1.jpg"
					alt="">
				<ul>
					<li><a href="#">T恤</a></li>
					<li><a href="#">卫衣</a></li>
					<li><a href="#">衬衫</a></li>
					<li><a href="#">雪纺/蕾丝衫</a></li>
					<li><a href="#">连衣裙</a></li>
					<li><a href="#">半身裙</a></li>
					<li><a href="#">套装裙</a></li>
					<li><a href="#">开衫</a></li>
					<li><a href="#">套头</a></li>
				</ul>
			</div>
			<div class="nvzhang-zhong">
				<ul>
					<li><img
						src="${pageContext.request.contextPath}../images/index/nvzhuanghuoyuan/nvzhuang2.jpg"
						alt=""></li>
					<li><img
						src="${pageContext.request.contextPath}../images/index/nvzhuanghuoyuan/nvzhuang3.jpg"
						alt=""></li>
					<li><img
						src="${pageContext.request.contextPath}../images/index/nvzhuanghuoyuan/nvzhuang4.jpg"
						alt=""></li>
					<li><img
						src="${pageContext.request.contextPath}../images/index/nvzhuanghuoyuan/nvzhuang5.jpg"
						alt=""></li>
				</ul>
			</div>
			<div class="nvzhang-you">
				<div class="nvzhang-you-shang">
					<h4>新鲜抢批</h4>
					<ul>
						<li></li>
						<li></li>
						<li></li>
					</ul>
				</div>
				<div class="nvzhang-you-xia">
					<ol>
						<li>
							<ul>
								<li><a href="detail.html" target="_blank"><img
										src="${pageContext.request.contextPath}../images/index/nvzhuanghuoyuan/nvzhuang6.jpg"
										alt=""></a>
									<div>
										<p>晴舒 新款春秋装英伦风韩版复古格纹chic小西装外套女</p>
										<p>
											<span>￥</span>127.70
										</p>
										<p>已售685</p>
									</div></li>
								<li><img
									src="${pageContext.request.contextPath}../images/index/nvzhuanghuoyuan/nvzhuang7.jpg"
									alt="">
									<div>
										<p>晴舒 2019年新款烧花波浪边针织高弹长袖打底衫女</p>
										<p>
											<span>￥</span>48.90
										</p>
										<p>已售884</p>
									</div></li>
								<li><img
									src="${pageContext.request.contextPath}../images/index/nvzhuanghuoyuan/nvzhuang8.jpg"
									alt="">
									<div>
										<p>晴舒 2019年新款 长袖条纹坑条针织T恤打底衫女</p>
										<p>
											<span>￥</span>140.40
										</p>
										<p>已售885</p>
									</div></li>
								<li><img
									src="${pageContext.request.contextPath}../images/index/nvzhuanghuoyuan/nvzhuang9.jpg"
									alt="">
									<div>
										<p>【预售款】晴舒 2019年春季新款 INS风简约休闲字母标语印花长袖T恤女</p>
										<p>
											<span>￥</span>41.50
										</p>
										<p>已售954</p>
									</div></li>
							</ul>
						</li>
						<li>
							<ul>
								<li><img
									src="${pageContext.request.contextPath}../images/index/nvzhuanghuoyuan/nvzhuang10.jpg"
									alt="">
									<div>
										<p>晴舒 女款时尚上衣 WG181106</p>
										<p>
											<span>￥</span>83.00
										</p>
										<p>已售602</p>
									</div></li>
								<li><img
									src="${pageContext.request.contextPath}../images/index/nvzhuanghuoyuan/nvzhuang11.jpg"
									alt="">
									<div>
										<p>【预售款】晴舒 学院风袖口拼接长袖小西装外套女</p>
										<p>
											<span>￥</span>145.70
										</p>
										<p>已售431</p>
									</div></li>
								<li><img
									src="${pageContext.request.contextPath}../images/index/nvzhuanghuoyuan/nvzhuang12.jpg"
									alt="">
									<div>
										<p>晴舒 慵懒风韩版偏厚针织长款连衣裙女</p>
										<p>
											<span>￥</span>87.20
										</p>
										<p>已售632</p>
									</div></li>
								<li><img
									src="${pageContext.request.contextPath}../images/index/nvzhuanghuoyuan/nvzhuang13.jpg"
									alt="">
									<div>
										<p>晴舒 2019年新款春秋季法式少女蝴蝶结绑带长袖印花连衣裙女</p>
										<p>
											<span>￥</span>85.10
										</p>
										<p>已售358</p>
									</div></li>
							</ul>
						</li>
						<li>
							<ul>
								<li><img
									src="${pageContext.request.contextPath}../images/index/nvzhuanghuoyuan/nvzhuang14.jpg"
									alt="">
									<div>
										<p>晴舒 2019年春秋季简约优雅绑带长袖针织连衣裙女</p>
										<p>
											<span>￥</span>70.20
										</p>
										<p>已售576</p>
									</div></li>
								<li><img
									src="${pageContext.request.contextPath}../images/index/nvzhuanghuoyuan/nvzhuang15.jpg"
									alt="">
									<div>
										<p>晴舒 复古中高腰咖色格纹直筒裤小脚裤女</p>
										<p>
											<span>￥</span>86.20
										</p>
										<p>已售580</p>
									</div></li>
							</ul>
						</li>
					</ol>
				</div>
			</div>
		</div>
	</div>
	
	
	
	<div class="main-xiangbao">
		<div class="main-xiangbao-content">
			<p>
				箱包货源<i> </i>
			</p>
			<div class="xiangbao-you">
				<div class="xiangbao-you-shang">
					<h4>新鲜抢批</h4>
					<ul>
						<li></li>
						<li></li>

					</ul>
				</div>
				<div class="xiangbao-you-xia">
					<ol>
						<li>
							<ul>
								<li><img
									src="${pageContext.request.contextPath}../images/index/xiangbaohuoyuan/xiangbao6.jpg"
									alt="">
									<div>
										<p>至缘 P085</p>
										<p>
											<span>￥</span>11.70
										</p>
										<p>已售475</p>
									</div></li>
								<li><img
									src="${pageContext.request.contextPath}../images/index/xiangbaohuoyuan/xiangbao7.jpg"
									alt="">
									<div>
										<p>至缘 P081</p>
										<p>
											<span>￥</span>10.60
										</p>
										<p>已售535</p>
									</div></li>
								<li><img
									src="${pageContext.request.contextPath}../images/index/xiangbaohuoyuan/xiangbao8.jpg"
									alt="">
									<div>
										<p>至缘斜挎包ZK023</p>
										<p>
											<span>￥</span>30.90
										</p>
										<p>已售879</p>
									</div></li>
								<li><img
									src="${pageContext.request.contextPath}../images/index/xiangbaohuoyuan/xiangbao9.jpg"
									alt="">
									<div>
										<p>起风了 至缘斜跨手提包Q176</p>
										<p>
											<span>￥</span>24.50
										</p>
										<p>已售972</p>
									</div></li>
							</ul>
						</li>
						<li>
							<ul>
								<li><img
									src="${pageContext.request.contextPath}../images/index/xiangbaohuoyuan/xiangbao10.jpg"
									alt="">
									<div>
										<p>至缘 P048</p>
										<p>
											<span>￥</span>8.50
										</p>
										<p>已售960</p>
									</div></li>
								<li><img
									src="${pageContext.request.contextPath}../images/index/xiangbaohuoyuan/xiangbao11.png"
									alt="">
									<div>
										<p>至缘新款宽带单肩包 U080</p>
										<p>
											<span>￥</span>38.30
										</p>
										<p>已售890</p>
									</div></li>
								<li><img
									src="${pageContext.request.contextPath}../images/index/xiangbaohuoyuan/xiangbao12.jpg"
									alt="">
									<div>
										<p>至缘 WW10</p>
										<p>
											<span>￥</span>24.00
										</p>
										<p>已售477</p>
									</div></li>
								<li><img
									src="${pageContext.request.contextPath}../images/index/xiangbaohuoyuan/xiangbao13.jpg"
									alt="">
									<div>
										<p>宇洛 妈咪包YL1708</p>
										<p>
											<span>￥</span>60.60
										</p>
										<p>已售1100</p>
									</div></li>
							</ul>
						</li>

					</ol>
				</div>
			</div>
			<div class="xiangbao-zuo">
				<img
					src="${pageContext.request.contextPath}../images/index/xiangbaohuoyuan/xiangbao1.jpg"
					alt="">
				<ul>
					<li><a href="#">真皮包</a></li>
					<li><a href="#">单肩包</a></li>
					<li><a href="#">女士钱包</a></li>
					<li><a href="#">小方包</a></li>
					<li><a href="#">手提包</a></li>
					<li><a href="#">斜挎包</a></li>
					<li><a href="#">晚宴包</a></li>
					<li><a href="#">手拿包</a></li>
					<li><a href="#">出街潮搭</a></li>
				</ul>
			</div>
			<div class="xiangbao-zhong">
				<ul>
					<li><img
						src="${pageContext.request.contextPath}../images/index/xiangbaohuoyuan/xiangbao2.jpg"
						alt=""></li>
					<li><img
						src="${pageContext.request.contextPath}../images/index/xiangbaohuoyuan/xiangbao3.jpg"
						alt=""></li>
					<li><img
						src="${pageContext.request.contextPath}../images/index/xiangbaohuoyuan/xiangbao4.jpg"
						alt=""></li>
					<li><img
						src="${pageContext.request.contextPath}../images/index/xiangbaohuoyuan/xiangbao5.jpg"
						alt=""></li>
				</ul>
			</div>

		</div>
	</div>
	<div class="main-xiexue">
		<div class="main-xiexue-content">
			<p>
				鞋靴货源<i> </i>
			</p>
			<div class="xiexue-zuo">
				<img
					src="${pageContext.request.contextPath}../images/index/xiexuehuoyuan/xiexue1.jpg"
					alt="">
				<ul>
					<li><a href="#">中低跟</a></li>
					<li><a href="#">高跟鞋</a></li>
					<li><a href="#">单鞋</a></li>
					<li><a href="#">短靴</a></li>
					<li><a href="#">中靴</a></li>
					<li><a href="#">长靴</a></li>
					<li><a href="#">凉鞋</a></li>
					<li><a href="#">拖鞋</a></li>
					<li><a href="#">休闲鞋</a></li>
				</ul>
			</div>
			<div class="xiexue-zhong">
				<ul>
					<li><img
						src="${pageContext.request.contextPath}../images/index/xiexuehuoyuan/xiexue2.jpg"
						alt=""></li>
					<li><img
						src="${pageContext.request.contextPath}../images/index/xiexuehuoyuan/xiexue3.jpg"
						alt=""></li>
					<li><img
						src="${pageContext.request.contextPath}../images/index/xiexuehuoyuan/xiexue4.jpg"
						alt=""></li>
					<li><img
						src="${pageContext.request.contextPath}../images/index/xiexuehuoyuan/xiexue5.jpg"
						alt=""></li>
				</ul>
			</div>
			<div class="xiexue-you">
				<div class="xiexue-you-shang">
					<h4>新鲜抢批</h4>
					<ul>
						<li></li>
						<li></li>
						<li></li>
					</ul>
				</div>
				<div class="xiexue-you-xia">
					<ol>
						<li>
							<ul>
								<li><img
									src="${pageContext.request.contextPath}../images/index/xiexuehuoyuan/xiexue6.jpg"
									alt="">
									<div>
										<p>集迦 集迦GEMPLUS性感2018新高跟鞋女细跟尖头女性网红少女 31831104050</p>
										<p>
											<span>￥</span>195.70
										</p>
										<p>已售685</p>
									</div></li>
								<li><img
									src="${pageContext.request.contextPath}../images/index/xiexuehuoyuan/xiexue7.jpg"
									alt="">
									<div>
										<p>集迦 集迦Gemplus秋冬2018新款女士运动厚底袜子鞋韩版百搭欧洲站 31831306070</p>
										<p>
											<span>￥</span>189.40
										</p>
										<p>已售699</p>
									</div></li>
								<li><img
									src="${pageContext.request.contextPath}../images/index/xiexuehuoyuan/xiexue8.jpg"
									alt="">
									<div>
										<p>集迦 集迦GEMPLUS网红女2018新玛丽珍仙女鞋懒人一脚蹬尖头韩版 31831304159</p>
										<p>
											<span>￥</span>133.00
										</p>
										<p>已售652</p>
									</div></li>
								<li><img
									src="${pageContext.request.contextPath}../images/index/xiexuehuoyuan/xiexue9.jpg"
									alt="">
									<div>
										<p>集迦 集迦GEMPLUS社会单鞋女2018新秋乐福鞋鞋懒人一脚蹬仙女韩版 31831205112</p>
										<p>
											<span>￥</span>189.40
										</p>
										<p>已售813</p>
									</div></li>
							</ul>
						</li>
						<li>
							<ul>
								<li><img
									src="${pageContext.request.contextPath}../images/index/xiexuehuoyuan/xiexue10.jpg"
									alt="">
									<div>
										<p>哈驰春季头层牛皮豆豆鞋 英伦套脚鞋男士休闲鞋真皮懒人鞋潮鞋 MF173022</p>
										<p>
											<span>￥</span>289.00
										</p>
										<p>已售710</p>
									</div></li>
								<li><img
									src="${pageContext.request.contextPath}../images/index/xiexuehuoyuan/xiexue11.jpg"
									alt="">
									<div>
										<p>东琪 时尚潮流老爹鞋酷炫百搭松糕厚底运动休闲小白鞋女鞋 116-2</p>
										<p>
											<span>￥</span>85.10
										</p>
										<p>已售900</p>
									</div></li>
								<li><img
									src="${pageContext.request.contextPath}../images/index/xiexuehuoyuan/xiexue12.jpg"
									alt="">
									<div>
										<p>氧气时代 拼色运动鞋女秋冬新款潮流休闲鞋街头潮鞋 YD1801</p>
										<p>
											<span>￥</span>220.50
										</p>
										<p>已售599</p>
									</div></li>
								<li><img
									src="${pageContext.request.contextPath}../images/index/xiexuehuoyuan/xiexue13.jpg"
									alt="">
									<div>
										<p>hattie女鞋 新款女鞋 H180029</p>
										<p>
											<span>￥</span>266.00
										</p>
										<p>已售443</p>
									</div></li>
							</ul>
						</li>
						<li>
							<ul>
								<li><img
									src="${pageContext.request.contextPath}../images/index/xiexuehuoyuan/xiexue14.jpg"
									alt="">
									<div>
										<p>hattie女鞋 18年春夏爆款 H180017</p>
										<p>
											<span>￥</span>298.00
										</p>
										<p>已售604</p>
									</div></li>
								<li><img
									src="${pageContext.request.contextPath}../images/index/xiexuehuoyuan/xiexue15.jpg"
									alt="">
									<div>
										<p>哈驰休闲皮鞋真皮男鞋运动头层牛皮磨砂皮百搭低帮英伦青年工装鞋 MI462929</p>
										<p>
											<span>￥</span>283.00
										</p>
										<p>已售849</p>
									</div></li>
							</ul>
						</li>
					</ol>
				</div>
			</div>
		</div>
	</div>
	<div class="liejian">
		<div class="liejian-content">
			<p>友情链接</p>
			
		</div>
	</div>
	<div class="liejian2">
		<div class="liejian2-content">
			<ul>
				<li><a href="http://www.emay.cn/">流量平台</a> <span>|</span></li>
				<li><a href="http://www.taopuwang.com/">天猫转让</a> <span>|</span></li>
				<li><a href="http://www.meilele.com/shipin/">家居饰品</a> <span>|</span></li>
				<li><a href="http://www.chimatong.com/">尺码通</a> <span>|</span></li>
				<li><a href="http://www.huanlj.com/">换链神器</a> <span>|</span></li>
				<li><a href="http://hot.36578.com">小本创业网</a> <span>|</span></li>
				<li><a href="http://www.ecduo.cn/kaiwangdian.html">如何开网店</a> <span>|</span></li>
				<li><a href="http://zu.dl.fang.com/">大连租房网</a> <span>|</span></li>
				<li><a href="http://top.shang360.com/">品牌加盟</a> <span>|</span></li>
				<li><a href="http://www.ihuashi.cn/">网上花店</a> <span>|</span></li>
				<li><a href="http://www.ecduo.cn/yuebao.html">余额宝</a> <span>|</span></li>
				<li><a href="https://www.eduoduo.com.cn/">鲜花速递</a> <span>|</span></li>
				<li><a href="http://www.1shangbiao.com/">鲜花店</a> <span>|</span></li>
				<li><a href="http://server.zzidc.com">双线服务器</a> <span>|</span></li>
				<li><a href="http://www.vvic.com/" title="搜款网">搜款网</a> <span>|</span></li>
				<li><a href="http://www.azb22.com" title="化妆品代理">化妆品代理</a> <span>|</span></li>
				<li><a href="http://www.taodashi.cn/" title="淘宝网址导航">淘宝网址导航</a>
					<span>|</span></li>
				<li><a href="http://www.huoniuniu.com/" title="货牛牛">货牛牛</a> <span>|</span></li>
				<li><a href="http://www.ecmob.cn/" rel="nofollow" title="电商平台">电商平台</a>
					<span>|</span></li>
				<li><a href="http://www.51taoyang.com/" title="羊毛衫">羊毛衫</a> <span>|</span></li>
				<li><a href="http://www.globalbuy.cc/" title="供求信息">供求信息</a> <span>|</span></li>
				<li><a href="http://gongying.99114.com/" title="B2B供应商">B2B供应商</a>
					<span>|</span></li>
				<li><a href="http://www.jmbao.com/" title="白酒招商加盟">白酒招商加盟</a> <span>|</span></li>
				<li><a href="http://paihang.jiameng.com/" title="加盟店">加盟店</a> <span>|</span></li>
				<li><a href="http://www.aioexpress.com/" title="淘宝转运">淘宝转运</a>
					<span>|</span></li>
				<li><a href="http://fuzhuang.huangye88.com/" title="服装批发网">服装批发网</a>
					<span>|</span></li>
				<li><a href="http://www.yidian51.com/" title="淘宝网店转让">淘宝网店转让</a>
					<span>|</span></li>
				<li><a href="http://www.hy5.com.cn/" title="货源">货源</a> <span>|</span></li>
			</ul>
		</div>
	</div>
	<div class="footer">
		<div class="footer-content-shang">

			<div>
				<dl>
					<dd>关于多商网</dd>
					<dt>
						<a href="#">了解多商网</a>
					</dt>
					<dt>
						<a href="#">加入我们</a>
					</dt>
					<dt>
						<a href="#">联系我们</a>
					</dt>
					<dt>
						<a href="#">常见问题</a>
					</dt>
				</dl>
				<dl>
					<dd>分销商帮助</dd>
					<dt>
						<a href="#">如何成为分销商</a>
					</dt>
					<dt>
						<a href="#">进货&分销上架流程图</a>
					</dt>
				</dl>
				<dl>
					<dd>成长路径</dd>
					<dt>
						<a href="#">分销商成长路径</a>
					</dt>
					<dt>
						<a href="#">转介绍福利</a>
					</dt>
					<dt>
						<a href="#">邀请有奖</a>
					</dt>
				</dl>
				<dl>
					<dd>报活动</dd>
					<dt>
						<a href="#">申报活动</a>
					</dt>
					<dt>
						<a href="#">活动产品</a>
					</dt>

				</dl>
				<dl>
					<dd>供应商帮助</dd>
					<dt>
						<a href="#">如何成为供应商</a>
					</dt>
					<dt>
						<a href="#">我要入驻</a>
					</dt>
					<dt>
						<a href="#">产品上架流程</a>
					</dt>
				</dl>
				<dl>
					<dd>帮助中心</dd>
					<dt>
						<a href="#">找回密码</a>
					</dt>
					<dt>
						<a href="#">常见问题</a>
					</dt>
					
				</dl>
			</div>
		</div>
	
	</div>
	<div class="gudinlan">
		<a href=""></a> <a href=""></a> <a href=""></a> <a href=""></a> <a
			href="" class="xian"></a>
	</div>
	<div class="yin"></div>
	<div class="dingbu2">
		<a href="#dingbu1"></a>
	</div>
	<script type="text/javascript">
		
	</script>
</body>
</html>