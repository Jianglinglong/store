<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="/common/jstl.jspf"%>
<!DOCTYPE html >
<html xmlns="http://www.w3.org/1999/xhtml" lang="zh-CN">
<head>
<base href="${basePath }/" />
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta name="viewport"
	content="width=device-width, initial-scale=1.0, minimum-scale=1.0, maximum-scale=1.0, user-scalable=no">

	<title>购物车页面</title>

	<link href="AmazeUI-2.4.2/assets/css/amazeui.css" rel="stylesheet"
		type="text/css" />
	<link href="basic/css/demo.css" rel="stylesheet" type="text/css" />
	<link href="css/cartstyle.css" rel="stylesheet" type="text/css" />
	<link href="css/optstyle.css" rel="stylesheet" type="text/css" />

	<script type="text/javascript" src="js/jquery.js"></script>
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
						id="J_MiniCartNum" class="h">${shopCart.size() }</strong></a>
				</div>
			</div>
			<div class="topMessage favorite">
				<div class="menu-hd">
					<a href="favorite/show.do" target="_top"><i class="am-icon-heart am-icon-fw"></i><span>收藏夹</span></a>
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

	<!--购物车 -->
	<div class="concent">
		<div id="cartTable">
			<div class="cart-table-th">
				<div class="wp">
					<div class="th th-chk">
						<div id="J_SelectAll1" class="select-all J_SelectAll"></div>
					</div>
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
					<div class="th th-op">
						<div class="td-inner">操作</div>
					</div>
				</div>
			</div>
			<div class="clear"></div>

			<tr class="item-list">
				<div class="bundle  bundle-last">
					<div class="bundle-hd">
						<div class="bd-promos">
							<div class="bd-has-promo">
								已享优惠:<span class="bd-has-promo-content">省￥19.50</span>&nbsp;&nbsp;
							</div>
							<div class="act-promo">
								<a href="javascript:;" target="_blank">第二支半价，第三支免费<span class="gt">&gt;&gt;</span></a>
							</div>
							<span class="list-change theme-login">编辑</span>
						</div>
					</div>
					<div class="clear"></div>
					<div class="bundle-main">
						<c:forEach items="${shopCart}" var="shopCart" varStatus="ad">
							<div style="display: none">
								<span id="imgM${ad.count-1}">${proImgM.get(ad.count-1) }</span>
								<div id="number1${ad.count-1}">${number1.get(ad.count-1) }</div>
									<div>
										<c:forEach items="${proType1.get(ad.index)  }" var="k" varStatus="add">
											<span id="protype1${ad.index }${add.index}">${k.type }</span>
										</c:forEach>
									</div>
									<div>
										<c:forEach items="${proType2.get(ad.index)  }" var="b" varStatus="add">
											<span id="protype2${ad.index }${add.index}">${b.type }</span>
										</c:forEach>
									</div>
								<div id="number2${ad.count-1}">${number2.get(ad.count-1) }</div>
							</div>
							<span id="proId" style="display: none">${product.get(ad.count-1).proId }</span>
							<ul class="item-content clearfix" id="ul${ad.count-1}">
								<li class="td td-chk">
									<div class="cart-checkbox">
										<input class="check" id="CheckBox${ad.count-1}" name="${shopCart.shopcartId }"
											value="${ad.count}" type="checkbox">
										<label for="J_CheckBox_170037950254"></label>
									</div>
								</li>
								<li class="td td-item">

									<div class="item-pic">
										<a href="javascript:;" target="_blank"
											data-title="${product.get(ad.count-1).proName }"
											class="J_MakePoint" data-point="tbcart.8.12"> <img
											src="${product.get(ad.count-1).proImg }" id="img${ad.count-1 }"
											class="itempic J_ItemImg"></a>
									</div>
									<div class="item-info">
										<div class="item-basic-info">
											<a href="javascript:;" target="_blank"
												title="${product.get(ad.count-1).proName }"
												class="item-title J_MakePoint" data-point="tbcart.8.11">${product.get(ad.count-1).proName }</a>
										</div>
									</div>
								</li>
								<li class="td td-info">
									 <div class="item-props item-props-can">
										<span class="sku-line" id="ytype1${ad.count-1 }">${shopCart.proType1 }:${shopCart.proLevel1 }</span>
										<span class="sku-line" id="ytype2${ad.count-1 }">${shopCart.proType2 }:${shopCart.proLevel2 }</span>
										<span tabindex="0" class="btn-edit-sku theme-login" 
										id="xiugai${ad.count-1 }"
											onclick="javascript:update(${ad.count-1 },${number1.get(ad.count-1) },${number2.get(ad.count-1) });"
											>修改</span> <i
											class="theme-login am-icon-sort-desc"></i>
									</div>
								</li>
								<li class="td td-price">
									<div class="item-price price-promo-promo">
										<div class="price-content">
											<div class="price-line">
												<em class="price-original">${proYJ.get(ad.count-1)}</em>
											</div>
											<div class="price-line">
												<em class="J_Price price-now" id="price${ad.count-1 }"
													tabindex="0">${shopCart.proPrice }</em>
											</div>
										</div>
									</div>
								</li>
								<li class="td td-amount">
									<div class="amount-wrapper">
										<div class="item-amount">
											<div class="sl">
												<input class="min am-btn" id="jian${ad.count-1 }" name=""
													type="button"
													onclick="jian(${ad.count-1})"
													value="-" /> 
													<input class="text_box"  type="text" id="number${ad.count-1 }"
													onchange="change(${ad.count-1})"
													value="${shopCart.proNum }" style="width: 30px;" />
													<input
													class="add am-btn" id="jia${ad.count-1 }" name="" type="button"
													onclick="jia(${ad.count-1})"
													value="+" />
											</div>
										</div>
									</div>
								</li>
								<li class="td td-sum">
									<div class="td-inner">
										<em tabindex="0" class="J_ItemSum number" id="money${ad.count-1 }">${shopCart.proMoney }</em>
									</div>
								</li>
								<li class="td td-op">
									<div class="td-inner">
										<a title="移入收藏夹" rel="${shopCart.proId }" class="btn-fav"
											href="JavaScript:;">
											移入收藏夹</a> <a
											href="javascript:deleteOne(${shopCart.shopcartId },${ad.count-1 });"
											data-point-url="#" class="delete">删除</a>
									</div>
								</li>
							</ul>
						</c:forEach>
