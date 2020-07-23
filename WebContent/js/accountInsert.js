function checkInsert(){
	if($("#account_price").val()=="0"){				
		alert("账目金额不得为0。");				
		return false;			
		}				
	if($("#account_date").val()==""){				
		alert("请填写日期时间。");				
		return false;			
	}				
	alert($("#account_price"));
	alert($("#account_type"));
	alert($("#account_date"));
	alert($("#account_type"));
	$.ajax({
		type:"get",
		url:"accountInsert",
		data:{
			"name":$("#name").val(),
			"Account_Price":$("#account_price").val(),
			"Account_Type":$("#account_type").val(),
			"Account_Date":$("#account_date").val(),
			"Account_Type":$("#account_type").val(),
		},
		dataType:"json",
		success:function(result){
			alert(result.success);
			if(result.success=="true"){
				alert(result.errMessage);
				window.location.href="/Purse_RE_Shame/UserData?name="+$("#name").val();
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

	