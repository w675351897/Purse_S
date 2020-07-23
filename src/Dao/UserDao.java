package Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import Domain.User;
import Util.DBUtils;

/** 

* @author 作者 Living（王立伟）: 

* @version 创建时间：2019年11月13日 下午7:37:25 

* 类说明 

*/
public class UserDao {
	public List<User> searchUser(String UserName)throws SQLException{
		List<User> userList = new ArrayList<User>();
		
		String sql = "select * from User where ";
//		String sql = "creat table "+UserName+" ";
		
		if(UserName == null || ("".equals(UserName.trim()))){
			return null;
		}
		sql = sql + " User_Name ='"+UserName+"'";
		System.out.println(sql);
		
		Connection conn = DBUtils.getConnection();
		PreparedStatement pstat = conn.prepareStatement(sql);
		ResultSet rs = pstat.executeQuery();
		
		while (rs.next()) {
			User User = new User();
			User.setUser_Name(rs.getString("User_Name"));
			User.setUser_Password(rs.getString("User_Password"));
//			User.setRole(rs.getInt("UserRole"));
//			用户权限功能暂不开放
			userList.add(User);
		}
		
		return userList;
	}
	public void CreatUser() {
		
	}

}
