<%@page import="com.team.store.po.UserInfo"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="/common/jstl.jspf" %>
<!DOCTYPE html PUBLIC"-//W3C//DTD XHTML 1.0 Transitional//EN""http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml" lang="zh-CN">
<head>
	<base href="${basePath }/" />
		<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
		<meta name="viewport" content="width=device-width, initial-scale=1.0, minimum-scale=1.0, maximum-scale=1.0, user-scalable=no">

		<title>首页</title>

		<link href="AmazeUI-2.4.2/assets/css/amazeui.css" rel="stylesheet" type="text/css" />
		<link href="AmazeUI-2.4.2/assets/css/admin.css" rel="stylesheet" type="text/css" />

		<link href="basic/css/demo.css" rel="stylesheet" type="text/css" />

		<link href="css/hmstyle.css" rel="stylesheet" type="text/css" />
		<script src="AmazeUI-2.4.2/assets/js/jquery.min.js"></script>
		<script src="AmazeUI-2.4.2/assets/js/amazeui.min.js"></script>
		<script type="text/javascript" src="js/product.js"></script>
		<style type="text/css">
#container {
	position: absolute;
}

#mark {
	z-index: 100;
	border-top: 1px dotted #ccc;
	background: #fefefe;
	width: 100%;
	position: relative;
	left: 0px;
	top: 1px;
	display: none;
	max-height:100px;
	overflow:auto;
}

#topMain {
	z-index: 1000;
}

#mark span {
	display: block;
	z-index: 100;
}

#mark span:hover {
	background: skyblue;
	cursor: pointer;
	z-index: 100;
}
</style>

	</head>

	<body>
		<div class="hmtop">
			<!--顶部导航条 -->
			<div class="am-container header">
				<ul class="message-l">
					<div class="topMessage">
						<div class="menu-hd">
						<c:if test="${user == null }">
							<a href="javascript:;" target="_top" class="h">亲，请登录</a>
							<a href="javascript:;" target="_top">免费注册</a>
						</c:if>
						</div>
					</div>
				</ul>
				<ul class="message-r">
					<div class="topMessage home">
						<div class="menu-hd"><a href="home/list.do" target="_top" class="h">商城首页</a></div>
					</div>
					<div class="topMessage my-shangcheng">
						<div class="menu-hd MyShangcheng"><a href="personalData/list.do" target="_top"><i class="am-icon-user am-icon-fw"></i>个人中心</a></div>
					</div>
					<div class="topMessage mini-cart">
						<div class="menu-hd"><a id="mc-menu-hd" href="shopCart/listShopCart.do" target="_top"><i class="am-icon-shopping-cart  am-icon-fw"></i><span>购物车</span><strong id="J_MiniCartNum" class="h">${shopCartSize }</strong></a></div>
					</div>
					<div class="topMessage favorite">
						<div class="menu-hd"><a href="favorite/show.do" target="_top"><i class="am-icon-heart am-icon-fw"></i><span>收藏夹</span></a></div>
				</ul>
				</div>

				<!--悬浮搜索框-->

				<div class="nav white" style="z-index:999">
					<div class="logo"><img src="images/logo.png" /></div>
					<div class="logoBig">
						<li><img src="images/logobig.png" /></li>
					</div>

					<div class="search-bar pr"style="z-index:999" >
						<a name="index_none_header_sysc" href="javascript:;"></a>
						<form action="searchProduct/search.do" method="post">
				<input id="searchInput" name="proName" type="text" placeholder="搜索"
					autocomplete="off"><input id="ai-topsearch"
					class="submit am-btn" value="搜索" index="1" type="submit">
						<div id="mark" style="z-index: 999;background-color: white;"></div>
			</form>
					</div>
				</div>

				<div class="clear"></div>
			</div>
			
			
			<div class="banner">
                      <!--轮播 -->
						<div class="am-slider am-slider-default scoll" data-am-flexslider id="demo-slider-0">
							<ul class="am-slides">
								<li class="banner1"><a href="javascript:;"><img src="images/ad1.jpg" /></a></li>
								<li class="banner2"><a><img src="images/ad2.jpg" /></a></li>
								<li class="banner3"><a><img src="images/ad3.jpg" /></a></li>
								<li class="banner4"><a><img src="images/ad4.jpg" /></a></li>

							</ul>
						</div>
						<div class="clear"></div>	
			</div>						
			
			<div class="shopNav">
				<div class="slideall">
			        
					   <div class="long-title"><span class="all-goods">全部分类</span></div>
					   <div class="nav-cont">
							<ul>
								<li class="index"><a href="javascript:;">首页</a></li>
                              <!--   <li class="qc"><a href="javascript:;">闪购</a></li>
                                <li class="qc"><a href="javascript:;">限时抢</a></li>
                                <li class="qc"><a href="javascript:;">团购</a></li>
                                <li class="qc last"><a href="javascript:;">大包装</a></li> -->
							</ul>
						    <div class="nav-extra">
						    	<i class="am-icon-user-secret am-icon-md nav-user"></i><b></b>我的福利
						    	<i class="am-icon-angle-right" style="padding-left: 10px;"></i>
						    </div>
						</div>
		        				
						<!--侧边导航 -->
						<div id="nav" class="navfull">
							<div class="area clearfix">
