/*//图片自动预览
$(function(){
	 $("#picturePositive").change(function(){
            var $file = $(this);
            var fileObj = $file[0];
            var windowURL = window.URL || window.webkitURL;
            var dataURL;
            var $img = $("#imgPositive");
            //当图片名称为空时，照片不显示。
            if(document.getElementById('picturePositive').value.trim()==""){
                document.getElementById('tr_userpicture').style.display = 'none';
             }
            if (fileObj && fileObj.files && fileObj.files[0]) {
                dataURL = windowURL.createObjectURL(fileObj.files[0]);
                //允许上传的图片格式  
                var newPreview = document.getElementById("picturePositive").value;
                var regext = /\.jpg$|\.gif$|\.jpeg$|\.png$|\.bmp$/gi;
                if (!regext.test(newPreview)) {
                    newPreview=="";
                    alert("选择的照片格式不正确，请重新选择！");
                     $(fileObj).after($(fileObj).clone($(fileObj)));
                      $(fileObj).remove();
                      $("#tr_userpicture").hide();
                    return false;
                }
                
                	$img.attr("src", dataURL);
                
                alert(dataURL);
                $("#tr_userpicture").show();

            } else {
                dataURL = $file.val();
                var imgObj = document.getElementById("imgPositive");

                imgObj.style.filter = "progid:DXImageTransform.Microsoft.AlphaImageLoader(sizingMethod=scale)";
                imgObj.filters.item("DXImageTransform.Microsoft.AlphaImageLoader").src = dataURL;
            }
        });
        
})*/






$(function(){
    
	$("input:file").change(function(){
		var $file = $(this);
		var fileObj = $file[0];
		var dataUrl = window.URL.createObjectURL(fileObj.files[0]);
		var fielId = $(this).attr("id");
		//允许上传的图片格式  
        var newPreview = document.getElementById(fielId).value;
        var regext = /\.jpg$|\.gif$|\.jpeg$|\.png$|\.bmp$/gi;
        if (!regext.test(newPreview)) {
            newPreview=="";
            alert("选择的照片格式不正确，请重新选择！");
             $(fileObj).after($(fileObj).clone($(fileObj)));
              $(fileObj).remove();
            return false;
        }
        if(fielId =="picturePositive"){
        	$("#imgPositive").attr("src",dataUrl);
        }else{
        	$("#imgBack").attr("src",dataUrl);
        }
	})
})


$(function(){    
	
	$("#upBtn").mouseenter(function(){
		var flag = true;
		if(flag){
			flag = validateUserRealname();
		}
		if(flag){
			flag = validateUserIdCard();
		}
	});
	
	$("#upBtn").click(function(){
		var flag = true;
		if(flag){
			flag = validateUserRealname();
		}
		if(flag){
			flag = validateUserIdCard();
		}
		if(flag){
			flag = validatePicture();
		}
		if(flag){
			alert("提交成功");
			$("#formUp").submit();
		}
	});
	
/* 2. 输入框失去焦点进行校验-------------------------------------- */
$("input.idCardUser").mouseenter(function() {
	var flag = true;
	if(flag){
		flag = validateUserRealname();
	}
	if(flag){
		flag = validateUserIdCard();
	}

	
});
	
	
/*姓名校验方法-----  -------------------------------------------*/
function validateUserRealname() {  
 
    var value = $("#user-name").val();//获取输入框内容  
      /*-------------1. 非空校验*/ 
    if(!value) {  
       $("#userRealname-message").html("<font color=red>*姓名不能为空</font>");
       return false; 
    }  
     
    /* ------------2. 长度校验*/ 
       
    else if(value.length < 2 || value.length > 16) {  
      $("#userRealname-message").html("<font color=red>*姓名长度必须为2-16位</font>");
      return false; 
    }  
     /*-------------3.验证格式*/
     
    else if (!value.match(/^[\u4E00-\u9FA5]{1,6}$/)) { 
    	$("#userRealname-message").html("<font color=red>*姓名只能为中文！</font>"); 
    	return false;
    	}
    else{
    	$("#userRealname-message").html("<font color=red>*</font>"); 
    	return true;
    }
     
   }


function validateUserIdCard() {  
	var value = $("#userIDcard").val();//获取输入框内容  
	/*-------------1. 非空校验*/ 
	if(!value) {  
		$("#userIdCard-message").html("<font color=red>*身份证号不能为空</font>");
		return false; 
	}  
	/*-------------3.验证格式*/
	else if (!value.match(/(^\d{15}$)|(^\d{18}$)|(^\d{17}(\d|X|x)$)/)) { 
		$("#userIdCard-message").html("<font color=red>*身份证输入错误！</font>"); 
		return false;
	}
	else{
		$("#userIdCard-message").html("<font color=red>*</font>");
		return true;
	}
	
   }

function validatePicture() {  
	var picturePositive = $("#picturePositive").val();//获取输入框内容  
	var pictureBack = $("#pictureBack").val();//获取输入框内容  
	/*-------------1. 非空校验*/ 
	if(!picturePositive) {  
		alert("请上传身份证正面照片");
		return false; 
	}  
	/*-------------3.验证格式*/
	if (!pictureBack) { 
		alert("请上传身份证背面照片");
		return false;
	}
	else{
		return true;
	}
	
   }
})

















