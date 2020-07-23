package Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.alibaba.fastjson.JSON;

import Domain.UserCheck;
import Util.DBUtils;

/** 

* @author 作者 Living（王立伟）: 

* @version 创建时间：2019年12月20日 下午11:02:55 

* 类说明 

*/
public class UserCheckDao {
	public List<UserCheck>searchUser()throws SQLException{
		List<UserCheck> userCheckList = new ArrayList<UserCheck>();
		String sql = "select * from User";
		System.out.println(sql);
		
		Connection conn = DBUtils.getConnection();
		PreparedStatement pstat = conn.prepareStatement(sql);
		ResultSet rs = pstat.executeQuery();
		
		while(rs.next()) {
			UserCheck usercheck = new UserCheck();
			usercheck.setUser_Id(rs.getInt("User_Id"));
			usercheck.setUser_Name(rs.getString("User_Name"));
			usercheck.setUser_Password(rs.getString("User_Password"));
			
			userCheckList.add(usercheck);
			System.out.println("get UserCheck = "+JSON.toJSONString(userCheckList));
		}
		return userCheckList;
	}

}
