//function register(){
//	
//	if($("#username").val()==""){				
//		alert("用户名不能为空！");				
//		return false;			
//		}			
//	if($("#password").val()==""){				
//		alert("密码不能为空！");				
//		return false;			
//		}			
//	if($("#repassword").val()==""){				
//		alert("请再次输入密码！");				
//		return false;			
//		}	
//	if($("#repassword").val()!=$("#password").val()){				
//		alert("两次输入的密码不同！");				
//		return false;			
//		}			
//	
//	$.ajax({
//		type:"get",
//		url:"userRegister",
//		data:{
//			"username":$("#username").val(),
//			"password":$("#password").val(),
//		},
//		dataType:"json",
//		success:function(result){
//			alert(result.success);
//				if(result.success=="true"){
//					alert(result.errMessage);
//					window.location.href=$("#url").val()+result.skip+"?name="+$("#username").val();
//				}else{
//					alert(result.errMessage);
//				}
//			},
//			error:function(xhr,status,errMsg){
//				alert(errMsg)			
//				}
//			
//		})
//
//	return false;
//}