<script type="text/javascript">
$(".btn-fav").click(function(){
	var proId= $(this).attr("rel");
	$.post("${basePath }/favorite/add.do",{proId:proId},function(data){
		if(data == true){
			alert("添加成功");
		}else{
			alert("已经收藏，请查看");
		}
	});
});
</script>
					</div>
				</div>
			</tr>
		</div>
		<div class="clear"></div>

		<div class="float-bar-wrapper">
			<div id="J_SelectAll2" class="select-all J_SelectAll">
				<div class="cart-checkbox">
					<input class="check-all check" id="J_SelectAllCbx2"
						name="select-all" value="true" type="checkbox"> <label
						for="J_SelectAllCbx2"></label>
				</div>
				<span>全选</span>
			</div>
			<div class="operations">
				<a href="javascript:deleteShopCart();" hidefocus="true" class="deleteAll">删除</a> <a href="javascript:;"
					hidefocus="true" class="J_BatchFav">移入收藏夹</a>
			</div>
			<div class="float-bar-right">
				<div class="amount-sum">
					<span class="txt">已选商品</span> <em id="J_SelectedItemsCount">0</em><span
						class="txt">件</span>
					<div class="arrow-box">
						<span class="selected-items-arrow"></span> <span class="arrow"></span>
					</div>
				</div>
				<div class="price-sum">
					<span class="txt">合计:</span> <strong class="price">¥<em
						id="J_Total">0.00</em></strong>
				</div>
				<div class="btn-area">
					<a href="javascript:pay();" id="J_Go" class="submit-btn submit-btn-disabled"
						aria-label="请注意如果没有选择宝贝，将无法结算"> <span>结&nbsp;算</span></a>
				</div>
			</div>

		</div>

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

	<!--操作页面-->

	<div class="theme-popover-mask"></div>

	<div class="theme-popover">
		<div class="theme-span"></div>
		<div class="theme-poptit h-title">
			<a href="javascript:;" title="关闭" class="close">×</a>
		</div>
		<div class="theme-popbod dform">
			<form class="theme-signin" name="loginform" action="" method="post">

				<div class="theme-signin-left">

					<li class="theme-options">
						<div class="cart-title" id="type1">颜色：</div>
						<ul id="prodetail1">
							<!-- <li class="sku-line selected" id="level">12#川南玛瑙<i></i></li>
							<li class="sku-line">10#蜜橘色+17#樱花粉<i></i></li> -->
						</ul>
					</li>
					<li class="theme-options">
						<div class="cart-title" id="type2">包装：</div>
						<ul id="prodetail2">
							<!-- <li class="sku-line selected">包装：裸装<i></i></li>
							<li class="sku-line">两支手袋装（送彩带）<i></i></li> -->
						</ul>
					</li>
					<div class="theme-options">
						<div class="cart-title number">数量</div>
						<dd>
							<input class="min am-btn am-btn-default" name="" type="button"
								value="-" /> <input class="text_box" name="" type="text"
								value="1" style="width: 30px;" /> <input
								class="add am-btn am-btn-default" name="" type="button"
								value="+" /> <span class="tb-hidden">库存<span
								class="stock">1000</span>件
							</span>
						</dd>

					</div>
					<div class="clear"></div>
					<div class="btn-op">
						<div class="btn am-btn am-btn-warning" id="makesure" onclick="updateSure()">确认</div>
						<div class="btn close am-btn am-btn-warning">取消</div>
					</div>

				</div>
				<div class="theme-signin-right">
					<div class="img-info">
						<img id="xiugaiimg" src="images/kouhong.jpg_80x80.jpg" />
					</div>
					<div class="text-info">
						<span class="J_Price price-now" id="xiugaiprice">¥39.00</span> <span id="Stock"
							class="tb-hidden">库存<span class="stock">1000</span>件
						</span>
					</div>
				</div>
				
			</form>
		</div>
	</div>
	<!--引导 -->
	<div class="navCir">
		<li><a href="home/list.do"><i class="am-icon-home"></i>首页</a></li>
		<li><a href="javascript:;"><i class="am-icon-list"></i>分类</a></li>
		<li class="active"><a href="shopCart/listShopCart.do"><i
				class="am-icon-shopping-basket"></i>购物车</a></li>
		<li><a href="personalData/list.do"><i class="am-icon-user"></i>我的</a></li>
	</div>
	<script type="text/javascript">
	//设置全局变量
		var totalPrice=0;
	//口味之前被选中的位置
		var seled1 = 0;
	//包装之前被选中的位置
		var seled2 = 0;
	//用来初始化时选中的位置  只做一次
		var num1 = 0;
		var num2 = 0;
		function update(ad,number1,number2){
			//口味
			var kouwei = $("#protype1"+ad+"0").html(); 
			
			//口味 列表
			//得到原口味  原为拼接的
			var ytype1 = $("#ytype1"+ad).html();
			//包装
			var baozhuang = $("#protype2"+ad+"0").html(); 
			$("#type2").html(baozhuang);
			//得到原包装
			var ytype2 = $("#ytype2"+ad).html();
			$("#prodetail1 li").remove();
			$("#prodetail2 li").remove(); 
			$("#makesure").attr("name",ad);
			
			//得到被选中的口味序号
			
			//得到被选中的包装序号
			if(num1==0){
				for (var j = 1 ; j <number1 ; j++) {
					var allkouwei1 = $("#protype1"+ad+""+j).html();
					if(ytype1==(kouwei+":"+allkouwei1)){
						seled1 = j-1;
					}
				}
			}
			//初始化所有口味
			for (var i = 1 ; i < number1 ; i++) {
				var allkouwei = $("#protype1"+ad+""+i).html();
				
				if(ytype1==(kouwei+":"+allkouwei)){
					$li = $("<li class='sku-line selected' id='level1"+(i-1)+"' onclick='chosekw("+(i-1)+")'>"+allkouwei+"<i></i></li>");
				}else{
					$li = $("<li class='sku-line' id='level1"+(i-1)+"' onclick='chosekw("+(i-1)+")'>"+allkouwei+"<i></i></li>");
				}
				$("#prodetail1").append($li);
				
			}
			//得到被选中的包装序号
			if(num2==0){
				for (var j = 1 ; j <number2 ; j++) {
					var allbaozhuang1 = $("#protype2"+ad+j).html();
					if(ytype2==(baozhuang+":"+allbaozhuang1)){
						seled2 = j-1;
					}
				}
			}
			//初始化所有包装
			for (var i = 1 ; i < number2 ; i++) {
				var allbaozhuang = $("#protype2"+ad+i).html();
				
				if(ytype2==(baozhuang+":"+allbaozhuang)){
					seled2 = i-1;
					$li = $("<li class='sku-line selected' id='level2"+(i-1)+"' onclick='chosebz("+(i-1)+")'>"+allbaozhuang+"<i></i></li>");
				}else{
					$li = $("<li class='sku-line' id='level2"+(i-1)+"' onclick='chosebz("+(i-1)+")'>"+allbaozhuang+"<i></i></li>");
					
				}
				$("#prodetail2").append($li);
				
			}
			//包装
			var baozhuang = $("#protype2"+ad+"0").html();
			$("#type2").html(baozhuang);
			//var src = $('#xiugaiimg')[0].src;
			//图片
			var img = $("#imgM"+ad).text();
			$("#xiugaiimg").attr('src',img);
			//价格
			var price = $("#price"+ad).html();
			$("#xiugaiprice").html(price);
		/* 	$.post("shopCart/update.do",{"proId":proId},function(data){
				if (data =="OK") {
					//location.href ="order/success.do?addrPeople="+addrPeople+"&addrPhone="+addrPhone+"&price="+price+"&addrDetail="+addrDetail;
				};
			});  */  
			$("#type1").html(kouwei);
		}
		//
		function chosekw(sel){
			//清楚原有的样式
			$("#level1"+sel).removeClass("sku-line");
			$("#level1"+seled1).removeClass("sku-line  selected");
			//添加现在的样式
			$("#level1"+sel).addClass("sku-line  selected");
			$("#level1"+seled1).addClass("sku-line");
			num1=1;
			seled1 =sel;
		}
		function chosebz(sel,seled){
			//清楚原有的样式
			$("#level2"+sel).removeClass("sku-line");
			$("#level2"+seled2).removeClass("sku-line  selected");
			//添加现在的样式
			$("#level2"+sel).addClass("sku-line  selected");
			$("#level2"+seled2).addClass("sku-line");
			num2=1;
			seled2 =sel;
		}
		function updateSure(){
			var ad = $("#makesure").attr("name");
			//口味
			var kouwei = $("#level1"+seled1).text();
			var kw = $("#protype1"+ad+"0").html(); 
			var ytype1 = $("#ytype1"+ad).html(kw+":"+kouwei);
			//包装
			var baozhuang = $("#level2"+seled2).text();
			var bz = $("#protype2"+ad+"0").html(); 
			var ytype2 = $("#ytype2"+ad).html(bz+":"+baozhuang);
			//数量
			var number = $("#number"+ad).val();
			//价格
			var money = $("#money"+ad).text();
			var shopcartId = $("#CheckBox"+ad).attr("name");
		    $.post("shopCart/updateShopCart.do",{"shopcartId":shopcartId,"kouwei":kouwei,"baozhuang":baozhuang,"number":number,"money":money},function(data){
				if (data =="OK") {
					alert("修改成功");
					$(document.body).css("position","static");
//					滚动条复位
					$('.theme-signin-left').scrollTop(0);					
					$('.theme-login').removeClass("selected");
					$('.item-props-can').removeClass("selected");					
					$('.theme-span').hide();
					$('.theme-popover-mask').hide();
					$('.theme-popover').slideUp(200);
				}else{
					alert("修改失败");
				};
			});   
		}
		
		//数量加
		function jia(index){
			var number =  parseInt($("#number"+index).val())+ parseInt(1);
			//单价
			var price = $("#price"+index).html();
			//总价
			var total='totalPrice'+index;
			total = price*number;
			$("#money"+index).html(total.toFixed(2));
			if(number>1){
				$("#jian"+index).attr("disabled", false); 
			}
			
};
		//数量减
		function jian(index){
			
			var number =  parseInt($("#number"+index).val())- parseInt(1);
			if(number==1){
			
				$("#jian"+index).attr("disabled", true); 
			}
			//单价
			var price = $("#price"+index).html();
			//总价
			var total='totalPrice'+index;
			total = price*number;
			$("#money"+index).html(total.toFixed(2));
			console.log("number:"+number);
			console.log("total:"+total);
			
		
	};
	//数量变化（手动输入）
	function change(index){
		//数量
		var number = $("#number"+index).val();
		//单价
		var price = $("#price"+index).html();
		var yprice = $("#money"+index).html();
		//总价
		var totalprice = price*number;
		//差价
		var cjprice = totalprice - yprice;
		$("#money"+index).html(totalprice.toFixed(2));
		var $isChecked = $("#CheckBox"+index).is(":checked");
		if( $isChecked){
			var money = parseInt($("#J_Total").html())+cjprice;
			$("#J_Total").html(money);
		};
	
};
	
	//选择
	$('input').live('click',function(){ 
		totalPrice=0;
		var len=$('input:checked').length;
		if(len==0){
			$("#J_Total").html(0.00);
		}
	 if($('#J_SelectAllCbx2').is(':checked')){
		len=parseInt(len)-1;
	}
	   $("#J_SelectedItemsCount").html(len);
	   $("input[id^='CheckBox']:checked").each(function(){
		   var Id=this.value-1;
		   var t='money'+Id;
		   totalPrice=parseInt(totalPrice)+parseInt($('#'+t).html());
		   $("#J_Total").html(totalPrice.toFixed(2));
		   
	   });
	 });  

	
	 $("#J_SelectAllCbx2").click( 
			  function(){ 
			    if(this.checked){ 
			        $("input[id^='CheckBox']").attr('checked', true)
			    }else{ 
			        $("input[id^='CheckBox']").attr('checked', false)
			    } 
			  } 
			);
		//删除
		function deleteShopCart(){
			 $("input[id^='CheckBox']:checked").each(function(){
				var id= this.id; 
				$.post("shopCart/deleteShopCart.do",{"shopcartId":this.name},function(data){
						if (data =="OK") {
							$("#"+id).parent().parent().parent().remove() ;
						}else{
							alert("删除失败");
						};
					});   
			   });
			};
			function deleteOne(shopcartId,ad){
					var id="ul"+ad; 
					$.post("shopCart/deleteShopCart.do",{"shopcartId":shopcartId},function(data){
							if (data =="OK") {
								$("#"+id).remove() ;
							}else{
								alert("删除失败");
							};
						});    
				};
				//提交订单
				function pay(){
					var scId = new Array();
					var number = new Array();
					var money = new Array();
					var i = 0;
					$("input[id^='CheckBox']:checked").each(function(){
						//用他ID截取数字 获取索引
						var id=parseInt(this.id.replace(/[^0-9]/ig,""));//截取数字
						//购物车id
						scId[i] = this.name;
						//数量
						number[i] = $("#number"+id).val();
						//每一个的总价
						money[i] = $("#money"+id).text();
						var j = parseInt(this.value)-parseInt(1);
						$("#ul"+j).remove();
						i++;
					   }); 
					sc =scId.toString();
					number =number.toString();
					money =money.toString();
				    $.post("shopCart/shopCartpay.do",{"sc":sc,"money":money,"number":number},function(data){
						if (data) {
							$("input[id^='CheckBox']:checked").each(function(){
								$("#ul"+this.value).remove();
							   }); 
							$("body").html(data);
						}else{
							alert("提交失败");
						};
					});   
				};	
		</script>
</body>

</html>