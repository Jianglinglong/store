

 

/*-------------------------------------表单验证-----------------------------------------------------------*/
 $(function(){
      /* 1.输入框得到焦点隐藏错误信息 */   
    $("input.informationUser").focus(function() {  
    	
    });  
         
     /* 2. 输入框失去焦点进行校验 */
    $("input.informationUser").blur(function() {
        var id = $(this).attr("id");//获取当前输入框的id  
        var funName = "validate" + id.substring(0,1).toUpperCase() + id.substring(1) + "()";//得到对应的校验函数名  
        eval(funName);//执行函数调用  
    });  
	
/*昵称校验方法 -------------------------------------------*/	   
function validateUserName() {  
    var id = "userName";  
    var value = $("#" + id).val();//获取输入框内容  
     
      /*-------------1. 非空校验*/ 
    if(!value) {  
       $("#userNameLabel").text("*昵称不能为空");
       return false; 
    }  
     
    /* ------------2. 长度校验*/   
    else if(value.length < 2 || value.length > 20) {  
      $("#userNameLabel").text("*昵称必须为4-20个字符");
      return false; 
    }  
    
     /*-------------3.验证格式*/ 
    else if (!value.match(/^[\u4e00-\u9fa5A-Za-z0-9_]*$/)) { 
    	$("#userNameLabel").text("昵称格式不正确，不能包含特殊字符"); 
    	return false;
    	}
    else{
    	$("#userNameLabel").text("*"); 
    }
   }
/*昵称校验方法-----结束 -------------------------------------------*/

/*姓名校验方法-----  -------------------------------------------*/
function validateUserRealname() {  
    var id = "userRealname";  
    var value = $("#" + id).val();//获取输入框内容  
      /*-------------1. 非空校验*/ 
    if(!value) {  
       $("#userRealnameLabel").text("*姓名不能为空");
       return false; 
    }  
     
    /* ------------2. 长度校验*/ 
       
    else if(value.length < 2 || value.length > 16) {  
      $("#userRealnameLabel").text("*姓名长度必须为2-16位");
      return false; 
    }  
     /*-------------3.验证格式*/
     
    else if (!value.match(/^[\u4E00-\u9FA5]{1,6}$/)) { 
    	$("#userRealnameLabel").text("*姓名只能为中文！"); 
    	return false;
    	}
    else{
    	$("#userRealnameLabel").text("*"); 
    }
     
   }
/*姓名校验方法-----结束 -------------------------------------------*/


/*手机校验方法-----  -------------------------------------------*/
function validateUserPhone() {  
	var id = "userPhone";  
    var value = $("#" + id).val();//获取输入框内容  
     
      /*-------------1. 非空校验*/ 
      
    if(!value) {  
       $("#userPhoneLabel").text("*手机号码不能为空");
       return false; 
    }  
     
    /* ------------2. 长度校验*/ 
       
    else if(value.length != 11) {  
      $("#userPhoneLabel").text("*手机号码长度必须为11位！");
      return false; 
    }  
    
     /*-------------3.验证格式*/
     
    else if (!value.match(/^(((13[0-9]{1})|(14[0-9]{1})|(17[0,3,7]{1})|(15[0-3]{1})|(15[5-9]{1})|(18[0-9]{1}))+\d{8})$/)) { 
    	$("#userPhoneLabel").text("*手机号码格式不正确！"); 
    	return false;
    	}
    else{
    	$("#userPhoneLabel").text("*"); 
    }
    
   }
/*手机校验方法-----结束 -------------------------------------------*/

/*邮箱校验方法-----  -------------------------------------------*/
function validateUserEmail() {  
    var id = "userEmail";  
    var value = $("#" + id).val();//获取输入框内容  
      /*-------------1. 非空校验*/ 
    if(!value) {  
       $("#userEmaillLabel").text("*邮箱不能为空");
       return false; 
    }  
     /*-------------3.验证格式*/
    else if (!value.match(/^\w+([-+.]\w+)*@\w+([-.]\w+)*\.\w+([-.]\w+)*$/)) { 
    	$("#userEmaillLabel").text("*邮箱格式不正确！"); 
    	return false;
    	}
    else{
    	$("#userEmaillLabel").text("*");
    /*	$.ajax({
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
	            	    	  $("#error").text("用户已存在") ;
	            	    	  flag=false;
	            	      }else{
				            	
				            }    
		            }
	         },
      });*/
    }
  
   }
/*邮箱校验方法-----结束 -------------------------------------------*/
     
})










