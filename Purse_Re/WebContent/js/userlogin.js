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
					window.location.href="menu.html"
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
function register(){
	window.location.href="/register.html";
}