/**
 * 
 */
package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Domain.UserDataDelete;
import Service.UserDataDeleteService;

/** 
* @author 作者 Living: 
* @version 创建时间：2019年12月25日 下午4:29:01 
* @Description
*/
@WebServlet("/UserDataDelete")
public class UserDataDeleteController extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=" + "utf-8");

		String name = request.getParameter("name");
		String account_Id = request.getParameter("id");
		System.out.println("get message from browse[" + name + "][" + account_Id + "]");
		
		UserDataDelete userDataDelete = new UserDataDelete();
		userDataDelete.setAccount_Id(account_Id);
		userDataDelete.setName(name);
		
		UserDataDeleteService userDateDeleteService = new UserDataDeleteService();
		userDateDeleteService.delete(userDataDelete);
		
		response.sendRedirect("/Purse_RE_Shame/UserData?name=" + name);
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(req, resp);
	}

}
