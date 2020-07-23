package Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.alibaba.fastjson.JSON;

import Domain.Admin;
import Util.DBUtils;



/** 

* @author 作者 Living（王立伟）: 

* @version 创建时间：2019年11月8日 下午2:26:32 

* 类说明 

*/
public class AdminDao {
	public List<Admin> searchAdmin(String userName) throws SQLException{
		List<Admin> adminList = new ArrayList<Admin>();
		String sql = "select * from Admin where ";
		if(userName == null || ("".equals(userName.trim()))){
			return null;
		}
		sql = sql + " Admin_name ='"+userName+"'";
		System.out.println(sql);
		
		Connection conn = DBUtils.getConnection();
		PreparedStatement pstat = conn.prepareStatement(sql);
		ResultSet rs = pstat.executeQuery();
		
		while (rs.next()) {
			Admin admin = new Admin();
			System.out.println("00000000000000000000000000s"+rs.getString("Admin_Name"));
			admin.setAdmin_Name(rs.getString("Admin_Name"));
			admin.setAdmin_Password(rs.getString("Admin_Password"));
//			admin.setRole(rs.getInt("Admin_Role"));
			adminList.add(admin);
		}
		System.out.println("get in Dao admin = "+ JSON.toJSONString(adminList));
		return adminList;
	}

}
