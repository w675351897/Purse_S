function login(){
	
	$.ajax({
		type:"get",
		url:"adminLogin",
		data:{
			"username":$("#username").val(),
			"password":$("#password").val(),
			},
		dataType:"json",
		success:function(result){
			alert(result.success);
				if(result.success=="true"){
			
					alert(result.errMessage);
//					window.location.href=result.skip+"?name="+$("#username").val();
//					window.location.href="adminIndex.jsp"
					window.location.href="admin.jsp"+"?name="+$("#username").val();
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
function CallAdmin(){
	alert("管理员已经收到您的请求");
}