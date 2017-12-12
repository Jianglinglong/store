

var time;
/*原手机发送验证码------------------------------------------------------------------------------*/
function sendMobileCodeOld(){
	
	$(function(){
	    $("#send-old-code").attr('disabled',true);    //当点击后倒计时不能点击此按钮 
	    time = 60;  //倒计时60秒 
	    var timer = setInterval(fun1, 1000);  //设置定时器
	    function fun1() { 
	        time--; 
	        if(time>=0) { 
	        	
	        	/*dyMobileButton.innerHTML = time + "s后重新发送"; */
	        	$("#send-old-code").text(time) ;
	        }else{ 
	        	$("#send-old-code").text("验证码") ;
	        	$("#send-old-code").attr('disabled',false); //倒计时结束能够重新点击发送的按钮 
	        	
	          clearTimeout(timer);  //清除定时器 
	          time = 60;  //设置循环重新开始条件 
	        } 
	      } 
	});
	
	$(function(){
		$.ajax({
		   	 url:"personalData/phoneCodeOld.do?",
		        async: false,
		        type: 'POST',
		        dataType: 'json',
		        timeout: 1000,
		        cache: false,
		        success : function(data) {
		          if(data != null ){
		           	      if(data.trueOrFalse){
		           	    	$("#back-old-code").val("");
		           	    	$("#show-old-message").html("<font color='#08BF6A'>*发送成功</font>");
                            $("#back-old-code").val(data.sendsmsNum);
		           	      }else{
		           	    	$("#show-old-message").html("<font color=red>*发送失败</font>");
		           	      }
		           }      
		           	  },
		       error : function() {
		           $.message.alert('提示', '请求失败！', 'error');
		       }
		   });
	})
	
}




/*新手机发送验证码------------------------------------------------------------------------------*/
function sendMobileCodeNew(){
	
	$(function(){
	    $("#send-new-code").attr('disabled',true);    //当点击后倒计时不能点击此按钮 
	    time = 60;  //倒计时60秒 
	    var timer = setInterval(fun1, 1000);  //设置定时器
	    function fun1() { 
	        time--; 
	        if(time>=0) { 
	        	
	        	/*dyMobileButton.innerHTML = time + "s后重新发送"; */
	        	$("#send-new-code").text(time) ;
	        }else{ 
	        	$("#send-new-code").text("验证码") ;
	        	$("#send-new-code").attr('disabled',false); //倒计时结束能够重新点击发送的按钮 
	        	
	          clearTimeout(timer);  //清除定时器 
	          time = 60;  //设置循环重新开始条件 
	        } 
	      } 
	});
	
	$(function(){
		var newPhone = $("#user-new-phone").val().trim();
		$.ajax({
		   	 url:"personalData/phoneCodeNew.do?newPhone="+newPhone,
		        async: false,
		        type: 'POST',
		        dataType: 'json',
		        timeout: 1000,
		        cache: false,
		        success : function(data) {
		          if(data != null ){
		           	      if(data.trueOrFalse){
		           	    	$("#back-new-code").val("");
		           	    	$("#show-new-message").html("<font color='#08BF6A'>*发送成功</font>");
                            $("#back-new-code").val(data.sendsmsNum);
		           	      }else{
		           	    	$("#show-new-message").html("<font color=red>*手机已绑定</font>");
		           	      }
		           }      
		           	  },
		       error : function() {
		           $.message.alert('提示', '请求失败！', 'error');
		       }
		   });
	})
}




/*表单验证*/

