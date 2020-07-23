package Domain;
/** 

* @author 作者 Living（王立伟）: 

* @version 创建时间：2019年10月28日 下午10:48:22 

* 类说明 

*/
public class User {
	private Integer User_Id;
	private String User_Name;
	private String User_Password;
	private Integer Role;
	
	public Integer getUser_Id() {
		return User_Id;
	}
	public void setUser_Id(Integer user_Id) {
		User_Id = user_Id;
	}
	public String getUser_Name() {
		return User_Name;
	}
	public void setUser_Name(String user_Name) {
		User_Name = user_Name;
	}
	public String getUser_Password() {
		return User_Password;
	}
	public void setUser_Password(String user_Password) {
		User_Password = user_Password;
	}
	public Integer getRole() {
		return Role;
	}
	public void setRole(Integer role) {
		Role = role;
	}
	

}
