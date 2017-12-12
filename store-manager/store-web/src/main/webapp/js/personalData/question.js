$(function(){ 
	
	$("#btn-up").click(function(){
		
		var flag = false;
		flag = validateQuesContextOne();
		if(flag = true){
			flag = validateUserAnswer1();
		}
		if(flag = true){
			flag = validateQuesContextTwo();
		}
		if(flag == true){
			flag = validateUserAnswer2();
		}
		if(flag == true){
			var quesOne = $("#quesContextOne").val().trim();
			var answerOne = $("#userAnswer1").val().trim();
			var quesTwo = $("#quesContextTwo").val().trim();
			var answerTwo = $("#userAnswer2").val().trim();
	
			
			$.ajax({
		    	 url:"personalData/setQuestion.do?quesOne="+quesOne+"&&answerOne="+answerOne+
		    	     "&&quesTwo="+quesTwo+"&&answerTwo="+answerTwo,
		         async: false,
		         type: 'POST',
		         dataType: 'json',
		         
		         timeout: 1000,
		         cache: false,
		         contentType: "charset=UTF-8",
		         success : function(data) {
		           if(data != null ){
		            	      if(data.trueOrFalse){
		            	    	     alert("成功");
			            	    	 $("#step-2").addClass("step-1").removeClass("step-2");
			            	    	 $("#u-progress-bar-total-steps-2").attr("style","background:#23C279");
		            	      }else{
		            	    	  $("#error").html("<font color=red>*设置失败</font>");
		            	    	  return false;
		            	      }
		            }      
		            	  },
		        error : function() {
		            $.message.alert('提示', '请求失败！', 'error');
		        }
		    });
		}
	})
	
	function validateQuesContextOne(){
		var value = $("#quesContextOne").val().trim();
		if(value == "a"){
			$("#quesContextOne-message").html("<font color=red>*请选择安全问题</font>")
			return false;
		}
		else{
			$("#quesContextOne-message").html("<font color=red>*</font>");
			return true;
		}
	}
	
    function validateUserAnswer1(){
    	var value = $("#userAnswer1").val().trim();
    	if(!value){
    		$("#userAnswer1-message").html("<font color=red>*请填写答案</font>")
    		return false;
    	}else{
    		$("#userAnswer1-message").html("<font color=red>*</font>");
    		return true;
    	}
    	
	}
    
    function validateQuesContextTwo(){
    	var value = $("#quesContextTwo").val().trim();
    	if(value == "a"){
    		$("#quesContextTwo-message").html("<font color=red>*请选择安全问题</font>")
    		return false;
    	}else{
    		$("#quesContextTwo-message").html("<font color=red>*</font>");
    		return true;
    	}
    	
    }
    
    function validateUserAnswer2(){
    	var value = $("#userAnswer2").val().trim();
    	if(!value){
    		$("#userAnswer2-message").html("<font color=red>*请填写答案</font>")
    		return false;
    	}else{
    		$("#userAnswer2-message").html("<font color=red>*</font>");
    		return true;
    	}
    	
	}
	
})