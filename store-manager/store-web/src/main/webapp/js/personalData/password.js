$(function(){
	var oldPassword;
	var newPassword;
	var confirmPassword;
	$("#am-btn").click(function(){
/*		validateOldPassword();
		validateNewPassword();
		validateConfirmPassword();*/
			oldPassword=$("#user-old-password").val().trim();//获取输入框内容 
		      /*-------------1. 非空校验*/ 
		    if(!oldPassword) {  
		       $("#old-password").html("<font color=red>*密码不能为空</font>");
		       return false; 
		    }  
		     
		    /* ------------2. 长度校验*/ 
		       
		    else if(oldPassword.length < 8 || oldPassword.length > 16) {  
		      $("#old-password").html("<font color=red>*密码长度必须为8-16位！</font>");
		      return false; 
		    }  
		     /*-------------3.验证格式*/
		     
		    else if (!oldPassword.match(/[a-zA-Z][a-zA-Z0-9]{3,15}/)) { 
		    	$("#old-password").html("<font color=red>*密码格式不正确！</font>"); 
		    	return false;
		    	}
		    else{
		    	$.ajax({
			    	 url:"personalData/password.do?oldPassword="+oldPassword,
			         async: false,
			         type: 'POST',
			         dataType: 'json',
			         timeout: 1000,
			         cache: false,
			         success : function(data) {
			           if(data != null ){
			            	      if(data.trueOrFalse){
			            	    	 $("#old-password").html("<font color=color='#08BF6A'>密码正确"); 
			            	      }else{
			            	    	  $("#old-password").html("<font color=red>*密码错误</font>");
			            	    	  return false;
			            	      }
			            }      
			            	  },
			        error : function() {
			            $.message.alert('提示', '请求失败！', 'error');
			        }
			    });
		    }
		
			newPassword=$("#user-new-password").val().trim();//获取输入框内容 
		      /*-------------1. 非空校验*/ 
		    if(!newPassword) {  
		       $("#new-password").html("<font color=red>*密码不能为空</font>");
		       return false; 
		    }  
		     
		    /* ------------2. 长度校验*/ 
		       
		    else if(newPassword.length < 8 || newPassword.length > 16) {  
		      $("#new-password").html("<font color=red>*密码长度必须为8-16位！</font>");
		      return false; 
		    }  
		     /*-------------3.验证格式*/
		     
		    else if (!newPassword.match(/[a-zA-Z][a-zA-Z0-9]{3,15}/)) { 
		    	$("#new-password").html("<font color=red>*密码格式不正确！</font>"); 
		    	return false;
		    	}
		    else{
		    	$("#new-password").html("<font color=red>*</font>");  
		    }
		
		 	newPassword=$("#user-new-password").val().trim();
	    	confirmPassword = $("#user-confirm-password").val().trim();
	    	if(newPassword != confirmPassword){
	    		$("#confirm-password").html("<font color=red>*两次输入的密码不一致</font>")
	    		return false;
	    	}else{
	    		$("#confirm-password").html("<font color=red>*</font>")
	    	}
		
		
		oldPassword=$("#user-old-password").val().trim();//获取输入框内容 
		newPassword=$("#user-new-password").val().trim();

		$.ajax({
	    	 url:"personalData/updatePassword.do?oldPassword="+oldPassword+"&&newPassword="+newPassword,
	         async: false,
	         type: 'POST',
	         dataType: 'json',
	         timeout: 1000,
	         cache: false,
	         success : function(data) {
	           if(data != null ){
	            	      if(data.trueOrFalse){
	            	    	 /*alert("修改成功");*/
	            	    	 $("#step-2").addClass("step-1").removeClass("step-2");
	            	    	 $("#u-progress-bar-total-steps-2").attr("style","background:#23C279");
	            	    	 $("input").val("");
	            	    	 $(".show-message").html("<font color=red>*</font>")
	            	      }else{
	            	    	 /* alert("修改失败");*/
	            	    	  return false;
	            	      }
	            }      
	            	  },
	        error : function() {
	            $.message.alert('提示', '请求失败！', 'error');
	        }
	    });
		
	});
	

	$("input,#am-btn").mouseenter(function(){
		var flag = true;
		if(flag){
			flag = validateOldPassword();
		}
		if(flag){
			flag = validateNewPassword();
		}
		if(flag){
			flag = validateConfirmPassword();
		}
	
	});
	
	/*验证旧密码-------------------------------------------------------------------*/
	function validateOldPassword(){
		oldPassword=$("#user-old-password").val().trim();//获取输入框内容 
	      /*-------------1. 非空校验*/ 
	    if(!oldPassword) {  
	       $("#old-password").html("<font color=red>*密码不能为空</font>");
	       return false; 
	    }  
	     
	    /* ------------2. 长度校验*/ 
	       
	    else if(oldPassword.length < 8 || oldPassword.length > 16) {  
	      $("#old-password").html("<font color=red>*密码长度必须为8-16位！</font>");
	      return false; 
	    }  
	     /*-------------3.验证格式*/
	     
	    else if (!oldPassword.match(/[a-zA-Z][a-zA-Z0-9]{3,15}/)) { 
	    	$("#old-password").html("<font color=red>*密码格式不正确！</font>"); 
	    	return false;
	    	}
	    else{
	    	$.ajax({
		    	 url:"personalData/password.do?oldPassword="+oldPassword,
		         async: false,
		         type: 'POST',
		         dataType: 'json',
		         timeout: 1000,
		         cache: false,
		         success : function(data) {
		           if(data != null ){
		            	      if(data.trueOrFalse){
		            	    	 $("#old-password").html("<font color='#08BF6A'>密码正确</font>"); 
		            	      }else{
		            	    	  $("#old-password").html("<font color=red>*密码错误</font>");
		            	    	  return false;
		            	      }
		            }      
		            	  },
		        error : function() {
		            $.message.alert('提示', '请求失败！', 'error');
		        }
		    });
	    }
	}

	
	
	/*验证新密码-------------------------------------------------------------------*/
    function validateNewPassword(){
    	newPassword=$("#user-new-password").val().trim();//获取输入框内容 
	      /*-------------1. 非空校验*/ 
	    if(!newPassword) {  
	       $("#new-password").html("<font color=red>*密码不能为空</font>");
	       return false; 
	    }  
	     
	    /* ------------2. 长度校验*/ 
	       
	    else if(newPassword.length < 8 || newPassword.length > 16) {  
	      $("#new-password").html("<font color=red>*密码长度必须为8-16位！</font>");
	      return false; 
	    }  
	     /*-------------3.验证格式*/
	     
	    else if (!newPassword.match(/[a-zA-Z][a-zA-Z0-9]{3,15}/)) { 
	    	$("#new-password").html("<font color=red>*密码格式不正确！</font>"); 
	    	return false;
	    	}
	    else{
	    	$("#new-password").html("<font color=red>*</font>");  
	    }
	}
    
    /*验证确认新密码-------------------------------------------------------------------*/
    function validateConfirmPassword(){
    	newPassword=$("#user-new-password").val().trim();
    	confirmPassword = $("#user-confirm-password").val().trim();
    	if(newPassword != confirmPassword){
    		$("#confirm-password").html("<font color=red>*两次输入的密码不一致</font>")
    		return false;
    	}

    	else{
    		$("#confirm-password").html("<font color=red>*</font>")
    	}
    }
	
});