<div class="category-content" id="guide_2">
	
	<div class="category">
		<ul class="category-list" id="js_climit_li">
		<c:forEach items="${listClass}" var="cla" end="9">
<li class="appliance js_toggle relative first"style="height: 43px">
	<div class="category-info">
		<h3 class="category-name b-category-name"><i><img src="images/cake.png"></i><a class="ml-22" title="${cla.pcName }">${cla.pcName }</a></h3>
		<em>&gt;</em></div>
	<div class="menu-item menu-in top">
		<div class="area-in">
		<div class="area-bg">
			<div class="menu-srot">
				<div class="sort-side">
				<c:forEach items="${ listBrand}" var="brand">
				<c:if test="${brand.pcId==cla.pcId }">
					<dl class="dl-sort">
						<dt><span title="${brand.pbName }">${brand.pbName }</span></dt>
						<c:forEach items="${listProduct }" var="pro">
						<c:if test="${pro.pbId==brand.pbId && pro.pcId == cla.pcId }">
						<dd><a title="${pro.proName }" href="searchProduct/search.do?proId=${pro.proId }"><span>${pro.proName }</span></a></dd>
						</c:if>
						</c:forEach>
					</dl>
					</c:if>
					</c:forEach>
				</div>
				<div class="brand-side">
					<dl class="dl-sort"><dt><span>实力商家</span></dt>
						<dd><a rel="nofollow" title="诚邀商家入驻" target="_blank" href="JavaScript:;" rel="nofollow"><span  class="red" >诚邀商家入驻</span></a></dd>
						
					</dl>
				</div>
			</div>
				</div>
			</div>
		</div>
					<b class="arrow"></b>	
					</li>
					</c:forEach>
				</ul>
			</div>
		</div>

	</div>
						</div>
						<!--轮播 -->
						<script type="text/javascript">
							(function() {
								$('.am-slider').flexslider();
							});
							$(document).ready(function() {
								$("li").hover(function() {
									$(".category-content .category-list li.first .menu-in").css("display","none");
									$(".category-content .category-list li.first").removeClass("hover");
									$(this).addClass("hover");
									$(this).children("div.menu-in").css("display","block")
								}, function() {
									$(this).removeClass("hover")
									$(this).children("div.menu-in").css("display","none")
								});
							})
						</script>


					<!--小导航 -->
					<div class="am-g am-g-fixed smallnav">
						<div class="am-u-sm-3">
							<a href="javascript:;"><img src="images/navsmall.jpg" />
								<div class="title">商品分类</div>
							</a>
						</div>
						<div class="am-u-sm-3">
							<a href="javascript:;"><img src="images/huismall.jpg" />
								<div class="title">大聚惠</div>
							</a>
						</div>
						<div class="am-u-sm-3">
							<a href="personalData/list.do"><img src="images/mansmall.jpg" />
								<div class="title">个人中心</div>
							</a>
						</div>
						<div class="am-u-sm-3">
							<a href="javascript:;"><img src="images/moneysmall.jpg" />
								<div class="title">投资理财</div>
							</a>
						</div>
					</div>

					<!--走马灯 -->

					<div class="marqueen">
						<span class="marqueen-title">商城头条</span>
						<div class="demo">

							<ul>
								<!-- <li class="title-first"><a target="_blank" href="javascript:;">
									<img src="images/TJ2.jpg"></img>
									<span>[特惠]</span>商城爆品1分秒								
								</a></li>
								<li class="title-first"><a target="_blank" href="javascript:;">
									<span>[公告]</span>商城与广州市签署战略合作协议
								     <img src="images/TJ.jpg"></img>
								     <p>XXXXXXXXXXXXXXXXXX</p>
							    </a></li> -->
							    
						<div class="mod-vip">
							<div class="m-baseinfo">
							<c:if test="${user != null }">
								<a href="personalData/list.do">
									<img src="${user.userPhoto }">
								</a>
							</c:if>
								<em>
									<span class="s-name"><c:if test="${user != null }">
									Hi,${user.userName }
									</c:if></span>
									<!-- <a href="javascript:;"><p>点击更多优惠活动</p></a> -->									
								</em>
							</div>
							<div class="member-logout">
							<c:if test="${user eq null }">
								<a class="am-btn-warning btn" href="login.jsp">登录</a>
								<a class="am-btn-warning btn" href="register/list.do">注册</a>
								</c:if>
							</div>
							<div class="member-login">
								<a href="javascript:;"><strong>0</strong>待收货</a>
								<a href="javascript:;"><strong>0</strong>待发货</a>
								<a href="javascript:;"><strong>0</strong>待付款</a>
								<a href="javascript:;"><strong>0</strong>待评价</a>
							</div>
							<div class="clear"></div>	
						</div>																	    
							    
							<!-- 	<li><a target="_blank" href="javascript:;"><span>[特惠]</span>洋河年末大促，低至两件五折</a></li>
								<li><a target="_blank" href="javascript:;"><span>[公告]</span>华北、华中部分地区配送延迟</a></li>
								<li><a target="_blank" href="javascript:;"><span>[特惠]</span>家电狂欢千亿礼券 买1送1！</a></li>
								 -->
							</ul>
                      <!--   <div class="advTip"><img src="images/advTip.jpg"/></div> -->
						</div>
					</div>
					<div class="clear"></div>
				</div>
				<script type="text/javascript">
					if ($(window).width() < 640) {
						function autoScroll(obj) {
							$(obj).find("ul").animate({
								marginTop:"-39px"
							}, 500, function() {
								$(this).css({
									marginTop:"0px"
								}).find("li:first").appendTo(this);
							})
						}
						$(function() {
							setInterval('autoScroll(".demo")', 3000);
						})
					}
				</script>
			</div>
			<div class="shopMainbg">
				<div class="shopMain" id="shopmain">

					<!--今日推荐 -->
