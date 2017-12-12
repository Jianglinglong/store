/*+++++++++++++++++手机注册开始++++++++++++++++++++++++++++++*/ 

/*<!-- sendMobileCode获取验证码按钮script事件 *************************-->*/


/*--------------------------------手机注册获取验证码-----------------------------*/
function sendMobileCode(){
	
/*---------------------点击倒计时---------------------------------------*/
		$(function(){

			
		    $("#dyMobileButton").attr('disabled',true);    //当点击后倒计时时候不能点击此按钮 
		    var time = 60;  //倒计时60秒 
		    var timer = setInterval(fun1, 1000);  //设置定时器 

		    function fun1() { 
		        time--; 
		        if(time>=0) { 
		        	
		        	/*dyMobileButton.innerHTML = time + "s后重新发送"; */
		        	$("#dyMobileButton").text(time+"s后重新发送") ;
		        }else{ 
		        	$("#dyMobileButton").text("重新发送验证码") ;
		        	$("#dyMobileButton").attr('disabled',false); //倒计时结束能够重新点击发送的按钮 
		        	
		          clearTimeout(timer);  //清除定时器 
		          time = 60;  //设置循环重新开始条件 
		        } 
		      } 
		});
/*---------------------点击倒计时结束---------------------------------------*/		
  
		/*----------------------获取后台验证码------------------------------------------------*/
		$(function() {
			var valueAccount = $("#userAccount").val();
		    $.ajax({
		    	 url: "register/sendsms.do?userAccount="+valueAccount,
		         async: false,
		         type: 'POST',
		         dataType: 'json',
		         timeout: 1000,
		         cache: false,
		         success : function(data) {
		           if(data != null ){
		            	      if(!data.trueOrFalse){
		            	    	 $("#obtainCodePhone").val(data.sendsmsNum);
		            	    	 $("#error").html("<font color='#08BF6A'>用户可注册</font>"); 
		            	      }else{
		            	    	  $("#error").html("<font color=red>*用户已存在</font>");
		            	      }
		            }else{
		            	$("#error").html("<font color=red>*发送验证码失败</font>") ;
		                }       
		            	  },
		        error : function() {
		            $.message.alert('提示', '请求失败！', 'error');
		        }
		    });
		});
		/*----------------------获取后台验证码结束------------------------------------------------*/

		
}
/*--------------------------------获取验证码结束-----------------------------*/





