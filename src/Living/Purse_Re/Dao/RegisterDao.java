 package Living.Purse_Re.Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.alibaba.fastjson.JSON;

import Living.Purse_Re.Domain.Register;
import Living.Purse_Re.util.DBUtils;

/** 

* @author 作者 Living（王立伟）: 

* @version 创建时间：2019年10月23日 下午2:24:53 

* 类说明 

*/
public class RegisterDao {
	public void insertUser(Register reg)throws SQLException {
		String sql = "Insert Into User(User_Name,User_Password) value(?,?)";
		System.out.println(sql);
		
		Connection conn = DBUtils.getConnection();
		PreparedStatement pstat = conn.prepareStatement(sql);
		
		System.out.println("UpdateZXXXX  "+JSON.toJSONString(reg));

		pstat.setString(1,reg.getRegName());
		pstat.setString(2,reg.getRegPass());
		
		pstat.executeUpdate();
		
		
	}
	
}
