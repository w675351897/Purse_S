/**
 * 
 */
package Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import Domain.UserDataDelete;
import Domain.UserDelete;
import Util.DBUtils;

/** 
* @author 作者 sun: 
* @version 创建时间：2019年12月25日 下午4:55:50 
* @Description
*/
public class UserDataDeleteDao {
	public static void delete(UserDataDelete userDataDelete)throws SQLException  {

		String id = userDataDelete.getAccount_Id();
		String name = userDataDelete.getName();
		

		String sql = "delete from Account_"+name+" where Account_Id="+id;
		
		
		System.out.println(sql);
		
		Connection conn = DBUtils.getConnection();
		PreparedStatement pstat = conn.prepareStatement(sql);
		pstat.executeUpdate();
		
	}
}
