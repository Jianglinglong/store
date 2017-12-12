<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="/common/jstl.jspf"%>
<!DOCTYPE html>
<html>
<base href="${basePath}/" />
<base scr="${basePath}/" />
<head>
<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1.0,maximum-scale=1.0, user-scalable=0">

<title>退换货管理</title>

<link href="AmazeUI-2.4.2/assets/css/admin.css" rel="stylesheet"
	type="text/css">
<link href="AmazeUI-2.4.2/assets/css/amazeui.css" rel="stylesheet"
	type="text/css">

<link href="css/personal.css" rel="stylesheet" type="text/css">
<link href="css/orstyle.css" rel="stylesheet" type="text/css">

<script src="AmazeUI-2.4.2/assets/js/jquery.min.js"></script>
<script src="AmazeUI-2.4.2/assets/js/amazeui.js"></script>
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
								<c:if test="${user == null }">
									<a href="javascript:;" target="_top" class="h">亲，请登录</a>
									<a href="javascript:;" target="_top">免费注册</a>
								</c:if>
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

				<div class="user-order">

					<!--标题 -->
					<div class="am-cf am-padding">
						<div class="am-fl am-cf">
							<strong class="am-text-danger am-text-lg">退换货管理</strong> / <small>Change</small>
						</div>
					</div>
					<hr />

					<div class="am-tabs am-tabs-d2 am-margin" data-am-tabs>

						<ul class="am-avg-sm-2 am-tabs-nav am-nav am-nav-tabs">
							<li class="am-active"><a href="#tab1">退款管理</a></li>
							<li><a href="#tab2">售后管理</a></li>

						</ul>

						<div class="am-tabs-bd">
							<div class="am-tab-panel am-fade am-in am-active" id="tab1">
								<div class="order-top">
									<div class="th th-item">
										<td class="td-inner">商品</td>
									</div>
									<div class="th th-orderprice th-price">
										<td class="td-inner">交易金额</td>
									</div>
									<div class="th th-changeprice th-price">
										<td class="td-inner">退款金额</td>
									</div>
									<div class="th th-status th-moneystatus">
										<td class="td-inner">交易状态</td>
									</div>
									<div class="th th-change th-changebuttom">
										<td class="td-inner">交易操作</td>
									</div>
								</div>
								<c:forEach items="${orderInfo }" var="orderInfo">
									<c:if test="${orderInfo.appraisStatus==3 }">

										<div class="order-main">
											<div class="order-list">
												<div class="order-title">
													<div class="dd-num">
														退款编号：<a href="javascript:;">${orderInfo.orderId }</a>
													</div>
													<span>申请时间：<h>
														<fmt:formatDate value="${orderInfo.orderTime }"
															pattern="yyyy-MM-dd" /></h></span>
													<!--    <em>店铺：小桔灯</em>-->
												</div>
												<div class="order-content">
													<div class="order-left">
														<ul class="item-list">
															<li class="td td-item">
																<div class="item-pic">
																	<a href="javascript:;" class="J_MakePoint"> <img
																		src="${orderInfo.proImg }" class="itempic J_ItemImg">
																	</a>
																</div>
																<div class="item-info">
																	<div class="item-basic-info">
																		<a href="javascript:;">
																			<p>${orderInfo.proName }</p>
																			<p class="info-little">${orderInfo.orderLevle1 }
																				<br />${orderInfo.orderLevle2 }
																			</p>
																		</a>
																	</div>
																</div>
															</li>

															<ul class="td-changeorder">
																<li class="td td-orderprice">
																	<div class="item-orderprice">
																		<span>交易金额：</span>72.00
																	</div>
																</li>
																<li class="td td-changeprice">
																	<div class="item-changeprice">
																		<span>退款金额：</span>70.00
																	</div>
																</li>
															</ul>
															<div class="clear"></div>
														</ul>

														<div class="change move-right">
															<li class="td td-moneystatus td-status">
																<div class="item-status">
																	<p class="Mystatus">退款成功</p>

																</div>
															</li>
														</div>
														<li class="td td-change td-changebutton"><a
															href="orderInfo/record.do">
																<div class="am-btn am-btn-danger anniu">钱款去向</div>
														</a></li>

													</div>
												</div>

											</div>


										</div>
									</c:if>
								</c:forEach>

							</div>
							<div class="am-tab-panel am-fade" id="tab2">
								<div class="order-top">
									<div class="th th-item">
										<td class="td-inner">商品</td>
									</div>
									<div class="th th-orderprice th-price">
										<td class="td-inner">交易金额</td>
									</div>
									<div class="th th-changeprice th-price">
										<td class="td-inner">退款金额</td>
									</div>
									<div class="th th-status th-moneystatus">
										<td class="td-inner">交易状态</td>
									</div>
									<div class="th th-change th-changebuttom">
										<td class="td-inner">交易操作</td>
									</div>
								</div>

								<div class="order-main">
									<div class="order-list">
										<div class="order-title">
											<div class="dd-num">
												退款编号：<a href="javascript:;">1601430</a>
											</div>
											<span>申请时间：2015-12-20</span>
											<!--    <em>店铺：小桔灯</em>-->
										</div>
										<div class="order-content">
											<div class="order-left">
												<ul class="item-list">
													<li class="td td-item">
														<div class="item-pic">
															<a href="javascript:;" class="J_MakePoint"> <img
																src="images/kouhong.jpg_80x80.jpg"
																class="itempic J_ItemImg">
															</a>
														</div>
														<div class="item-info">
															<div class="item-basic-info">
																<a href="javascript:;">
																	<p>美康粉黛醉美唇膏 持久保湿滋润防水不掉色</p>
																	<p class="info-little">
																		颜色：12#川南玛瑙 <br />包装：裸装
																	</p>
																</a>
															</div>
														</div>
													</li>

													<ul class="td-changeorder">
														<li class="td td-orderprice">
															<div class="item-orderprice">
																<span>交易金额：</span>72.00
															</div>
														</li>
														<li class="td td-changeprice">
															<div class="item-changeprice">
																<span>退款金额：</span>70.00
															</div>
														</li>
													</ul>
													<div class="clear"></div>
												</ul>

												<div class="change move-right">
													<li class="td td-moneystatus td-status">
														<div class="item-status">
															<p class="Mystatus">退款成功</p>

														</div>
													</li>
												</div>
												<li class="td td-change td-changebutton"><a
													href="record.html">
														<div class="am-btn am-btn-danger anniu">钱款去向</div>
												</a></li>

											</div>
										</div>
									</div>
								</div>

							</div>

						</div>

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
				<li class="person active"><a href="personalData/list.do"><i
						class="am-icon-user"></i>个人中心</a></li>
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
						<li><a href="orderInfo/change.do">退款售后</a></li>
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