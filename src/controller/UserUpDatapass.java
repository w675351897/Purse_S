package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Domain.UserPassUpdata;
import Service.UserPassUpdataService;

/** 

* @author 作者 Living（王立伟）: 

* @version 创建时间：2019年12月10日 下午2:55:40 

* 类说明 
	更新密码
*/
public class UserUpDatapass extends HttpServlet{
	
		public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			doPost(request, response);
		}
	@Override
		protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			// TODO Auto-generated method stub
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=" + "utf-8");

		String name = request.getParameter("name");
		String newpass = request.getParameter("newpass");



		UserPassUpdata userPassUpdata = new UserPassUpdata();
		userPassUpdata.setName(name);
		userPassUpdata.setNewpass(newpass);

		UserPassUpdataService userPassUpdataService = new UserPassUpdataService();
		userPassUpdataService.updata(userPassUpdata);
		

		response.sendRedirect("login.jsp");
			
		}
}
