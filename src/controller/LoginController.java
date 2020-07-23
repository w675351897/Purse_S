package controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.alibaba.fastjson.JSON;

import Domain.Admin;
import Domain.Result;
import Service.AdminService;
/** 

* @author 作者 Living（王立伟）: 

* @version 创建时间：2019年11月8日 下午2:21:52 

* 类说明 

*/
@WebServlet("/adminLogin")
public class LoginController extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		
		AdminService adminService = new AdminService();
		List<Admin> adminList = adminService.searchAdmin(username);
		System.out.println("get service message ["+ JSON.toJSONString(adminList));
		
		Result result = new Result();
		
		if(adminList == null) {
			result.setSuccess("false");
			result.setErrMessage("Not REgisted|该用户不存在");
		}else if(
				adminList.get(0).getAdmin_Password().equals(password)
				) {
			result.setSuccess("true");
			result.setErrMessage("欢迎登录"+username);
			result.setSkip("/admin.jsp");
		}else {
			result.setSuccess("false");
			result.setErrMessage("PSWError|用户名密码错误");
		}
		response.getWriter().write(JSON.toJSONString(result));
		response.getWriter().flush();
		response.getWriter().close();
		
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doPost(req, resp);
	}
}
