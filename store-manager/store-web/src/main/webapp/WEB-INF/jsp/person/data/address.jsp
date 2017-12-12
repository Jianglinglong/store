<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="/common/jstl.jspf"%>
<!DOCTYPE html>
<html>

<head>
<base href="${basePath }/" />
<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1.0,maximum-scale=1.0, user-scalable=0">

<title>地址管理</title>

<link href="AmazeUI-2.4.2/assets/css/admin.css" rel="stylesheet"type="text/css">
<link href="AmazeUI-2.4.2/assets/css/amazeui.css" rel="stylesheet"type="text/css">
<link href="css/personal.css" rel="stylesheet" type="text/css">
<link href="css/addstyle.css" rel="stylesheet" type="text/css">
<link href="css/bootstrap-3.3.4.css" rel="stylesheet" type="text/css">
<script src="AmazeUI-2.4.2/assets/js/jquery.min.js"type="text/javascript"></script>
<script src="AmazeUI-2.4.2/assets/js/amazeui.js"></script>
<script src="js/personalData/address.js"></script>
<script src="js/province-city-area.js"></script>
<script src="js/personal.js"></script>
<script type="text/javascript">
var jsonObeject;
$.ajaxSetup({ 
	  async: false 
}); 
$.getJSON('${basePath}/json/address.json',function(data) {
	jsonObeject = data;
});
//显示为默认地址  选中状态
function strToJson(id,json){
	var context = '<span class="province">'+jsonObeject[json.p].name+'</span>&nbsp;' 
	+'<span class="city">'+jsonObeject[json.p].city[json.c].name+"</span>&nbsp;"+ 
	'<span class="dist">'+jsonObeject[json.p].city[json.c].area[json.a]+"</span>&nbsp;"+
	'<span class="street">'+json.detial+'</span>';
	$("#"+id).append(context);
	if(json.def==1){
		$("#"+id).parent().parent().addClass('defaultAddr');
	}else{
		$("#"+id).parent().parent().removeClass('defaultAddr');
	}
} 
</script>
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
								<a href="javascript:;" target="_top"><i
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

				<div class="user-address">
					<!--标题 -->
					<div class="am-cf am-padding">
						<div class="am-fl am-cf">
							<strong class="am-text-danger am-text-lg">地址管理</strong> / <small>Address&nbsp;list</small>
						</div>
					</div>
					<hr />
					<ul id="am-avg-sm-1" class="am-avg-sm-1 am-avg-md-3 am-thumbnails">
						<c:forEach items="${addressList }" var="address"
							varStatus="addrIndex">
							<li class="user-addresslist"><span class="new-option-r">
									<i class="am-icon-check-circle"></i> 默认地址
							</span>
								<p class="new-tit new-p-re">
									<span class="new-txt">${address.addrPeople }</span> <span
										class="new-txt-rd2">${address.addrPhone }</span>
								</p>
								<div class="new-mu_l2a new-p-re">
									<p id="addrIndex${addrIndex.index }" class="new-mu_l2cw">
										<span class="title">地址：</span>

										<script type="text/javascript">
											strToJson("addrIndex${addrIndex.index }",${address.addrAddress });
										</script>
									</p>
								</div>
								<div class="new-addr-btn">
									<a
										href="personalData/initUpdateAddress.do?addrId=${address.addrId }"><i
										class="am-icon-edit"></i>编辑</a> <span class="new-addr-bar">|</span>
									<a
										href="personalData/deleteAddress.do?addrId=${address.addrId }"><i
										class="am-icon-trash"></i>删除</a>
								</div></li>
						</c:forEach>
					</ul>
					<div class="clear"></div>
					<a class="new-abtn-type"
						data-am-modal="{target: '#doc-modal-1', closeViaDimmer: 0}">添加新地址</a>
					<!--例子-->
					<div class="am-modal am-modal-no-btn" id="doc-modal-1">

						<div class="add-dress" style="position: relative">

							<!--标题 -->
							<div class="am-cf am-padding">
								<div class="am-fl am-cf">
									<strong id="address-strong" class="am-text-danger am-text-lg"
										onclick="editClick();">新增地址</strong> / <small
										id="address-small">Add&nbsp;address</small>
								</div>
							</div>
							<hr />

							<div id="address-add" class="am-u-md-12 am-u-lg-8">

								<!-- 表单开始 ******************************************************************************************************-->
								<form id="addressForm" action="personalData/addAddress.do"
									method="post" class="am-form am-form-horizontal">
									<input type="hidden" name="addrAddress" id="userAddress"
										value="" />
									<div class="am-form-group">
										<label for="user-name" class="am-form-label">收货人</label>
										<div class="am-form-content" style="position: relative">
											<input type="text" name="addrPeople" id="userName"
												placeholder="收货人">
											<div id="userName-message"
												style="line-height: 250%; position: absolute; width: 180px; height: 28px; left: 580px; top: 0px;">
												<font color=red>*</font>
											</div>
										</div>
									</div>

									<div class="am-form-group">
										<label for="user-phone" class="am-form-label">手机号码</label>
										<div class="am-form-content" style="position: relative">
											<input id="userPhone" name="addrPhone" placeholder="手机号必填"
												type="tel">
											<div id="userPhone-message"
												style="line-height: 250%; position: absolute; width: 180px; height: 28px; left: 580px; top: 0px;">
												<font color=red>*</font>
											</div>
										</div>
									</div>

									<div class="am-form-group">
										<label for="user-address" class="am-form-label">所在地</label>
										<div class="am-form-content address"
											style="position: relative;">
											<select id="pro">
												<!-- <option value="a">浙江省</option>
													<option value="b" selected>湖北省</option> -->
											</select> <select id="citys">
												<!-- <option value="a">温州市</option>
													<option value="b" selected>武汉市</option> -->
											</select> <select id="area">
												<!-- <option value="a">瑞安区</option>
													<option value="b" selected>洪山区</option> -->
											</select>
											<div id="addr-message"
												style="line-height: 250%; position: absolute; width: 180px; height: 28px; left: 580px; top: 0px;">
												<font color=red>*</font>
											</div>
										</div>

									</div>

									<div class="am-form-group">
										<label for="user-intro" class="am-form-label">详细地址</label>
										<div class="am-form-content" style="position: relative">
											<textarea class="" rows="3" id="userIntro"
												placeholder="输入详细地址"></textarea>
											<small>100字以内写出你的详细地址...</small>
											<div id="userIntro-message"
												style="line-height: 250%; position: absolute; width: 180px; height: 28px; left: 580px; top: 0px;">
												<font color=red>*</font>
											</div>
										</div>
									</div>

									<div class="am-form-group">
										<div class="am-u-sm-9 am-u-sm-push-3">
											<div id="btn-up" class="am-btn am-btn-danger">添加</div>
											<input class="am-close am-btn am-btn-danger" type="reset"
												value="取消" data-am-modal-close>
										</div>
									</div>
								</form>
								<!-- 表单结束 ******************************************************************************************************-->
							</div>

						</div>

					</div>

				</div>

				<script type="text/javascript">
						$(document).ready(function() {							
							$(".new-option-r").click(function() {
								$(this).parent('.user-addresslist').addClass("defaultAddr").siblings().removeClass("defaultAddr");
							});
							
							var $ww = $(window).width();
							if($ww>640) {
								$("#doc-modal-1").removeClass("am-modal am-modal-no-btn")
							}
							
						});
					</script>

				<div class="clear"></div>

			</div>
			<!--底部-->
			<div class="footer">
				<div class="footer-hd">
					<p>
						<a href="javascript:;">恒望科技</a> <b>|</b> <a href="javascript:;">商城首页</a>
						<b>|</b> <a href="javascript:;">支付宝</a> <b>|</b> <a
							href="javascript:;">物流</a>
					</p>
				</div>
				<div class="footer-bd">
					<p>
						<a href="javascript:;">关于恒望</a> <a href="javascript:;">合作伙伴</a> <a
							href="javascript:;">联系我们</a> <a href="javascript:;">网站地图</a> <em>©
							2015-2025 Hengwang.com 版权所有. 更多模板 <a href="Javascript:;"
							target="_blank" title=""></a> - Collect from <a
							href="Javascript:;" title="" target="_blank"></a>
						</em>
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
						<li><a href="change.html">退款售后</a></li>
						<li><a href="comment.html">评价商品</a></li>
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