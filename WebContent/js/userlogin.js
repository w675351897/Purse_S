function login(){
	
	$.ajax({
		type:"get",
		url:"userLogin",
		data:{
			"username":$("#username").val(),
			"password":$("#password").val(),
			},
		dataType:"json",
		success:function(result){
			alert(result.success);
				if(result.success=="true"){
			
					alert(result.errMessage);
//					window.location.href="userMain.jsp"
//					window.location.href=$("#url").val()+result.skip+"?name="+$("#username").val();
					window.location.href="user.jsp"+"?name="+$("#username").val();
				}else{
					alert(result.errMessage);
				}
			},
			error:function(xhr,status,errMsg){
				alert(errMsg)			
				}
			
		})
	return false;
}
//function CallAdmin(){
//	alert("管理员已经收到您的请求");
//}
function reg(){
	window.location.href="./reg.jsp"
	// window.location.href="./reg.html"
}