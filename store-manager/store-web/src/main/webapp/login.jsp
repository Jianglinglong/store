<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@include file="/common/jstl.jspf"%>
<!DOCTYPE html>
<html>

<head lang="en">
<meta charset="UTF-8">
<title>登录</title>
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport"
	content="width=device-width, initial-scale=1.0, minimum-scale=1.0, maximum-scale=1.0, user-scalable=no">
<meta name="format-detection" content="telephone=no">
<meta name="renderer" content="webkit">
<meta http-equiv="Cache-Control" content="no-siteapp" />

<link rel="stylesheet"
	href="${basePath}/AmazeUI-2.4.2/assets/css/amazeui.css" />
<link href="${basePath}/css/dlstyle.css" rel="stylesheet"
	type="text/css">
<script src="${basePath}/AmazeUI-2.4.2/assets/js/jquery.min.js"></script>
</head>

<body>

	<div class="login-boxtitle">
		<a href="home/list.do"><img alt="logo"
			src="${basePath}/images/logobig.png" /></a>
	</div>

	<div class="login-banner">
		<div class="login-main">
			<div class="login-banner-bg">
				<span></span><img src="${basePath}/images/big.jpg" />
			</div>
			<div class="login-box">

				<h3 class="title">登录商城</h3>

				<div class="clear"></div>

					<form action="${pageContext.request.contextPath }/user/login.do"
						method="post" id="loginform">
				<div class="login-form">
						<input type="hidden" name="uri" value="${uri }" />
						<div class="user-name">
							<label for="user"><i class="am-icon-user"></i></label> <input
								type="text" name="account" id="user" placeholder="邮箱/手机/用户名">
						</div>
						<div class="user-pass">
							<label for="password"><i class="am-icon-lock"></i></label> <input
								type="password" name="password" id="password"
								placeholder="请输入密码">
						</div>
						
				<span style="color:red"><c:if test="${message!=null }">${message }</c:if></span>
				<div class="login-links">
					
					<a href="${basePath }/register.jsp"
						class="zcnext am-fr am-btn-default">注册
						</a> <br />
				</div>
				<div class="am-cf">
						
					 <input	 type="submit"   name="submit"  value="登 录" id="userSubmit"
						onclick="usersubmit()" class="am-btn am-btn-primary am-btn-sm">
				</div>
				
				</form>
				<div class="partner">
					<h3>合作账号</h3>
					<div class="am-btn-group">
						<li><a href="javascript:;"><i class="am-icon-qq am-icon-sm"></i><span>QQ登录</span></a></li>
						<li><a href="javascript:;"><i class="am-icon-weibo am-icon-sm"></i><span>微博登录</span>
						</a></li>
						<li><a href="javascript:;"><i class="am-icon-weixin am-icon-sm"></i><span>微信登录</span>
						</a></li>
					</div>
				</div>

			</div>
		</div>
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
				<a href="javascript:;">关于恒望</a> <a href="javascript:;">合作伙伴</a> <a href="javascript:;">联系我们</a> <a
					href="#">网站地图</a> <em> <a
					href="Javascript:;" target="_blank" title=""></a>
					- Collect from <a href="Javascript:;" title=""
					target="_blank"></a></em>
			</p>
		</div>
	</div>
	
</body>

<style type="text/css">
#ValidateCode {
	display: inline-block;
	border: 1px solid #ccc;
	cursor: pointer;
	width: 100px;
	height: 40px;
}
</style>
<script type="text/javascript">
function usersubmit(){
	var userAccount = $("#user").val();
	var password = $("#password").val();
	$("#loginform").form('submit',{
		url:"${pageContext.request.contextPath }/user/login.do",  
        data: {"userAccount":userAccount,"password":password}
		});
}

</script>
</html>