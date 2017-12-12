<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="/common/jstl.jspf"%>
<!DOCTYPE html>
<html>
<base href="${basePath}/" />
<head>
<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1.0,maximum-scale=1.0, user-scalable=0">

<title>发表评论</title>

<link href="AmazeUI-2.4.2/assets/css/admin.css" rel="stylesheet"
	type="text/css">
<link href="AmazeUI-2.4.2/assets/css/amazeui.css" rel="stylesheet"
	type="text/css">

<link href="css/personal.css" rel="stylesheet" type="text/css">
<link href="css/appstyle.css" rel="stylesheet" type="text/css">
<script src="AmazeUI-2.4.2/assets/js/jquery.min.js"type="text/javascript"></script>
		<script src="js/personal.js"></script>
<script type="text/javascript" src="js/jquery-form.js"></script>
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
								<a href="javascript:;" target="_top" class="h">亲，请登录</a> <a href="javascript:;"
									target="_top">免费注册</a>
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
								<a href="personalData/list.do" target="_top"><i class="am-icon-user am-icon-fw"></i>个人中心</a>
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

					<div class="user-comment">
						<!--标题 -->
						<div class="am-cf am-padding">
							<div class="am-fl am-cf">
							
								<strong class="am-text-danger am-text-lg">发表评论</strong> / <small>Make&nbsp;Comments</small>
							</div>
						</div>
						<hr />
						<c:set var="num" value="0"/>
						<c:forEach items="${orderInfo }" var="orderInfo" varStatus="in">
						<c:if test="${orderInfo.appraisStatus==0 }">
						<div class="comment-main">
							<div class="comment-list">

								<div class="item-pic">
									<a href="javascript:;" class="J_MakePoint"> <img
										src="${orderInfo.proImg }" class="itempic" class="itempic">
									</a>
								</div>

								<div class="item-title">

									<div class="item-name">
										<a href="javascript:;">
											<p class="item-basic-info">${orderInfo.proName }</p>
											<div class="rl" style="display: none">${orderInfo.proId }</div>
										</a>
									</div>
									<div class="item-info">
										<div class="info-little">
											<span>${orderInfo.orderLevle1 }</span> <span>${orderInfo.orderLevle2 }</span>
										</div>
										<div class="item-price">
											价格：<strong>119.88元</strong>
										</div>
									</div>
								</div>
								<div class="clear"></div>
								<div class="item-comment">
									<textarea placeholder="请写下对宝贝的感受吧，对他人帮助很大哦！"></textarea>
								</div>
								<form action="orderInfo/upload.do" method="post" id="subform${in.index }" enctype="multipart/form-data">
								
								<div class="filePic1">
							<img src="images/image.jpg" alt="" class="preview" style="height: 50px;width: 50px">
								<input type="file" class="inputPic" name="uploadimg">
								</div>
								</form>
								
								<div class="item-opinion">
									<li><i class="op1"></i>好评</li>
									<li><i class="op2"></i>中评</li>
									<li><i class="op3"></i>差评</li>
								</div>
							</div>

							<div class="info-btn">
								<div class="am-btn am-btn-danger">发表评论</div>
							</div>

						</div>
						<c:set var="num" value="${num+1 }"/>
						</c:if>
						</c:forEach>
					</div>

			</div>
			<!--底部-->
			<div class="footer">
				<div class="footer-hd">
					<p>
						<a href="javascript:;">恒望科技</a> <b>|</b> <a href="home/list.do">商城首页</a> <b>|</b> <a
							href="javascript:;">支付宝</a> <b>|</b> <a href="javascript:;">物流</a>
					</p>
				</div>
				<div class="footer-bd">
					<p>
						<a href="javascript:;">关于恒望</a> <a href="javascript:;">合作伙伴</a> <a href="javascript:;">联系我们</a> <a
							href="javascript:;">网站地图</a> <em>© 2015-2025 Hengwang.com 版权所有. 更多模板 <a
							href="Javascript:;" target="_blank" title=""></a>
							- Collect from <a href="Javascript:;" title=""
							target="_blank"></a></em>
					</p>
				</div>
			</div>
		</div>

		<aside class="menu">
			<ul>
				<li class="person active"><a href="index.html"><i
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
						<li><a href="collection.html">收藏</a></li>
						<li><a href="foot.html">足迹</a></li>
					</ul>
				</li>

				<li class="person">
					<p>
						<i class="am-icon-qq"></i>在线客服
					</p>
					<ul>
						<li><a href="consultation.html">商品咨询</a></li>
						<li><a href="suggest.html">意见反馈</a></li>

						<li><a href="news.html">我的消息</a></li>
					</ul>
				</li>
			</ul>

		</aside>
	</div>

</body>
<script type="text/javascript">
	$(document).ready(function() {
		$(".comment-list .item-opinion li").click(function() {
			$(this).prevAll().children('i').removeClass("active");
			$(this).nextAll().children('i').removeClass("active");
			$(this).children('i').addClass("active");

		});
	});
	$(".inputPic").change(function(){imgPreview(this);});
	function imgPreview(fileDom){
        //判断是否支持FileReader
        if (window.FileReader) {
            var reader = new FileReader();
        } else {
            alert("您的设备不支持图片预览功能，如需该功能请升级您的设备！");
        }
        
        var index = $(".inputPic").index(fileDom);
        //获取文件
        var file = fileDom.files[0];
        var imageType = /^image\//;
        //是否是图片
        if (!imageType.test(file.type)) {
            alert("请选择图片！");
            return;
        }
        //读取完成
        reader.onload = function(e) {
            //获取图片dom
            $(".preview").eq(index).attr("src",e.target.result);
            //图片路径设置为读取的图片
        };
        reader.readAsDataURL(file);
    }
/* 获取地址栏的orderId */
	function GetQueryString(name)
	{
	     var reg = new RegExp("(^|&)"+ name +"=([^&]*)(&|$)");
	     var r = window.location.search.substr(1).match(reg);
	     if(r!=null)return  unescape(r[2]); return null;
	}
	
/*发表评论  */
	$(function() {
		/* var value = $(".item-comment").text(); */
		$(".am-btn-danger").click(function() {
			var index = $(".am-btn-danger").index(this);
			
			var html= $(".active").eq(index).attr('class');
			var text= $("textarea").eq(index).val();
			var proId= $(".rl").eq(index).html();
			var orderId=GetQueryString("orderId");
			
			/* $.get("orderInfo/ajax.do",{text:text,html:html,proId:proId},function(data){
				alert(data);
			});  */

			var options = {
				url:'orderInfo/upload.do?text='+text+'&html='+html+'&proId='+proId+'&orderId='+orderId,
				success: function(data) {
						alert("评价成功");
				}
			};
			$("#subform"+index).ajaxSubmit(options);
			
		});
	});
   
</script> 
</html>