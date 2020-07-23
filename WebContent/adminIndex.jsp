<%@page pageEncoding="utf-8" contentType="text/html;charset=utf-8"%>
<!doctype html>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"  %>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<html>
	<head>
		<meta charset="utf-8">
		<title></title>
		<meta name="viewport" content="width=device-width,initial-scale=1,minimum-scale=1,maximum-scale=1,user-scalable=no" />
		<link href="css/mui.css" rel="stylesheet" />
		<!-- <script src="js/adminIndex.js"></script> -->
		<css>
		
		</css>
	</head>

	<body>
		<%String name=request.getParameter("name"); %>
		
		<c:forEach items="${requestScope.userCheckList}" var="userCheck" varStatus="status">
			<form action="UserDelete">
				<input name="name" type="hidden" value="<%out.print(name);%>"/>
				<input name="id" type="hidden" value="${userCheck.user_Id}"/>
				<ul class="mui-table-view">
				    <li  class="mui-table-view-cell">
				    
				    <table style="width:100%">
				    	<tr style="width:100%">
				    	<td style="width:30%">
					   ${userCheck.user_Name}
					   </td>
					   <td style="width:30%">
					   </td>
					   <td style="width:30%; text-align:right">			 
					    <input  type="button" value="Delete" onclick="submit();"/>
					    </td>
					    </tr>
					</table>
					
				    </li>
			    </ul>
		    </form>
		</c:forEach>
		
		<script src="js/mui.js"></script>
		<script type="text/javascript">
			mui.init()
		</script>
		
	</body>

</html>
