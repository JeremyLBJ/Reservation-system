<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>登录</title>
 <link rel="icon" href="${pageContext.request.contextPath}images/asset-favicon.ico">
<link rel="stylesheet" href="${pageContext.request.contextPath}css/base.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}css/login.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}css/iconfont.css">
    <script src="${pageContext.request.contextPath}js/jquery-1.11.1.min.js"></script>
    <script src="${pageContext.request.contextPath}js/jquery.validate.js"></script>
    <script src="${pageContext.request.contextPath}js/login.js"></script>
</head>
<body>
<div class="header">
            <a href="#"><img src="${pageContext.request.contextPath}images/Login/denglu1.png" alt=""></a>
</div>
<div class="main">
        <img src="${pageContext.request.contextPath}images/Login/denglu2.jpg" alt="">
        <div class="login">
            <form>
                <div class="name"><input name="uname" /></div>
                <div class="pwd"><input  name="upwd" type="password" /></div>
                <div class="wj"><input type="checkbox"/> 下次自动登录
                    <a href="#">忘记密码？</a></div>
                <div class="dl"><button>登 录</button></div>
                <div class="zc"><span></span>微信
                    <a href="#">立即注册？</a></div>
            </form>
        </div>
</div>
<div class="footer">
    <div class="footer-content">
        <div class="shang">
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
                <dt>
                    <a href="#">多商学院</a>
                </dt>
            </dl>
            <a href="#"></a>
        </div>
        <div>
            <img src="${pageContext.request.contextPath}images/index/shangbiao/shangbiao1.jpg" height="49" width="353"/><img src="${pageContext.request.contextPath}images/index/shangbiao/shangbiao2.png" height="30" width="83"/><img src="${pageContext.request.contextPath}images/index/shangbiao/shangbiao3.png" height="33" width="86"/>
        </div>
        <div>
            <a href="#">关于我们</a>
            <span>|</span>
            <a href="#"> 用户帮助</a>
            <span>|</span>
            <a href="#"> 法律声明</a>
            <span>|</span>
            <a href="#"> 联系我们</a>
            <span>|</span>
            <a href="#"> 多商学院</a>
            <span>|</span>
            <a href="#">经营证照</a>
            <span>|</span>
        </div>
        <div>
            <p>趋势动力旗下广州友商信息科技有限公司版权所有©2005-2019 粤ICP备11099332号 站长统计</p>
            <p>多商网-珠三角云供应链平台，支持淘宝代销、网店代理，免费提供一件代发</p>
            <p>地址: 广州市中山大道89号天河软件园华景园区B栋西梯五楼 电话：400-616-3518</p>
        </div>
        </div>
</div>
</body>
</html>