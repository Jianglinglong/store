<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="/common/jstl.jspf" %>
<!DOCTYPE html PUBLIC"-//W3C//DTD HTML 4.01 Transitional//EN""http://www.w3.org/TR/html4/loose.dtd">
<html>
 
	<head lang="en">
	    <base href="${basePath}/ }" />
	    
		<meta charset="UTF-8">
		<title>注册</title>
		<meta http-equiv="X-UA-Compatible" content="IE=edge">
		<meta name="viewport" content="width=device-width, initial-scale=1.0, minimum-scale=1.0, maximum-scale=1.0, user-scalable=no">
		<meta name="format-detection" content="telephone=no">
		<meta name="renderer" content="webkit">
		<meta http-equiv="Cache-Control" content="no-siteapp" />

		<link rel="stylesheet" href="AmazeUI-2.4.2/assets/css/amazeui.min.css" />
		<link href="css/dlstyle.css" rel="stylesheet" type="text/css">
		<script src="AmazeUI-2.4.2/assets/js/jquery.min.js"></script>
		<script src="AmazeUI-2.4.2/assets/js/amazeui.min.js"></script>
        <script src="js/register.js"></script>
        
        
        
	</head>
<body>

		<div class="login-boxtitle">
			<a href="home/demo.html"><img alt="" src="images/logobig.png" /></a>
		</div>

		<div class="res-banner">
			<div class="res-main">
				<div class="login-banner-bg"><span></span><img src="images/big.jpg" /></div>
				<div class="login-box">

						<div class="am-tabs" id="doc-my-tabs">
							<ul class="am-tabs-nav am-nav am-nav-tabs am-nav-justify">
								<li class="am-active"><a href="">邮箱注册</a></li>
								<li><a href="">手机号注册</a></li>
							</ul>
   <div id="error" style="height:25px;position:absolute;left:85px;top:60px;"></div>
   
   
   
   
<!-- /////////////////////////邮箱注册////////////////////////////////////////////// -->
<div class="am-tabs-bd">
<div class="am-tab-panel am-active">
								
<form method="post" action="register/addUser.do" id="formEmail" name="formEmail">

	 <input type="hidden" name="obtainCodeEmail" id="obtainCodeEmail" value="" />	
	  <input type="hidden" name="userEmaill" id="userEmaill-email" value="" />	
	  			
	 <div class="user-email">
			<label for="email"><i class="am-icon-envelope-o"></i></label>
			<input type="email" name="userAccount" id="userAccountEmail" placeholder="请输入邮箱账号">
              </div>										
              <div class="user-pass">
		    <label for="password"><i class="am-icon-lock"></i></label>
		    <input type="text" name="userPassword" id="userPasswordEmail" placeholder="设置密码，包含字母、数字">
              </div>										
              <div class="user-pass">
		    <label for="passwordRepeat"><i class="am-icon-lock"></i></label>
		    <input type="text" name="" id="passwordRepeatEmail" placeholder="确认密码">
              </div>	
                 
</form>
                 
		 <div class="login-links">
				<label for="reader-meEmail">
					<input id="reader-meEmail" type="checkbox"> 点击表示您同意商城《服务协议》
				</label>
	  	</div>
		<div class="am-cf">
			<button id="checkedRegisterEmail" name="" disabled="true" onclick="checkedRegisterEmail();"  
			class="am-btn am-btn-primary am-btn-sm am-fl">
			注册
			</button>
		</div>

</div>
<!-- ***************************邮箱注册结束********************************************************** -->



<!-- /////////////////////////手机注册///////////////////////////////////////////////////// -->
<div class="am-tab-panel">
	<form method="post" action="register/addUser.do" id="formPhone" name="formPhone">
         <input type="hidden" name="obtainCodePhone" id="obtainCodePhone" value="" />
         <input type="hidden" name="userPhone" id="userPhone-phone" value="" />
            <div class="user-phone">
			    <label for="userAccount"><i class="am-icon-mobile-phone am-icon-md"></i></label>
			    <input type="text" name="userAccount" id="userAccount" placeholder="请输入手机号">
            </div>			
            			   													
         <div class="verification">
            <input type="hidden" name="sendsmsNum" id="sendsmsNum" value=""/>
			<label for="code"><i class="am-icon-code-fork" style="line-height:50px;"></i></label>
			<input type="text" name="" id="code" placeholder="请输入验证码">
			<br />
			
			<a class="btn" href="javascript:void(0)"  id="sendMobileCode"  >
				<button id="dyMobileButton" disabled="true" onclick="sendMobileCode();" >获取手机验证码</button>
		    </a>
            </div>
           
           <div class="user-pass">
			    <label for="userPassword"><i class="am-icon-lock"></i></label>
			    <input type="text" name="userPassword" id="userPassword" placeholder="设置密码，包含字母、数字">
           </div>	
           									
           <div class="user-pass">
			    <label for="passwordRepeat"><i class="am-icon-lock"></i></label>
			    <input type="text" name="" id="passwordRepeat" placeholder="确认密码">
           </div>	
		</form>
		
	 <div class="login-links">
			<label for="reader-mePhone">
				<input name="" id="reader-mePhone" type="checkbox"> 点击表示您同意商城《服务协议》
			</label>
  	 </div>
  	 
	<div class="am-cf">
		<button id="checkedRegisterPhone" name="" disabled="true" onclick="" class="am-btn am-btn-primary am-btn-sm am-fl">
		注册
		</button>
	</div>
	
		<hr>
</div>
<!-- //////////////////////手机注册结束///////////////////////////////////////////////// -->
		
		<script>
			$(function() {
			    $('#doc-my-tabs').tabs();
			  })
		</script>

				</div>
			</div>

	</div>

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
	</body>
	

</html>