/*---------------------表单验证-------------------------*/
$(function(){
		 

     /* 1.输入框得到焦点隐藏错误信息 */   
    $("input").focus(function() {  
      
    });  
       /* 1 */
     /* 2. 输入框失去焦点进行校验 */
    $("input").mouseenter(function() {  
    	 var id = $(this).attr("id");//获取当前输入框的id  
         var funName = "validate" + id.substring(0,1).toUpperCase() + id.substring(1) + "()";//得到对应的校验函数名  
         eval(funName);//执行函数调用  
    });  
	
/*手机注册名校验方法 -------------------------------------------*/	   
function validateUserAccount() {  
	var id = "userAccount";  
    var value = $("#" + id).val();//获取输入框内容  
     
      /*-------------1. 非空校验*/ 
      
    if(!value) {  
       $("#error").html("<font color=red>*手机号码不能为空</font>");
       $("#dyMobileButton").attr('disabled',true);
       return false; 
    }  
     
    /* ------------2. 长度校验*/ 
       
    else if(value.length != 11) {  
      $("#error").html("<font color=red>*手机号码长度错误！</font>");
      $("#dyMobileButton").attr('disabled',true);
      return false; 
    }  
    
     /*-------------3.验证格式*/
     
    else if (!value.match(/^(((13[0-9]{1})|(14[0-9]{1})|(17[0,3,7]{1})|(15[0-3]{1})|(15[5-9]{1})|(18[0-9]{1}))+\d{8})$/)) { 
    	$("#error").html("<font color=red>*手机号码格式错误！</font>"); 
    	$("#dyMobileButton").attr('disabled',true);
    	return false;
    	}
    else{
    	if($("#dyMobileButton").text()== "获取手机验证码"){
    		$("#dyMobileButton").attr('disabled',false);
    	}
    	
    }
     
   }
/*手机注册名校验方法-----结束 -------------------------------------------*/

/*手机注册密码校验方法-----  -------------------------------------------*/
function validateUserPassword() {  
    var id = "userPassword";  
    var value = $("#" + id).val();//获取输入框内容  
      /*-------------1. 非空校验*/ 
    if(!value) {  
       $("#error").html("<font color=red>*密码不能为空</font>");
       return false; 
    }  
     
    /* ------------2. 长度校验*/ 
       
    else if(value.length < 8 || value.length > 16) {  
      $("#error").html("<font color=red>*密码长度为7-16位！</font>");
      return false; 
    }  
     /*-------------3.验证格式*/
     
    else if (!value.match(/[a-zA-Z][a-zA-Z0-9]{3,15}/)) { 
    	$("#error").html("<font color=red>*密码格式不正确！</font>"); 
    	return false;
    	}
    else{
    	if($("#dyMobileButton").text()== "获取手机验证码"){
    		$("#dyMobileButton").attr('disabled',false);
    	}
    	$("#error").html(""); 
    	
    }
     
   }
/*手机注册密码校验方法-----结束 -------------------------------------------*/


/*手机验证码校验方法-----  -------------------------------------------*/
function validateCode() {  
    var id = "code";
    var obtainCodePhone = $("#obtainCodePhone").val();
    var value = $("#" + id).val();//获取输入框内容  
      /*-------------1. 非空校验*/ 
    if(!value) {  
       $("#error").html("<font color=red>*验证码不能为空</font>");
       return false; 
    }
    else{
    	if($("#dyMobileButton").text()== "获取手机验证码"){
    		$("#dyMobileButton").attr('disabled',false);
    	}
    	$("#error").html(" "); 
    }
    
   }
/*手机验证码校验方法-----结束 -------------------------------------------*/

/*手机确认校验方法-----  -------------------------------------------*/
function validatePasswordRepeat() {  
    var id2 = "userPassword";  
    var id3 = "passwordRepeat";  
    var value2 = $("#" + id2).val().trim();//获取输入框内容  
    var value3 = $("#" + id3).val().trim();//获取输入框内容  
      /*-------------1. 非空校验*/ 
    if(value2 != value3) {  
       $("#error").html("<font color=red>*两次密码不同</font>");
       return false; 
    }  
    else{
    	if($("#dyMobileButton").text()== "获取手机验证码"){
    		$("#dyMobileButton").attr('disabled',false);
    	}
    	$("#error").html(" "); 
    }
   }
/*手机确认密码校验方法-----结束 -------------------------------------------*/

/*邮箱注册名校验方法 -------------------------------------------*/	   
function validateUserAccountEmail() {  
    var id = "userAccountEmail";  
    var value = $("#" + id).val();//获取输入框内容  
     
      /*-------------1. 非空校验*/ 
      
    if(!value) {  
       $("#error").html("<font color=red>*邮箱不能为空</font>");
       return false; 
    }  
  
     /*-------------3.验证格式*/
     
    else if (!value.match(/^\w+([-+.]\w+)*@\w+([-.]\w+)*\.\w+([-.]\w+)*$/)) { 
    	
    	$("#error").html("<font color=red>*邮箱格式不正确！</font>"); 
    	return false;
    	}
    else{
    	if($("#dyMobileButton").text()== "获取手机验证码"){
    		$("#dyMobileButton").attr('disabled',false);
    	}
    	$("#error").html(" ");
    	$.ajax({
	    	 url: "register/sendUser.do?userAccount="+value,
	         async: false,
	         type: 'POST',
	         dataType: 'json',
	         timeout: 1000,
	         cache: false,
	         success : function(data)
	         {
		           if(data != null )
		           {
	            	      if(data.trueOrFalse)
	            	      {
	            	    	  $("#error").html("<font color=red>*用户已存在</font>") ;
	            	    	  flag=false;
	            	      }else{
				            	$("#error").html("<font color='#08BF6A'>用户可注册</font>") ;
				            }    
		            }
	         },
      });
    }
    
    
     
   }
/*邮箱注册名校验方法-----结束 -------------------------------------------*/

/*邮箱注册密码校验方法-----  -------------------------------------------*/
function validateUserPasswordEmail() {  
    var id = "userPasswordEmail";  
    var value = $("#" + id).val();//获取输入框内容  
      /*-------------1. 非空校验*/ 
    if(!value) {  
       $("#error").html("<font color=red>*密码不能为空</font>");
       return false; 
    }  
     
    /* ------------2. 长度校验*/ 
       
    else if(value.length < 8 || value.length > 16) {  
      $("#error").html("<font color=red>*密码为7-16位！</font>");
      return false; 
    }  
     /*-------------3.验证格式*/
     
    else if (!value.match(/[a-zA-Z][a-zA-Z0-9]{3,15}/)) { 
    	$("#error").html("<font color=red>*密码格式不正确！</font>"); 
    	return false;
    	}
    else{
    	if($("#dyMobileButton").text()== "获取手机验证码"){
    		$("#dyMobileButton").attr('disabled',false);
    	}
    	$("#error").html(" "); 
    }
     
   }
/*邮箱注册密码校验方法-----结束 -------------------------------------------*/

/*邮箱确认校验方法-----  -------------------------------------------*/
function validatePasswordRepeatEmail() {
    var id2 = "userPasswordEmail";  
    var id3 = "passwordRepeatEmail";  
    var value2 = $("#" + id2).val().trim();//获取输入框内容  
    var value3 = $("#" + id3).val().trim();//获取输入框内容  
      /*-------------1. 非空校验*/ 
    if(!value3){
      	 $("#error").html("<font color=red>*请确认密码</font>");
      }
    else if(value2 != value3) {  
       $("#error").html("<font color=red>*两次输入不同</font>");
       return false; 
    }  
    else{
    	if($("#dyMobileButton").text()== "获取手机验证码"){
    		$("#dyMobileButton").attr('disabled',false);
    	}
    	$("#error").html(" "); 
    }
   }
/*邮箱确认密码校验方法-----结束 -------------------------------------------*/
})


