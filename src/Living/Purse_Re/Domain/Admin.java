package Living.Purse_Re.Domain;
/** 

* @author 作者 Living（王立伟）: 

* @version 创建时间：2019年10月20日 下午2:55:50 

* 类说明 
* 复刻版本
*/
public class Admin {
	
	private Integer User_Id;
	private String Username;
//	private Integer Admin_Id;
//	private String AdminName;
	private String Password;
	private Integer role;
	
//	public Integer getAdmin_Id() {
//		return Admin_Id;
//	}
//	public void setAdmin_Id(Integer admin_Id) {
//		Admin_Id = admin_Id;
//	}
//	public String getAdminName() {
//		return AdminName;
//	}
//	public void setAdminName(String adminName) {
//		AdminName = adminName;
//	}
	
	public String getPassword() {
		return Password;
	}
	public Integer getUser_Id() {
		return User_Id;
	}
	public void setUser_Id(Integer user_Id) {
		User_Id = user_Id;
	}
	public String getUsername() {
		return Username;
	}
	public void setUsername(String username) {
		Username = username;
	}
	public void setPassword(String password) {
		Password = password;
	}
	public Integer getRole() {
		return role;
	}
	public void setRole(Integer role) {
		this.role = role;
	}
}