/*---------------------表单提交验证-------------------------------------*/

$(function(){
	$("#formButton").click(function(){
/*提交昵称验证-------------------------------*/
	var id = "userName";  
    var value = $("#" + id).val();//获取输入框内容  
     
      /*-------------1. 非空校验*/ 
    if(!value) {  
       $("#userNameLabel").text("*昵称不能为空");
       return false; 
    }  
     
    /* ------------2. 长度校验*/   
    else if(value.length < 4 || value.length > 20) {  
      $("#userNameLabel").text("*昵称必须为4-20个字符");
      return false; 
    }  
    
     /*-------------3.验证格式*/ 
    else if (!value.match(/^[\u4e00-\u9fa5A-Za-z0-9_]*$/)) { 
    	$("#userNameLabel").text("*昵称格式不正确，不能包含特殊字符！"); 
    	return false;
    	}
    else{
    	$("#userNameLabel").text(""); 
    }
/*提交姓名验证-------------------------------*/
    id = "userRealname";  
    value = $("#" + id).val();//获取输入框内容  
      /*-------------1. 非空校验*/ 
    if(!value) {  
       $("#userRealnameLabel").text("*姓名不能为空");
       return false; 
    }  
     
    /* ------------2. 长度校验*/ 
       
    else if(value.length < 2 || value.length > 16) {  
      $("#userRealnameLabel").text("*姓名长度必须为2-16位");
      return false; 
    }  
     /*-------------3.验证格式*/
     
    else if (!value.match(/^[\u4E00-\u9FA5]{1,6}$/)) { 
    	$("#userRealnameLabel").text("*姓名只能为中文！"); 
    	return false;
    	}
    else{
    	$("#userRealnameLabel").text("*"); 
    }
    
/*提交生日验证-------------------------------*/
    var birth = $("#sel1").val()+"-"+$("#sel2").val()+"-"+$("#sel3").val();
   
    if($("#sel1").val().length<4){
    	$("#userBirdthLabel").text("*请选择年份");
    	return false;
    }
    else if($("#sel2").val().length<1){
    	$("#userBirdthLabel").text("*请选择月份");
    	return false;
    }
    else if($("#sel3").val().length<1){
    	$("#userBirdthLabel").text("*请选择日期");
    	return false;
    }
    else{
    	$("#userBirth").val(birth);
    }
    /*提交手机验证-------------------------------*/
    id = "userPhone";  
    value = $("#" + id).val();//获取输入框内容  
     
      /*-------------1. 非空校验 */
      
    if(!value) {  
       $("#userPhoneLabel").text("*手机号码不能为空");
       return false; 
    }  
     
    /* ------------2. 长度校验 */
       
    else if(value.length != 11) {  
      $("#userPhoneLabel").text("*手机号码长度必须为11位！");
      return false; 
    }  
    
    /* -------------3.验证格式*/
     
    else if (!value.match(/^(((13[0-9]{1})|(14[0-9]{1})|(17[0,3,7]{1})|(15[0-3]{1})|(15[5-9]{1})|(18[0-9]{1}))+\d{8})$/)) { 
    	$("#userPhoneLabel").text("*手机号码格式不正确！"); 
    	return false;
    	}
    else{
    	$("#userPhoneLabel").text("*你的手机号码"); 
    }
/*提交邮箱验证-------------------------------*/
    id = "userEmail";  
    value = $("#" + id).val();//获取输入框内容  
     /* -------------1. 非空校验 */
    if(!value) {  
       $("#userEmaillLabel").text("邮箱不能为空");
       return false; 
    }  
 /*    -------------3.验证格式*/
    else if (!value.match(/^\w+([-+.]\w+)*@\w+([-.]\w+)*\.\w+([-.]\w+)*$/)) { 
    	$("#userEmaillLabel").text("*邮箱格式不正确！"); 
    	return false;
    	}
    else{
    	$("#userEmaillLabel").text("*");
    /*	全部验证通过：提交表单*/
    	$("#informationForm").submit();
    }


	})
})
/*++++++++++++++++++++++表单提交验证结束+++++++++++++++++++++++++++++++*/










