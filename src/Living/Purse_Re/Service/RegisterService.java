package Living.Purse_Re.Service;

import java.sql.SQLException;

import Living.Purse_Re.Dao.RegisterDao;
import Living.Purse_Re.Domain.Register;

/** 

* @author 作者 Living（王立伟）: 

* @version 创建时间：2019年10月23日 上午10:51:28 

* 类说明 

*/
public class RegisterService {
	
	private RegisterDao regDao = new RegisterDao();
	
	public void insertUser(Register reg) throws SQLException {
		try {
			regDao.insertUser(reg);			
		} catch (Exception e) {
			
			System.out.println("用户注册失败");
			// TODO: handle exception
		}
		
	}
}
