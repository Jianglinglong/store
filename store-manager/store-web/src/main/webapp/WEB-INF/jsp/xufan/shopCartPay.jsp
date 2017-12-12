<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@ include file="/common/jstl.jspf" %>
<base href="${basePath }/"/>
<!DOCTYPE html PUBLIC"-//W3C//DTD XHTML 1.0 Transitional//EN""http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
		<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
		<meta name="viewport" content="width=device-width, initial-scale=1.0 ,minimum-scale=1.0, maximum-scale=1.0, user-scalable=no">

		<title>结算页面</title>

		<link href="AmazeUI-2.4.2/assets/css/amazeui.css" rel="stylesheet" type="text/css" />

		<link href="basic/css/demo.css" rel="stylesheet" type="text/css" />
		<link href="css/cartstyle.css" rel="stylesheet" type="text/css" />

		<link href="css/jsstyle.css" rel="stylesheet" type="text/css" />

		<script type="text/javascript" src="js/address.js"></script>
		<script type="text/javascript">
			var jsonObeject;
			$.ajaxSetup({ 
				  async: false 
			}); 
			$.getJSON('${basePath}/json/address.json',function(data) {
				jsonObeject = data;
			});
			
			function strToJson(id,json){
				var context = jsonObeject[json.p].name+""+jsonObeject[json.p].city[json.c].name+""+ jsonObeject[json.p].city[json.c].area[json.a]; 
				$("#"+id).html(context+""+json.detial);
				if(json.def==1){
					$("#"+id).parent().parent().parent().append('<ins class="deftip">默认地址</ins>');
				}else{
					$("#"+id).parent().parent().parent().append('<ins class="deftip"></ins>');
					$("#"+id).parent().parent().parent().parent().removeClass('defaultAddr');
				}
				
			} 
			$(function(){
				
				$(".user-addresslist").click(function(){
					var addr= $("#addr"+$(this).index()).html();
					addrId = $("#addr"+$(this).index()).attr("addrId");
					
				});
			});
			$.ajaxSetup({ 
				  async: true 
			}); 
		</script>
	</head>

	<body>
		<!--顶部导航条 -->
		<div class="am-container header">
			<ul class="message-l">
				<div class="topMessage">
                <c:if test="${user eq null}">
                    <div class="menu-hd">
                        <a href="login.jsp" target="_top" class="h">亲，请登录</a>
                        <a href="register/list.do" target="_top">免费注册</a>
                    </div>
                </c:if>
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

			<div class="nav white">
				<div class="logo"><img src="images/logo.png" /></div>
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
			<div class="concent">
				<!--地址 -->
				<div class="paycont">
					<div class="address">
						<h3>确认收货地址 </h3>
						<div class="control">
							<div class="tc-btn createAddr theme-login am-btn am-btn-danger">使用新地址</div>
						</div>
						<div class="clear"></div>
						<ul id="ulul">
							<div class="per-border"></div>
							<span id="allpronum" style="display:none">${shopcart.size() }</span>
							<c:forEach items="${addr}" var="address" varStatus="ad">
								<li class="user-addresslist defaultAddr" id="lili${ad.count-1 }" onclick="showAddr(${ad.index+1 })">
							
								<div class="address-left">
									<div class="user DefaultAddr">
										
										<span class="buy-address-detail">   
                   						<span class="buy-user" style="display:none" id="addrId${ad.index+1 }">${address.addrId }</span>
                   						<span class="buy-user" id="peo${ad.index+1 }">${address.addrPeople }</span>
										<span class="buy-phone" id="pho${ad.index+1 }">${address.addrPhone }</span>
										</span>
									</div>
									<div class="default-address DefaultAddr">
										<span class="buy-line-title buy-line-title-type">收货地址：</span>
										<span class="buy--address-detail">
								   <span class="province" addrId="${address.addrId }" id="addr${ad.index+1 }"><script >strToJson("addr${ad.index+1 }",${address.addrAddress});</script></span>
										</span>
									</div>
									
								</div>
								<div class="address-right">
									<a href="person/personalData/initAddress.do">
										<span class="am-icon-angle-right am-icon-lg"></span></a>
								</div>
								<div class="clear"></div>

								<div class="new-addr-btn">
									<a href="javascript:;" class="hidden">设为默认</a>
									<span class="new-addr-bar hidden">|</span>
									<a  href="javascript:initUpdate(${address.addrId });">编辑</a>
									<span class="new-addr-bar">|</span>
									<a href="javascript:deleteAddr(${address.addrId },${ad.count-1 });" >删除</a>
								</div>
								
							</li>
							</c:forEach>
							
							<span class="province" id="address" onLoad="strToJson(addrAddress)" ></span>
							<div class="per-border"></div>
							

						<div class="clear"></div>
					</div>
					
					<!--物流 -->
					<div class="logistics">
						<h3>选择物流方式</h3>
						<ul class="op_express_delivery_hot">
							<li data-value="yuantong" class="OP_LOG_BTN "><i class="c-gap-right" style="background-position:0px -468px"></i>圆通<span></span></li>
							<li data-value="shentong"  class="OP_LOG_BTN "><i class="c-gap-right" style="background-position:0px -1008px"></i>申通<span></span></li>
							<li data-value="yunda"  class="OP_LOG_BTN "><i class="c-gap-right" style="background-position:0px -576px"></i>韵达<span></span></li>
							<li data-value="zhongtong"  class="OP_LOG_BTN op_express_delivery_hot_last"><i class="c-gap-right" style="background-position:0px -324px"></i>中通<span></span></li>
							<li data-value="shunfeng"  class="OP_LOG_BTN  op_express_delivery_hot_bottom"><i class="c-gap-right" style="background-position:0px -180px"></i>顺丰<span></span></li>
						</ul>
						<span id="wl" style="display: none"></span>
					</div>
					<div class="clear"></div>

					<!--支付方式-->
					<div class="logistics">
						<h3>选择支付方式</h3>
						<ul class="pay-list">
							<li class="pay card"><img src="images/wangyin.jpg" />银联<span></span></li>
							<li class="pay qq"><img src="images/weizhifu.jpg" />微信<span></span></li>
							<li class="pay taobao"><img src="images/zhifubao.jpg" />支付宝<span></span></li>
						</ul>
					</div>
					<div class="clear"></div>

					<!--订单 -->
					<div class="concent">
						<div id="payTable">
							<h3>确认订单信息</h3>
							<div class="cart-table-th">
								<div class="wp">

									<div class="th th-item">
										<div class="td-inner">商品信息</div>
									</div>
									<div class="th th-price">
										<div class="td-inner">单价</div>
									</div>
									<div class="th th-amount">
										<div class="td-inner">数量</div>
									</div>
									<div class="th th-sum">
										<div class="td-inner">金额</div>
									</div>
									<div class="th th-oplist">
										<div class="td-inner">配送方式</div>
									</div>

								</div>
							</div>
							<div class="clear"></div>

							<tr class="item-list">
								<div class="bundle  bundle-last">

									<div class="bundle-main">
										<c:forEach items="${shopcart  }" var="shopcart" varStatus="ad">
											<ul class="item-content clearfix">
											<div class="pay-phone">
												<li class="td td-item">
													<span style="display:none" id="shopcartId${ad.index }">${shopcart.shopcartId }</span> 
													<span style="display:none" id="proId${ad.index }">${product.get(ad.index).proId }</span> 
													<div class="item-pic">
														<a href="javascript:;" class="J_MakePoint">
															<img src="${product.get(ad.index).proImg }" class="itempic J_ItemImg"></a>
													</div>
													<div class="item-info">
														<div class="item-basic-info">
															<a href="javascript:;" class="item-title J_MakePoint" data-point="tbcart.8.11">${product.get(ad.index).proName }</a>
														</div>
													</div>
													</li>
													<li class="td td-info">
														<div class="item-props">
															<span class="sku-line" id="level1${ad.index }">${shopcart.proType1 }：${shopcart.proLevel1 }</span>
															<span class="sku-line" id="level2${ad.index }">${shopcart.proType2 }：${shopcart.proLevel2 }</span>
														</div>
													</li>
													<li class="td td-price">
														<div class="item-price price-promo-promo">
															<div class="price-content">
																<em class="J_Price price-now" id="price${ad.index }">${shopcart.proPrice }</em>
															</div>
														</div>
													</li>
												</div>
												<li class="td td-amount">
													<div class="amount-wrapper">
														<div class="item-amount">
															<span class="phone-title">购买数量</span>
															<div class="sl">
																<em class="J_Price price-now" id="number${ad.index }">${shopcart.proNum }</em>
															</div>
														</div>
													</div>
												</li>
												<li class="td td-sum">
													<div class="td-inner">
														<em class="J_Price price-now" id="money${ad.index }">${shopcart.proMoney }</em>
													</div>
												</li>
												<li class="td td-oplist">
													<div class="td-inner">
														<span class="phone-title">配送方式</span>
														<div class="pay-logis">
															快递<b class="sys_item_freprice" id="kuaidi${ad.index }">10</b>元
														</div>
													</div>
												</li>

											</ul>
										
										</c:forEach>
										
										<div class="clear"></div>

									</div>
							</tr>
							<div class="clear"></div>
							</div>


									</div>
							</tr>
							</div>
							<div class="clear"></div>
							<div class="pay-total">
						<!--留言-->
							<div class="order-extra">
								<div class="order-user-info">
									<div id="holyshit257" class="memo">
										<label>买家留言：</label>
										<input type="text" title="选填,对本次交易的说明（建议填写已经和卖家达成一致的说明）" placeholder="选填,建议填写和卖家达成一致的说明" class="memo-input J_MakePoint c2c-text-default memo-close">
										<div class="msg hidden J-msg">
											<p class="error">最多输入500个字符</p>
										</div>
									</div>
								</div>

							</div>
							<!--优惠券 -->
							<div class="buy-agio">
								<li class="td td-coupon">

									<span class="coupon-title">优惠券</span>
									<select data-am-selected id="yhj">
										<option value="-1">
												<div class="c-limit">
												<strong>不使用优惠卷</strong>
										</option>
										<c:forEach items="${coupon }" var="cou" varStatus="ad">
											<option value="${cou.couponId }" id="yhj${ad.index+1 }"  >
													￥${cou.couponPrice} 满${cou.couponCondition}使用
												
											</option>
										</c:forEach>
										
									</select>
								</li>
								<%-- <div class="c-price">
												<strong>￥</strong><strong id="yhjprice${ad.index+1}">${cou.couponPrice}</strong>
												</div>
												<div class="c-limit">
													<c:if test="${cou.couponCondition==0}">
														无门槛使用
													</c:if>
													<c:if test="${cou.couponCondition!=0}">
														满${cou.couponCondition}使用
													</c:if>
												</div> --%>
												<%-- <option value="${pack.packetId }">
												<div class="item-info">
												<strong>￥${pack.packetTotalMoney}</strong>
												</div>
												<div class="item-remainderprice">
														<span style="disable:none" id="hbprice${ad.index+1}">${pack.packetRemainMoney}</span>
														<span>还剩</span>${pack.packetRemainMoney}<span>元</span>
												</div> --%>
								<li class="td td-bonus">
									<span id="yue" style="display: none"></span>
									<span class="bonus-title">红包</span>
									<select data-am-selected id="hb">
										<option value="-1">
												<div class="item-info">
												<strong>不使用红包</strong>
										</option>
										<c:forEach items="${packets }" var="pack" varStatus="ad">
											<option value="${pack.packetId }" id="hb${ad.index+1 }" >
													￥${pack.packetTotalMoney} 剩${pack.packetRemainMoney}
												
											</option>
											
											</option>
										</c:forEach>
										
									</select>

								</li>

							</div>
							<div class="clear"></div>
							</div>
							<!--含运费小计 -->
							<div class="buy-point-discharge">
								<p class="price g_price">
								<span id="jiage" style="display: none"></span>
									合计（含运费） <span>¥</span><em class="pay-sum"></em>
								</p>
							</div>

							<!--信息 -->
				
							<div class="order-go clearfix" id="tijiao" style="display:none">
								<div class="pay-confirm clearfix">
								<form action="" method="post">
									<div class="box">
										<div tabindex="0" id="holyshit267" class="realPay"><em class="t">实付款：</em>
											<span class="price g_price">
                                    <span>¥</span> <em class="style-large-bold-red" id="J_ActualFee"></em>
											</span>
										</div>

										<div id="holyshit268" class="pay-address">
										    <span class="buy-user" style="display:none" id="addrIddd"></span>
											<p class="buy-footer-address">
												<span class="buy-line-title buy-line-title-type">寄送至：</span>
												<span class="buy--address-detail" id="addrDetail">
								   			<span class="addd"></span>
											
											</p>
											<p class="buy-footer-address">
												<span class="buy-line-title">收货人：</span>
												<span class="buypeo" id="addrPeople">  </span> 
                                         <span class="buy-user"> </span>
												<span class="buypho" id="addrPhone"></span>
												
											</p>
										</div>
									</div>

									<div id="holyshit269" class="submitOrder">
										<div class="go-btn-wrap">
											<a id="J_Go"  href="javascript:addOrder();" class="btn-go" tabindex="0" title="点击此按钮，提交订单">提交订单</a>
										</div>
									</div>
									<div class="clear"></div>
									</form>
								</div>
							</div>
						</div>

						<div class="clear"></div>
					</div>
				</div>
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
			<div class="theme-popover-mask" id="addmask">></div>
			<div class="theme-popover" id="add">>

				<!--标题 -->
				<div class="am-cf am-padding">
					<div class="am-fl am-cf"><strong class="am-text-danger am-text-lg">新增地址</strong> / <small>Add address</small></div>
				</div>
				<hr/>

				<div class="am-u-md-12">
					<form class="am-form am-form-horizontal"   method="post">

						<div class="am-form-group">
							<label for="user-name" class="am-form-label">收货人</label>
							<div class="am-form-content">
								<input type="text" id="user-name" placeholder="收货人" name="addrPeople">
							</div>
						</div>

						<div class="am-form-group">
							<label for="user-phone" class="am-form-label">手机号码</label>
							<div class="am-form-content">
								<input id="user-phone" placeholder="手机号必填" type="phone" name="addrPhone">
							</div>
						</div>

						<div class="am-form-group">
							<label for="user-phone" class="am-form-label">所在地</label>
							<div class="am-form-content address">
									<select name="p" id="pro" style="width:100px" >
									<option value="-1" id="addP">请选择</option>
									</select>
									<select name="c" id="citys" style="width:100px"><option value="-1" id="addC">请选择</option></select>
									<select name="a" id="area" style="width:100px"><option value="-1" id="addA">请选择</option></select>
						</div>
						<br />
						<div class="am-form-group">
							<label for="user-intro" id="detial" class="am-form-label">详细地址</label>
							<div class="am-form-content">
								<textarea class="" rows="3" id="user-intro" name="detail" placeholder="输入详细地址"></textarea>
								<small>100字以内写出你的详细地址...</small>
							</div>
						</div>

						<div class="am-form-group theme-poptit">
							<div class="am-u-sm-9 am-u-sm-push-3">
								<div class="am-btn am-btn-danger close" onclick="add();" >保存</div>
								<div class="am-btn am-btn-danger close">取消</div>
							</div>
						</div>
					</form>
					
				</div>
			</div>	
			</div>
