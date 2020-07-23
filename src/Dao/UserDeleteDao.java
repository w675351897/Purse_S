package Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import Domain.UserDelete;
import Util.DBUtils;


/** 

* @author 作者 Living（王立伟）: 

* @version 创建时间：2019年12月23日 上午9:36:47 

* 类说明 

*/
public class UserDeleteDao {
		public static void delete(UserDelete userDelete)throws SQLException  {
				String id = userDelete.getId();
				
				String sql = "delete from User where user_Id="+id;
				System.out.println(sql);
				
				Connection conn = DBUtils.getConnection();
				PreparedStatement pstat = conn.prepareStatement(sql);
				pstat.executeUpdate();
				
			}

}