<!-- 
					<div class="am-g am-g-fixed recommendation">
						<div class="clock am-u-sm-3"">
							<img src="images/2016.png"></img>
							<p>今日<br>推荐</p>
						</div>
						<div class="am-u-sm-4 am-u-lg-3">
							<div class="info">
								<h3>真的有鱼</h3>
								<h4>开年福利篇</h4>
							</div>
							<div class="recommendationMain">
								<img src="images/tj.png"></img>
							</div>
						</div>						
						<div class="am-u-sm-4 am-u-lg-3">
							<div class="info">
								<h3>囤货过冬</h3>
								<h4>让爱早回家</h4>
							</div>
							<div class="recommendationMain">
								<img src="images/tj1.png"></img>
							</div>
						</div>
						<div class="am-u-sm-4 am-u-lg-3">
							<div class="info">
								<h3>浪漫情人节</h3>
								<h4>甜甜蜜蜜</h4>
							</div>
							<div class="recommendationMain">
								<img src="images/tj2.png"></img>
							</div>
						</div>

					</div> -->
					<div class="clear"></div>
					<!--热门活动 -->

					<!-- <div class="am-container activity">
						<div class="shopTitle">
							<h4>活动</h4>
							<h3>每期活动 优惠享不停 </h3>
							<span class="more">
                              <a class="more-link" href="#">全部活动</a>
                            </span>
						</div>
					
					  <div class="am-g am-g-fixed">
						<div class="am-u-sm-3">
							<div class="icon-sale one"></div>	
								<h4>秒杀</h4>							
							<div class="activityMain">
								<img src="images/activity1.jpg"></img>
							</div>
							<div class="info">
								<h3>春节送礼优选</h3>
							</div>														
						</div>
						
						<div class="am-u-sm-3">
						  <div class="icon-sale two"></div>	
							<h4>特惠</h4>
							<div class="activityMain">
								<img src="images/activity2.jpg"></img>
							</div>
							<div class="info">
								<h3>春节送礼优选</h3>								
							</div>							
						</div>						
						
						<div class="am-u-sm-3">
							<div class="icon-sale three"></div>
							<h4>团购</h4>
							<div class="activityMain">
								<img src="images/activity3.jpg"></img>
							</div>
							<div class="info">
								<h3>春节送礼优选</h3>
							</div>							
						</div>						

						<div class="am-u-sm-3 last">
							<div class="icon-sale"></div>
							<h4>超值</h4>
							<div class="activityMain">
								<img src="images/activity.jpg"></img>
							</div>
							<div class="info">
								<h3>春节送礼优选</h3>
							</div>													
						</div>

					  </div>
                   </div>
					<div class="clear"></div>
 -->
					<!--甜点-->
					
					<div class="am-container">
						<div class="shopTitle">
							<h4>饼干/膨化</h4>
							<h3>欢乐时光怎么能少了美食相伴</h3>
							<div class="today-brands">
							<c:forEach items="${listBrand}" var="brand" end="3">
								<a href="javascript:;">${brand.pbName }</a>
								</c:forEach>
							</div>
							<span class="more">
                    <a class="more-link" href="#">更多美味</a>
                        </span>
						</div>
					</div>
					
					<div class="am-g am-g-fixed floodOne">
						<div class="am-u-sm-5 am-u-md-3 am-u-lg-4 text-one">
							<c:forEach items="${listProduct }" var="pro">
							<a href="searchProduct/search.do?proId=${pro.proId }">
							<c:if test="${pro.proId== 7}">
								<div class="outer-con">
									<div class="title">
										${pro.proName }
									</div>					
									<div class="sub-title">
										仅售：¥${pro.proPrice }
									</div>
								</div>
                                  <img src="${pro.proImg}" />		
                                  </c:if>						
							</a>
							</c:forEach>
						</div>
						<div class="am-u-sm-7 am-u-md-5 am-u-lg-4">
						<c:forEach items="${listProduct }" var="pro">
							<c:if test="${pro.proId==12 }">
							<div class="text-two">
								<div class="outer-con">
									<div class="title">
										${pro.proName }
									</div>									
									<div class="sub-title">
										仅售：¥${ pro.proPrice }
									</div>
									
								</div>
								<a href="searchProduct/search.do?proId=${pro.proId }"><img src="${pro.proImg }" /></a>
							</div>
							</c:if>
							<c:if test="${pro.proId==13 }">
							<div class="text-two last">
								<div class="outer-con">
									<div class="title">
										${pro.proName }
									</div>
									<div class="sub-title">
										仅售：¥${pro.proPrice }
									</div>
									
								</div>
								<a href="searchProduct/search.do?proId=${pro.proId }"><img src="${pro.proImg }" /></a>
						    </div>
						    </c:if>
						    </c:forEach>
						</div>
		             <div class="am-u-sm-12 am-u-md-4">
		             <c:forEach items="${listProduct }" var="pro" begin="19" end="22">
						<div class="am-u-sm-3 am-u-md-6 text-three">
							<div class="outer-con">
								<div class="title">
									${pro.proName }
								</div>
								
								<div class="sub-title">
									仅售：¥${pro.proPrice }
								</div>
							</div>
							<a href="searchProduct/search.do?proId=${pro.proId }"><img src="${pro.proImg }" /></a>
						</div>
						</c:forEach>
					</div>

					</div>
                 <div class="clear"></div>
					<!--坚果-->
					<div class="am-container">
						<div class="shopTitle">
							<h4>熟食/肉类</h4>
							<h3>香香辣辣，回味无穷</h3>
							<div class="today-brands">
							<c:forEach items="${listBrand}" var="brand" begin="4" end="6">
								<a href="javascript:;">${brand.pbName }</a>
							</c:forEach>
								
							</div>
							<span class="more">
                    <a class="more-link" href="#">更多美味</a>
                        </span>
						</div>
					</div>
					<div class="am-g am-g-fixed floodTwo">
						
						
						<div class="am-u-sm-5 am-u-md-4 text-one">
							<c:forEach items="${listProduct }" var="pro">
							<a href="searchProduct/search.do?proId=${pro.proId }">
							<c:if test="${pro.proId== 15}"> 
								<div class="outer-con">
									<div class="title">
										${pro.proName }
									</div>					
									<div class="sub-title">
										仅售：¥${pro.proPrice }
									</div>
								</div>
                                  <img src="${pro.proImg}" />		
                                </c:if>				
							</a>
							</c:forEach>
						</div>
						<div class="am-u-sm-7 am-u-md-4 am-u-lg-2 text-two">
								<c:forEach items="${listProduct }" var="pro">
							<a href="searchProduct/search.do?proId=${pro.proId }">
							<c:if test="${pro.proId== 19}">
								<div class="outer-con">
									<div class="title">
										${pro.proName }
									</div>					
									<div class="sub-title">
										仅售：¥${pro.proPrice }
									</div>
								</div>
                                  <img src="${pro.proImg}" />		
                                  </c:if>						
							</a>
							</c:forEach>						
						</div>
						
						<div class="am-u-md-4 am-u-lg-2 text-three">
							<c:forEach items="${listProduct }" var="pro">
							<a href="searchProduct/search.do?proId=${pro.proId }">
							<c:if test="${pro.proId== 16}">
								<div class="outer-con">
									<div class="title">
										${pro.proName }
									</div>					
									<div class="sub-title">
										仅售：¥${pro.proPrice }
									</div>
								</div>
                                  <img src="${pro.proImg}" />		
                                  </c:if>						
							</a>
							</c:forEach>
						</div>
						<div class="am-u-md-4 am-u-lg-2 text-three">
							<c:forEach items="${listProduct }" var="pro">
							<a href="searchProduct/search.do?proId=${pro.proId }">
							<c:if test="${pro.proId== 20}">
								<div class="outer-con">
									<div class="title">
										${pro.proName }
									</div>					
									<div class="sub-title">
										仅售：¥${pro.proPrice }
									</div>
								</div>
                                  <img src="${pro.proImg}" />		
                                  </c:if>						
							</a>
							</c:forEach>
						</div>
						<div class="am-u-sm-6 am-u-md-4 am-u-lg-2 text-two">
								<c:forEach items="${listProduct }" var="pro">
							<a href="searchProduct/search.do?proId=${pro.proId }">
							<c:if test="${pro.proId== 21}">
								<div class="outer-con">
									<div class="title">
										${pro.proName }
									</div>					
									<div class="sub-title">
										仅售：¥${pro.proPrice }
									</div>
								</div>
                                  <img src="${pro.proImg}" />		
                                  </c:if>						
							</a>
							</c:forEach>						
						</div>						
						<div class="am-u-sm-6 am-u-md-3 am-u-lg-2 text-four">
								<c:forEach items="${listProduct }" var="pro">
							<a href="searchProduct/search.do?proId=${pro.proId }">
							<c:if test="${pro.proId== 22}">
								<div class="outer-con">
									<div class="title">
										${pro.proName }
									</div>					
									<div class="sub-title">
										仅售：¥${pro.proPrice }
									</div>
								</div>
                                  <img src="${pro.proImg}" />		
                                  </c:if>						
							</a>
							</c:forEach>						
						</div>				
						<div class="am-u-sm-4 am-u-md-3 am-u-lg-4 text-five">
							<c:forEach items="${listProduct }" var="pro">
							<a href="searchProduct/search.do?proId=${pro.proId }">
							<c:if test="${pro.proId== 23}">
								<div class="outer-con">
									<div class="title">
										${pro.proName }
									</div>					
									<div class="sub-title">
										仅售：¥${pro.proPrice }
									</div>
								</div>
                                  <img src="${pro.proImg}" />		
                                  </c:if>						
							</a>
							</c:forEach>
						</div>	
						<div class="am-u-sm-4 am-u-md-3 am-u-lg-2 text-six">
							<<c:forEach items="${listProduct }" var="pro">
							<a href="searchProduct/search.do?proId=${pro.proId }">
							<c:if test="${pro.proId== 17}">
								<div class="outer-con">
									<div class="title">
										${pro.proName }
									</div>					
									<div class="sub-title">
										仅售：¥${pro.proPrice }
									</div>
								</div>
                                  <img src="${pro.proImg}" />		
                                  </c:if>						
							</a>
							</c:forEach>
						</div>	
						<div class="am-u-sm-4 am-u-md-3 am-u-lg-4 text-five">
							<c:forEach items="${listProduct }" var="pro">
							<a href="searchProduct/search.do?proId=${pro.proId }">
							<c:if test="${pro.proId== 18}">
								<div class="outer-con">
									<div class="title">
										${pro.proName }
									</div>					
									<div class="sub-title">
										仅售：¥${pro.proPrice }
									</div>
								</div>
                                  <img src="${pro.proImg}" />		
                                  </c:if>						
							</a>
							</c:forEach>
						</div>							
					</div>

					<div class="clear"></div>

                 
					<div class="am-container">
						<div class="shopTitle">
							<h4>蛋糕/点心</h4>
							<h3>你是我的优乐美么？不，我是你小点心</h3>
							<div class="today-brands">
							<c:forEach items="${listBrand}" var="brand" begin="7" end="9">
								<a href="javascript:;">${brand.pbName }</a>
							</c:forEach>
							</div>
							<span class="more">
                    <a class="more-link" href="searchProduct/search.do">更多美味</a>
                        </span>
						</div>
					</div>
					<div class="am-g am-g-fixed flood method3">
						<ul class="am-thumbnails">
							
							<li>
								<div class="list">
							<c:forEach items="${listProduct }" var="pro">
							     <c:if test="${pro.proId== 27}">
									<a href="searchProduct/search.do?proId=${pro.proId }">
									
										<img src="${pro.proImg}" />
										<div class="pro-title">${pro.proName}</div>
										<span class="e-price">￥${pro.proPrice}</span>
									</a>
								</c:if>
							</c:forEach>
								</div>
							</li>
							<li>
								<div class="list">
									<c:forEach items="${listProduct }" var="pro">
							     <c:if test="${pro.proId== 28}">
									<a href="searchProduct/search.do?proId=${pro.proId }">
									
										<img src="${pro.proImg}" />
										<div class="pro-title">${pro.proName}</div>
										<span class="e-price">￥${pro.proPrice}</span>
									</a>
								</c:if>
							</c:forEach>
								</div>
							</li>
							<li>
								<div class="list">
									<c:forEach items="${listProduct }" var="pro">
							     <c:if test="${pro.proId== 29}">
									<a href="searchProduct/search.do?proId=${pro.proId }">
									
										<img src="${pro.proImg}" />
										<div class="pro-title">${pro.proName}</div>
										<span class="e-price">￥${pro.proPrice}</span>
									</a>
								</c:if>
							</c:forEach>
								</div>
							</li>
							<li>
								<div class="list">
									<c:forEach items="${listProduct }" var="pro">
							     <c:if test="${pro.proId== 30}">
									<a href="searchProduct/search.do?proId=${pro.proId }">
									
										<img src="${pro.proImg}" />
										<div class="pro-title">${pro.proName}</div>
										<span class="e-price">￥${pro.proPrice}</span>
									</a>
								</c:if>
							</c:forEach>
								</div>
							</li>
							<!-- <li>
								<div class="list">
									<a href="javascript:;">
										<img src="images/cp2.jpg" />
										<div class="pro-title">ZEK 原味海苔</div>
										<span class="e-price">￥8.90</span>
									</a>
								</div>
							</li>
							<li>
								<div class="list">
									<a href="javascript:;">
										<img src="images/cp.jpg" />
										<div class="pro-title">萨拉米 1+1小鸡腿</div>
										<span class="e-price">￥29.90</span>
									</a>
								</div>
							</li>
							<li>
								<div class="list">
									<a href="javascript:;">
										<img src="images/cp2.jpg" />
										<div class="pro-title">ZEK 原味海苔</div>
										<span class="e-price">￥8.90</span>
									</a>
								</div>
							</li>
							<li>
								<div class="list">
									<a href="javascript:;">
										<img src="images/cp.jpg" />
										<div class="pro-title">萨拉米 1+1小鸡腿</div>
										<span class="e-price">￥29.90</span>
									</a>
								</div>
							</li>
							<li>
								<div class="list">
									<a href="javascript:;">
										<img src="images/cp2.jpg" />
										<div class="pro-title">ZEK 原味海苔</div>
										<span class="e-price">￥8.90</span>
									</a>
								</div>
							</li>
 -->
						</ul>

					</div>

					<div class="footer">
						<div class="footer-hd">
							<p>
								<a href="javascript:;">恒望科技</a>
								<b>|</b>
								<a href="javascript:;">商城首页</a>
								<b>|</b>
								<a href="javascript:;">支付宝</a>
								<b>|</b>
								<a href="javascript:;">物流</a>
							</p>
						</div>
						<div class="footer-bd">
							<p>
								<a href="javascript:;">关于恒望</a>
								<a href="javascript:;">合作伙伴</a>
								<a href="javascript:;">联系我们</a>
								<a href="javascript:;">网站地图</a>
								
							</p>
						</div>
					</div>
				</div>
			</div>
		</div>
		</div>
		<!--引导 -->

		<div class="navCir">
			<li class="active"><a href="home3.html"><i class="am-icon-home"></i>首页</a></li>
			<li><a href="javascript:;"><i class="am-icon-list"></i>分类</a></li>
			<li><a href="shopCart/listShopCart.do"><i class="am-icon-shopping-basket"></i>购物车</a></li>	
			<li><a href="personalData/list.do"><i class="am-icon-user"></i>我的</a></li>					
		</div>
		<!--菜单 -->
		<div class=tip>
			<div id="sidebar">
				<div id="wrap">
					<div id="prof" class="item">
						<a href="personalData/list.do">
							<span class="setting"></span>
						</a>
						<div class="ibar_login_box status_login">
							<div class="avatar_box">
							  <c:if test="${user != null }">
                                <p class="avatar_imgbox">
                                    <img src="${user.userPhoto }"/>
                                </p>
                              </c:if>
								<ul class="user_info">
								<c:if test="${user != null }">
									<li>用户名：${user.userName }</li>
									<li>级&nbsp;别：普通会员</li>
								</c:if>
								</ul>
							</div>
							<div class="login_btnbox">
							<c:if test="${user != null }">
								<a href="#" class="login_order">我的订单</a>
								<a href="#" class="login_favorite">我的收藏</a>
							</c:if>	
							</div>
							<i class="icon_arrow_white"></i>
						</div>

					</div>
					<div id="shopCart" class="item">
						<a href="javascript:;">
							<span class="message"></span>
						</a>
						<p>
							购物车
						</p>
						<p class="cart_num">${shopCartSize }</p>
						
					</div>
					<script>
						$(function(){
							$("#shopCart").click(function(){
								location.href="shopCart/listShopCart.do"; 
							});
						});
					</script>
					<div id="asset" class="item">
						<a href="javascript:;">
							<span class="view"></span>
						</a>
						<div class="mp_tooltip">
							我的资产
							<i class="icon_arrow_right_black"></i>
						</div>
					</div>

					<div id="foot" class="item">
						<a href="foot/show.do"> 
							<span class="zuji"></span>
						</a>
						<div class="mp_tooltip">
							我的足迹
							<i class="icon_arrow_right_black"></i>
						</div>
					</div>

					<div id="brand" class="item">
						<a href="javascript:;">
							<span class="wdsc"><img src="images/wdsc.png" /></span>
						</a>
						<div class="mp_tooltip">
							我的收藏
							<i class="icon_arrow_right_black"></i>
						</div>
					</div>

					<div id="broadcast" class="item">
						<a href="javascript:;">
							<span class="chongzhi"><img src="images/chongzhi.png" /></span>
						</a>
						<div class="mp_tooltip">
							我要充值
							<i class="icon_arrow_right_black"></i>
						</div>
					</div>

					<div class="quick_toggle">
						<li class="qtitem">
							<a href="javascript:;"><span class="kfzx"></span></a>
							<div class="mp_tooltip">客服中心<i class="icon_arrow_right_black"></i></div>
						</li>
						<!--二维码 -->
						<li class="qtitem">
							<a href="#none"><span class="mpbtn_qrcode"></span></a>
							<div class="mp_qrcode" style="display:none;"><img src="images/weixin_code_145.png" /><i class="icon_arrow_white"></i></div>
						</li>
						<li class="qtitem">
							<a href="#top" class="return_top"><span class="top"></span></a>
						</li>
					</div>

					<!--回到顶部 -->
					<div id="quick_links_pop" class="quick_links_pop hide"></div>

				</div>

			</div>
			<div id="prof-content" class="nav-content">
				<div class="nav-con-close">
					<i class="am-icon-angle-right am-icon-fw"></i>
				</div>
				<div>
					我
				</div>
			</div>
			<div id="shopCart-content" class="nav-content">
				<div class="nav-con-close">
					<i class="am-icon-angle-right am-icon-fw"></i>
				</div>
				<div>
					购物车aaaaaaaaaaaaaaaaaaaaaaaaaa
				</div>
			</div>
			<div id="asset-content" class="nav-content">
				<div class="nav-con-close">
					<i class="am-icon-angle-right am-icon-fw"></i>
				</div>
				<div>
					资产
				</div>

				<div class="ia-head-list">
					<a href="#" target="_blank" class="pl">
						<div class="num">0</div>
						<div class="text">优惠券</div>
					</a>
					<a href="#" target="_blank" class="pl">
						<div class="num">0</div>
						<div class="text">红包</div>
					</a>
					<a href="#" target="_blank" class="pl money">
						<div class="num">￥0</div>
						<div class="text">余额</div>
					</a>
				</div>

			</div>
			<div id="foot-content" class="nav-content">
				<div class="nav-con-close">
					<i class="am-icon-angle-right am-icon-fw"></i>
				</div>
				<div>
					足迹
				</div>
			</div>
			<div id="brand-content" class="nav-content">
				<div class="nav-con-close">
					<i class="am-icon-angle-right am-icon-fw"></i>
				</div>
				<div>
					收藏
				</div>
			</div>
			<div id="broadcast-content" class="nav-content">
				<div class="nav-con-close">
					<i class="am-icon-angle-right am-icon-fw"></i>
				</div>
				<div>
					充值
				</div>
			</div>
		</div>
		<script>
			window.jQuery || document.write('<script src="basic/js/jquery.min.js"><\/script>');
		</script>
		<script type="text/javascript" src="basic/js/quick_links.js"></script>
	</body>

</html>