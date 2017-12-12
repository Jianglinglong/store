<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="/common/jstl.jspf"%>
<!DOCTYPE html>
<html>

<head>
<base href="${basePath }/" />
<meta charset="UTF-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1.0,maximum-scale=1.0, user-scalable=0">

<title>安全设置</title>

<link href="AmazeUI-2.4.2/assets/css/admin.css" rel="stylesheet"
	type="text/css">
<link href="AmazeUI-2.4.2/assets/css/amazeui.css" rel="stylesheet"
	type="text/css">

<link href="css/personal.css" rel="stylesheet" type="text/css">
<link href="css/infstyle.css" rel="stylesheet" type="text/css">
<script src="AmazeUI-2.4.2/assets/js/jquery.min.js"
	type="text/javascript"></script>
<script src="js/personal.js"></script>
</head>

<body>
	<!--头 -->
	<header>
		<article>
			<div class="mt-logo">
				<!--顶部导航条 -->
				<div class="am-container header">
					<ul class="message-l">
						<div class="topMessage">
							<div class="menu-hd">
									<a href="personalData/list.do" target="_top" class="h">${user.userName }</a>
									<a href="register/list.do" target="_top">免费注册</a>
							</div>
						</div>
					</ul>
					<ul class="message-r">
						<div class="topMessage home">
							<div class="menu-hd">
								<a href="home/list.do" target="_top" class="h">商城首页</a>
							</div>
						</div>
						<div class="topMessage my-shangcheng">
							<div class="menu-hd MyShangcheng">
								<a href="personalData/list.do" target="_top"><i
									class="am-icon-user am-icon-fw"></i>个人中心</a>
							</div>
						</div>
						<div class="topMessage mini-cart">
							<div class="menu-hd">
								<a id="mc-menu-hd" href="javascript:;" target="_top"><i
									class="am-icon-shopping-cart  am-icon-fw"></i><span>购物车</span><strong
									id="J_MiniCartNum" class="h">0</strong></a>
							</div>
						</div>
						<div class="topMessage favorite">
							<div class="menu-hd">
								<a href="favorite/show.do" target="_top"><i
									class="am-icon-heart am-icon-fw"></i><span>收藏夹</span></a>
							</div>
					</ul>
				</div>

				<!--悬浮搜索框-->

				<div class="nav white">
					<div class="logoBig">
						<li><img src="images/logobig.png" /></li>
					</div>

					<div class="search-bar pr">
						<a name="index_none_header_sysc" href="javascript:;"></a>
						<form>
							<input id="searchInput" name="index_none_header_sysc" type="text"
								placeholder="搜索" autocomplete="off"> <input
								id="ai-topsearch" class="submit am-btn" value="搜索" index="1"
								type="submit">
						</form>
					</div>
				</div>

				<div class="clear"></div>
			</div>
			</div>
		</article>
	</header>
	<div class="nav-table">
		<div class="long-title">
			<span class="all-goods">全部分类</span>
		</div>
		<div class="nav-cont">
			<ul>
				<li class="index"><a href="javascript:;">首页</a></li>
				<li class="qc"><a href="javascript:;">闪购</a></li>
				<li class="qc"><a href="javascript:;">限时抢</a></li>
				<li class="qc"><a href="javascript:;">团购</a></li>
				<li class="qc last"><a href="javascript:;">大包装</a></li>
			</ul>
			<div class="nav-extra">
				<i class="am-icon-user-secret am-icon-md nav-user"></i><b></b>我的福利 <i
					class="am-icon-angle-right" style="padding-left: 10px;"></i>
			</div>
		</div>
	</div>
	<b class="line"></b>
	<div class="center">
		<div class="col-main">
			<div class="main-wrap">

				<!--标题 -->
				<div class="user-safety">
					<div class="am-cf am-padding">
						<div class="am-fl am-cf">
							<strong class="am-text-danger am-text-lg">账户安全</strong> / <small>Set&nbsp;up&nbsp;Safety</small>
						</div>
					</div>
					<hr />

					<!--头像 -->
					<div class="user-infoPic">

						<div class="filePic">
							<img class="am-circle am-img-thumbnail"
								src="<c:if test='${user.userPhoto==null }'>images/getAvatar.do.jpg</c:if>
									<c:if test='${user.userPhoto!=null }'>${user.userPhoto}</c:if>"
								alt="" />
						</div>

						<p class="am-form-help">头像</p>

						<div class="info-m">
							<div>
								<b>用户名：<i>${user.userAccount }</i></b>
							</div>
							<div class="safeText">
								<a href="personalData/initSafety.do">账户安全:<em
									style="margin-left: 20px;">60</em>分
								</a>
								<div class="progressBar">
									<span style="left: -95px;" class="progress"></span>
								</div>
							</div>
						</div>
					</div>

					<div class="check">
						<ul>
							<li><i class="i-safety-lock"></i>
								<div class="m-left">
									<div class="fore1">登录密码</div>
									<div class="fore2">
										<small>为保证您购物安全，建议您定期更改密码以保护账户安全。</small>
									</div>
								</div>
								<div class="fore3">
									<a href="personalData/initPassword.do">
										<div class="am-btn am-btn-secondary">修改</div>
									</a>
								</div></li>
							<li><i class="i-safety-wallet"></i>
								<div class="m-left">
									<div class="fore1">支付密码</div>
									<div class="fore2">
										<small>启用支付密码功能，为您资产账户安全加把锁。</small>
									</div>
								</div>
								<div class="fore3">
									<a href="personalData/initSetpay.do">
										<div class="am-btn am-btn-secondary">立即启用</div>
									</a>
								</div></li>
							<li><i class="i-safety-iphone"></i>
								<div class="m-left">
									<div class="fore1">手机验证</div>
									<div class="fore2">
										<small>您验证的手机：若已丢失或停用，请立即更换</small>
									</div>
								</div>
								<div class="fore3">
									<a href="personalData/initBindphone.do">
										<div class="am-btn am-btn-secondary">换绑</div>
									</a>
								</div></li>
							<li><i class="i-safety-mail"></i>
								<div class="m-left">
									<div class="fore1">邮箱验证</div>
									<div class="fore2">
										<small>您验证的邮箱：可用于快速找回登录密码</small>
									</div>
								</div>
								<div class="fore3">
									<a href="personalData/initEmail.do">
										<div class="am-btn am-btn-secondary">换绑</div>
									</a>
								</div></li>
							<li><i class="i-safety-idcard"></i>
								<div class="m-left">
									<div class="fore1">实名认证</div>
									<div class="fore2">
										<small>用于提升账号的安全性和信任级别，认证后不能修改认证信息。</small>
									</div>
								</div>
								<div class="fore3">
									<a href="personalData/initIdcard.do">
										<div class="am-btn am-btn-secondary">认证</div>
									</a>
								</div></li>
							<li><i class="i-safety-security"></i>
								<div class="m-left">
									<div class="fore1">安全问题</div>
									<div class="fore2">
										<small>保护账户安全，验证您身份的工具之一。</small>
									</div>
								</div>
								<div class="fore3">
									<a href="personalData/initQuestion.do">
										<div class="am-btn am-btn-secondary">认证</div>
									</a>
								</div></li>
						</ul>
					</div>

				</div>
			</div>
			<!--底部-->
			<div class="footer">
				<div class="footer-hd">
					<p>
						<a href="javascript:;">恒望科技</a> <b>|</b> <a href="home/list.do">商城首页</a>
						<b>|</b> <a href="javascript:;">支付宝</a> <b>|</b> <a
							href="javascript:;">物流</a>
					</p>
				</div>
				<div class="footer-bd">
					<p>
						<a href="javascript:;">关于恒望</a> <a href="javascript:;">合作伙伴</a> <a
							href="javascript:;">联系我们</a> <a href="javascript:;">网站地图</a>

					</p>
				</div>
			</div>
		</div>

		
				<aside class="menu">
					<ul>
						<li class="person active"><a href="personalData/list.do"
							target="_top"><i class="am-icon-user am-icon-fw"></i>个人中心</a></li>
						<li class="person">
							<p>
								<i class="am-icon-newspaper-o"></i>个人资料
							</p>
							<ul>
								<li><a href="personalData/list.do">个人信息</a></li>
								<li><a href="personalData/initSafety.do">安全设置</a></li>
								<li><a href="personalData/initAddress.do">地址管理</a></li>
								<li><a href="personalData/initCardlist.do">快捷支付</a></li>
							</ul>
						</li>
						<li class="person">
							<p>
								<i class="am-icon-balance-scale"></i>我的交易
							</p>
							<ul>
								<li><a href="orderInfo/listSucceed.do">订单管理</a></li>
								<li><a href="orderInfo/change.do">订单管理</a></li>
								<li><a href="orderInfo/comment.do">评价商品</a></li>
							</ul>
						</li>
						<li class="person">
							<p>
								<i class="am-icon-dollar"></i>我的资产
							</p>
							<ul>
								<li><a href="javascript:getPoints();">我的积分</a></li>
								<li><a href="javascript:getCoupon();">优惠券 </a></li>
								<li><a href="javascript:getBonus();">红包</a></li>
								<li><a href="javascript:getWalletlist();">账户余额</a></li>
								<li><a href="javascript:getBill();">账单明细</a></li>
							</ul>
						</li>
						<li class="person">
							<p>
								<i class="am-icon-tags"></i>我的收藏
							</p>
							<ul>
								<li><a href="favorite/show.do">收藏</a></li>
								<li><a href="foot/show.do">足迹</a></li>
							</ul>
						</li>
						<li class="person">
							<p>
								<i class="am-icon-qq"></i>在线客服
							</p>
							<ul>
								<li><a href="suggest/suggest.do">商品咨询</a></li>
								<li><a href="consul/consul.do">意见反馈</a></li>

								<li><a href="javascript:;">我的消息</a></li>
							</ul>
						</li>
					</ul>

				</aside>
	</div>

</body>

</html>