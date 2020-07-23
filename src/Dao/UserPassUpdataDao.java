package Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import Domain.UserPassUpdata;
import Util.DBUtils;

/** 

* @author 作者 Living（王立伟）: 

* @version 创建时间：2019年12月10日 下午3:01:39 

* 类说明 

*/
public class UserPassUpdataDao {
public static void updata(UserPassUpdata userPassUpdata)throws SQLException  {
		
		String name = userPassUpdata.getName();
		String newpass = userPassUpdata.getNewpass();
		
		
		String sql = "update clients set client_pass = '"+newpass+"' where client_name = '"+name+"'";
		
		System.out.println(sql);
		
		Connection conn = DBUtils.getConnection();
		PreparedStatement pstat = conn.prepareStatement(sql);

		pstat.executeUpdate();
		
	}
}