<!-- 			<div class="theme-popover-mask" id="initUpdatemask"></div>
			<div class="theme-popover" id="initUpdate" >	 -->
			
			<div class="theme-popover-mask" id="initUpdatemask"></div>
			<div class="theme-popover" id="initUpdate" >
				<!--标题 -->
				<div class="am-cf am-padding">
					<div class="am-fl am-cf"><strong class="am-text-danger am-text-lg">修改地址</strong> / <small>Update address</small></div>
				</div>
				<hr/>

				<div class="am-u-md-12">
					<form class="am-form am-form-horizontal"   method="post">
						<span id="updateAddrId"></span>
						<div class="am-form-group">
							<label for="user-name" class="am-form-label">收货人</label>
							<div class="am-form-content">
								<input type="text" id="updateuser-name" placeholder="收货人" name="addrPeople">
							</div>
						</div>

						<div class="am-form-group">
							<label for="user-phone" class="am-form-label">手机号码</label>
							<div class="am-form-content">
								<input id="updateuser-phone" placeholder="手机号必填" type="phone" name="updateaddrPhone">
							</div>
						</div>

						<div class="am-form-group">
							<label for="user-phone" class="am-form-label">所在地</label>
							<div class="am-form-content address">
									<select name="p" id="updatepro" style="width:100px" >
									<option value="-1" id="initP">请选择</option>
									</select>
									<select name="c" id="updatecitys" style="width:100px"><option value="-1" id="initC">请选择</option></select>
									<select name="a" id="updatearea" style="width:100px"><option value="-1" id="initA">请选择</option></select>
						</div>
						<br />
						<div class="am-form-group">
							<label for="user-intro" id="detial" class="am-form-label">详细地址</label>
							<div class="am-form-content">
								<textarea class="" rows="3" id="updateuser-intro" name="detail" placeholder="输入详细地址"></textarea>
								<small>100字以内写出你的详细地址...</small>
							</div>
						</div>

						<div class="am-form-group theme-poptit">
							<div class="am-u-sm-9 am-u-sm-push-3">
								<div class="am-btn am-btn-danger close" onclick="updateAddr();" >保存</div>
								<div class="am-btn am-btn-danger close">取消</div>
							</div>
						</div>
					</form>
					
				</div>
				</div>
			<script>
				//action="addr/add.do"
				
			function initUpdate(addrId){
				// 禁止遮罩层下面的内容滚动
				$(document.body).css("overflow","hidden");
			
				$(this).addClass("selected");
				$(this).parent().addClass("selected");

				$("#updateAddrId").text(addrId);				
				$('#initUpdatemask').show();
				$('#initUpdatemask').height($(window).height());
				$('#initUpdate').slideDown(200);
				$.post("addr/initUpdate.do",{"addrId":addrId},function(data){
					$("#updateuser-name").val(data.addr.addrPeople);
					$("#updateuser-phone").val(data.addr.addrPhone);
					$("#updateuser-intro").val(data.detial);
					$("#initP").val(data.p);
					$("#initC").val(data.c);
					$("#initA").val(data.a); 
				});  
			}
			function updateAddr(){
				var addrId = $("#updateAddrId").text();
				var p=$("#updatepro option:selected").val();  //获取选中的项
				var c=$("#updatecitys option:selected").val();  //获取选中的项
				var a=$("#updatearea option:selected").val();  //获取选中的项
				var detial=$("#updateuser-intro").val();  //获取detial的项
				var addrPeople =$("#updateuser-name").val();
				var addrPhone =$("#updateuser-phone").val();
				$.post("addr/update.do",{"addrId":addrId,"p":p,"c":c,"a":a,"detial":detial,"addrPeople":addrPeople,"addrPhone":addrPhone},function(data){
					window.location.reload();
				});  
			}
				function add(){
					var addrPeople = $("#user-name").val();
					var addrPhone = $("#user-phone").val();
					var pro = $("#pro").val();
					var citys = $("#citys").val();
					var area = $("#area").val();
					var detial = $("#user-intro").val();
					$.post("addr/add1.do",{"addrPeople":addrPeople,"addrPhone":addrPhone,"pro":pro,"citys":citys,"area":area,"detial":detial,},function(data){
						window.location.reload();
					});
					
				} 
				function deleteAddr(addrId,ad){
					var id="lili"+ad; 
					$.post("addr/delete.do",{"addrId":addrId},function(data){
							if (data =="OK") {
								$("#"+id).remove() ;
							}else{
								alert("删除失败");
							};
						});    
				};
			</script>
			<!-- <script >strToJson('addr"+(count+1)+"',data.addrAddress);</script> -->
			<div class="clear"></div>
			<script type="text/javascript">
			function showAddr(addId){
				var tijiao =document.getElementById("tijiao");
				tijiao.style.display="block";
				var addr='addr'+addId;
				var peo='peo'+addId;
				var pho='pho'+addId;
				var addrId='addrId'+addId;
				$(".addd").html($("#"+addr).html());
				$(".buypeo").html($("#"+peo).html());
				$(".buypho").html($("#"+pho).html());
				$("#addrIddd").html($("#"+addrId).html());
			};
		
		$(function(){
			//优惠券
			$("#yhj").change(function(){
				var c= $(this).get(0).selectedIndex;
				var couponId= $("#yhj"+c).val();
				if (typeof(couponId) =="undefined")
				{
					var money = $("#jiage").text();
					$(".pay-sum").text(money);
					$("#J_ActualFee").html(money);
				}else{
					$.post("coupon/useCoupon.do",{"couponId":couponId},function(data){
						var money =$("#jiage").text();
						var yhjprice = data.couponPrice;
						var condition = data.condition;
						if(money>condition){
							money = money -yhjprice;
							if(money<0){
								money = 0;
								yhjprice = yhjprice - money;
							}else{
								yhjprice=0.0;
							}
							
							$(".pay-sum").text(money.toFixed(2));
							$("#J_ActualFee").html(money.toFixed(2));
						}
					});  
				}
				
			});
			//红包
			$("#hb").change(function(){
				var c= $(this).get(0).selectedIndex;
				var packetId= $("#hb"+c).val();
				if (typeof(packetId) =="undefined")
				{
					var money = $("#jiage").text();
					$(".pay-sum").text(money);
					$("#J_ActualFee").html(money);
				}else{
					$.post("coupon/usePacket.do",{"packetId":packetId},function(data){
						var money = $("#jiage").text();
						var hbprice = data.packetprice;
						money = money -hbprice;
						if(money<=0){
							money = 0;
							hbprice = hbprice - money;
						}else{
							hbprice=0.0;
						}
						
						$(".pay-sum").text(money.toFixed(2));
						$("#J_ActualFee").html(money.toFixed(2));
						
					});    
				}
				
				
			});
			//获取物流公司被选中的
			 $(".OP_LOG_BTN").on("click", function() {
	                wl = $(this).text(); //当前索引值
	                $("#wl").html(wl);
	            });
			var num = $("#allpronum").text();
			//总价
			var totalprice = 0;
			//每个购物车的总价格
			var money = 0;
			//快递
			var kuaidi = 0;
			for(var i = 0; i <num ;i++ ){
				money = $("#money"+i).text();
				totalprice = Number(totalprice)+Number(money);
				kuaidi = Number(kuaidi)+Number($("#kuaidi"+i).text());
			}
			//$(".J_ItemSum").html(totalprice.toFixed(2));
			
			var allprice = Number(totalprice)+Number(kuaidi);
			$("#jiage").html(allprice.toFixed(2));
			$(".pay-sum").html(allprice.toFixed(2));
			$("#J_ActualFee").html(allprice.toFixed(2));
			for(var i = 0 ; i<jsonObeject.length;i++){
				$("#pro").append("<option value="+i+">"+jsonObeject[i].name+"</option>")
			}
			
			$("#pro").change(function(){
				var index =  $("#pro").get(0).selectedIndex - 1;
				$("#citys").empty(); 
				var city = jsonObeject[index].city;
				$("#area").empty(); 
				$("#area").append("<option value='-1'>请选择</option>")
				$("#citys").append("<option value='-1'>请选择</option>")
				for(var i = 0 ; i <city.length; i ++){
					$("#citys").append("<option value="+i+">"+city[i].name+"</option>")
				}
			});
			
			$("#citys").change(function(){
				var s= $("#pro").get(0).selectedIndex - 1;
				var c= $(this).get(0).selectedIndex - 1;
				$("#area").empty(); 
				$("#area").append("<option value='-1'>请选择</option>")
				var area = jsonObeject[s].city[c].area;
				for(var i = 0 ; i <area.length; i ++){
					$("#area").append("<option value="+i+">"+area[i]+"</option>")
				}
			});
			
		});
		function addOrder(){
			var yhj = $("#yhj  option:selected").val();
			var hb = $("#hb option:selected").val();
			var hbprice = $("#yue").text();
			if(yhj!=-1){
				$.post("coupon/updateCoupon.do",{"couponId":yhj,"yhjprice":"0"},function(data){
					
				});   
			}
			if(hb!=-1){
				$.post("coupon/updatePacket.do",{"packetId":hb,"packetPrice":hbprice},function(data){
					
				});  
			}
			var num = $("#allpronum").text();
			//总价
			var totalprice = $("#J_ActualFee").text();
			//每个购物车的总价格
			var money = 0;
			//快递
			var kuaidi = 0;
			var addrPhone =  $("#addrPhone").text();
			var addrPeople =  $("#addrPeople").text();
			var addrDetail = $("#addrDetail").text();
			var proId = new Array();	
			var price = new Array();	
			var number = new Array();	
			var level1 = new Array();	
			var level2 = new Array();	
			var addrStats = 1;
			//设置物流码
			//获取物流公司
			var wl = $("#wl").html();
			for(var i = 0; i <num ;i++ ){
				proId[i] = $("#proId"+i).text();
				price[i] = $("#money"+i).text();
				number[i] =  $("#number"+i).text();
				level1[i] = $("#level1"+i).text();
				level2[i] = $("#level2"+i).text();
				
				var shopcartId = $("#shopcartId"+i).text();
				$.post("shopCart/deleteShopCart.do",{"shopcartId":shopcartId},function(data){
					
				});  
			}
			var adproId = proId.toString();	
			var adprice = price.toString();	
			var adnumber = number.toString();
			var adlevel1 = level1.toString();
			var adlevel2 = level2.toString();
			$.post("order/shopcartaddOrder.do",{"proId":adproId,"addrPeople":addrPeople,"addrPhone":addrPhone,"totalprice":totalprice,"price":adprice,"addrDetail":addrDetail,"addrStats":addrStats,"level1":adlevel1,"level2":adlevel2,"number":adnumber,"wl":wl,"yhj":yhj,"hb":hb},function(data){
				
			});
			location.href ="order/success.do?addrPeople="+addrPeople+"&addrPhone="+addrPhone+"&price="+totalprice+"&addrDetail="+addrDetail;
		 }
		
		
		
		
	</script>
	</body>

</html>