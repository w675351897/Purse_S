/**
 * 
 */
package Service;

import Dao.UserDataDeleteDao;

import Domain.UserDataDelete;

/** 
* @author 作者 Living: 
* @version 创建时间：2019年12月25日 下午4:48:29 
* @Description
*/
public class UserDataDeleteService {
	
	public void delete(UserDataDelete userDataDelete) {
		try {
			UserDataDeleteDao.delete(userDataDelete);
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

}