$(function(){
	$("#btn-submit").click(function(){
		var flag = true;
		if(flag){
			flag = validateOldCode();
		}
		if(flag){
			flag = validateNewPhone();	
				}
		if(flag){
			flag = validateNewCode();
		}

/*		alert(flag+"成功");*/
		if(flag == true){
			var newPhone = $("#user-new-phone").val().trim();
			$.ajax({
			   	 url:"personalData/updatePhone.do?newPhone="+newPhone,
			        async: false,
			        type: 'POST',
			        dataType: 'json',
			        timeout: 1000,
			        cache: false,
			        success : function(data) {
			          if(data != null ){
			           	      if(data.trueOrFalse){
			           	    	  $("#step-2-step").addClass("step-1").removeClass("step-2");
			           	    	  $("#u-progress-bar-total-steps-2").attr("style","background:#23C279");
			           	    	  $("#user-phone").text(data.userPhone);
				    	          $("input").val("");
				    	          $(".show-message").html("<font color=red>*</font>")
			           	      }else{
			           	    	
			           	      }
			           }      
			           	  },
			       error : function() {
			           $.message.alert('提示', '请求失败！', 'error');
			       }
			   });
		}
	});
	
	$("input,#btn-submit").mouseenter(function(){
		validateNewPhone();
	});
	
    /*验证原手机验证码*/
	function validateOldCode(){
		var oldCode = $("#user-code").val().trim();//获取输入框内容 
		var code = $("#back-old-code").val().trim();
	      /*-------------1. 非空校验*/ 
	    if(!oldCode) {  
	       $("#show-old-message").html("<font color=red>*请输入验证码！</font>");
	       return false; 
	    }  
	    else if(oldCode.length != 6){
	    	$("#show-old-message").html("<font color=red>*请输入6位纯数字！</font>");
	    	return false;
	    }
	    else if (!oldCode.match(/^\d{6}$/)) { 
	    	$("#show-old-message").html("<font color=red>*请输入6位纯数字！</font>"); 
	    	return false;
	    }
	    else if(oldCode != code){
	    	$("#show-old-message").html("<font color=red>*验证码错误！</font>"); 
	    	return false;
	    }
	    else{
	    	$("#show-old-message").html("<font color='#08BF6A'>*输入正确</font>");
          return true;
	    }
	}
	
	/*验证新手机号*/
	function validateNewPhone(){
		var newPhone = $("#user-new-phone").val().trim();//获取输入框内容  
	     
	      /*1. 非空校验*/ 
	    if(!newPhone) {  
	       $("#show-new-phone-message").html("<font color=red>*手机号码不能为空</font>");
	       $("#send-new-code").attr('disabled',true);
	       return false; 
	    }  
	     
	    /*2. 长度校验*/ 
	       
	    else if(newPhone.length != 11) {  
	      $("#show-new-phone-message").html("<font color=red>*手机号码长度错误！</font>");
	      $("#send-new-code").attr('disabled',true);
	      return false; 
	    }  
	    
	     /*3.验证格式*/
	     
	    else if (!newPhone.match(/^(((13[0-9]{1})|(14[0-9]{1})|(17[0,3,7]{1})|(15[0-3]{1})|(15[5-9]{1})|(18[0-9]{1}))+\d{8})$/)) { 
	    	$("#show-new-phone-message").html("<font color=red>*手机号码格式错误！</font>"); 
	    	$("#send-new-code").attr('disabled',true);
	    	return false;
	    	}
	    else{
	    	if($("#send-new-code").text() == "验证码"){
	    		$("#send-new-code").attr('disabled',false);
		    	$("#show-new-phone-message").html("<font color='#08BF6A'>*格式输入正确</font>"); 
	    	}else{
	    		$("#send-new-code").attr('disabled',true);
	    		return true;
	    	}
	    }
	}
	
	/*验证新手机手机验证码*/
	function validateNewCode(){
		var newCodeValue = $("#user-new-code").val().trim();//获取输入框内容 
		var codeValue = $("#back-new-code").val().trim();
		
	      /*-------------1. 非空校验*/ 
	    if(!newCodeValue) {  
	       $("#show-old-message").html("<font color=red>*请输入验证码！</font>");
	        return false; 
	    }  
	    else if(newCodeValue.length != 6){
	    	$("#show-new-message").html("<font color=red>*请输入6位纯数字！</font>");
	    	return false;
	    }
	    else if (!newCodeValue.match(/^\d{6}$/)) { 
	    	$("#show-new-message").html("<font color=red>*请输入6位纯数字！</font>"); 
	    	return false;
	    }
	    else if(newCodeValue != codeValue){
	    	$("#show-new-message").html("<font color=red>*验证码错误！</font>"); 
	    	return false;
	    }
	    else{
	    	$("#show-new-message").html("<font color='#08BF6A'>*格式输入正确</font>");
            return true;
	    }
	}
	
	
	
})





















