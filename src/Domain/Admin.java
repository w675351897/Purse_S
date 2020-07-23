package Domain;
/** 

* @author 作者 Living（王立伟）: 

* @version 创建时间：2019年10月28日 下午10:56:04 

* 类说明 

*/
public class Admin {
	
	private Integer Admin_Id;
	private String Admin_Name;
	private String Admin_Password;
	private Integer Role;
	
	public Integer getAdmin_Id() {
		return Admin_Id;
	}
	public void setAdmin_Id(Integer admin_Id) {
		Admin_Id = admin_Id;
	}
	public String getAdmin_Name() {
		return Admin_Name;
	}
	public void setAdmin_Name(String admin_Name) {
		Admin_Name = admin_Name;
	}
	public String getAdmin_Password() {
		return Admin_Password;
	}
	public void setAdmin_Password(String admin_Password) {
		Admin_Password = admin_Password;
	}
	public Integer getRole() {
		return Role;
	}
	public void setRole(Integer role) {
		Role = role;
	}
}
