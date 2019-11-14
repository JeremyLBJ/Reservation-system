<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>
<!DOCTYPE html>
<html lang="zh-CN">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
 <script src="${pageContext.request.contextPath}js/jquery-1.11.1.min.js"></script>
    <script src="${pageContext.request.contextPath}js/carts.js"></script>
    <link rel="icon" href="${pageContext.request.contextPath}images/asset-favicon.ico">
    <link rel="stylesheet" href="${pageContext.request.contextPath}css/carts.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}css/base.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}css/iconfont1.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}css/iconfont.css">
<title>购物车</title>
</head>
<body>

<div class="header">
    <div class="header-content">
        <div class="header-zuo">
            <em></em>
            <span></span>
            <a href=""><span class="iconfont icon-xiaoxi"></span>消息</a><a href="">退出</a>
        </div>
        <div class="header-you">
            <ul>
                <li><a href="">多商首页</a></li>
                <li><a href="">我的多商</a></li>
                <li><a href="">购物车</a></li>
                <li><a href="">收藏夹</a></li>
                <li><a href="">在线客服</a></li>
                <li><a href="">手机逛多商</a></li>
                <li><a href="">供应商入住</a></li>
            </ul>
        </div>
    </div>
</div>
<div class="sousuo">
    <div class="sousuo-content">
        <h1>买家中心</h1>
        <div><input type="text"><img src="${pageContext.request.contextPath}images/gouwuche/sousuo.PNG"/>
            <d>搜索</d>
        </div>
    </div>
</div>
<div class="nav">
    <div class="nav-content">
        <dl>
            <dt>您的位置：</dt>
            <dd><a href="">多商网首页</a> <em>></em></dd>
            <dd><a href="">我的多商</a><em>></em></dd>
            <dd><a href="">我的进货车</a></dd>
        </dl>
    </div>
</div>
<div class="main">
    <div class="main-content">
        <div class="img">
            <img src="${pageContext.request.contextPath}images/gouwuche/dsImg_64.jpg"/>
            <span>您的进货车还没有货品！</span><br>
            <span>现在<a href="">去逛逛~</a></span>
        </div>
        <div class="bg">
            <table>
                <thead>
                <tr>
                    <td><input type="checkbox">全选</td>
                    <td>商品信息</td>
                    <td>规格</td>
                    <td>单价</td>
                    <td>总数</td>
                    <td>小计</td>
                    <td>操作</td>
                </tr>
                <tr>
                    <td  colspan="7">供应商：广州晴舒服饰有限公司</td>
                </tr>
                </thead>
                <tbody>

                </tbody>
                <tfoot>
                    <tr>
                        <td colspan="7">已进货商品 <span>  </span> 件 合计（不含运费）： <em>  </em>  <button>计算</button></td>
                    </tr>
                    <tr>
                        <td><label><input type="checkbox">全选</label>&nbsp;&nbsp;&nbsp;<a href="">删除</a></td>
                    </tr>
                </tfoot>
            </table>
        </div>
    </div>
</div>
<div class="lishi">
    <div class="lishi-content">
        <ul>
            <li>最近浏览</li>
            <li>最近收藏</li>
            <li><span><</span><span>></span></li>
        </ul>
        <ol>

        </ol>
    </div>
</div>
<div class="footer">
    <div class="footer-contennt">
        <div class="footer-tou">
            <ul>
                <li><img src="${pageContext.request.contextPath}images/gouwuche/dsImg_21.jpg"/></li>
                <li><img src="${pageContext.request.contextPath}images/gouwuche/dsImg_22.jpg"/></li>
                <li><img src="${pageContext.request.contextPath}images/gouwuche/dsImg_23.jpg"/></li>
                <li><img src="${pageContext.request.contextPath}images/gouwuche/dsImg_24.jpg"/></li>
            </ul>
        </div>
        <div class="footer-zhong">
            <ul>
                <li>联系我们</li>
                <li>(020)28872118 /(020)28872158</li>
                <li>trend@ecmob.cn</li>
                <li></li>
            </ul>
            <dl>
                <dt>关于多商网</dt>
                <dd>了解多商网</dd>
                <dd>加入我们</dd>
                <dd>联系我们</dd>
            </dl>
            <dl>
                <dt>分销商帮助</dt>
                <dd>分销是什么</dd>
                <dd>如何成为分销商</dd>
                <dd>进货分销流程</dd>
            </dl>
            <dl>
                <dt>成长路径</dt>
                <dd>分销商成长路径</dd>
                <dd>转福利介绍</dd>
                <dd>邀请有奖</dd>
            </dl>
            <dl>
                <dt>报活动</dt>
                <dd>马上申请活动</dd>
                <dd>活动相关产品</dd>
                <dd>如何报活动</dd>
            </dl>
            <dl>
                <dt>供应商帮助</dt>
                <dd>如何成为供应商</dd>
                <dd>我要入驻</dd>
                <dd>产品上架流程</dd>
            </dl>
            <dl>
                <dt>帮助中心</dt>
                <dd>找回密码</dd>
                <dd>常见问题</dd>
                <dd>多商学院</dd>
            </dl>
            <c:forEach items="${List}" var="r">
            <dl>
                <dt>${r}</dt>
                <input type="button" id="tno" value="点击">
                
            </dl>
            
            </c:forEach>
        </div>
        <div class="footer-di">
            <span>2019-All rights Reseved</span>
            <span><img src="${pageContext.request.contextPath}images/gouwuche/dsImg_29.jpg"/>
            <img src="${pageContext.request.contextPath}images/gouwuche/dsImg_30.jpg"/>
            <img src="${pageContext.request.contextPath}images/gouwuche/dsImg_31.jpg"/>
            <img src="${pageContext.request.contextPath}images/gouwuche/dsImg_32.jpg"/>
            <img src="${pageContext.request.contextPath}images/gouwuche/dsImg_33.jpg"/>
            <img src="${pageContext.request.contextPath}images/gouwuche/dsImg_34.jpg"/>
            </span>
        </div>
    </div>
</div>
<script type="text/javascript">
$('#tno').click(function(){
	
	$.post('cart',function(data){
		if(data.code==1){
		console.log(data);
		}
	})
})

</script>
</body>
</html>