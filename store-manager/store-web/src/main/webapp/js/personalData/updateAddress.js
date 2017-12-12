
 
 
/* 提交收获地址表单开始------------------------------------------------------------------*/
 $(function(){
		
	    $("#btn-up").click(function() { 
	    	
	    	var flag = validateUserName();
	    	if(flag == true){
	    	 flag = validateUserPhone();
	    	}
	    	if(flag == true){
	    		/*alert("地址");*/
	    		flag = validateAddrAddress();
	    	}
	    	if(flag == true){
	    		/*alert("详细");*/
	    		flag = validateUserIntro();
	    	}
	    	if(flag == true){
	    		if(confirm("确认修改！")){
	    			var pro = $("#pro").val().trim();
	    			var citys = $("#citys").val().trim();
	    			var area = $("#area").val().trim();
	    			var detial = $("#userIntro").val().trim();
	    			
	    			var valueName = $("#userName").val().trim();
	    			var valuePhone = $("#userPhone").val().trim();
	    			
	    			var proShow = $("#pro option:checked").text().trim(); // 选中项目的显示值
	    			var citysShow = $("#citys option:checked").text().trim(); // 选中项目的显示值
	    			var areaShow = $("#area option:checked").text().trim(); // 选中项目的显示值

	    			var context = "<li class='user-addresslist '><span class='new-option-r'><i class='am-icon-check-circle'></i>默认地址</span><p class='new-tit new-p-re'><span class='new-txt'>"+valueName+"</span><span class='new-txt-rd2'>"+valuePhone+"</span></p><div class='new-mu_l2a new-p-re'><p  class='new-mu_l2cw'><span class='province'>"+proShow+"</span>&nbsp;<span class='city'>"+citysShow+"</span>&nbsp;<span class='dist'>"+areaShow+"</span>&nbsp;<span class='street'>"+detial+"</span></p></div><div class='new-addr-btn'><a href='addr/initUpdate.do?addrId=${address.addrId }'><i class='am-icon-edit'></i>编辑</a> <spanclass='new-addr-bar'>|</span> <a href='personalData/deleteAddress.do?addrId=${address.addrId }' onclick='delClick(this);'><i class='am-icon-trash'></i>删除</a></div></li>";
	    			
	    			//$("#userAddress").val('{"def":"0","'+'c":"'+citys+'","a":"'+area+'","p":"'+pro+'","detial":"'+detial+'"}');
	    			//alert('{"def":"0","'+'c":"'+citys+'","a":"'+area+'","p":"'+pro+'","detial":"'+detial+'"}');
	    			$("#userAddress").val('{"def":"0","'+'c":"'+citys+'","a":"'+area+'","p":"'+pro+'","detial":"'+detial+'"}');
	    			$("#addressForm").submit();
	    		}
	    		
	    	}
	    	
	    }); 
	   
	    $("*").mouseenter(function() { 
	    	var flag = validateUserName();
	    	if(flag == true){
	    	 flag = validateUserPhone();
	    	}
	    	if(flag == true){
	    		flag = validateAddrAddress();
	    	}
	    	if(flag == true){
	    		flag = validateUserIntro();
	    	}
	    });  
    /*验证收货人 */  
	function validateUserName() {
		var value = $("#userName").val().trim();
		if(!value) {  
		       $("#userName-message").html("<font color=red>*收货人不能为空</font>");
		       return false; 
		    }  
		     
		    /* ------------2. 长度校验*/  
		    else if(value.length > 30) {  
		      $("#userName-message").html("<font color=red>*收货人名称过长！</font>");
		      return false; 
		    }  
		    
		     /*-------------3.验证格式*/
		    else if (!value.match(/^[\u4e00-\u9fa5]+$/)) { 
		    	$("#userName-message").html("<font color=red>*请输入中文！</font>"); 
		    	return false;
		    	}
		    else{
		    	$("#userName-message").html("<font color=red>*</font>"); 
		    	return true;
		    	}
	}

    /*验证手机*/
	function validateUserPhone() {
		var value = $("#userPhone").val().trim();
		if(!value) {  
		       $("#userPhone-message").html("<font color=red>*手机号码不能为空</font>");
		        return false; 
		    }  
		     
		    /* ------------2. 长度校验*/  
		    else if(value.length != 11) {  
		      $("#userPhone-message").html("<font color=red>*手机号码长度错误！</font>");
		        return false; 
		    }  
		    
		     /*-------------3.验证格式*/
		    else if (!value.match(/^(((13[0-9]{1})|(14[0-9]{1})|(17[0,3,7]{1})|(15[0-3]{1})|(15[5-9]{1})|(18[0-9]{1}))+\d{8})$/)) { 
		    	$("#userPhone-message").html("<font color=red>*手机号码格式错误！</font>"); 
		    	return false;
		    	}
		    else{
		    	$("#userPhone-message").html("<font color=red>*</font>");
		    	return true;
		    	}
	}
	
	/*验证省市区*/
	function validateAddrAddress(){
	    var value = $("#area").val();
	    if(!value){
	    	$("#addr-message").html("<font color=red>*请选择地址</font>");
	    	return false;
	    }else if(value == "-1"){
	    	$("#addr-message").html("<font color=red>*请选择地址</font>");
	    	return false;
	    }else{
	    	$("#addr-message").html("<font color=red>*</font>");
	    	return true;
	    }
	}
	
	 /* 验证详细地址*/
	function validateUserIntro() {
		var value = $("#userIntro").val().trim();
		if(!value) {  
		       $("#userIntro-message").html("<font color=red>*详细地址不能为空</font>");
		       return false; 
		    } 
		else{
			 $("#userIntro-message").html("<font color=red>*</font>");
			   return true;
		}
	}
		
	});
/* 提交收获地址表单结束------------------------------------------------------------------*/


 
 
 

