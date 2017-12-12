var time;
/*邮箱发送验证码------------------------------------------------------------------------------*/
function sendMobileCode(){
	$(function(){
	    $("#send-code").attr('disabled',true);    //当点击后倒计时不能点击此按钮 
	    time = 60;  //倒计时60秒 
	    var timer = setInterval(fun1, 1000);  //设置定时器
	    function fun1() { 
	        time--; 
	        if(time>=0) { 
	        	
	        	/*dyMobileButton.innerHTML = time + "s后重新发送"; */
	        	$("#send-code").text(time) ;
	        }else{ 
	        	$("#send-code").text("验证码") ;
	        	$("#send-code").attr('disabled',false); //倒计时结束能够重新点击发送的按钮 
	        	
	          clearTimeout(timer);  //清除定时器 
	          time = 60;  //设置循环重新开始条件 
	        } 
	      } 
	});
	
	$(function(){
		$.ajax({
		   	 url:"personalData/emailCodeNew.do?",
		        async: false,
		        type: 'POST',
		        dataType: 'json',
		        timeout: 1000,
		        cache: false,
		        success : function(data) {
		          if(data != null ){
		           	      if(data.trueOrFalse){
		           	    	$("#back-code").val("");
		           	    	$("#code-message").html("<font color='#08BF6A'>*发送成功</font>");
                            $("#back-code").val(data.sendsmsNum);
		           	      }else{
		           	    	$("#code-message").html("<font color=red>*发送失败</font>");
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

	$("#btn-up").click(function(){
		var flag = false;
			flag = validateEmail();
		if(flag == true){
			flag = validateCode();
		}
		if(flag == true){
			
			var email = $("#user-email").val().trim();
			 $.ajax({
		    	 url: "personalData/addEmail.do?email="+email,
		         async: false,
		         type: 'POST',
		         dataType: 'json',
		         timeout: 1000,
		         cache: false,
		         success : function(data) {
		           if(data != null ){
		            	      if(!data.trueOrFalse){
		            	    	  $("#step-2-step").addClass("step-1").removeClass("step-2");
			           	    	  $("#u-progress-bar-total-steps-2").attr("style","background:#23C279");
				    	          $("input").val("");
				    	          $(".show-message").html("<font color=red>*</font>")
		            	      }else{
		            	    	  $("#email-message").html("<font color=red>*邮箱已绑定</font>");
		            	      }
		            }    
		            	  },
		        error : function() {
		            $.message.alert('提示', '请求失败！', 'error');
		        }
		    });
		}
	})
	
	$("input").blur(function(){
		validateEmail();
	})
	
	function validateEmail() {  
	    var value = $("#user-email").val().trim();//获取输入框内容  
	      /*-------------1. 非空校验*/  
	    if(!value) {  
	       $("#email-message").html("<font color=red>*邮箱不能为空</font>");
	       return false; 
	    }  
	     /*-------------3.验证格式*/
	    if (!value.match(/^\w+([-+.]\w+)*@\w+([-.]\w+)*\.\w+([-.]\w+)*$/)) { 
	    	
	    	$("#email-message").html("<font color=red>*邮箱格式不正确！</font>"); 
	    	return false;
	    	}
	    else{
	    	if($("#send-code").text()=="验证码"){
		    	$("#send-code").attr('disabled',false);
	    	}
	    	    $("#email-message").html("<font color='#08BF6A'>*邮箱格式输入正确！</font>");
	    	return true;
	    }
	   }
	
	function validateCode() {  
	    var value = $("#user-code").val().trim();//获取输入框内容  
	    var valueBack = $("#back-code").val().trim();  
	      /*-------------1. 非空校验*/  
	    if(!value) {  
	       $("#code-message").html("<font color=red>*请输入验证码</font>");
	       return false; 
	    }  
	     /*-------------3.验证格式*/
	    if (value != valueBack) { 
	    	$("#code-message").html("<font color=red>*验证码错误！</font>"); 
	    	return false;
	    	}
	    else{
	    	return true;
	    }
	   }
});




