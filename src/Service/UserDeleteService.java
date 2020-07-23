package Service;

import Dao.UserDeleteDao;
import Domain.UserDelete;

/** 

* @author 作者 Living（王立伟）: 

* @version 创建时间：2019年12月23日 上午9:36:11 

* 类说明 

*/
public class UserDeleteService {
	public void delte(UserDelete userDelete) {
		try {
			UserDeleteDao.delete(userDelete);
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

}
