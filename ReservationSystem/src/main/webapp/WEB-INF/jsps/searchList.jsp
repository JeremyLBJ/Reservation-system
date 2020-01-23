<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html lang="zh-CN">

<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <!-- 上述3个meta标签*必须*放在最前面，任何其他内容都*必须*跟随其后！ -->
    <meta name="description" content="">
    <meta name="author" content="">
    <link rel="icon" href="${pageContext.request.contextPath}../img/asset-favicon.ico">
    <title>在线教育网</title>

	<script src="${pageContext.request.contextPath}../js/jquery-1.12.3.min.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}../js/searchList.js"></script>
    <link rel="stylesheet" href="${pageContext.request.contextPath}../plugins/normalize-css/normalize.css" />
    <link rel="stylesheet" href="${pageContext.request.contextPath}../plugins/bootstrap/dist/css/bootstrap.css" />
    <link rel="stylesheet" href="${pageContext.request.contextPath}../css/page-learing-list.css" />
</head>

<body>
    <!-- 页面头部 -->
    <!--头部导航-->
    <header>
        <div class="learingHeader">
            <nav class="navbar">
                <div class="">
                     <div class="nav-list">
                        <ul class="nav navbar-nav">
                            <li class="active"><a href="travel.index.html" target="_blank">首页</a></li>
                            <li><a href="#">登录</a></li>
                            <li><a href="#">用户注册</a></li>
                            <li></li>
                        </ul>
                    </div>

							<!--此处判断用户是否登录  -->
                    <div class="sign-in">
                        <a href="#" class="personal">个人中心<span class="personalIco"></span></a> <a href="#" class="myInfo"><img src="${pageContext.request.contextPath}../img/asset-myImg.jpg" alt=""> 孙老师</a>
                    </div>
                </div>
            </nav>
        </div>
    </header>
    <div class="learing-list">
        <div class="list-box">
            <ul>
                <li id="name"> 填写商品名字或者品牌名字  :  ${ param.name } </li>
            </ul>
            <ul>
                <li>品牌：</li>
                 <c:forEach items="${bList }" var="b">
                	<ol>
                    <li class="brand" data-id="${b}" >${b}</li>
                </ol>
                
                </c:forEach> 
               </ul>
            <ul>
                <li>價格：</li>
                <ol>
                    <li>0-69 ￥</li>
                    <li>69-180 ￥</li>
                    <li>180-399 ￥</li>
                    <li>399-599 ￥</li>
                    <li>599-1000 ￥</li>
                </ol>
            </ul>
        </div>
    </div>

    <div class="container">
        <div class="row">
            <div class="col-md-9 list-row-left">
                <div class="list-cont-left">
                    <div class="tit">
                        <ul class="nav nav-tabs ">
                            <li class="active"><a href="#">推荐</a></li>
                            <li><a href="#">最新</a></li>
                            <li><a href="#">热评</a></li>
                            <div class="page navbar-right">
                                <a href="#" class="prev">
                                    < </a>
                                        <span class="">1/28</span>
                                        <a href="#" class="next"> ></a>
                            </div>
                        </ul>
                    </div>
                    <div class="tab-content">
                        <div class="content-list">
                            <div class="recom-item">
                                <a href="${pageContext.request.contextPath}../Detail/shopInfos?id=0">
									<p>
										<img
											src="${pageContext.request.contextPath}../img/widget-topBg.png"
											height="140px" width="100%" alt="">
										<span class="lab">HOT</span>
									</p>
									<ul>
                                        <li>Think PHP 5.0 博客系统实战项目演练 </li>
                                        <li><span>高级</span> <em> · </em> 1126人在学习</li>
                                    </ul>
                                </a>
                            </div>
                            <div class="recom-item">
                                <a href="#">
                                    <p><img src="${pageContext.request.contextPath}../img/widget-topBg.png" height="140px" width="100%" alt=""><span class="lab">HOT</span></p>
                                    <ul>
                                        <li>Think PHP 5.0 博客系统实战项目演练 </li>
                                        <li><span>高级</span> <em> · </em> 1125人在学习</li>
                                    </ul>
                                </a>
                            </div>
                            <div class="recom-item">
                                <a href="#">
                                    <p><img src="${pageContext.request.contextPath}${pageContext.request.contextPath}../img/widget-topBg.png" height="140px" width="100%" alt=""><span class="lab">HOT</span></p>
                                    <ul>
                                        <li>Think PHP 5.0 博客系统实战项目演练 </li>
                                        <li><span>高级</span> <em> · </em> 1125人在学习</li>
                                    </ul>
                                </a>
                            </div>
                            <div class="recom-item">
                                <a href="#">
                                    <p><img src="${pageContext.request.contextPath}${pageContext.request.contextPath}../img/widget-topBg.png" height="140px" width="100%" alt=""><span class="lab">HOT</span></p>
                                    <ul>
                                        <li>Think PHP 5.0 博客系统实战项目演练 </li>
                                        <li><span>高级</span> <em> · </em> 1125人在学习</li>
                                    </ul>
                                </a>
                            </div>
                            <div class="recom-item">
                                <a href="#">
                                    <p><img src="${pageContext.request.contextPath}${pageContext.request.contextPath}../img/widget-topBg.png" width="100%" alt=""></p>
                                    <ul>
                                        <li>Think PHP 5.0 博客系统实战项目演练 </li>
                                        <li><span>高级</span> <em> · </em> 1125人在学习</li>
                                    </ul>
                                </a>
                            </div>
                            <div class="recom-item">
                                <a href="#">
                                    <p><img src="${pageContext.request.contextPath}${pageContext.request.contextPath}../img/widget-topBg.png" width="100%" alt=""></p>
                                    <ul>
                                        <li>Think PHP 5.0 博客系统实战项目演练 </li>
                                        <li><span>高级</span> <em> · </em> 1125人在学习</li>
                                    </ul>
                                </a>
                            </div>
                            <div class="recom-item">
                                <a href="#">
                                    <p><img src="${pageContext.request.contextPath}${pageContext.request.contextPath}../img/widget-topBg.png" width="100%" alt=""></p>
                                    <ul>
                                        <li>Think PHP 5.0 博客系统实战项目演练 </li>
                                        <li><span>高级</span> <em> · </em> 1125人在学习</li>
                                    </ul>
                                </a>
                            </div>
                            <div class="recom-item">
                                <a href="#">
                                    <p><img src="${pageContext.request.contextPath}../img/widget-topBg.png" width="100%" alt=""></p>
                                    <ul>
                                        <li>Think PHP 5.0 博客系统实战项目演练 </li>
                                        <li><span>高级</span> <em> · </em> 1125人在学习</li>
                                    </ul>
                                </a>
                            </div>
                            <div class="recom-item">
                                <a href="#">
                                    <p><img src="${pageContext.request.contextPath}../img/widget-topBg.png" width="100%" alt=""></p>
                                    <ul>
                                        <li>Think PHP 5.0 博客系统实战项目演练 </li>
                                        <li><span>高级</span> <em> · </em> 1125人在学习</li>
                                    </ul>
                                </a>
                            </div>
                            <div class="recom-item">
                                <a href="#">
                                    <p><img src="${pageContext.request.contextPath}../img/widget-topBg.png" width="100%" alt=""></p>
                                    <ul>
                                        <li>Think PHP 5.0 博客系统实战项目演练 </li>
                                        <li><span>高级</span> <em> · </em> 1125人在学习</li>
                                    </ul>
                                </a>
                            </div>
                            <div class="recom-item">
                                <a href="#">
                                    <p><img src="${pageContext.request.contextPath}../img/widget-topBg.png" width="100%" alt=""></p>
                                    <ul>
                                        <li>Think PHP 5.0 博客系统实战项目演练 </li>
                                        <li><span>高级</span> <em> · </em> 1125人在学习</li>
                                    </ul>
                                </a>
                            </div>
                            <div class="recom-item">
                                <a href="#">
                                    <p><img src="${pageContext.request.contextPath}../img/widget-topBg.png" width="100%" alt=""></p>
                                    <ul>
                                        <li>Think PHP 5.0 博客系统实战项目演练 </li>
                                        <li><span>高级</span> <em> · </em> 1125人在学习</li>
                                    </ul>
                                </a>
                            </div>
                            <div class="recom-item">
                                <a href="#">
                                    <p><img src="${pageContext.request.contextPath}../img/widget-topBg.png" width="100%" alt=""></p>
                                    <ul>
                                        <li>Think PHP 5.0 博客系统实战项目演练 </li>
                                        <li><span>高级</span> <em> · </em> 1125人在学习</li>
                                    </ul>
                                </a>
                            </div>
                            <div class="recom-item">
                                <a href="#">
                                    <p><img src="${pageContext.request.contextPath}../img/widget-topBg.png" width="100%" alt=""></p>
                                    <ul>
                                        <li>Think PHP 5.0 博客系统实战项目演练 </li>
                                        <li><span>高级</span> <em> · </em> 1125人在学习</li>
                                    </ul>
                                </a>
                            </div>
                            <div class="recom-item">
                                <a href="#">
                                    <p><img src="${pageContext.request.contextPath}../img/widget-topBg.png" width="100%" alt=""></p>
                                    <ul>
                                        <li>Think PHP 5.0 博客系统实战项目演练 </li>
                                        <li><span>高级</span> <em> · </em> 1125人在学习</li>
                                    </ul>
                                </a>
                            </div>
                            <div class="recom-item">
                                <a href="#">
                                    <p><img src="${pageContext.request.contextPath}../img/widget-topBg.png" width="100%" alt=""></p>
                                    <ul>
                                        <li>Think PHP 5.0 博客系统实战项目演练 </li>
                                        <li><span>高级</span> <em> · </em> 1125人在学习</li>
                                    </ul>
                                </a>
                            </div>
                            <div class="recom-item">
                                <a href="#">
                                    <p><img src="${pageContext.request.contextPath}../img/widget-topBg.png" width="100%" alt=""></p>
                                    <ul>
                                        <li>Think PHP 5.0 博客系统实战项目演练 </li>
                                        <li><span>高级</span> <em> · </em> 1125人在学习</li>
                                    </ul>
                                </a>
                            </div>
                            <div class="recom-item">
                                <a href="#">
                                    <p><img src="${pageContext.request.contextPath}../img/widget-topBg.png" width="100%" alt=""></p>
                                    <ul>
                                        <li>Think PHP 5.0 博客系统实战项目演练 </li>
                                        <li><span>高级</span> <em> · </em> 1125人在学习</li>
                                    </ul>
                                </a>
                            </div>
                            <div class="recom-item">
                                <a href="#">
                                    <p><img src="${pageContext.request.contextPath}../img/widget-topBg.png" width="100%" alt=""></p>
                                    <ul>
                                        <li>Think PHP 5.0 博客系统实战项目演练 </li>
                                        <li><span>高级</span> <em> · </em> 1125人在学习</li>
                                    </ul>
                                </a>
                            </div>
                            <div class="recom-item">
                                <a href="#">
                                    <p><img src="${pageContext.request.contextPath}../img/widget-topBg.png" width="100%" alt=""></p>
                                    <ul>
                                        <li>Think PHP 5.0 博客系统实战项目演练 </li>
                                        <li><span>高级</span> <em> · </em> 1125人在学习</li>
                                    </ul>
                                </a>
                            </div>
                            <div class="recom-item">
                                <a href="#">
                                    <p><img src="${pageContext.request.contextPath}../img/widget-topBg.png" width="100%" alt=""></p>
                                    <ul>
                                        <li>Think PHP 5.0 博客系统实战项目演练 </li>
                                        <li><span>高级</span> <em> · </em> 1125人在学习</li>
                                    </ul>
                                </a>
                            </div>
                            <div class="recom-item">
                                <a href="#">
                                    <p><img src="${pageContext.request.contextPath}../img/widget-topBg.png" width="100%" alt=""></p>
                                    <ul>
                                        <li>Think PHP 5.0 博客系统实战项目演练 </li>
                                        <li><span>高级</span> <em> · </em> 1125人在学习</li>
                                    </ul>
                                </a>
                            </div>
                            <div class="recom-item">
                                <a href="#">
                                    <p><img src="${pageContext.request.contextPath}../img/widget-topBg.png" width="100%" alt=""></p>
                                    <ul>
                                        <li>Think PHP 5.0 博客系统实战项目演练 </li>
                                        <li><span>高级</span> <em> · </em> 1125人在学习</li>
                                    </ul>
                                </a>
                            </div>
                            <div class="recom-item">
                                <a href="#">
                                    <p><img src="${pageContext.request.contextPath}../img/widget-topBg.png" width="100%" alt=""></p>
                                    <ul>
                                        <li>Think PHP 5.0 博客系统实战项目演练 </li>
                                        <li><span>高级</span> <em> · </em> 1125人在学习</li>
                                    </ul>
                                </a>
                            </div>
                            <div class="recom-item">
                                <a href="#">
                                    <p><img src="${pageContext.request.contextPath}../img/widget-topBg.png" width="100%" alt=""></p>
                                    <ul>
                                        <li>Think PHP 5.0 博客系统实战项目演练 </li>
                                        <li><span>高级</span> <em> · </em> 1125人在学习</li>
                                    </ul>
                                </a>
                            </div>
                            <div class="recom-item">
                                <a href="#">
                                    <p><img src="${pageContext.request.contextPath}../img/widget-topBg.png" width="100%" alt=""></p>
                                    <ul>
                                        <li>Think PHP 5.0 博客系统实战项目演练 </li>
                                        <li><span>高级</span> <em> · </em> 1125人在学习</li>
                                    </ul>
                                </a>
                            </div>
                            <div class="recom-item">
                                <a href="#">
                                    <p><img src="${pageContext.request.contextPath}../img/widget-topBg.png" width="100%" alt=""></p>
                                    <ul>
                                        <li>Think PHP 5.0 博客系统实战项目演练 </li>
                                        <li><span>高级</span> <em> · </em> 1125人在学习</li>
                                    </ul>
                                </a>
                            </div>
                            <div class="recom-item">
                                <a href="#">
                                    <p><img src="${pageContext.request.contextPath}../img/widget-topBg.png" width="100%" alt=""></p>
                                    <ul>
                                        <li>Think PHP 5.0 博客系统实战项目演练 </li>
                                        <li><span>高级</span> <em> · </em> 1125人在学习</li>
                                    </ul>
                                </a>
                            </div>
                            <li class="clearfix"></li>
                        </div>
                        <div class="clearfix"></div>
                    </div>
                </div>
            </div>
            <div class="col-md-3 list-row-rit">
                <div class="list-cont-right">
                    <div class="right-box">
                        <div class="tit">精品TOP榜</div>
                        <div class="contList">
                            <div class="contList-item">
                                <div class="box hov">
                                    <div class="info">
                                        <p>Think PHP 5.0 博客系统实战项目演练</p>
                                        <li><span>高级</span> <em> · </em> 1125人在学习</li>
                                    </div>
                                    <div class="infoImg">
                                        <div><img src="${pageContext.request.contextPath}../img/widget-topBg.png" width="100%" height="110" alt=""></div>
                                        <div class="desc">通过对ThinkPHP框架基础，带领大家由浅入深轻松掌握ThinkPHP的理论基础，更加全面的掌握ThinkPHP框架运行机制……</div>
                                    </div>
                                </div>
                            </div>
                            <div class="contList-item">
                                <div class="box">
                                    <div class="info">
                                        <p>Think PHP 5.0 博客系统实战项目演练</p>
                                        <li><span>高级</span> <em> · </em> 1125人在学习</li>
                                    </div>
                                    <div class="infoImg">
                                        <div><img src="../img/widget-topBg.png" width="100%" height="110" alt=""></div>
                                        <div class="desc">通过对ThinkPHP框架基础，带领大家由浅入深轻松掌握ThinkPHP的理论基础，更加全面的掌握ThinkPHP框架运行机制……</div>
                                    </div>
                                </div>
                            </div>
                            <div class="contList-item">
                                <div class="box">
                                    <div class="info">
                                        <p>Think PHP 5.0 博客系统实战项目演练</p>
                                        <li><span>高级</span> <em> · </em> 1125人在学习</li>
                                    </div>
                                    <div class="infoImg">
                                        <div><img src="../img/widget-topBg.png" width="100%" height="110" alt=""></div>
                                        <div class="desc">通过对ThinkPHP框架基础，带领大家由浅入深轻松掌握ThinkPHP的理论基础，更加全面的掌握ThinkPHP框架运行机制……</div>
                                    </div>
                                </div>
                            </div>
                            <div class="contList-item">
                                <div class="box">
                                    <div class="info">
                                        <p>Think PHP 5.0 博客系统实战项目演练</p>
                                        <li><span>高级</span> <em> · </em> 1125人在学习</li>
                                    </div>
                                    <div class="infoImg">
                                        <div><img src="../img/widget-topBg.png" width="100%" height="110" alt=""></div>
                                        <div class="desc">通过对ThinkPHP框架基础，带领大家由浅入深轻松掌握ThinkPHP的理论基础，更加全面的掌握ThinkPHP框架运行机制……</div>
                                    </div>
                                </div>
                            </div>
                            <div class="contList-item">
                                <div class="box">
                                    <div class="info">
                                        <p>Think PHP 5.0 博客系统实战项目演练</p>
                                        <li><span>高级</span> <em> · </em> 1125人在学习</li>
                                    </div>
                                    <div class="infoImg">
                                        <div><img src="../img/widget-topBg.png" width="100%" height="110" alt=""></div>
                                        <div class="desc">通过对ThinkPHP框架基础，带领大家由浅入深轻松掌握ThinkPHP的理论基础，更加全面的掌握ThinkPHP框架运行机制……</div>
                                    </div>
                                </div>
                            </div>
                            <div class="contList-item">
                                <div class="box">
                                    <div class="info">
                                        <p>Think PHP 5.0 博客系统实战项目演练</p>
                                        <li><span>高级</span> <em> · </em> 1125人在学习</li>
                                    </div>
                                    <div class="infoImg">
                                        <div><img src="../img/widget-topBg.png" width="100%" height="110" alt=""></div>
                                        <div class="desc">通过对ThinkPHP框架基础，带领大家由浅入深轻松掌握ThinkPHP的理论基础，更加全面的掌握ThinkPHP框架运行机制……</div>
                                    </div>
                                </div>
                            </div>
                        </div>

                        <div class="tit">猜你喜欢</div>
                        <div class="contList">
                            <div class="contList-item">
                                <div class="box hov">
                                    <div class="info">
                                        <p>Think PHP 5.0 博客系统实战项目演练</p>
                                        <li><span>高级</span> <em> · </em> 1125人在学习</li>
                                    </div>
                                    <div class="infoImg">
                                        <div><img src="../img/widget-btnbg.png" width="100%" height="110" alt=""></div>
                                        <div class="desc">通过对ThinkPHP框架基础，带领大家由浅入深轻松掌握ThinkPHP的理论基础，更加全面的掌握ThinkPHP框架运行机制……</div>
                                    </div>
                                </div>
                            </div>
                            <div class="contList-item">
                                <div class="box">
                                    <div class="info">
                                        <p>Think PHP 5.0 博客系统实战项目演练</p>
                                        <li><span>高级</span> <em> · </em> 1125人在学习</li>
                                    </div>
                                    <div class="infoImg">
                                        <div><img src="../img/widget-btnbg.png" width="100%" height="110" alt=""></div>
                                        <div class="desc">通过对ThinkPHP框架基础，带领大家由浅入深轻松掌握ThinkPHP的理论基础，更加全面的掌握ThinkPHP框架运行机制……</div>
                                    </div>
                                </div>
                            </div>
                            <div class="contList-item">
                                <div class="box">
                                    <div class="info">
                                        <p>Think PHP 5.0 博客系统实战项目演练</p>
                                        <li><span>高级</span> <em> · </em> 1125人在学习</li>
                                    </div>
                                    <div class="infoImg">
                                        <div><img src="../img/widget-btnbg.png" width="100%" height="110" alt=""></div>
                                        <div class="desc">通过对ThinkPHP框架基础，带领大家由浅入深轻松掌握ThinkPHP的理论基础，更加全面的掌握ThinkPHP框架运行机制……</div>
                                    </div>
                                </div>
                            </div>
                            <div class="contList-item">
                                <div class="box">
                                    <div class="info">
                                        <p>Think PHP 5.0 博客系统实战项目演练</p>
                                        <li><span>高级</span> <em> · </em> 1125人在学习</li>
                                    </div>
                                    <div class="infoImg">
                                        <div><img src="../img/widget-btnbg.png" width="100%" height="110" alt=""></div>
                                        <div class="desc">通过对ThinkPHP框架基础，带领大家由浅入深轻松掌握ThinkPHP的理论基础，更加全面的掌握ThinkPHP框架运行机制……</div>
                                    </div>
                                </div>
                            </div>
                            <div class="contList-item">
                                <div class="box">
                                    <div class="info">
                                        <p>Think PHP 5.0 博客系统实战项目演练</p>
                                        <li><span>高级</span> <em> · </em> 1125人在学习</li>
                                    </div>
                                    <div class="infoImg">
                                        <div><img src="../img/widget-btnbg.png" width="100%" height="110" alt=""></div>
                                        <div class="desc">通过对ThinkPHP框架基础，带领大家由浅入深轻松掌握ThinkPHP的理论基础，更加全面的掌握ThinkPHP框架运行机制……</div>
                                    </div>
                                </div>
                            </div>
                            <div class="contList-item">
                                <div class="box">
                                    <div class="info">
                                        <p>Think PHP 5.0 博客系统实战项目演练</p>
                                        <li><span>高级</span> <em> · </em> 1125人在学习</li>
                                    </div>
                                    <div class="infoImg">
                                        <div><img src="../img/widget-btnbg.png" width="100%" height="110" alt=""></div>
                                        <div class="desc">通过对ThinkPHP框架基础，带领大家由浅入深轻松掌握ThinkPHP的理论基础，更加全面的掌握ThinkPHP框架运行机制……</div>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>
   

    <!-- 页面 css js -->

    <script type="text/javascript" src="${pageContext.request.contextPath}../plugins/jquery/dist/jquery.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}../plugins/bootstrap/dist/js/bootstrap.js"></script>
    <script>
        $('.list-box ol li').on('click', function() {
            $(this).addClass('active');
            $(this).siblings().removeClass('active');
        })


        $('.list-cont-left .nav-tabs li').on('click', function() {
            $(this).addClass("active").siblings().removeClass('active');
        })


        $('.contList-item').hover(function() {
            $(this).find('.box').addClass('hov').parent().siblings().find('.box').removeClass('hov')
        }, function() {
            $(this).siblings().first().find('.box').addClass('hov').parent().siblings().find('.box').removeClass('hov')
        })
    </script>
</body>