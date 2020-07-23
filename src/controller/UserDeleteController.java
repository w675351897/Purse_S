package controller;
/** 

* @author 作者 Living（王立伟）: 

* @version 创建时间：2019年12月23日 上午9:28:20 

* 类说明 
* 用于管理员删除用户

*/

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Domain.UserDelete;
import Service.UserDeleteService;

@WebServlet("/UserDelete")
public class UserDeleteController extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=" + "utf-8");

		String name = request.getParameter("name");
		String id = request.getParameter("id");

		System.out.println("get message from browse[" + name + "][" + id + "]");
		
		UserDelete userDelete = new  UserDelete();
		userDelete.setId(id);
		userDelete.setName(name);
		
		UserDeleteService userDeleteService = new UserDeleteService();
		userDeleteService.delte(userDelete);
//		???
//		request.getRequestDispatcher("/Purse_Shame/UserCheck?name=" + name).forward(request, response);
		response.sendRedirect("/Purse_RE_Shame/UserCheck?name=" + name);
		
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(req, resp);
	}

}