/*上传头像*/
function fileUp(){
	    if(confirm("你确定要修改头像吗？")){
	    	 $.ajax({
	    		    url: 'personalData/upload.do',
	    		    type: 'POST',
	    		    cache: false,
	    		    data: new FormData($('#photo')[0]),
	    		    processData: false,
	    		     scriptCharset: 'utf-8',
	    		    contentType: false
	    		}).done(function(data) {
	    		    $("#photoImg").attr('src',data.userPhoto);
	    		}).fail(function(data) {
	    		     alert("修改头像失败");
	    		});
	    }
	   
            
}
 /*上传头像结束*/









 /*日期联动*/
$(function(){
         //生成日期
   function creatDate()
   {
     //生成1900年-2100年
     for(var i = 2016; i >= 1950; i--)
     {
       //创建select项
       var option = document.createElement('option');
       option.setAttribute('value',i);
       option.innerHTML = i;
       sel1.appendChild(option);
     }
     //生成1月-12月
     for(var i = 1; i <=12; i++){
       var option1 = document.createElement('option');
       option1.setAttribute('value',i);
       option1.innerHTML = i;
       sel2.appendChild(option1);
     }
     //生成1日—31日
     for(var i = 1; i <=31; i++){
       var option2 = document.createElement('option');
       option2.setAttribute('value',i);
       option2.innerHTML = i;
       sel3.appendChild(option2);
     }
   }
   creatDate();
   //保存某年某月的天数
   var days;
 
   //年份点击 绑定函数
   sel1.onclick = function()
   {
     //月份显示默认值
     sel2.options[0].selected = true;
     //天数显示默认值
     sel3.options[0].selected = true;
   }
   //月份点击 绑定函数
   sel2.onclick = function()
   {
     //天数显示默认值
     sel3.options[0].selected = true;
     //计算天数的显示范围
     //如果是2月
     if(sel2.value == 2)
     {
       //判断闰年
       if((sel1.value % 4 === 0 && sel1.value % 100 !== 0) || sel1.value % 400 === 0)
       {
         days = 29;
       }
       else
       {
         days = 28;
       }
       //判断小月
     }else if(sel2.value == 4 || sel2.value == 6 ||sel2.value == 9 ||sel2.value == 11){
       days = 30;
     }else{
       days = 31;
     }
 
     //增加或删除天数
     //如果是28天，则删除29、30、31天(即使他们不存在也不报错)
     if(days == 28){
       sel3.remove(31);
       sel3.remove(30);
       sel3.remove(29);
     }
     //如果是29天
     if(days == 29){
       sel3.remove(31);
       sel3.remove(30);
       //如果第29天不存在，则添加第29天
       if(!sel3.options[29]){
         sel3.add(new Option('29','29'),null)
       }
     }
     //如果是30天
     if(days == 30){
       sel3.remove(31);
       //如果第29天不存在，则添加第29天
       if(!sel3.options[29]){
         sel3.add(new Option('29','29'),null)
       }
       //如果第30天不存在，则添加第30天
       if(!sel3.options[30]){
         sel3.add(new Option('30','30'),null)
       }
     }
     //如果是31天
     if(days == 31){
       //如果第29天不存在，则添加第29天
       if(!sel3.options[29])
       {
         sel3.add(new Option('29','29'),null)
       }
       //如果第30天不存在，则添加第30天
       if(!sel3.options[30])
       {
         sel3.add(new Option('30','30'),null)
       }
       //如果第31天不存在，则添加第31天
       if(!sel3.options[31])
       {
         sel3.add(new Option('31','31'),null)
       }
     }
   }
})


/*-------------------------------------日期结束-------------------------------------------------------------*/




 
