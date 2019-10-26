package Living.Purse_Re.Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.alibaba.fastjson.JSON;

import Living.Purse_Re.Domain.Admin;
import Living.Purse_Re.util.DBUtils;

/** 

* @author 作者 Living（王立伟）: 

* @version 创建时间：2019年10月20日 下午3:45:32 

* 类说明 

*/
public class AdminDao {

	public List<Admin> searchAdmin(String userName) throws SQLException {
		List<Admin> adminList = new ArrayList<Admin>();
		/*
		 * 暂时用不上
		 * String sql = "create table client_TestName"
		 * +"(date varchar(20) key,date_height varchar(20),date_weight varchar(20),date_year varchar(20),BMR varchar(20),BMR_ratio varchar(20),date_carb varchar(20),date_Pr varchar(20),date_fat varchar(20))"
		 * ; System.out.println(sql);
		 * 
		 * Connection conn = DBUtils.getConnection(); PreparedStatement pstat =
		 * conn.prepareStatement(sql); pstat.executeUpdate();
		 */
		
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
			admin.setUsername(rs.getString("Admin_Name"));
			admin.setPassword(rs.getString("Admin_Password"));
			admin.setRole(rs.getInt("Admin_Role"));
			adminList.add(admin);
			
		}
		System.out.println("get in Dao admin = "+ JSON.toJSONString(adminList));
		return adminList;
	}

}
