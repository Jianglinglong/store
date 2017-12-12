<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="/common/jstl.jspf"%>
<!DOCTYPE html PUBLIC"-//W3C//DTD XHTML 1.0 Transitional//EN""http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml" lang="zh-CN">
<head>
<base href="${basePath }/" />
<base scr="${basePath}/" />
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta name="viewport"
	content="width=device-width, initial-scale=1.0, minimum-scale=1.0, maximum-scale=1.0, user-scalable=no">

	<title>首页</title>

	<link href="AmazeUI-2.4.2/assets/css/amazeui.css" rel="stylesheet"
		type="text/css" />
	<link href="AmazeUI-2.4.2/assets/css/admin.css" rel="stylesheet"
		type="text/css" />
	<link href="basic/css/demo.css" rel="stylesheet" type="text/css" />
	<link href="css/product.css" rel="stylesheet" type="text/css" />

	<link href="css/hmstyle.css" rel="stylesheet" type="text/css" />
	<script src="AmazeUI-2.4.2/assets/js/jquery.min.js"></script>
	<script src="AmazeUI-2.4.2/assets/js/amazeui.min.js"></script>
	<script type="text/javascript" src="basic/js/jquery-1.7.min.js"></script>
	<script type="text/javascript" src="js/script.js"></script>
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
	max-height: 100px;
	overflow: auto;
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
					<c:if test="${user eq null}">
						<div class="menu-hd">
								<a href="javascript:;" target="_top" class="h">亲，请登录</a>
								<a href="javascript:;" target="_top">免费注册</a>
						</div>
					</c:if>
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
						<a href="javascript:;" target="_top"><i
							class="am-icon-heart am-icon-fw"></i><span>收藏夹</span></a>
					</div>
				</div>
			</ul>
		</div>

		<!--悬浮搜索框-->

		<div class="nav white">
			<div class="logo">
				<img src="images/logo.png" />
			</div>
			<div class="logoBig">
				<li><img src="images/logobig.png" /></li>
			</div>

			<div class="search-bar pr">
				<a name="index_none_header_sysc" href="searchProduct/search.do"></a>
				<form action="searchProduct/search.do" method="post">
					<input id="searchInput" name="proName" type="text" placeholder="搜索"
						autocomplete="off"><input id="ai-topsearch"
						class="submit am-btn" value="搜索" index="1" type="submit">
							<div id="mark" style="z-index: 999;"></div>
				</form>
			</div>
		</div>
		<div class="clear"></div>

	</div>

	<b class="line"></b>
	<div class="shopNav">
		<div class="slideall" style="height: auto;">

			<div class="long-title">
				<span class="all-goods">全部分类</span>
			</div>
			<div class="nav-cont">
				<ul>
					<li class="index"><a href="javascript:;">首页</a></li>
					<!-- <li class="qc"><a href="javascript:;">闪购</a></li>
                <li class="qc"><a href="javascript:;">限时抢</a></li>
                <li class="qc"><a href="javascript:;">团购</a></li>
                <li class="qc last"><a href="javascript:;">大包装</a></li> -->
				</ul>
				<div class="nav-extra">
					<i class="am-icon-user-secret am-icon-md nav-user"></i><b></b>我的福利
					<i class="am-icon-angle-right" style="padding-left: 10px;"></i>
				</div>
			</div>

			<div class="bannerTwo">
				<!--轮播 -->
				<div class="am-slider am-slider-default scoll" data-am-flexslider
					id="demo-slider-0">
					<ul class="am-slides">
						<li class="banner1"><a href="introduction.html"><img
								src="images/ad5.jpg" /></a></li>
						<li class="banner2"><a><img src="images/ad6.jpg" /></a></li>
						<li class="banner3"><a><img src="images/ad7.jpg" /></a></li>
						<li class="banner4"><a><img src="images/ad8.jpg" /></a></li>
					</ul>
				</div>
				<div class="clear"></div>
			</div>
			<!--侧边导航 -->
			<div id="nav" class="navfull" style="position: static;">
				<div class="area clearfix">
					<div class="category-content" id="guide_2">

						<div class="category" style="box-shadow: none; margin-top: 2px;">
							<ul class="category-list navTwo" id="js_climit_li">
								<c:forEach items="${listClass}" var="cla">
									<li class="appliance js_toggle relative first" style="">
										<div class="category-info">
											<h3 class="category-name b-category-name">
												<i><img src="images/cake.png"></i><a class="ml-22"
													title="${cla.pcName }">${cla.pcName }</a>
											</h3>
											<em>&gt;</em>
										</div>
										<div class="menu-item menu-in top">
											<div class="area-in">
												<div class="area-bg">
													<div class="menu-srot" style="width: 853px;">
														<div class="sort-side">
															<c:forEach items="${ listBrand}" var="brand" end="9">
																<c:if test="${brand.pcId==cla.pcId }">
																	<dl class="dl-sort">
																		<dt>
																			<span title="${brand.pbName }">${brand.pbName }</span>
																		</dt>
																		<c:forEach items="${listProduct }" var="pro">
																			<c:if
																				test="${pro.pbId==brand.pbId && pro.pcId == cla.pcId }">
																				<dd>
																					<a title="${pro.proName }"
																						href="searchProduct/search.do?proId=${pro.proId }"><span>${pro.proName }</span></a>
																				</dd>
																			</c:if>
																		</c:forEach>
																	</dl>
																</c:if>
															</c:forEach>
														</div>
														<div class="brand-side">
															<dl class="dl-sort">
																<dt>
																	<span>实力商家</span>
																</dt>
																<dd>
																	<a rel="nofollow" title="诚邀商家入驻" target="_blank"
																		href="JavaScript:;" rel="nofollow"><span
																		class="red">诚邀商家入驻</span></a>
																</dd>

															</dl>
														</div>
													</div>
												</div>
											</div>
										</div> <b class="arrow"></b>
									</li>
								</c:forEach>

							</ul>
						</div>
					</div>

				</div>
			</div>

			<!--导航 -->
			<script type="text/javascript">
				(function() {
					$('.am-slider').flexslider();
				});
				$(document)
						.ready(
								function() {
									$("li")
											.hover(
													function() {
														$(
																".category-content .category-list li.first .menu-in")
																.css("display",
																		"none");
														$(
																".category-content .category-list li.first")
																.removeClass(
																		"hover");
														$(this).addClass(
																"hover");
														$(this)
																.children(
																		"div.menu-in")
																.css("display",
																		"block")
													},
													function() {
														$(this).removeClass(
																"hover")
														$(this).children(
																"div.menu-in")
																.css("display",
																		"none")
													});
								})
			</script>


			<!--小导航 -->
			<div class="am-g am-g-fixed smallnav">
				<div class="am-u-sm-3">
					<a href="javascript:;"><img src="images/navsmall.jpg" />
						<div class="title">商品分类</div> </a>
				</div>
				<div class="am-u-sm-3">
					<a href="javascript:;"><img src="images/huismall.jpg" />
						<div class="title">大聚惠</div> </a>
				</div>
				<div class="am-u-sm-3">
					<a href="javascript:;"><img src="images/mansmall.jpg" />
						<div class="title">个人中心</div> </a>
				</div>
				<div class="am-u-sm-3">
					<a href="javascript:;"><img src="images/moneysmall.jpg" />
						<div class="title">投资理财</div> </a>
				</div>
			</div>


			<!--各类活动-->
			<!-- <div class="row">
            <li><a><img src="images/row1.jpg" /></a></li>
            <li><a><img src="images/row2.jpg" /></a></li>
            <li><a><img src="images/row3.jpg" /></a></li>
            <li><a><img src="images/row4.jpg" /></a></li>
        </div> -->
			<div class="clear"></div>
			<!--走马灯 -->

			<c:if test="${user != null }">
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
									<a href="personalData/list.do"> <img
										src="images/getAvatar.do.jpg"></a> <em> <span
										class="s-name"><c:if test="${user != null }">
                                        Hi,${user.userName }
                                    </c:if></span> <a href="javascript:;"><p>点击更多优惠活动</p></a>
									</em>
								</div>
								<div class="member-logout">
									<c:if test="${user eq null }">
										<a class="am-btn-warning btn" href="login.jsp">登录</a>
										<a class="am-btn-warning btn" href="register/list.do">注册</a>
									</c:if>
								</div>
								<div class="member-login">
									<a href="javascript:;"><strong>0</strong>待收货</a> <a
										href="javascript:;"><strong>0</strong>待发货</a> <a
										href="javascript:;"><strong>0</strong>待付款</a> <a
										href="javascript:;"><strong>0</strong>待评价</a>
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
			</c:if>
			<div class="clear"></div>

		</div>


		<script type="text/javascript">
			if ($(window).width() < 640) {
				function autoScroll(obj) {
					$(obj).find("ul").animate({
						marginTop : "-39px"
					}, 500, function() {
						$(this).css({
							marginTop : "0px"
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

			<!--热门活动 -->

			<!-- <div class="am-container">

            <div class="sale-mt">
                <i></i> <em class="sale-title">限时秒杀</em>
                <div class="s-time" id="countdown">
                    <span class="hh">01</span> <span class="mm">20</span> <span
                        class="ss">59</span>
                </div>
            </div>


            <div class="am-g am-g-fixed sale">
                <div class="am-u-sm-3 sale-item">
                    <div class="s-img">
                        <a href="javascript:;"><img src="images/sale3.jpg" /></a>
                    </div>
                    <div class="s-info">
                        <a href="javascript:;"><p class="s-title">ZEK 原味海苔</p></a>
                        <div class="s-price">
                            ￥<b>9.90</b> <a class="s-buy" href="javascript:;">秒杀</a>
                        </div>
                    </div>
                </div>

                <div class="am-u-sm-3 sale-item">
                    <div class="s-img">
                        <a href="javascript:;"><img src="images/sale2.jpg" /></a>
                    </div>
                    <div class="s-info">
                        <a href="javascript:;"><p class="s-title">ZEK 原味纯木</p></a>
                        <div class="s-price">
                            ￥<b>19.90</b> <a class="s-buy" href="javascript:;">秒杀</a>
                        </div>
                    </div>
                </div>

                <div class="am-u-sm-3 sale-item">
                    <div class="s-img">
                        <a href="javascript:;"><img src="images/sale1.jpg" /></a>
                    </div>
                    <div class="s-info">
                        <a href="javascript:;"><p class="s-title">ZEK 原味海苔</p></a>
                        <div class="s-price">
                            ￥<b>9.90</b> <a class="s-buy" href="javascript:;">秒杀</a>
                        </div>
                    </div>
                </div>

                <div class="am-u-sm-3 sale-item">
                    <div class="s-img">
                        <a href="javascript:;"><img src="images/sale2.jpg" /></a>
                    </div>
                    <div class="s-info">
                        <a href="javascript:;"><p class="s-title">ZEK 原味海苔</p></a>
                        <div class="s-price">
                            ￥<b>9.90</b> <a class="s-buy" href="javascript:;">秒杀</a>
                        </div>
                    </div>
                </div>

            </div>
        </div> -->
			<div class="clear"></div>
			<div class="f1">
				<!--甜点-->

				<div class="am-container">
					<div class="shopTitle">
						<h4 class="floor-title">饼干/膨化</h4>
						<div class="floor-subtitle">
							<em class="am-icon-caret-left"></em>
							<h3>酥酥脆脆，回味无穷</h3>
						</div>
						<div class="today-brands" style="right: 0px; top: 13px;">
							<c:forEach items="${listBrand}" var="brand" end="3">
								<a href="javascript:;">${brand.pbName }</a>
							</c:forEach>
						</div>

					</div>
				</div>

				<div class="am-g am-g-fixed floodSix">
					<div class="am-u-sm-5 am-u-md-3 text-one list">
						<div class="word">
							<c:forEach items="${listProduct}" var="pro" end="18">
								<c:if test="${pro.pbId==1}">
									<a href="searchProduct/search.do?proId=${pro.proId }"
										class="outer"><span class="inner"><b class="text">${pro.proName }</b></span></a>
								</c:if>
							</c:forEach>
							<a class="outer" href="javascript:;"><span class="inner"><b
									class="text"></b></span></a>
						</div>
						<a href="searchProduct/search.do?proId=7"> <img
							src="images/lsy01m.jpg" />
							<div class="outer-con">
								<div class="title">零食大礼包开抢啦</div>
								<div class="sub-title">当小鱼儿恋上软豆腐</div>
							</div>
						</a>
						<div class="triangle-topright"></div>
					</div>

					<div class="am-u-sm-7 am-u-md-5 am-u-lg-2 text-two big">
						<c:forEach items="${listProduct }" var="pro">
							<c:if test="${pro.proId==7}">
								<div class="outer-con">
									<div class="title">${pro.proName }</div>
									<div class="sub-title">¥${pro.proPrice }</div>

								</div>
								<a href="searchProduct/search.do?proId=${pro.proId }"><img
									src="${pro.proImg}" /></a>
							</c:if>

						</c:forEach>
					</div>

					<li>
						<div class="am-u-md-2 am-u-lg-2 text-three">
							<div class="boxLi"></div>
							<c:forEach items="${listProduct }" var="pro">
								<c:if test="${pro.proId== 8}">
									<div class="outer-con">
										<div class="title">${pro.proName }</div>
										<div class="sub-title">¥${pro.proPrice }</div>

									</div>
									<a href="searchProduct/search.do?proId=${pro.proId }"><img
										src="${pro.proImg}" /></a>
								</c:if>
							</c:forEach>
						</div>
					</li>
					<li>
						<div class="am-u-md-2 am-u-lg-2 text-three sug">
							<div class="boxLi"></div>
							<c:forEach items="${listProduct }" var="pro">
								<c:if test="${pro.proId== 9}">
									<div class="outer-con">
										<div class="title">${pro.proName }</div>
										<div class="sub-title">¥${pro.proPrice }</div>

									</div>
									<a href="searchProduct/search.do?proId=${pro.proId }"><img
										src="${pro.proImg}" /></a>
								</c:if>
							</c:forEach>
						</div>
					</li>
					<li>
						<div class="am-u-sm-4 am-u-md-5 am-u-lg-4 text-five">
							<div class="boxLi"></div>
							<c:forEach items="${listProduct }" var="pro">
								<c:if test="${pro.proId== 10}">
									<div class="outer-con">
										<div class="title">${pro.proName }</div>
										<div class="sub-title">¥${pro.proPrice }</div>

									</div>
									<a href="searchProduct/search.do?proId=${pro.proId }"><img
										src="${pro.proImg}" /></a>
								</c:if>
							</c:forEach>
						</div>
					</li>
					<li>
						<div class="am-u-sm-4 am-u-md-2 am-u-lg-2 text-six">
							<div class="boxLi"></div>
							<c:forEach items="${listProduct }" var="pro">
								<c:if test="${pro.proId== 5}">
									<div class="outer-con">
										<div class="title">${pro.proName }</div>
										<div class="sub-title">¥${pro.proPrice }</div>

									</div>
									<a href="searchProduct/search.do?proId=${pro.proId }"><img
										src="${pro.proImg}" /></a>
								</c:if>
							</c:forEach>
						</div>
					</li>
					<li>
						<div class="am-u-sm-4 am-u-md-2 am-u-lg-4 text-six">
							<div class="boxLi"></div>
							<c:forEach items="${listProduct }" var="pro">
								<c:if test="${pro.proId==13}">
									<div class="outer-con">
										<div class="title">${pro.proName }</div>
										<div class="sub-title">¥${pro.proPrice }</div>

									</div>
									<a href="searchProduct/search.do?proId=${pro.proId }"><img
										src="${pro.proImg}" /></a>
								</c:if>
							</c:forEach>
						</div>
					</li>
				</div>

				<div class="clear"></div>
			</div>
			<div class="f2">

				<!--坚果-->
				<div class="am-container">
					<div class="shopTitle">
						<h4 class="floor-title">熟食/肉类</h4>
						<div class="floor-subtitle">
							<em class="am-icon-caret-left"></em>
							<h3>酥酥脆脆，回味无穷</h3>
						</div>
						<div class="today-brands" style="right: 0px; top: 13px">
							<c:forEach items="${listBrand}" var="brand" begin="4" end="6">
								<a href="javascript:;">${brand.pbName }</a>
							</c:forEach>
						</div>
					</div>
				</div>
				<div class="am-g am-g-fixed floodSeven">
					<div class="am-u-sm-5 am-u-md-4 text-one list">
						<div class="word">
							<c:forEach items="${listProduct}" var="pro" begin="9" end="15">
								<c:if test="${pro.pbId==5}">
									<a href="searchProduct/search.do?proId=${pro.proId }"
										class="outer"><span class="inner"><b class="text">${pro.proName }</b></span></a>
								</c:if>
							</c:forEach>
							<a class="outer" href="javascript:;"><span class="inner"><b
									class="text"></b></span></a>
						</div>
						<a href="javascript:;">
							<div class="outer-con">
								<div class="title">零食大礼包开抢啦！</div>
								<div class="sub-title">零食大礼包</div>
							</div> <img src="images/11.jpg" />
						</a>
						<div class="triangle-topright"></div>
					</div>

					<div class="am-u-sm-7 am-u-md-4 text-two big">

						<c:forEach items="${listProduct }" var="pro">
							<c:if test="${pro.proId==18}">
								<div class="outer-con">
									<div class="title">${pro.proName }</div>
									<div class="sub-title">¥${pro.proPrice }</div>

								</div>
								<a href="searchProduct/search.do?proId=${pro.proId }"><img
									src="${pro.proImg}" /></a>
							</c:if>
						</c:forEach>

					</div>

					<li>
						<div class="am-u-sm-7 am-u-md-4 text-two">
							<div class="boxLi"></div>
							<c:forEach items="${listProduct }" var="pro">
								<c:if test="${pro.proId==19}">
									<div class="outer-con">
										<div class="title">${pro.proName }</div>
										<div class="sub-title">¥${pro.proPrice }</div>

									</div>
									<a href="searchProduct/search.do?proId=${pro.proId }"><img
										src="${pro.proImg}" /></a>
								</c:if>
							</c:forEach>
						</div>
					</li>
					<li>
						<div class="am-u-sm-3 am-u-md-2 text-three sug">
							<div class="boxLi"></div>
							<c:forEach items="${listProduct }" var="pro">
								<c:if test="${pro.proId==20}">
									<div class="outer-con">
										<div class="title">${pro.proName }</div>
										<div class="sub-title">¥${pro.proPrice }</div>

									</div>
									<a href="searchProduct/search.do?proId=${pro.proId }"><img
										src="${pro.proImg}" /></a>
								</c:if>
							</c:forEach>
						</div>
					</li>
					<li>
						<div class="am-u-sm-3 am-u-md-2 text-three big">
							<div class="boxLi"></div>
							<c:forEach items="${listProduct }" var="pro">
								<c:if test="${pro.proId==21}">
									<div class="outer-con">
										<div class="title">${pro.proName }</div>
										<div class="sub-title">¥${pro.proPrice }</div>

									</div>
									<a href="searchProduct/search.do?proId=${pro.proId }"><img
										src="${pro.proImg}" /></a>
								</c:if>
							</c:forEach>
						</div>
					</li>
					<li>
						<div class="am-u-sm-3 am-u-md-2 text-three">
							<div class="boxLi"></div>
							<c:forEach items="${listProduct }" var="pro">
								<c:if test="${pro.proId==22}">
									<div class="outer-con">
										<div class="title">${pro.proName }</div>
										<div class="sub-title">¥${pro.proPrice }</div>

									</div>
									<a href="searchProduct/search.do?proId=${pro.proId }"><img
										src="${pro.proImg}" /></a>
								</c:if>
							</c:forEach>
						</div>
					</li>
					<li>
						<div class="am-u-sm-3 am-u-md-2 text-three">
							<div class="boxLi"></div>
							<c:forEach items="${listProduct }" var="pro">
								<c:if test="${pro.proId==23}">
									<div class="outer-con">
										<div class="title">${pro.proName }</div>
										<div class="sub-title">¥${pro.proPrice }</div>

									</div>
									<a href="searchProduct/search.do?proId=${pro.proId }"><img
										src="${pro.proImg}" /></a>
								</c:if>
							</c:forEach>
						</div>
					</li>
				</div>
				<div class="clear"></div>
			</div>
			<div class="am-container">
				<div class="shopTitle">
					<h4>蛋糕/点心</h4>
					<h3>你是我的优乐美么？不，我是你小点心</h3>
					<div class="today-brands">
						<c:forEach items="${listBrand}" var="brand" begin="7" end="9">
							<a href="javascript:;">${brand.pbName }</a>
						</c:forEach>
					</div>
					<span class="more"> <a class="more-link"
						href="searchProduct/search.do">更多美味</a>
					</span>
				</div>
			</div>
			<div class="am-g am-g-fixed flood method3">
				<ul class="am-thumbnails">

					<li>
						<div class="list">
							<c:forEach items="${listProduct }" var="pro">
								<c:if test="${pro.proId== 27}">
									<a href="searchProduct/search.do?proId=${pro.proId }"> <img
										src="${pro.proImg}" />
										<div class="pro-title">${pro.proName}</div> <span
										class="e-price">￥${pro.proPrice}</span>
									</a>
								</c:if>
							</c:forEach>
						</div>
					</li>
					<li>
						<div class="list">
							<c:forEach items="${listProduct }" var="pro">
								<c:if test="${pro.proId== 28}">
									<a href="searchProduct/search.do?proId=${pro.proId }"> <img
										src="${pro.proImg}" />
										<div class="pro-title">${pro.proName}</div> <span
										class="e-price">￥${pro.proPrice}</span>
									</a>
								</c:if>
							</c:forEach>
						</div>
					</li>
					<li>
						<div class="list">
							<c:forEach items="${listProduct }" var="pro">
								<c:if test="${pro.proId== 29}">
									<a href="searchProduct/search.do?proId=${pro.proId }"> <img
										src="${pro.proImg}" />
										<div class="pro-title">${pro.proName}</div> <span
										class="e-price">￥${pro.proPrice}</span>
									</a>
								</c:if>
							</c:forEach>
						</div>
					</li>
					<li>
						<div class="list">
							<c:forEach items="${listProduct }" var="pro">
								<c:if test="${pro.proId== 30}">
									<a href="searchProduct/search.do?proId=${pro.proId }"> <img
										src="${pro.proImg}" />
										<div class="pro-title">${pro.proName}</div> <span
										class="e-price">￥${pro.proPrice}</span>
									</a>
								</c:if>
							</c:forEach>
						</div>
					</li>
				</ul>
			</div>

			<!-- <div class="f3">
            甜点

            <div class="am-container">
                <div class="shopTitle">
                    <h4 class="floor-title">甜品</h4>
                    <div class="floor-subtitle">
                        <em class="am-icon-caret-left"></em>
                        <h3>每一道甜品都有一个故事</h3>
                    </div>
                    <div class="today-brands" style="right: 0px; top: 13px;">
                        <a href="javascript:;">桂花糕</a>| <a href="javascript:;">奶皮酥</a>| <a href="javascript:;">栗子糕
                        </a>| <a href="javascript:;">马卡龙</a>| <a href="javascript:;">铜锣烧</a>| <a href="javascript:;">豌豆黄</a>
                    </div>

                </div>
            </div>

            <div class="am-g am-g-fixed floodSix">

                <div class="am-u-sm-5 am-u-md-3 text-one list">
                    <div class="word">
                        <a class="outer" href="javascript:;"><span class="inner"><b
                                class="text">核桃</b></span></a> <a class="outer" href="javascript:;"><span
                            class="inner"><b class="text">核桃</b></span></a> <a class="outer"
                            href="javascript:;"><span class="inner"><b class="text">核桃</b></span></a> <a
                            class="outer" href="javascript:;"><span class="inner"><b
                                class="text">核桃</b></span></a> <a class="outer" href="javascript:;"><span
                            class="inner"><b class="text">核桃</b></span></a> <a class="outer"
                            href="javascript:;"><span class="inner"><b class="text">核桃</b></span></a> <a
                            class="outer" href="javascript:;"><span class="inner"><b
                                class="text">核桃</b></span></a> <a class="outer" href="javascript:;"><span
                            class="inner"><b class="text">核桃</b></span></a> <a class="outer"
                            href="javascript:;"><span class="inner"><b class="text">核桃</b></span></a>
                    </div>
                    <a href="javascript:;"> <img src="images/5.jpg" />
                        <div class="outer-con">
                            <div class="title">零食大礼包开抢啦</div>
                            <div class="sub-title">当小鱼儿恋上软豆腐</div>
                        </div>
                    </a>
                    <div class="triangle-topright"></div>
                </div>

                <div class="am-u-sm-7 am-u-md-5 am-u-lg-2 text-two big">

                    <div class="outer-con">
                        <div class="title">雪之恋和风大福</div>
                        <div class="sub-title">¥13.8</div>

                    </div>
                    <a href="javascript:;"><img src="images/act1.png" /></a>
                </div>

                <li>
                    <div class="am-u-md-2 am-u-lg-2 text-three">
                        <div class="boxLi"></div>
                        <div class="outer-con">
                            <div class="title">小优布丁</div>
                            <div class="sub-title">¥4.8</div>

                        </div>
                        <a href="javascript:;"><img src="images/1.jpg" /></a>
                    </div>
                </li>
                <li>
                    <div class="am-u-md-2 am-u-lg-2 text-three sug">
                        <div class="boxLi"></div>
                        <div class="outer-con">
                            <div class="title">小优布丁</div>
                            <div class="sub-title">¥4.8</div>

                        </div>
                        <a href="javascript:;"><img src="images/2.jpg" /></a>
                    </div>
                </li>
                <li>
                    <div class="am-u-sm-4 am-u-md-5 am-u-lg-4 text-five">
                        <div class="boxLi"></div>
                        <div class="outer-con">
                            <div class="title">小优布丁</div>
                            <div class="sub-title">¥4.8</div>

                        </div>
                        <a href="javascript:;"><img src="images/5.jpg" /></a>
                    </div>
                </li>
                <li>
                    <div class="am-u-sm-4 am-u-md-2 am-u-lg-2 text-six">
                        <div class="boxLi"></div>
                        <div class="outer-con">
                            <div class="title">小优布丁</div>
                            <div class="sub-title">¥4.8</div>

                        </div>
                        <a href="javascript:;"><img src="images/3.jpg" /></a>
                    </div>
                </li>
                <li>
                    <div class="am-u-sm-4 am-u-md-2 am-u-lg-4 text-six">
                        <div class="boxLi"></div>
                        <div class="outer-con">
                            <div class="title">小优布丁</div>
                            <div class="sub-title">¥4.8</div>

                        </div>
                        <a href="javascript:;"><img src="images/4.jpg" /></a>
                    </div>
                </li>
            </div>
            <div class="clear"></div>
        </div>
        <div class="f4">

            坚果
            <div class="am-container">
                <div class="shopTitle">
                    <h4 class="floor-title">坚果</h4>
                    <div class="floor-subtitle">
                        <em class="am-icon-caret-left"></em>
                        <h3>酥酥脆脆，回味无穷</h3>
                    </div>
                    <div class="today-brands" style="right: 0px; top: 13px">
                        <a href="javascript:;">腰果</a>| <a href="javascript:;">松子</a>| <a href="javascript:;">夏威夷果 </a>|
                        <a href="javascript:;">碧根果</a>| <a href="javascript:;">开心果</a>| <a href="javascript:;">核桃仁</a>
                    </div>
                </div>
            </div>
            <div class="am-g am-g-fixed floodSeven">
                <div class="am-u-sm-5 am-u-md-4 text-one list">
                    <div class="word">
                        <a class="outer" href="javascript:;"><span class="inner"><b
                                class="text">核桃</b></span></a> <a class="outer" href="javascript:;"><span
                            class="inner"><b class="text">核桃</b></span></a> <a class="outer"
                            href="javascript:;"><span class="inner"><b class="text">核桃</b></span></a> <a
                            class="outer" href="javascript:;"><span class="inner"><b
                                class="text">核桃</b></span></a> <a class="outer" href="javascript:;"><span
                            class="inner"><b class="text">核桃</b></span></a> <a class="outer"
                            href="javascript:;"><span class="inner"><b class="text">核桃</b></span></a> <a
                            class="outer" href="javascript:;"><span class="inner"><b
                                class="text">核桃</b></span></a> <a class="outer" href="javascript:;"><span
                            class="inner"><b class="text">核桃</b></span></a> <a class="outer"
                            href="javascript:;"><span class="inner"><b class="text">核桃</b></span></a>
                    </div>
                    <a href="javascript:;">
                        <div class="outer-con">
                            <div class="title">零食大礼包开抢啦！</div>
                            <div class="sub-title">零食大礼包</div>
                        </div> <img src="images/11.jpg" />
                    </a>
                    <div class="triangle-topright"></div>
                </div>

                <div class="am-u-sm-7 am-u-md-4 text-two big">

                    <div class="outer-con">
                        <div class="title">雪之恋和风大福</div>
                        <div class="sub-title">¥13.8</div>

                    </div>
                    <a href="javascript:;"><img src="images/act2.png" /></a>

                </div>

                <li>
                    <div class="am-u-sm-7 am-u-md-4 text-two">
                        <div class="boxLi"></div>
                        <div class="outer-con">
                            <div class="title">雪之恋和风大福</div>
                            <div class="sub-title">¥13.8</div>

                        </div>
                        <a href="javascript:;"><img src="images/6.jpg" /></a>
                    </div>
                </li>
                <li>
                    <div class="am-u-sm-3 am-u-md-2 text-three sug">
                        <div class="boxLi"></div>
                        <div class="outer-con">
                            <div class="title">小优布丁</div>
                            <div class="sub-title">¥4.8</div>

                        </div>
                        <a href="javascript:;"><img src="images/7.jpg" /></a>
                    </div>
                </li>
                <li>
                    <div class="am-u-sm-3 am-u-md-2 text-three big">
                        <div class="boxLi"></div>
                        <div class="outer-con">
                            <div class="title">小优布丁</div>
                            <div class="sub-title">¥4.8</div>

                        </div>
                        <a href="javascript:;"><img src="images/10.jpg" /></a>
                    </div>
                </li>
                <li>
                    <div class="am-u-sm-3 am-u-md-2 text-three">
                        <div class="boxLi"></div>
                        <div class="outer-con">
                            <div class="title">小优布丁</div>
                            <div class="sub-title">¥4.8</div>

                        </div>
                        <a href="javascript:;"><img src="images/8.jpg" /></a>
                    </div>
                </li>
                <li>
                    <div class="am-u-sm-3 am-u-md-2 text-three">
                        <div class="boxLi"></div>
                        <div class="outer-con">
                            <div class="title">小优布丁</div>
                            <div class="sub-title">¥4.8</div>

                        </div>
                        <a href="javascript:;"><img src="images/9.jpg" /></a>
                    </div>
                </li>
            </div>
            <div class="clear"></div>
        </div>

        <div class="f5">
            甜点

            <div class="am-container">
                <div class="shopTitle">
                    <h4 class="floor-title">甜品</h4>
                    <div class="floor-subtitle">
                        <em class="am-icon-caret-left"></em>
                        <h3>每一道甜品都有一个故事</h3>
                    </div>
                    <div class="today-brands" style="right: 0px; top: 13px;">
                        <a href="javascript:;">桂花糕</a>| <a href="javascript:;">奶皮酥</a>| <a href="javascript:;">栗子糕
                        </a>| <a href="javascript:;">马卡龙</a>| <a href="javascript:;">铜锣烧</a>| <a href="javascript:;">豌豆黄</a>
                    </div>

                </div>
            </div>

            <div class="am-g am-g-fixed floodSix">

                <div class="am-u-sm-5 am-u-md-3 text-one list">
                    <div class="word">
                        <a class="outer" href="javascript:;"><span class="inner"><b
                                class="text">核桃</b></span></a> <a class="outer" href="javascript:;"><span
                            class="inner"><b class="text">核桃</b></span></a> <a class="outer"
                            href="javascript:;"><span class="inner"><b class="text">核桃</b></span></a> <a
                            class="outer" href="javascript:;"><span class="inner"><b
                                class="text">核桃</b></span></a> <a class="outer" href="javascript:;"><span
                            class="inner"><b class="text">核桃</b></span></a> <a class="outer"
                            href="javascript:;"><span class="inner"><b class="text">核桃</b></span></a> <a
                            class="outer" href="javascript:;"><span class="inner"><b
                                class="text">核桃</b></span></a> <a class="outer" href="javascript:;"><span
                            class="inner"><b class="text">核桃</b></span></a> <a class="outer"
                            href="javascript:;"><span class="inner"><b class="text">核桃</b></span></a>
                    </div>
                    <a href="javascript:;"> <img src="images/5.jpg" />
                        <div class="outer-con">
                            <div class="title">零食大礼包开抢啦</div>
                            <div class="sub-title">当小鱼儿恋上软豆腐</div>
                        </div>
                    </a>
                    <div class="triangle-topright"></div>
                </div>

                <div class="am-u-sm-7 am-u-md-5 am-u-lg-2 text-two big">

                    <div class="outer-con">
                        <div class="title">雪之恋和风大福</div>
                        <div class="sub-title">¥13.8</div>

                    </div>
                    <a href="javascript:;"><img src="images/act1.png" /></a>
                </div>

                <li>
                    <div class="am-u-md-2 am-u-lg-2 text-three">
                        <div class="boxLi"></div>
                        <div class="outer-con">
                            <div class="title">小优布丁</div>
                            <div class="sub-title">¥4.8</div>

                        </div>
                        <a href="javascript:;"><img src="images/1.jpg" /></a>
                    </div>
                </li>
                <li>
                    <div class="am-u-md-2 am-u-lg-2 text-three sug">
                        <div class="boxLi"></div>
                        <div class="outer-con">
                            <div class="title">小优布丁</div>
                            <div class="sub-title">¥4.8</div>

                        </div>
                        <a href="javascript:;"><img src="images/2.jpg" /></a>
                    </div>
                </li>
                <li>
                    <div class="am-u-sm-4 am-u-md-5 am-u-lg-4 text-five">
                        <div class="boxLi"></div>
                        <div class="outer-con">
                            <div class="title">小优布丁</div>
                            <div class="sub-title">¥4.8</div>

                        </div>
                        <a href="javascript:;"><img src="images/5.jpg" /></a>
                    </div>
                </li>
                <li>
                    <div class="am-u-sm-4 am-u-md-2 am-u-lg-2 text-six">
                        <div class="boxLi"></div>
                        <div class="outer-con">
                            <div class="title">小优布丁</div>
                            <div class="sub-title">¥4.8</div>

                        </div>
                        <a href="javascript:;"><img src="images/3.jpg" /></a>
                    </div>
                </li>
                <li>
                    <div class="am-u-sm-4 am-u-md-2 am-u-lg-4 text-six">
                        <div class="boxLi"></div>
                        <div class="outer-con">
                            <div class="title">小优布丁</div>
                            <div class="sub-title">¥4.8</div>

                        </div>
                        <a href="javascript:;"><img src="images/4.jpg" /></a>
                    </div>
                </li>
            </div>
            <div class="clear"></div>
        </div>
        <div class="f6">

            坚果
            <div class="am-container">
                <div class="shopTitle">
                    <h4 class="floor-title">坚果</h4>
                    <div class="floor-subtitle">
                        <em class="am-icon-caret-left"></em>
                        <h3>酥酥脆脆，回味无穷</h3>
                    </div>
                    <div class="today-brands" style="right: 0px; top: 13px">
                        <a href="javascript:;">腰果</a>| <a href="javascript:;">松子</a>| <a href="javascript:;">夏威夷果 </a>|
                        <a href="javascript:;">碧根果</a>| <a href="javascript:;">开心果</a>| <a href="javascript:;">核桃仁</a>
                    </div>
                </div>
            </div>
            <div class="am-g am-g-fixed floodSeven">
                <div class="am-u-sm-5 am-u-md-4 text-one list">
                    <div class="word">
                        <a class="outer" href="javascript:;"><span class="inner"><b
                                class="text">核桃</b></span></a> <a class="outer" href="javascript:;"><span
                            class="inner"><b class="text">核桃</b></span></a> <a class="outer"
                            href="javascript:;"><span class="inner"><b class="text">核桃</b></span></a> <a
                            class="outer" href="javascript:;"><span class="inner"><b
                                class="text">核桃</b></span></a> <a class="outer" href="javascript:;"><span
                            class="inner"><b class="text">核桃</b></span></a> <a class="outer"
                            href="javascript:;"><span class="inner"><b class="text">核桃</b></span></a> <a
                            class="outer" href="javascript:;"><span class="inner"><b
                                class="text">核桃</b></span></a> <a class="outer" href="javascript:;"><span
                            class="inner"><b class="text">核桃</b></span></a> <a class="outer"
                            href="javascript:;"><span class="inner"><b class="text">核桃</b></span></a>
                    </div>
                    <a href="javascript:;">
                        <div class="outer-con">
                            <div class="title">零食大礼包开抢啦！</div>
                            <div class="sub-title">零食大礼包</div>
                        </div> <img src="images/11.jpg" />
                    </a>
                    <div class="triangle-topright"></div>
                </div>

                <div class="am-u-sm-7 am-u-md-4 text-two big">

                    <div class="outer-con">
                        <div class="title">雪之恋和风大福</div>
                        <div class="sub-title">¥13.8</div>

                    </div>
                    <a href="javascript:;"><img src="images/act2.png" /></a>

                </div>

                <li>
                    <div class="am-u-sm-7 am-u-md-4 text-two">
                        <div class="boxLi"></div>
                        <div class="outer-con">
                            <div class="title">雪之恋和风大福</div>
                            <div class="sub-title">¥13.8</div>

                        </div>
                        <a href="javascript:;"><img src="images/6.jpg" /></a>
                    </div>
                </li>
                <li>
                    <div class="am-u-sm-3 am-u-md-2 text-three sug">
                        <div class="boxLi"></div>
                        <div class="outer-con">
                            <div class="title">小优布丁</div>
                            <div class="sub-title">¥4.8</div>

                        </div>
                        <a href="javascript:;"><img src="images/7.jpg" /></a>
                    </div>
                </li>
                <li>
                    <div class="am-u-sm-3 am-u-md-2 text-three big">
                        <div class="boxLi"></div>
                        <div class="outer-con">
                            <div class="title">小优布丁</div>
                            <div class="sub-title">¥4.8</div>

                        </div>
                        <a href="javascript:;"><img src="images/10.jpg" /></a>
                    </div>
                </li>
                <li>
                    <div class="am-u-sm-3 am-u-md-2 text-three">
                        <div class="boxLi"></div>
                        <div class="outer-con">
                            <div class="title">小优布丁</div>
                            <div class="sub-title">¥4.8</div>

                        </div>
                        <a href="javascript:;"><img src="images/8.jpg" /></a>
                    </div>
                </li>
                <li>
                    <div class="am-u-sm-3 am-u-md-2 text-three">
                        <div class="boxLi"></div>
                        <div class="outer-con">
                            <div class="title">小优布丁</div>
                            <div class="sub-title">¥4.8</div>

                        </div>
                        <a href="javascript:;"><img src="images/9.jpg" /></a>
                    </div>
                </li>
            </div>
            <div class="clear"></div>
        </div>

        <div class="f7">
            甜点

            <div class="am-container">
                <div class="shopTitle">
                    <h4 class="floor-title">甜品</h4>
                    <div class="floor-subtitle">
                        <em class="am-icon-caret-left"></em>
                        <h3>每一道甜品都有一个故事</h3>
                    </div>
                    <div class="today-brands" style="right: 0px; top: 13px;">
                        <a href="javascript:;">桂花糕</a>| <a href="javascript:;">奶皮酥</a>| <a href="javascript:;">栗子糕
                        </a>| <a href="javascript:;">马卡龙</a>| <a href="javascript:;">铜锣烧</a>| <a href="javascript:;">豌豆黄</a>
                    </div>

                </div>
            </div>

            <div class="am-g am-g-fixed floodSix">

                <div class="am-u-sm-5 am-u-md-3 text-one list">
                    <div class="word">
                        <a class="outer" href="javascript:;"><span class="inner"><b
                                class="text">核桃</b></span></a> <a class="outer" href="javascript:;"><span
                            class="inner"><b class="text">核桃</b></span></a> <a class="outer"
                            href="javascript:;"><span class="inner"><b class="text">核桃</b></span></a> <a
                            class="outer" href="javascript:;"><span class="inner"><b
                                class="text">核桃</b></span></a> <a class="outer" href="javascript:;"><span
                            class="inner"><b class="text">核桃</b></span></a> <a class="outer"
                            href="javascript:;"><span class="inner"><b class="text">核桃</b></span></a> <a
                            class="outer" href="javascript:;"><span class="inner"><b
                                class="text">核桃</b></span></a> <a class="outer" href="javascript:;"><span
                            class="inner"><b class="text">核桃</b></span></a> <a class="outer"
                            href="javascript:;"><span class="inner"><b class="text">核桃</b></span></a> <a
                            class="outer" href="javascript:;"><span class="inner"><b
                                class="text">核桃</b></span></a> <a class="outer" href="javascript:;"><span
                            class="inner"><b class="text">核桃</b></span></a> <a class="outer"
                            href="javascript:;"><span class="inner"><b class="text">核桃</b></span></a>
                    </div>
                    <a href="javascript:;"> <img src="images/5.jpg" />
                        <div class="outer-con">
                            <div class="title">零食大礼包开抢啦</div>
                            <div class="sub-title">当小鱼儿恋上软豆腐</div>
                        </div>
                    </a>
                    <div class="triangle-topright"></div>
                </div>

                <div class="am-u-sm-7 am-u-md-5 am-u-lg-2 text-two big">

                    <div class="outer-con">
                        <div class="title">雪之恋和风大福</div>
                        <div class="sub-title">¥13.8</div>

                    </div>
                    <a href="javascript:;"><img src="images/act1.png" /></a>
                </div>

                <li>
                    <div class="am-u-md-2 am-u-lg-2 text-three">
                        <div class="boxLi"></div>
                        <div class="outer-con">
                            <div class="title">小优布丁</div>
                            <div class="sub-title">¥4.8</div>

                        </div>
                        <a href="javascript:;"><img src="images/1.jpg" /></a>
                    </div>
                </li>
                <li>
                    <div class="am-u-md-2 am-u-lg-2 text-three sug">
                        <div class="boxLi"></div>
                        <div class="outer-con">
                            <div class="title">小优布丁</div>
                            <div class="sub-title">¥4.8</div>

                        </div>
                        <a href="javascript:;"><img src="images/2.jpg" /></a>
                    </div>
                </li>
                <li>
                    <div class="am-u-sm-4 am-u-md-5 am-u-lg-4 text-five">
                        <div class="boxLi"></div>
                        <div class="outer-con">
                            <div class="title">小优布丁</div>
                            <div class="sub-title">¥4.8</div>

                        </div>
                        <a href="javascript:;"><img src="images/5.jpg" /></a>
                    </div>
                </li>
                <li>
                    <div class="am-u-sm-4 am-u-md-2 am-u-lg-2 text-six">
                        <div class="boxLi"></div>
                        <div class="outer-con">
                            <div class="title">小优布丁</div>
                            <div class="sub-title">¥4.8</div>

                        </div>
                        <a href="javascript:;"><img src="images/3.jpg" /></a>
                    </div>
                </li>
                <li>
                    <div class="am-u-sm-4 am-u-md-2 am-u-lg-4 text-six">
                        <div class="boxLi"></div>
                        <div class="outer-con">
                            <div class="title">小优布丁</div>
                            <div class="sub-title">¥4.8</div>

                        </div>
                        <a href="javascript:;"><img src="images/4.jpg" /></a>
                    </div>
                </li>
            </div>
            <div class="clear"></div>
        </div>
        <div class="f8">

            坚果
            <div class="am-container">
                <div class="shopTitle">
                    <h4 class="floor-title">坚果</h4>
                    <div class="floor-subtitle">
                        <em class="am-icon-caret-left"></em>
                        <h3>酥酥脆脆，回味无穷</h3>
                    </div>
                    <div class="today-brands" style="right: 0px; top: 13px">
                        <a href="javascript:;">腰果</a>| <a href="javascript:;">松子</a>| <a href="javascript:;">夏威夷果 </a>|
                        <a href="javascript:;">碧根果</a>| <a href="javascript:;">开心果</a>| <a href="javascript:;">核桃仁</a>
                    </div>
                </div>
            </div>
            <div class="am-g am-g-fixed floodSeven">
                <div class="am-u-sm-5 am-u-md-4 text-one list">
                    <div class="word">
                        <a class="outer" href="javascript:;"><span class="inner"><b
                                class="text">核桃</b></span></a> <a class="outer" href="javascript:;"><span
                            class="inner"><b class="text">核桃</b></span></a> <a class="outer"
                            href="javascript:;"><span class="inner"><b class="text">核桃</b></span></a> <a
                            class="outer" href="javascript:;"><span class="inner"><b
                                class="text">核桃</b></span></a> <a class="outer" href="javascript:;"><span
                            class="inner"><b class="text">核桃</b></span></a> <a class="outer"
                            href="javascript:;"><span class="inner"><b class="text">核桃</b></span></a> <a
                            class="outer" href="javascript:;"><span class="inner"><b
                                class="text">核桃</b></span></a> <a class="outer" href="javascript:;"><span
                            class="inner"><b class="text">核桃</b></span></a> <a class="outer"
                            href="javascript:;"><span class="inner"><b class="text">核桃</b></span></a>
                    </div>
                    <a href="javascript:;">
                        <div class="outer-con">
                            <div class="title">零食大礼包开抢啦！</div>
                            <div class="sub-title">零食大礼包</div>
                        </div> <img src="images/11.jpg" />
                    </a>
                    <div class="triangle-topright"></div>
                </div>

                <div class="am-u-sm-7 am-u-md-4 text-two big">

                    <div class="outer-con">
                        <div class="title">雪之恋和风大福</div>
                        <div class="sub-title">¥13.8</div>

                    </div>
                    <a href="javascript:;"><img src="images/act2.png" /></a>

                </div>

                <li>
                    <div class="am-u-sm-7 am-u-md-4 text-two">
                        <div class="boxLi"></div>
                        <div class="outer-con">
                            <div class="title">雪之恋和风大福</div>
                            <div class="sub-title">¥13.8</div>

                        </div>
                        <a href="javascript:;"><img src="images/6.jpg" /></a>
                    </div>
                </li>
                <li>
                    <div class="am-u-sm-3 am-u-md-2 text-three sug">
                        <div class="boxLi"></div>
                        <div class="outer-con">
                            <div class="title">小优布丁</div>
                            <div class="sub-title">¥4.8</div>

                        </div>
                        <a href="javascript:;"><img src="images/7.jpg" /></a>
                    </div>
                </li>
                <li>
                    <div class="am-u-sm-3 am-u-md-2 text-three big">
                        <div class="boxLi"></div>
                        <div class="outer-con">
                            <div class="title">小优布丁</div>
                            <div class="sub-title">¥4.8</div>

                        </div>
                        <a href="javascript:;"><img src="images/10.jpg" /></a>
                    </div>
                </li>
                <li>
                    <div class="am-u-sm-3 am-u-md-2 text-three">
                        <div class="boxLi"></div>
                        <div class="outer-con">
                            <div class="title">小优布丁</div>
                            <div class="sub-title">¥4.8</div>

                        </div>
                        <a href="javascript:;"><img src="images/8.jpg" /></a>
                    </div>
                </li>
                <li>
                    <div class="am-u-sm-3 am-u-md-2 text-three">
                        <div class="boxLi"></div>
                        <div class="outer-con">
                            <div class="title">小优布丁</div>
                            <div class="sub-title">¥4.8</div>

                        </div>
                        <a href="javascript:;"><img src="images/9.jpg" /></a>
                    </div>
                </li>
            </div>
            <div class="clear"></div>
        </div>

        <div class="f9">
            甜点

            <div class="am-container">
                <div class="shopTitle">
                    <h4 class="floor-title">甜品</h4>
                    <div class="floor-subtitle">
                        <em class="am-icon-caret-left"></em>
                        <h3>每一道甜品都有一个故事</h3>
                    </div>
                    <div class="today-brands" style="right: 0px; top: 13px;">
                        <a href="javascript:;">桂花糕</a>| <a href="javascript:;">奶皮酥</a>| <a href="javascript:;">栗子糕
                        </a>| <a href="javascript:;">马卡龙</a>| <a href="javascript:;">铜锣烧</a>| <a href="javascript:;">豌豆黄</a>
                    </div>

                </div>
            </div>

            <div class="am-g am-g-fixed floodSix">

                <div class="am-u-sm-5 am-u-md-3 text-one list">
                    <div class="word">
                        <a class="outer" href="javascript:;"><span class="inner"><b
                                class="text">核桃</b></span></a> <a class="outer" href="javascript:;"><span
                            class="inner"><b class="text">核桃</b></span></a> <a class="outer"
                            href="javascript:;"><span class="inner"><b class="text">核桃</b></span></a> <a
                            class="outer" href="javascript:;"><span class="inner"><b
                                class="text">核桃</b></span></a> <a class="outer" href="javascript:;"><span
                            class="inner"><b class="text">核桃</b></span></a> <a class="outer"
                            href="javascript:;"><span class="inner"><b class="text">核桃</b></span></a> <a
                            class="outer" href="javascript:;"><span class="inner"><b
                                class="text">核桃</b></span></a> <a class="outer" href="javascript:;"><span
                            class="inner"><b class="text">核桃</b></span></a> <a class="outer"
                            href="javascript:;"><span class="inner"><b class="text">核桃</b></span></a>
                    </div>
                    <a href="javascript:;"> <img src="images/5.jpg" />
                        <div class="outer-con">
                            <div class="title">零食大礼包开抢啦</div>
                            <div class="sub-title">当小鱼儿恋上软豆腐</div>
                        </div>
                    </a>
                    <div class="triangle-topright"></div>
                </div>

                <div class="am-u-sm-7 am-u-md-5 am-u-lg-2 text-two big">

                    <div class="outer-con">
                        <div class="title">雪之恋和风大福</div>
                        <div class="sub-title">¥13.8</div>

                    </div>
                    <a href="javascript:;"><img src="images/act1.png" /></a>
                </div>

                <li>
                    <div class="am-u-md-2 am-u-lg-2 text-three">
                        <div class="boxLi"></div>
                        <div class="outer-con">
                            <div class="title">小优布丁</div>
                            <div class="sub-title">¥4.8</div>

                        </div>
                        <a href="javascript:;"><img src="images/1.jpg" /></a>
                    </div>
                </li>
                <li>
                    <div class="am-u-md-2 am-u-lg-2 text-three sug">
                        <div class="boxLi"></div>
                        <div class="outer-con">
                            <div class="title">小优布丁</div>
                            <div class="sub-title">¥4.8</div>

                        </div>
                        <a href="javascript:;"><img src="images/2.jpg" /></a>
                    </div>
                </li>
                <li>
                    <div class="am-u-sm-4 am-u-md-5 am-u-lg-4 text-five">
                        <div class="boxLi"></div>
                        <div class="outer-con">
                            <div class="title">小优布丁</div>
                            <div class="sub-title">¥4.8</div>

                        </div>
                        <a href="javascript:;"><img src="images/5.jpg" /></a>
                    </div>
                </li>
                <li>
                    <div class="am-u-sm-4 am-u-md-2 am-u-lg-2 text-six">
                        <div class="boxLi"></div>
                        <div class="outer-con">
                            <div class="title">小优布丁</div>
                            <div class="sub-title">¥4.8</div>

                        </div>
                        <a href="javascript:;"><img src="images/3.jpg" /></a>
                    </div>
                </li>
                <li>
                    <div class="am-u-sm-4 am-u-md-2 am-u-lg-4 text-six">
                        <div class="boxLi"></div>
                        <div class="outer-con">
                            <div class="title">小优布丁</div>
                            <div class="sub-title">¥4.8</div>

                        </div>
                        <a href="javascript:;"><img src="images/4.jpg" /></a>
                    </div>
                </li>
            </div>
            <div class="clear"></div>
        </div>
        <div class="f10">

            坚果
            <div class="am-container">
                <div class="shopTitle">
                    <h4 class="floor-title">坚果</h4>
                    <div class="floor-subtitle">
                        <em class="am-icon-caret-left"></em>
                        <h3>酥酥脆脆，回味无穷</h3>
                    </div>
                    <div class="today-brands" style="right: 0px; top: 13px">
                        <a href="javascript:;">腰果</a>| <a href="javascript:;">松子</a>| <a href="javascript:;">夏威夷果 </a>|
                        <a href="javascript:;">碧根果</a>| <a href="javascript:;">开心果</a>| <a href="javascript:;">核桃仁</a>
                    </div>
                </div>
            </div>
            <div class="am-g am-g-fixed floodSeven">
                <div class="am-u-sm-5 am-u-md-4 text-one list">
                    <div class="word">
                        <a class="outer" href="javascript:;"><span class="inner"><b
                                class="text">核桃</b></span></a> <a class="outer" href="javascript:;"><span
                            class="inner"><b class="text">核桃</b></span></a> <a class="outer"
                            href="javascript:;"><span class="inner"><b class="text">核桃</b></span></a> <a
                            class="outer" href="javascript:;"><span class="inner"><b
                                class="text">核桃</b></span></a> <a class="outer" href="javascript:;"><span
                            class="inner"><b class="text">核桃</b></span></a> <a class="outer"
                            href="javascript:;"><span class="inner"><b class="text">核桃</b></span></a>
                    </div>
                    <a href="javascript:;">
                        <div class="outer-con">
                            <div class="title">零食大礼包开抢啦！</div>
                            <div class="sub-title">零食大礼包</div>
                        </div> <img src="images/11.jpg" />
                    </a>
                    <div class="triangle-topright"></div>
                </div>

                <div class="am-u-sm-7 am-u-md-4 text-two big">

                    <div class="outer-con">
                        <div class="title">雪之恋和风大福</div>
                        <div class="sub-title">¥13.8</div>

                    </div>
                    <a href="javascript:;"><img src="images/act2.png" /></a>

                </div>

                <li>
                    <div class="am-u-sm-7 am-u-md-4 text-two">
                        <div class="boxLi"></div>
                        <div class="outer-con">
                            <div class="title">雪之恋和风大福</div>
                            <div class="sub-title">¥13.8</div>

                        </div>
                        <a href="javascript:;"><img src="images/6.jpg" /></a>
                    </div>
                </li>
                <li>
                    <div class="am-u-sm-3 am-u-md-2 text-three sug">
                        <div class="boxLi"></div>
                        <div class="outer-con">
                            <div class="title">小优布丁</div>
                            <div class="sub-title">¥4.8</div>

                        </div>
                        <a href="javascript:;"><img src="images/7.jpg" /></a>
                    </div>
                </li>
                <li>
                    <div class="am-u-sm-3 am-u-md-2 text-three big">
                        <div class="boxLi"></div>
                        <div class="outer-con">
                            <div class="title">小优布丁</div>
                            <div class="sub-title">¥4.8</div>

                        </div>
                        <a href="javascript:;"><img src="images/10.jpg" /></a>
                    </div>
                </li>
                <li>
                    <div class="am-u-sm-3 am-u-md-2 text-three">
                        <div class="boxLi"></div>
                        <div class="outer-con">
                            <div class="title">小优布丁</div>
                            <div class="sub-title">¥4.8</div>

                        </div>
                        <a href="javascript:;"><img src="images/8.jpg" /></a>
                    </div>
                </li>
                <li>
                    <div class="am-u-sm-3 am-u-md-2 text-three">
                        <div class="boxLi"></div>
                        <div class="outer-con">
                            <div class="title">小优布丁</div>
                            <div class="sub-title">¥4.8</div>

                        </div>
                        <a href="javascript:;"><img src="images/9.jpg" /></a>
                    </div>
                </li>
            </div>
            <div class="clear"></div>
        </div>



        <div class="footer">
            <div class="footer-hd">
                <p>
                    <a href="javascript:;">恒望科技</a> <b>|</b> <a href="javascript:;">商城首页</a> <b>|</b> <a
                        href="#">支付宝</a> <b>|</b> <a href="javascript:;">物流</a>
                </p>
            </div>
            <div class="footer-bd">
                <p>
                    <a href="javascript:;">关于恒望</a> <a href="javascript:;">合作伙伴</a> <a href="javascript:;">联系我们</a>
                    <a href="javascript:;">网站地图</a> <em>© 2015-2025 Hengwang.com 版权所有. 更多模板
                        <a href="Javascript:;" target="_blank" title=""></a>
                        - Collect from <a href="Javascript:;" title=""
                        target="_blank"></a>
                    </em>
                </p>
            </div>
        </div>
    </div>
</div>
</div>
</div> -->

			<!--引导 -->
			<div class="navCir">
				<li class="active"><a href="home/list.do"><i
						class="am-icon-home"></i>首页</a></li>
				<li><a href="javascript:;"><i class="am-icon-list"></i>分类</a></li>
				<li><a href="shopCart/listShopCart.do"><i
						class="am-icon-shopping-basket"></i>购物车</a></li>
				<li><a href="personalData/list.do"><i class="am-icon-user"></i>我的</a></li>
			</div>
			<!--菜单 -->
			<div class=tip>
				<div id="sidebar">
					<div id="wrap">
						<div id="prof" class="item">
							<a href="personalData/list.do"> <span class="setting"></span>
							</a>
							<div class="ibar_login_box status_login">
								<c:if test="${user != null }">
									<div class="avatar_box">
										<p class="avatar_imgbox">
											<img src="${user.userPhoto }" />
										</p>
										<ul class="user_info">
											<li>用户名：${user.userName }</li>
										</ul>
									</div>

									<div class="login_btnbox">
										<c:if test="${user != null }">
											<a href="orderInfo/listSucceed.do" class="login_order">我的订单</a>
											<a href="favorite/show.do" class="login_favorite">我的收藏</a>
										</c:if>
									</div>
									<i class="icon_arrow_white"></i>
								</c:if>
								<c:if test="${user eq null}">
									<div class="menu-hd">
										<a href="login.jsp" target="_top" class="h">亲，请登录</a> <a
											href="register/list.do" target="_top">免费注册</a>
									</div>
								</c:if>
							</div>
						</div>
						<div id="shopCart" class="item">
							<a href="javascript:;"> <span class="message"></span>
							</a>
							<p>购物车</p>
							<p class="cart_num">0</p>
						</div>
						<script>
							$(function() {
								$("#shopCart").click(function() {
									location.href = "shopCart/listShopCart.do";
								});
							});
						</script>
						<div id="asset" class="item">
							<a href="javascript:;"> <span class="view"></span>
							</a>
							<div class="mp_tooltip">
								我的资产 <i class="icon_arrow_right_black"></i>
							</div>
						</div>

						<div id="foot" class="item">
							<a href="foot/show.do"> <span class="zuji"></span>
							</a>
							<div class="mp_tooltip">
								我的足迹 <i class="icon_arrow_right_black"></i>
							</div>
						</div>

						<div id="brand" class="item">
							<a href="javascript:;"> <span class="wdsc"><img
									src="images/wdsc.png" /></span>
							</a>
							<div class="mp_tooltip">
								我的收藏 <i class="icon_arrow_right_black"></i>
							</div>
						</div>

						<div id="broadcast" class="item">
							<a href="javascript:;"> <span class="chongzhi"><img
									src="images/chongzhi.png" /></span>
							</a>
							<div class="mp_tooltip">
								我要充值 <i class="icon_arrow_right_black"></i>
							</div>
						</div>
						<div class="quick_toggle">
							<li class="qtitem"><a href="javascript:;"><span
									class="kfzx"></span></a>
								<div class="mp_tooltip">
									客服中心<i class="icon_arrow_right_black"></i>
								</div></li>
							<!--二维码 -->
							<li class="qtitem"><a href="#none"><span
									class="mpbtn_qrcode"></span></a>
								<div class="mp_qrcode" style="display: none;">
									<img src="images/weixin_code_145.png" /><i
										class="icon_arrow_white"></i>
								</div></li>
							<li class="qtitem"><a href="#top" class="return_top"><span
									class="top"></span></a></li>
						</div>

						<!--回到顶部 -->
						<div id="quick_links_pop" class="quick_links_pop hide"></div>

					</div>

				</div>
				<div id="prof-content" class="nav-content">
					<div class="nav-con-close">
						<i class="am-icon-angle-right am-icon-fw"></i>
					</div>
					<div>我</div>
				</div>
				<div id="shopCart-content" class="nav-content">
					<div class="nav-con-close">
						<i class="am-icon-angle-right am-icon-fw"></i>
					</div>
					<div>购物车</div>
				</div>
				<div id="asset-content" class="nav-content">
					<div class="nav-con-close">
						<i class="am-icon-angle-right am-icon-fw"></i>
					</div>
					<div>资产</div>

					<div class="ia-head-list">
						<a href="#" target="_blank" class="pl">
							<div class="num">0</div>
							<div class="text">优惠券</div>
						</a> <a href="#" target="_blank" class="pl">
							<div class="num">0</div>
							<div class="text">红包</div>
						</a> <a href="#" target="_blank" class="pl money">
							<div class="num">￥0</div>
							<div class="text">余额</div>
						</a>
					</div>

				</div>
				<div id="foot-content" class="nav-content">
					<div class="nav-con-close">
						<i class="am-icon-angle-right am-icon-fw"></i>
					</div>
					<div>足迹</div>
				</div>
				<div id="brand-content" class="nav-content">
					<div class="nav-con-close">
						<i class="am-icon-angle-right am-icon-fw"></i>
					</div>
					<div>收藏</div>
				</div>
				<div id="broadcast-content" class="nav-content">
					<div class="nav-con-close">
						<i class="am-icon-angle-right am-icon-fw"></i>
					</div>
					<div>充值</div>
				</div>
			</div>
			<script>
				window.jQuery
						|| document
								.write('<script src="basic/js/jquery.min.js"><\/script>');
			</script>
			<script type="text/javascript" src="basic/js/quick_links.js"></script>
</body>

</html>