/*-----------------表单验证结束-----------------*/



/*--------------------手机注册霸王条约----------------------------------------------*/
$(function(){
	 /*------------手机注册按钮-----------*/
	$("#reader-mePhone").change(function() {   
	    if($(this).prop("checked")){  
	        $("#checkedRegisterPhone").attr('disabled',false);//按钮可用  
	    }  
	    else{  
	        $("#checkedRegisterPhone").attr('disabled',true);//按钮不可用  
	    }   
	}); 	
}); 
/*--------------------手机注册霸王条约结束----------------------*/	
	
	
	/******************************手机提交时验证**********************************/
$(function(){
	/*-------------------手机注册提交--------------------------------*/
	$("#checkedRegisterPhone").click(function(){
		
		/*--------------------------------验证手机------------------*/
			var id = "userAccount";  
		    var value = $("#" + id).val().trim();//获取输入框内容  
		      /*-------------1. 非空校验*/ 
		    if(!value) {  
		       $("#error").html("<font color=red>*手机号码不能为空</font>");
		       $("#dyMobileButton").attr('disabled',true);
	           return  false; 
		    }  
		    /* ------------2. 长度校验*/  
		    else if(value.length != 11) {  
		      $("#error").html("<font color=red>*手机号码长度为11位！</font>");
		      $("#dyMobileButton").attr('disabled',true);
		      return  false;
		    }  
		    
		     /*-------------3.验证格式*/
		    else if (!value.match(/^(((13[0-9]{1})|(14[0-9]{1})|(17[0,3,7]{1})|(15[0-3]{1})|(15[5-9]{1})|(18[0-9]{1}))+\d{8})$/)) { 
		    	
		    	$("#error").html("<font color=red>*手机号码格式不正确！</font>"); 
		    	$("#dyMobileButton").attr('disabled',true);
		    	return  false;
		    	}
		    else{
		    	if($("#dyMobileButton").text() != "获取手机验证码"){
		    		$("#dyMobileButton").attr('disabled',true);
		    	}else{
		    		$("#dyMobileButton").attr('disabled',false);
		    	}
		    	$("#error").html(" "); 
		    }
		    
		   
		    $.ajax({
			    	 url: "register/sendUser.do?userAccount="+value,
			         async: false,
			         type: 'POST',
			         dataType: 'json',
			         timeout: 1000,
			         cache: false,
			         success : function(data)
			         {
				           if(data != null )
				           {
			            	      if(data.trueOrFalse)
			            	      {
			            	    	  $("#error").html("<font color=red>*用户已存在</font>");
			            	    	  return false;
			            	      }
				            }    
			         },
		       });
	/*	    设置手机号码与用户名相同*/
		     $("#userPhone-phone").val(value);
		    
			   
			/*注册名校验方法-----结束 -------------------------------------------*/
		   
			/*注册密码校验方法-----  -------------------------------------------*/
			    id = "userPassword";  
			    value = $("#" + id).val().trim();//获取输入框内容  
			      /*-------------1. 非空校验*/ 
			    if(!value) {  
			       $("#error").html("<font color=red>*密码不能为空</font>");
			       return  false;
			    }  
			    /* ------------2. 长度校验*/   
			    else if(value.length <8 || value.length > 16) {  
			      $("#error").html("<font color=red>*密码长度必须为7-16位！</font>");
			      return  false;
			    }  
			     /*-------------3.验证格式*/
			    else if (!value.match(/[a-zA-Z][a-zA-Z0-9]{3,15}/)) { 
			    	$("#error").html("<font color=red>*密码格式不正确！</font>"); 
			    	return  false;
			    	}
			    else{
			    	if($("#dyMobileButton").text()== "获取手机验证码"){
			    		$("#dyMobileButton").attr('disabled',false);
			    	}
			    	$("#error").html(" "); 
			    } 
			   
			/*注册密码校验方法-----结束 -------------------------------------------*/

			/*验证码校验方法-----  -------------------------------------------*/ 
			    var id2 = "code".trim();  
		        var id3 = "obtainCodePhone".trim();  
		        var value2 = $("#" + id2).val().trim();//获取输入框内容  
		        var value3 = $("#" + id3).val().trim();//获取输入框内容 
			      /*-------------1. 非空校验*/ 
			    if(!value2) {  
			       $("#error").html("<font color=red>*验证码不能为空</font>");
			       return false; 
			    }  
			    else if(value2 != value3){
			    	$("#error").html("<font color=red>*验证码错误</font>");
			    	return  false; 
			    }
			/*验证码校验方法-----结束 -------------------------------------------*/

			    /*确认校验方法-----  -------------------------------------------*/
			        id2 = "userPassword".trim();  
			        id3 = "passwordRepeat".trim();  
			        value2 = $("#" + id2).val().trim();//获取输入框内容  
			        value3 = $("#" + id3).val().trim();//获取输入框内容  
			          /*-------------1. 非空校验*/
			       if(!value3){
                   	 $("#error").html("<font color=red>*请输入确认密码</font>");
                   }
			        else if(value2 != value3) {  
			           $("#error").html("<font color=red>*两次密码不同</font>");
			           return  false; 
			        } 
			        else{
			        	if($("#dyMobileButton").text()== "获取手机验证码"){
			        		$("#dyMobileButton").attr('disabled',false);
			        	}
			        	$("#formPhone").submit();
			        	return true;
			        }
			    
			
		})
		/*确认密码校验方法-----结束 -------------------------------------------*/
		
		
		
/*----------------------------邮箱注册提交时验证-------------------*/
		
$("#checkedRegisterEmail").click(function(){
			
			/*--------------------------------验证邮箱------------------*/
				var id = "userAccountEmail";  
			    var value = $("#" + id).val().trim();//获取输入框内容  
			      /*-------------1. 非空校验*/ 
			    if(!value) {  
			       $("#error").html("<font color=red>*邮箱不能为空</font>");
		           return  false; 
			    }  
			    
			     /*-------------3.验证格式*/
			    else if (!value.match(/^\w+([-+.]\w+)*@\w+([-.]\w+)*\.\w+([-.]\w+)*$/)) {
			    	
			    	$("#error").html("<font color=red>*邮箱格式不正确！</font>"); 
			    	return  false;
			    	}
			    else{
			    	var flag = true;
			    	$.ajax({
				    	 url: "register/sendUser.do?userAccount="+value,
				         async: false,
				         type: 'POST',
				         dataType: 'json',
				         timeout: 1000,
				         cache: false,
				         success : function(data)
				         {
					           if(data != null )
					           {
					        	   if(data.trueOrFalse){
                                          /*alert("查询前");*/
				            	    	  $("#error").html("<font color=red>*用户已存在</font>") ;
				            	    	  /*alert("查询后");*/
				            	    	  flag = false;
					        	   }else{
					        		   $("#error").html("<font color='#08BF6A'>*可以注册</font>") ;
					        	   }
					            }
				         },
			       });
			    	
			    	if(!flag){
			    		return false;
			    	}
			    }
			   
			    
		/*	    设置邮箱与用户名相同*/
			     $("#userEmaill-email").val(value);
				/*邮箱注册名校验方法-----结束 -------------------------------------------*/
			   
			     
				/*邮箱注册密码校验方法-----  -------------------------------------------*/
				    id = "userPasswordEmail";  
				    value = $("#" + id).val().trim();//获取输入框内容  
				      /*-------------1. 非空校验*/ 
				    if(!value) {  
				       $("#error").html("<font color=red>*密码不能为空</font>");
				       return  false;
				    }  
				    /* ------------2. 长度校验*/   
				    else if(value.length <8 || value.length > 16) {  
				      $("#error").html("<font color=red>*密码长度为7-16位！</font>");
				      return  false;
				    }  
				     /*-------------3.验证格式*/
				    else if (!value.match(/[a-zA-Z][a-zA-Z0-9]{3,15}/)) { 
				    	$("#error").html("<font color=red>*密码格式不正确！</font>"); 
				    	return  false;
				    	}
				    else{
				    	$("#error").html(" "); 
				    } 
				   
				/*邮箱注册密码校验方法-----结束 -------------------------------------------*/

				    /*邮箱注册确认校验方法-----  -------------------------------------------*/
				        id2 = "userPasswordEmail".trim();  
				        id3 = "passwordRepeatEmail".trim();  
				        value2 = $("#" + id2).val().trim();//获取输入框内容  
				        value3 = $("#" + id3).val().trim();//获取输入框内容  
                        if(!value3){
                        	 $("#error").html("<font color=red>*请输入确认密码</font>");
                        }
				        else if(value2 != value3) {  
				           return  false; 
				        } 
				        else{
				        	$("#formEmail").submit();
				        	return true;
				        }
				    
				
			})
			/*确认密码校验方法-----结束 -------------------------------------------*/
		
/*++++++++++++++++++++邮箱注册提交时验证+++++++++++*/
	
});
/*--------------------------提交时验证结束------------------------------*/
	

/*-************************************手机注册结束****************************-*/ 



	
	/*---------------------邮箱验证-------------------------*/


	/*--------------------邮箱注册霸王条约----------------------------------------------*/
	$(function(){
		/*-------------邮箱注册按钮-------------*/
		$("#reader-meEmail").change(function() {   
		    if($(this).prop("checked")){  
		        $("#checkedRegisterEmail").attr('disabled',false);//按钮可用  
		    }  
		    else{  
		        $("#checkedRegisterEmail").attr('disabled',true);//按钮不可用  
		    }   
		}); 
	}); 
	/*--------------------邮箱注册霸王条约结束----------------------*/	

/*+**************************************邮箱注册结束****************************************+*/








