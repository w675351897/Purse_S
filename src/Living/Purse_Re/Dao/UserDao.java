package Living.Purse_Re.Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import Living.Purse_Re.Domain.Admin;
import Living.Purse_Re.Domain.User;
import Living.Purse_Re.util.DBUtils;

/** 

* @author 作者 Living（王立伟）: 

* @version 创建时间：2019年10月20日 下午3:45:38 

* 类说明 

*/
public class UserDao {
	public List<User> searchUser(String userName) throws SQLException {
		List<User> userList = new ArrayList<User>();
		String sql = "select * from User where ";
		if(userName == null || ("".equals(userName.trim()))){
			return null;
		}
		
		sql = sql + " User_Name ='"+userName+"'";
		System.out.println(sql);
		Connection conn = DBUtils.getConnection();
		PreparedStatement pstat = conn.prepareStatement(sql);
		ResultSet rs = pstat.executeQuery();
		while (rs.next()) {
			User User = new User();
			User.setUsername(rs.getString("User_Name"));
			User.setPassword(rs.getString("User_Password"));
			User.setRole(rs.getInt("UserRole"));
			userList.add(User);
		}
		return userList;
	}
}
