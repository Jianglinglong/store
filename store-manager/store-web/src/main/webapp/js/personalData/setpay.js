var time;
/*发送验证码------------------------------------------------------------------------------*/
function sendMobileCode(){
	
	$(function(){
	    $("#sendCode").attr('disabled',true);    //当点击后倒计时不能点击此按钮 
	    time = 60;  //倒计时60秒 
	    var timer = setInterval(fun1, 1000);  //设置定时器
	    function fun1() { 
	        time--; 
	        if(time>=0) { 
	        	
	        	/*dyMobileButton.innerHTML = time + "s后重新发送"; */
	        	$("#sendCode").text(time) ;
	        }else{ 
	        	$("#sendCode").text("验证码") ;
	        	$("#sendCode").attr('disabled',false); //倒计时结束能够重新点击发送的按钮 
	        	
	          clearTimeout(timer);  //清除定时器 
	          time = 60;  //设置循环重新开始条件 
	        } 
	      } 
	});
	
	$(function(){
		$.ajax({
		   	 url:"personalData/setpay.do?",
		        async: false,
		        type: 'POST',
		        dataType: 'json',
		        timeout: 1000,
		        cache: false,
		        success : function(data) {
		          if(data != null ){
		           	      if(data.trueOrFalse){
		           	    	$("#code").val("");
		           	    	$("#verificationCode").html("<font color='#08BF6A'>*发送成功</font>");
                            $("#code").val(data.sendsmsNum);
		           	      }else{
		           	    	$("#verificationCode").html("<font color=red>*发送失败</font>");
		           	      }
		           }      
		           	  },
		       error : function() {
		           $.message.alert('提示', '请求失败！', 'error');
		       }
		   });
	})
	
}



$(function(){
    
	$("#preservation").click(function(){
		var flag = false;
		flag = validateUserCode();
		flag = validatePayCode();
		flag = validateCofirmPayCode();
		
		flag = validateCode();
		if(flag == true){
			var payCode = $("#user-pay-password").val().trim(); 
			ajaxValue(payCode);
		}
		
	});
	
	$("input,#preservation").mouseenter(function(){
		validateUserCode();
		validatePayCode();
		validateCofirmPayCode();
	});
	
	/*验证验证码*/
	function validateUserCode(){
		
		var userCodeValue=$("#userCode").val().trim();//获取输入框内容 
	      /*-------------1. 非空校验*/ 
	    if(!userCodeValue) {  
	       $("#verificationCode").html("<font color=red>*请输入验证码！</font>");
	       return false; 
	    }  
	    else if(userCodeValue.length != 6){
	    	$("#verificationCode").html("<font color=red>*请输入6位纯数字！</font>");
	    	return false;
	    }
	    else if (!userCodeValue.match(/^\d{6}$/)) { 
	    	$("#verificationCode").html("<font color=red>*请输入6位纯数字！</font>"); 
	    	return false;
	    }
	    else{
	    	$("#verificationCode").html("<font color='#08BF6A'>*格式输入正确！</font>");
            return true;
	    }
	}

	/*验证支付密码*/
	function validatePayCode(){
		var payCodeValue = $("#user-pay-password").val().trim();//获取支付密码输入框内容 
		if(!payCodeValue) {  
		       $("#payCode").html("<font color=red>*请输入支付密码！</font>");
		       return false; 
		    }  
		    else if(payCodeValue.length != 6){
		    	$("#payCode").html("<font color=red>*请输入六位支付密码！</font>");
		    	return false;
		    }
		    else if (!payCodeValue.match(/^\d{6}$/)) { 
		    	$("#payCode").html("<font color=red>*支付密码只能为数字！</font>"); 
		    	return false;
		    }
		    else{
		    	$("#payCode").html("<font color='#08BF6A'>*输入正确！</font>");  
		    	return true;
		    }
		
	}
	
	/*确认支付密码*/
	function validateCofirmPayCode(){
		var payCodeValue = $("#user-pay-password").val().trim();//获取支付密码输入框内容 
		var cofirmPayCode = $("#user-confirm-password").val().trim();//获取支付密码输入框内容 
		if(payCodeValue != cofirmPayCode) {  
			    $("#cofirmPayCode").html("<font color=red>*两次输入不一致！</font>");
		    	return false;
		    }
			else if(cofirmPayCode.length != 6){
				$("#cofirmPayCode").html("<font color=red>*请确认支付密码！</font>");
				return false;
			}
		    else{
		    	$("#cofirmPayCode").html("<font color='#08BF6A'>*输入正确！</font>");
		    	return true;
		    }
	}
	
	/*验证验证码是否正确*/
	function validateCode(){
		var codeValue = $("#code").val().trim();
		var userPayValue = $("#userCode").val().trim();
		if(codeValue != userPayValue){
			$("#verificationCode").html("<font color=red>*验证码错误！</font>"); 
	    	return false;
		}else{
			return true;
		}
	}
	
	/*提交表单*/
	function ajaxValue(payCode){
		$.ajax({
		   	 url:"personalData/addSetpay.do?payCode="+payCode,
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
			    	        	$("#sendCode").attr('disabled',true); //设置支付密码成功 
			    	        	$("input").val("");
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
