package Living.Purse_Re.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.alibaba.fastjson.JSON;

import Living.Purse_Re.Domain.Admin;
import Living.Purse_Re.Domain.Result;
import Living.Purse_Re.Service.AdminService;

/** 

* @author 作者 Living（王立伟）: 

* @version 创建时间：2019年10月20日 下午3:47:49 

* 类说明 

*/

@WebServlet("/userLogin")
public class LoginController extends HttpServlet{
	public void doGet(HttpServletRequest request , HttpServletResponse response)
			throws ServletException, IOException {
		doPost(request, response);

	}
	public void doPost(HttpServletRequest request , HttpServletResponse response)
			throws ServletException, IOException {

		String Username = request.getParameter("username");
		String password = request.getParameter("password");
		
		System.out.println("get message from browse["+Username+"]["+password+"]");
		
		AdminService adminService = new AdminService();
		List<Admin> adminList = adminService.searchAdmin(Username);
		System.out.println("get service message ["+ JSON.toJSONString(adminList));
		
		Result result = new Result();
		
		if(adminList == null) {
			result.setSuccess("false");
			result.setErrMessage("Not REgisted|该用户不存在");
		}else if(adminList.get(0).getPassword().equals(password)) {
			result.setSuccess("true");
			result.setErrMessage("欢迎登录"+Username);
		}else {
			result.setSuccess("false");
			result.setErrMessage("PSWError|用户名密码错误");
		}
		response.getWriter().write(JSON.toJSONString(result));
		response.getWriter().flush();
		response.getWriter().close();
		
	}
}
