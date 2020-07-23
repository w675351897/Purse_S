<%@page pageEncoding="utf-8" contentType="text/html;charset=utf-8"%>
<!doctype html>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"  %>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<html>

	<head>
		<meta charset="utf-8">
		<title></title>
		<meta name="viewport" content="width=device-width,initial-scale=1,minimum-scale=1,maximum-scale=1,user-scalable=no" />
		<link href="css/mui.css" rel="stylesheet" />
	</head>

	<body>
	<%String name=request.getParameter("name"); %>
	<script src="./js/jquery-1.7.2.min.js" type="text/javascript" charset="utf-8"></script>
		<script src="js/mui.js"></script>
		<script src="js/accountInsert.js"></script>
		
		<script type="text/javascript">
		
		</script>
		<div>
			<header class="mui-bar mui-bar-nav">
				<a class="mui-icon mui-action-menu" href="#offCanvasSide"></a>
				<h1 class="mui-title">账目创建</h1>
			</header>
		</div>
	<br/>
	<br/>
	<br/>
		<div>
		<form action="accountInsert">
			<table width="90%" border="1" cellspacing="2" cellpadding="2" align="center">
			<input name="name" type="hidden" value="<%out.print(name);%>"/>
				<tr>
					<td align="center">金额</td>
					<td>
						<div class="mui-numbox" style="width:100%">
						  <!-- "-"按钮，点击可减小当前数值 -->
						  <button class="mui-btn mui-numbox-btn-minus" type="button">-</button>
						  
						  <input class="mui-numbox-input" type="number" id="Account_Pirce" name="Account_Pirce"/>
						  <!-- "+"按钮，点击可增大当前数值 -->
						  
						  <button class="mui-btn mui-numbox-btn-plus" type="button">+</button>
						</div> 
						</td>
				</tr>
				<tr>
					<td align="center">用户名称</td>
					<td align="center" ><%out.print(name);%></td>
					</tr>
				<tr>
					<td align="center">交易类型</td>
					<td align="center">
						<select name="Account_Type" id="Account_Type" >
							<option value="1">一般</option>
							<option value="2">餐饮</option>
							<option value="3">购物</option>
							<option value="4">服饰</option>
							<option value="5">交通</option>
							<option value="6">娱乐</option>
							<option value="7">社交</option>
							<option value="8">居家</option>
							<option value="9">通讯</option>
						</select>
				</tr>
				<tr>
					<td align="center">日期</td>
					<td>
						<input type="date" name="Account_Date" id="Account_Date" />
						</td>
				</tr>
				<tr>
					<td align="center"> +/— </td>
					<td align="center">
						<select name="Account_PL" id="Account_PL">
							<option value="+">支出</option>
							<option value="-">收入</option>
						</select>
						</td>
					</tr>
					<tr>
						<td align="right">
							<br/>
							<!--<button type="button" data-loading-icon="mui-spinner mui-spinner-custom" class="mui-btn mui-btn-primary" onclick="checkInsert();">
							+记一笔</button> -->
							<input type="button" value="+记一笔" data-loading-icon="mui-spinner mui-spinner-custom" class="mui-btn mui-btn-primary" onclick="submit();">
							
							<br/>
							</td>
						<td align="center">
							<br/>
							<input type="button" value="取消" />
							<br/>
							</td>
					</tr>
					</table>
					</form>
		</div>
		
		
	</body>

</html>
