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

<title>退换货</title>

<link href="AmazeUI-2.4.2/assets/css/admin.css" rel="stylesheet"
	type="text/css">
<link href="AmazeUI-2.4.2/assets/css/amazeui.css" rel="stylesheet"
	type="text/css">

<link href="css/personal.css" rel="stylesheet" type="text/css">
<link href="css/refstyle.css" rel="stylesheet" type="text/css">

<script src="AmazeUI-2.4.2/assets/js/jquery.min.js"
	type="text/javascript"></script>
<script src="AmazeUI-2.4.2/assets/js/amazeui.js" type="text/javascript"></script>
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
				<!--标题 -->
				<div class="am-cf am-padding">
					<div class="am-fl am-cf">
						<strong class="am-text-danger am-text-lg">退换货申请</strong> / <small>Apply&nbsp;for&nbsp;returns</small>
					</div>
				</div>
				<hr />
				<div class="comment-list">
					<!--进度条-->
					<div class="m-progress">
						<div class="m-progress-list">
							<span class="step-1 step"> <em class="u-progress-stage-bg"></em>
								<i class="u-stage-icon-inner">1<em class="bg"></em></i>
								<p class="stage-name">买家申请退款</p>
							</span> <span class="step-2 step"> <em
								class="u-progress-stage-bg"></em> <i class="u-stage-icon-inner">2<em
									class="bg"></em></i>
								<p class="stage-name">商家处理退款申请</p>
							</span> <span class="step-3 step"> <em
								class="u-progress-stage-bg"></em> <i class="u-stage-icon-inner">3<em
									class="bg"></em></i>
								<p class="stage-name">款项成功退回</p>
							</span> <span class="u-progress-placeholder"></span>
						</div>
						<div class="u-progress-bar total-steps-2">
							<div class="u-progress-bar-inner"></div>
						</div>
					</div>


					<div class="refund-aside">
						<div class="item-pic">
							<a href="javascript:;" class="J_MakePoint"> <img
								src="${productRl.proImg }" class="itempic">
							</a>
						</div>

						<div class="item-title">

							<div class="item-name">
								<a href="javascript:;">
									<p class="item-basic-info">${productRl.proName }</p>
								</a>
							</div>
							<div class="info-little">
								<span>${allRl.orderLevle1 }</span> <span>${allRl.orderLevle2 }</span>
							</div>
						</div>
						<div class="item-info">
							<div class="item-ordernumber">
								<span class="info-title">订单编号：</span><a>${allRl.orderId }</a>
							</div>
							<div class="item-price">
								<span class="info-title">价&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;格：</span><span
									class="price">${productRl.proPrice }</span> <span
									class="number">×1</span><span class="item-title">(数量)</span>
							</div>
							<div class="item-amount">
								<span class="info-title">小&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;计：</span><span
									class="amount">${productRl.proPrice }</span>
							</div>
							<div class="item-pay-logis">
								<span class="info-title">运&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;费：</span><span
									class="price">10.00元</span>
							</div>
							<div class="item-amountall">
								<span class="info-title">总&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;计：</span><span
									class="amountall">29.88元</span>
							</div>
							<div class="item-time">
								<span class="info-title">成交时间：</span><span class="time"><h>
									<fmt:formatDate value="${orderInfo.orderTime }"
										pattern="yyyy-MM-dd" /></h></span>
							</div>

						</div>
						<div class="clear"></div>
					</div>
					<form action="">

						<div class="refund-main">
							<div class="item-comment">
								<div class="am-form-group">
									<label for="refund-type" class="am-form-label">退款类型</label>
									<div class="am-form-content">
										<select data-am-selected="">
											<option value="a" selected>仅退款</option>
											<option value="b">退款/退货</option>
										</select>
									</div>
								</div>

								<div class="am-form-group">
									<label for="refund-reason" class="am-form-label">退款原因</label>
									<div class="am-form-content">
										<select data-am-selected="">
											<option value="a" selected>请选择退款原因</option>
											<option value="b">不想要了</option>
											<option value="c">买错了</option>
											<option value="d">没收到货</option>
											<option value="e">与说明不符</option>
										</select>
									</div>
								</div>

								<div class="am-form-group">
									<label for="refund-money" class="am-form-label">退款金额<span>（不可修改）</span></label>
									<div class="am-form-content">
										<input type="text" id="refund-money" readonly="readonly"
											placeholder="19.88">
									</div>
								</div>
								<div class="am-form-group">
									<label for="refund-info" class="am-form-label">退款说明<span>（可不填）</span></label>
									<div class="am-form-content">
										<textarea placeholder="请输入退款说明"></textarea>
									</div>
								</div>

							</div>
							<div class="refund-tip">
								<div class="filePic">
									<input type="file" class="inputPic" value="选择凭证图片" name="file"
										max="5" maxsize="5120" allowexts="gif,jpeg,jpg,png,bmp"
										accept="image/*"> <img src="images/image.jpg" alt="">
								</div>
								<span class="desc">上传凭证&nbsp;最多三张</span>
							</div>
							<div class="info-btn">
								<div class="am-btn am-btn-danger">
									<a
										href="orderInfo/payBack.do?proId=${productRl.proId}&orderId=${allRl.orderId }">提交申请</a>
								</div>
							</div>
						</div>
					</form>
				</div>
				<div class="clear"></div>
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