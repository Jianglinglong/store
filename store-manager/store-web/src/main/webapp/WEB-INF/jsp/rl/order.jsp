<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@ include file="/common/jstl.jspf" %>
<!DOCTYPE html>
<html>
<base href="${basePath}/"/>
    <base scr="${basePath}/"/>
	<head>
		<meta charset="utf-8">
		<meta name="viewport" content="width=device-width, initial-scale=1.0,maximum-scale=1.0, user-scalable=0">

		<title>订单管理</title>

		<link href="AmazeUI-2.4.2/assets/css/admin.css" rel="stylesheet" type="text/css">
		<link href="AmazeUI-2.4.2/assets/css/amazeui.css" rel="stylesheet" type="text/css">

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
									<a href="javascript:;" target="_top" class="h">亲，请登录</a>
									<a href="javascript:;" target="_top">免费注册</a>
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
								<div class="menu-hd"><a id="mc-menu-hd" href="javascript:;" target="_top"><i class="am-icon-shopping-cart  am-icon-fw"></i><span>购物车</span><strong id="J_MiniCartNum" class="h">0</strong></a></div>
							</div>
							<div class="topMessage favorite">
								<div class="menu-hd"><a href="favorite/show.do" target="_top"><i class="am-icon-heart am-icon-fw"></i><span>收藏夹</span></a></div>
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
									<input id="searchInput" name="index_none_header_sysc" type="text" placeholder="搜索" autocomplete="off">
									<input id="ai-topsearch" class="submit am-btn" value="搜索" index="1" type="submit">
								</form>
							</div>
						</div>

						<div class="clear"></div>
					</div>
				</div>
			</article>
		</header>
            <div class="nav-table">
					   <div class="long-title"><span class="all-goods">全部分类</span></div>
					   <div class="nav-cont">
							<ul>
								<li class="index"><a href="javascript:;">首页</a></li>
                                <li class="qc"><a href="javascript:;">闪购</a></li>
                                <li class="qc"><a href="javascript:;">限时抢</a></li>
                                <li class="qc"><a href="javascript:;">团购</a></li>
                                <li class="qc last"><a href="javascript:;">大包装</a></li>
							</ul>
						    <div class="nav-extra">
						    	<i class="am-icon-user-secret am-icon-md nav-user"></i><b></b>我的福利
						    	<i class="am-icon-angle-right" style="padding-left: 10px;"></i>
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
							<div class="am-fl am-cf"><strong class="am-text-danger am-text-lg">订单管理</strong> / <small>Order</small></div>
						</div>
						<hr/>

						<div class="am-tabs am-tabs-d2 am-margin" data-am-tabs>

							<ul class="am-avg-sm-5 am-tabs-nav am-nav am-nav-tabs">
								<li class="am-active"><a href="#tab1">所有订单</a></li>
								<li><a href="#tab2">待付款</a></li>
								<li><a href="#tab3">待发货</a></li>
								<li><a href="#tab4">待收货</a></li>
								<li><a href="#tab5">待评价</a></li>
							</ul>

							<div class="am-tabs-bd">
								<div class="am-tab-panel am-fade am-in am-active" id="tab1">
									<div class="order-top">
										<div class="th th-item">
											<td class="td-inner">商品</td>
										</div>
										<div class="th th-price">
											<td class="td-inner">单价</td>
										</div>
										<div class="th th-number">
											<td class="td-inner">数量</td>
										</div>
										<div class="th th-operation">
											<td class="td-inner">商品操作</td>
										</div>
										<div class="th th-amount">
											<td class="td-inner">合计</td>
										</div>
										<div class="th th-status">
											<td class="td-inner">交易状态</td>
										</div>
										<div class="th th-change">
											<td class="td-inner">交易操作</td>
										</div>
									</div>

									<div class="order-main">
										<div class="order-list">
											
											<!--交易成功-->
											<c:forEach items="${orders}" var="orders" varStatus="rl">
											<div class="order-status5">
												<div class="order-title">
													<div class="dd-num">订单编号：<a href="javascript:;">${orders.orderId }</a></div>
													<span>成交时间：<h><fmt:formatDate value="${orders.orderTime }" pattern="yyyy-MM-dd"/></h></span>
													<!--    <em>店铺：小桔灯</em>-->
												</div>
												<div class="order-content">
												
													<div class="order-left">
													<c:forEach items="${order0 }" var="order0" varStatus="rl1">
													<c:if test="${order0.orderId==orders.orderId}">
													<ul class="item-list">
															<li class="td td-item">
																<div class="item-pic">
																	<a href="javascript:;" class="J_MakePoint">
																		<img src="${order0.proImg}" class="itempic J_ItemImg">
																	</a>
																</div>
																<div class="item-info">
																	<div class="item-basic-info">
																		<a href="javascript:;">
																			<p>${order0.proName} </p>
																			<p class="info-little">${order0.orderLevle1}
																				<br/>${order0.orderLevle2 }</p>
																		</a>
																	</div>
																</div>
															</li>
															<li class="td td-price">
																<div class="item-price">
																	${order0.proPrice}
																</div>
															</li>
															<li class="td td-number">
																<div class="item-number">
																	<span>×</span>${order0.proNum}
																</div>
															</li>
															<c:if test="${orders.orderState==1||orders.orderState==2}">
															<li class="td td-operation">
																<c:if test="${order0.appraisStatus==4 }">
																<div class="item-operation">
																	<a href="orderInfo/refund.do?proId=${order0.proId }&orderId=${orders.orderId}">退款</a>
																</div>
																</c:if>
																<c:if test="${order0.appraisStatus==3 }">
																<div class="item-operation">
																	<a href="">退款完成</a>
																</div>
																</c:if>
															</li>
															</c:if>
														</ul>


														
														</c:if>
														
													</c:forEach>	
														
														

													</div>
									
													<div class="order-right">
														<li class="td td-amount">
															<div class="item-amount">
																合计：${orders.orderPrice }
																<p>含运费：<span>10.00</span></p>
															</div>
														</li>
														<!-- 交易成功 -->
															<c:if test="${orders.orderState == 3}">
														<div class="move-right">
															<li class="td td-status">
																<div class="item-status">
																	<p class="Mystatus">交易成功</p>
																	<p class="order-info"><a href="orderInfo/orderInfo.do?orderId=${orders.orderId}">订单详情</a></p>
																	<p class="order-info"><a href="orderInfo/logistics.do?orderId=${orders.orderId}">查看物流</a></p>
																</div>
															</li>
															<li class="td td-change">
																<div class="am-btn am-btn-danger anniu">
																	<a href="orderInfo/deleteOrder.do?orderId=${orders.orderId}">删除订单</a></div>
															</li>
														</div>
														</c:if>
														<!--交易失败  -->
														<c:if test="${orders.orderState == 0 }">
														<div class="move-right">
															<li class="td td-status">
																<div class="item-status">
																<div  class="rl" style="margin: 12px auto;">
																	<p class="Mystatus">交易关闭</p>
																	</div>
																</div>
															</li>
															<li class="td td-change">
																<div class="am-btn am-btn-danger anniu">
																	<a href="orderInfo/deleteOrder.do?orderId=${orders.orderId }">删除订单</a></div>
															</li>
														</div>
														</c:if>
														<!-- 待发货 -->
														<c:if test="${orders.orderState == 1 }">
														<div class="move-right">
															<li class="td td-status">
																<div class="item-status">
																	<p class="Mystatus">买家已付款</p>
																	<p class="order-info"><a href="orderInfo/orderInfo.do?orderId=${orders.orderId}">订单详情</a></p>
																</div>
															</li>
															<li class="td td-change">
																<div class="am-btn am-btn-danger anniu" id="rl">
																	提醒发货</div>
															</li>
														</div>
													</c:if>
													
													<c:if test="${orders.orderState == 2 }">
													<div class="move-right">
															<li class="td td-status">
																<div class="item-status">
																	<p class="Mystatus">卖家已发货</p>
																	<p class="order-info"><a href="orderInfo/orderInfo.do?orderId=${orders.orderId}">订单详情</a></p>
																	<p class="order-info"><a href="orderInfo/logistics.do?orderId=${orders.orderId}">查看物流</a></p>
																	<p class="order-info"><a href="javascript:;">延长收货</a></p>
																</div>
															</li>
															<li class="td td-change">
																<div class="am-btn am-btn-danger anniu">
																	<a href="orderInfo/receipt.do?orderId=${orders.orderId }">确认收货</a></div>
															</li>
														</div>
														</c:if>
													</div>
												</div>
											</div>
											</c:forEach>
											
											
																					
											
											

											
											

										</div>

									</div>

								</div>
								<div class="am-tab-panel am-fade" id="tab2">

									<div class="order-top">
										<div class="th th-item">
											<td class="td-inner">商品</td>
										</div>
										<div class="th th-price">
											<td class="td-inner">单价</td>
										</div>
										<div class="th th-number">
											<td class="td-inner">数量</td>
										</div>
										<div class="th th-operation">
											<td class="td-inner">商品操作</td>
										</div>
										<div class="th th-amount">
											<td class="td-inner">合计</td>
										</div>
										<div class="th th-status">
											<td class="td-inner">交易状态</td>
										</div>
										<div class="th th-change">
											<td class="td-inner">交易操作</td>
										</div>
									</div>
									<!--选项卡--待付款  -->
								<c:forEach items="${orders }" var="orders"> 
								<c:if test="${orders.orderState==0 }">
									<div class="order-main">
										<div class="order-list">
											<div class="order-status1">
												<div class="order-title">
													<div class="dd-num">订单编号：<a href="javascript:;">${orders.orderId }</a></div>
													<span>成交时间：<h><fmt:formatDate value="${orders.orderTime }" pattern="yyyy-MM-dd"/></h></span>
													<!--    <em>店铺：小桔灯</em>-->
												</div>
												<div class="order-content">
												
													<div class="order-left">
													<c:forEach items="${order0 }" var="order0">
												<c:if test="${order0.orderId==orders.orderId }">
														<ul class="item-list">
															<li class="td td-item">
																<div class="item-pic">
																	<a href="javascript:;" class="J_MakePoint">
																		<img src="${order0.proImg}" class="itempic J_ItemImg">
																	</a>
																</div>
																<div class="item-info">
																	<div class="item-basic-info">
																		<a href="javascript:;">
																			<p>${order0.proName}</p>
																			<p class="info-little">${order0.orderLevle1}
																				<br/>${order0.orderLevle2} </p>
																		</a>
																	</div>
																</div>
															</li>
															<li class="td td-price">
																<div class="item-price">
																	${order0.proPrice}
																</div>
															</li>
															<li class="td td-number">
																<div class="item-number">
																	<span>×</span>${order0.proNum}
																</div>
															</li>
															<li class="td td-operation">
																<div class="item-operation">

																</div>
															</li>
														</ul>
														</c:if>
														</c:forEach>
														

														
													</div>
													<div class="order-right">
														<li class="td td-amount">
															<div class="item-amount">
																合计：${orders.orderPrice }
																<p>含运费：<span>10.00</span></p>
															</div>
														</li>
														<div class="move-right">
															<li class="td td-status">
																<div class="item-status">
																	<p class="Mystatus">等待买家付款</p>
																	<p class="order-info"><a href="javascript:;">取消订单</a></p>

																</div>
															</li>
															<li class="td td-change">
																<a href="pay.html">
																<div class="am-btn am-btn-danger anniu">
																	一键支付</div></a>
															</li>
														</div>
													</div>

												</div>
											</div>
										</div>

									</div>
									</c:if>
									</c:forEach>
								</div>
								<div class="am-tab-panel am-fade" id="tab3">
									<div class="order-top">
										<div class="th th-item">
											<td class="td-inner">商品</td>
										</div>
										<div class="th th-price">
											<td class="td-inner">单价</td>
										</div>
										<div class="th th-number">
											<td class="td-inner">数量</td>
										</div>
										<div class="th th-operation">
											<td class="td-inner">商品操作</td>
										</div>
										<div class="th th-amount">
											<td class="td-inner">合计</td>
										</div>
										<div class="th th-status">
											<td class="td-inner">交易状态</td>
										</div>
										<div class="th th-change">
											<td class="td-inner">交易操作</td>
										</div>
									</div>
									<!--待发货  -->
									
									<div class="order-main">
										<div class="order-list">
										<c:forEach items="${orders }" var="orders">
										<c:if test="${orders.orderState==1 }">
											<div class="order-status2">
												<div class="order-title">
													<div class="dd-num">订单编号：<a href="javascript:;">${orders.orderId }</a></div>
													<span>成交时间：<h><fmt:formatDate value="${orders.orderTime }" pattern="yyyy-MM-dd"/></h></span>
													<!--    <em>店铺：小桔灯</em>-->
												</div>
												<div class="order-content">
													<div class="order-left">
													<c:forEach items="${order0 }" var="order0">
													<c:if test="${order0.orderId==orders.orderId }">
														<ul class="item-list">
															<li class="td td-item">
																<div class="item-pic">
																	<a href="javascript:;" class="J_MakePoint">
																		<img src="${order0.proImg}" class="itempic J_ItemImg">
																	</a>
																</div>
																<div class="item-info">
																	<div class="item-basic-info">
																		<a href="javascript:;">
																			<p>${order0.proName}</p>
																			<p class="info-little">${order0.orderLevle1}
																				<br/>${order0.orderLevle2} </p>
																		</a>
																	</div>
																</div>
															</li>
															<li class="td td-price">
																<div class="item-price">
																	${order0.proPrice}
																</div>
															</li>
															<li class="td td-number">
																<div class="item-number">
																	<span>×</span>${order0.proNum}
																</div>
															</li>
															<li class="td td-operation">
															<c:if test="${order0.appraisStatus==4 }">
																<div class="item-operation">
																	<a href="orderInfo/refund.do?proId=${order0.proId }&orderId=${orders.orderId}">退款</a>
																</div>
																</c:if>
																<c:if test="${order0.appraisStatus==3 }">
																<div class="item-operation">
																	<a href="">退款完成</a>
																</div>
																</c:if>
																
															</li>
														</ul>
														</c:if>
														</c:forEach>

														

														
													</div>
													<div class="order-right">
														<li class="td td-amount">
															<div class="item-amount">
																合计：${orders.orderPrice }
																<p>含运费：<span>10.00</span></p>
															</div>
														</li>
														<div class="move-right">
															<li class="td td-status">
																<div class="item-status">
																	<p class="Mystatus">买家已付款</p>
																	<p class="order-info"><a href="orderInfo/orderInfo.do?orderId=${orders.orderId}">订单详情</a></p>
																</div>
															</li>
															<li class="td td-change">
																<div class="am-btn am-btn-danger anniu">
																	提醒发货</div>
															</li>
														</div>
													</div>
												</div>
											</div>
											</c:if>
											</c:forEach>
										</div>
									</div>
								</div>
								<div class="am-tab-panel am-fade" id="tab4">
									<div class="order-top">
										<div class="th th-item">
											<td class="td-inner">商品</td>
										</div>
										<div class="th th-price">
											<td class="td-inner">单价</td>
										</div>
										<div class="th th-number">
											<td class="td-inner">数量</td>
										</div>
										<div class="th th-operation">
											<td class="td-inner">商品操作</td>
										</div>
										<div class="th th-amount">
											<td class="td-inner">合计</td>
										</div>
										<div class="th th-status">
											<td class="td-inner">交易状态</td>
										</div>
										<div class="th th-change">
											<td class="td-inner">交易操作</td>
										</div>
									</div>
									<!-- 待收货 -->

									<div class="order-main">
										<div class="order-list">
										<c:forEach items="${orders }" var="orders">
										<c:if test="${orders.orderState==2 }">
											<div class="order-status3">
												<div class="order-title">
													<div class="dd-num">订单编号：<a href="javascript:;">${orders.orderId }</a></div>
													<span>成交时间：<h><fmt:formatDate value="${orders.orderTime }" pattern="yyyy-MM-dd"/></h></span>
													<!--    <em>店铺：小桔灯</em>-->
												</div>
												<div class="order-content">
													<div class="order-left">
													<c:forEach items="${order0 }" var="order0">
													<c:if test="${order0.orderId==orders.orderId }">
														<ul class="item-list">
															<li class="td td-item">
																<div class="item-pic">
																	<a href="javascript:;" class="J_MakePoint">
																		<img src="${order0.proImg}" class="itempic J_ItemImg">
																	</a>
																</div>
																<div class="item-info">
																	<div class="item-basic-info">
																		<a href="javascript:;">
																			<p>${order0.proName}</p>
																			<p class="info-little">${order0.orderLevle1}
																				<br/>${order0.orderLevle2} </p>
																		</a>
																	</div>
																</div>
															</li>
															<li class="td td-price">
																<div class="item-price">
																	${order0.proPrice}
																</div>
															</li>
															<li class="td td-number">
																<div class="item-number">
																	<span>×</span>${order0.proNum}
																</div>
															</li>
															<li class="td td-operation">
																<c:if test="${order0.appraisStatus==4 }">
																<div class="item-operation">
																	<a href="orderInfo/refund.do?proId=${order0.proId }&orderId=${orders.orderId}">退款</a>
																</div>
																</c:if>
																<c:if test="${order0.appraisStatus==3 }">
																<div class="item-operation">
																	<a href="">退款完成</a>
																</div>
																</c:if>
															</li>
														</ul>
														</c:if>
														</c:forEach>

														

													</div>
													<div class="order-right">
														<li class="td td-amount">
															<div class="item-amount">
																合计：${orders.orderPrice }
																<p>含运费：<span>10.00</span></p>
															</div>
														</li>
														<div class="move-right">
															<li class="td td-status">
																<div class="item-status">
																	<p class="Mystatus">卖家已发货</p>
																	<p class="order-info"><a href="orderInfo/orderInfo.do?orderId=${orders.orderId}">订单详情</a></p>
																	<p class="order-info"><a href="orderInfo/logistics.do?orderId=${orders.orderId}">查看物流</a></p>
																	<p class="order-info"><a href="javascript:;">延长收货</a></p>
																</div>
															</li>
															<li class="td td-change">
																<div class="am-btn am-btn-danger anniu">
																	<a href="orderInfo/receipt.doorderId=${orders.orderId }">确认收货</a></div>
															</li>
														</div>
													</div>
												</div>
											</div>
											</c:if>
											</c:forEach>
										</div>
									</div>
								</div>

								<div class="am-tab-panel am-fade" id="tab5">
									<div class="order-top">
										<div class="th th-item">
											<td class="td-inner">商品</td>
										</div>
										<div class="th th-price">
											<td class="td-inner">单价</td>
										</div>
										<div class="th th-number">
											<td class="td-inner">数量</td>
										</div>
										<div class="th th-operation">
											<td class="td-inner">商品操作</td>
										</div>
										<div class="th th-amount">
											<td class="td-inner">合计</td>
										</div>
										<div class="th th-status">
											<td class="td-inner">交易状态</td>
										</div>
										<div class="th th-change">
											<td class="td-inner">交易操作</td>
										</div>
									</div>
									<!-- 待评价 -->
									

									<div class="order-main">
										<div class="order-list">
											<!--不同状态的订单	-->
											<c:forEach items="${orders }" var="orders">
									<c:if test="${orders.orderState==3 }">
										<div class="order-status4">
												<div class="order-title">
													<div class="dd-num">订单编号：<a href="javascript:;">${orders.orderId }</a></div>
													<span>成交时间：<h><fmt:formatDate value="${orders.orderTime }" pattern="yyyy-MM-dd"/></h></span>

												</div>
												<div class="order-content">
													<div class="order-left">
													<c:forEach items="${order0 }" var="order0">
													<c:if test="${order0.orderId==orders.orderId }">
														<ul class="item-list">
															<li class="td td-item">
																<div class="item-pic">
																	<a href="javascript:;" class="J_MakePoint">
																		<img src="${order0.proImg}" class="itempic J_ItemImg">
																	</a>
																</div>
																<div class="item-info">
																	<div class="item-basic-info">
																		<a href="javascript:;">
																			<p>${order0.proName}</p>
																			<p class="info-little">${order0.orderLevle1 }
																				<br/>${order0.orderLevle2} </p>
																		</a>
																	</div>
																</div>
															</li>
															<li class="td td-price">
																<div class="item-price">
																	${order0.proPrice}
																</div>
															</li>
															<li class="td td-number">
																<div class="item-number">
																	<span>×</span>${order0.proNum}
																</div>
															</li>
															<li class="td td-operation">
																<div class="item-operation">
																	<a href="orderInfo/refund.doproId=${order0.proId }">退款/退货</a>
																</div>
															</li>
														</ul>
														</c:if>
														</c:forEach>

													</div>
													<div class="order-right">
														<li class="td td-amount">
															<div class="item-amount">
																合计：${orders.orderPrice }
																<p>含运费：<span>10.00</span></p>
															</div>
														</li>
														<div class="move-right">
															<li class="td td-status">
																<div class="item-status">
																	<p class="Mystatus">交易成功</p>
																	<p class="order-info"><a href="orderInfo/orderInfo.do?orderId=${orders.orderId }">订单详情</a></p>
																	<p class="order-info"><a href="orderInfo/logistics.do?orderId=${orders.orderId}">查看物流</a></p>
																</div>
															</li>
															<li class="td td-change">
																<a href="orderInfo/commentList.do?orderId=${orders.orderId }">
																	<div class="am-btn am-btn-danger anniu">
																		评价商品</div>
																</a>
															</li>
														</div>
													</div>
												</div>
											</div>
											
											
											</c:if>
									</c:forEach>


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
							<a href="javascript:;">恒望科技</a>
							<b>|</b>
							<a href="home/list.do">商城首页</a>
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
			<aside class="menu">
				<ul>
					<li class="person active">
						<a href="personalData/list.do"><i class="am-icon-user"></i>个人中心</a>
					</li>
					<li class="person">
						<p><i class="am-icon-newspaper-o"></i>个人资料</p>
						<ul>
							<li> <a href="personalData/list.do">个人信息</a></li>
							<li> <a href="personalData/initSafety.do">安全设置</a></li>
							<li> <a href="personalData/initAddress.do">地址管理</a></li>
							<li> <a href="personalData/initCardlist.do">快捷支付</a></li>
						</ul>
					</li>
					<li class="person">
						<p><i class="am-icon-balance-scale"></i>我的交易</p>
						<ul>
							<li><a href="orderInfo/listSucceed.do">订单管理</a></li>
							<li> <a href=" orderInfo/change.do">退款售后</a></li>
							<li> <a href="orderInfo/comment.do">评价商品</a></li>
						</ul>
					</li>
					<li class="person">
						<p><i class="am-icon-dollar"></i>我的资产</p>
						<ul>
							<li> <a href="javascript:getPoints();">我的积分</a></li>
							<li> <a href="javascript:getCoupon();">优惠券 </a></li>
							<li> <a href="javascript:getBonus();">红包</a></li>
							<li> <a href="javascript:getWalletlist();">账户余额</a></li>
							<li> <a href="javascript:getBill();">账单明细</a></li>
						</ul>
					</li>

					<li class="person">
						<p><i class="am-icon-tags"></i>我的收藏</p>
						<ul>
							<li> <a href="favorite/show.do">收藏</a></li>
							<li> <a href="foot/show.do">足迹</a></li>
						</ul>
					</li>

					<li class="person">
						<p><i class="am-icon-qq"></i>在线客服</p>
						<ul>
							<li> <a href="consultation.html">商品咨询</a></li>
							<li> <a href="suggest.html">意见反馈</a></li>							
							
							<li> <a href="news.html">我的消息</a></li>
						</ul>
					</li>
				</ul>

			</aside>
		</div>

	</body>

</html>