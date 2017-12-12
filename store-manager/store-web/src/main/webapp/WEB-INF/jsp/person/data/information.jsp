<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ include file="/common/jstl.jspf"%>
<!DOCTYPE html>
<html>

<head>
<base href="${basePath }/" />
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
<meta name="viewport"
	content="width=device-width, initial-scale=1.0,maximum-scale=1.0, user-scalable=0">

<title>个人资料</title>

<link href="AmazeUI-2.4.2/assets/css/admin.css" rel="stylesheet"
	type="text/css">
<link href="AmazeUI-2.4.2/assets/css/amazeui.css" rel="stylesheet"
	type="text/css">

<link href="css/personal.css" rel="stylesheet" type="text/css">
<link href="css/infstyle.css" rel="stylesheet" type="text/css">
<script src="AmazeUI-2.4.2/assets/js/jquery.min.js"></script>

<!-- 插件冲突 -->
<script src="AmazeUI-2.4.2/assets/js/amazeui.js"></script>
<script src="js/personal.js"></script>


<!--日期三级联动 -->
<script type="text/javascript" src="js/information.js"></script>

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

				<div class="user-info">
					<!--标题 -->
					<div class="am-cf am-padding">
						<div class="am-fl am-cf">
							<strong class="am-text-danger am-text-lg">个人资料</strong> / <small>Personal&nbsp;information</small>
						</div>
					</div>
					<hr />

					<!--头像 -->
					<div class="user-infoPic">

						<div class="filePic" style="position: relative; margin-top: 0">
							<form id="photo" action="personalData/upload.do" method="post"
								enctype="multipart/form-data">
								<input type="hidden" name="userPhoto" value="${user.userPhoto}" />
								<input type="file" name="file" id="fileTop" onchange="fileUp();"
									class="inputPic" allowexts="gif,jpeg,jpg,png,bmp"> <img
									id="photoImg" class="am-circle am-img-thumbnail"
									src="<c:if test='${user.userPhoto==null }'>images/getAvatar.do.jpg</c:if>
									<c:if test='${user.userPhoto!=null }'>${user.userPhoto}</c:if>" />
							</form>
						</div>

						<p class="am-form-help">头像</p>

						<div class="info-m">
							<div>
								<b>用户名：<i>${user.userAccount }</i></b>
							</div>
							<div class="vip">
								<span></span><a href="javascript:;">会员专享</a>
							</div>
						</div>
					</div>

					<!-- *****************************表单开始**************************************************************** -->
					<!--个人信息 -->
					<div class="info-main">
						<form action="personalData/update.do" id="informationForm"
							class="am-form am-form-horizontal" method="post">
							<input type="hidden" id="userBirth" name="userBirth" value="" />
							<!-- 昵称    -->
							<div class="am-form-group" style="position: relative;">
								<label for="user-name2" class="am-form-label">昵称</label>
								<div class="am-form-content" style="position: relative">
									<input id="userName" class="informationUser" name="userName"
										type="text" value="${user.userName }" placeholder="nickname:">
									<small>昵称由小写英文字母、中文、数字组成,且长度不超过20字符</small>
								</div>
								<div id="userNameLabel"
									style="color: red; line-height: 250%; position: absolute; width: auto; height: 28px; left: 466px; top: 33px;">*</div>
							</div>
							<!-- 姓名 -->
							<div class="am-form-group" style="position: relative;">
								<label for="user-name" class="am-form-label">姓名</label>
								<div class="am-form-content" style="position: relative">
									<input class="informationUser" id="userRealname"
										name="userRealname" value="${user.userRealname }" type="text"
										placeholder="name:"> <small>你的真实姓名</small>
								</div>
								<div id="userRealnameLabel"
									style="color: red; line-height: 250%; position: absolute; width: auto; height: 28px; left: 186px; top: 33px;">*</div>
							</div>
							<!-- 性别 -->
							<div class="am-form-group" style="position: relative;">
								<label class="am-form-label">性别</label>
								<div class="am-form-content sex">
									<label class="am-radio-inline"> <input type="radio"
										name="sex" value="1"
										<c:if test="${user.sex==1 }">checked</c:if> data-am-ucheck>
										男
									</label> <label class="am-radio-inline"> <input type="radio"
										name="sex" value="2"
										<c:if test="${user.sex==2 }">checked</c:if> data-am-ucheck>
										女
									</label> <label class="am-radio-inline"> <input type="radio"
										name="sex" value="3"
										<c:if test="${user.sex==0 }">checked</c:if> data-am-ucheck>
										保密
									</label>
								</div>
							</div>

							<!-- 生日 -->
							<div class="am-form-group" style="position: relative;">
								<label for="user-birth" class="am-form-label">生日</label>
								<div class="am-form-content birth">
									<div class="birth-select">
										<select name="sel1" id="sel1">
											<option value="">年</option>
										</select> <em>&nbsp;</em>
									</div>

									<div class="birth-select2">
										<select name="sel2" id="sel2">
											<option value="">月</option>
										</select> <em>&nbsp;</em>
									</div>
									<div class="birth-select2">
										<select name="sel3" id="sel3">
											<option value="">日</option>
										</select> <em>&nbsp;</em>
									</div>
									<small>你的生日为:<fmt:formatDate value="${user.userBirth}"
											dateStyle="long" /></small>
									<div id="userBirdthLabel"
										style="color: red; line-height: 250%; position: absolute; width: auto; height: 28px; left: 266px; top: 40px;">*</div>
								</div>

								<!-- 电话	 -->
							</div>
							<div class="am-form-group" style="position: relative;">
								<label for="user-phone" class="am-form-label">手机</label>
								<div class="am-form-content">
									<input type="text" id="userPhone" class="informationUser"
										name="userPhone" value="${user.userPhone }"
										placeholder="telephonenumber:"> <small>你的手机号码</small>
								</div>
								<div id="userPhoneLabel"
									style="color: red; line-height: 250%; position: absolute; width: auto; height: 28px; left: 180px; top: 33px;">*</div>
							</div>
							<!-- 电子邮件 -->
							<div class="am-form-group" style="position: relative;">
								<label for="user-email" class="am-form-label">电子邮件</label>
								<div class="am-form-content">
									<input type="text" id="userEmail" class="informationUser"
										name="userEmaill" value="${user.userEmaill }"
										placeholder="Email:"> <small>你的邮箱</small>
								</div>
								<div id="userEmaillLabel"
									style="color: red; line-height: 250%; position: absolute; width: auto; height: 28px; left: 150px; top: 33px;">*</div>
							</div>
							<!-- 收货地址 -->
							<div class="am-form-group address">
								<label for="user-address" class="am-form-label">收货地址</label>
								<div class="am-form-content address">
									<a href="personalData/initAddress.do">
										<p class="new-mu_l2cw">
											<span class="province">湖北</span>省 <span class="city">武汉</span>市
											<span class="dist">洪山</span>区 <span class="street">雄楚大道666号(中南财经政法大学)</span>
											<span class="am-icon-angle-right"></span>
										</p>
									</a>

								</div>
							</div>
							<!-- 账号安全 -->
							<div class="am-form-group safety">
								<label for="user-safety" class="am-form-label">账号安全</label>
								<div class="am-form-content safety">
									<a href="personalData/initSafety.do"> <span
										class="am-icon-angle-right"></span>
									</a>
								</div>
							</div>
							<div class="info-btn">
								<div class="am-btn am-btn-danger" id="formButton">保存修改</div>
							</div>
						</form>
						<!-- ************************************表单结束**************************************************************** -->
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
						<li><a href="javascript:;">收藏collection.html</a></li>
						<li><a href="javascript:;">足迹foot.html</a></li>
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
<script>
	
</script>

</html>