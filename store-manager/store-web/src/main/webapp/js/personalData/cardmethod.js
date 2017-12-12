$(function(){
	
	function validateOldPassword(){
		  var value = $("#userName").val().trim();
		  
		  var value = $("#userName").val().trim();
			if(!value) {  
			       $("#userName-message").html("<font color=red>*姓名不能为空</font>");
			       return false; 
			    }  
			     
			    /* ------------2. 长度校验*/  
			    else if(value.length > 30) {  
			      $("#userName-message").html("<font color=red>*姓名过长！</font>");
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

	
})
