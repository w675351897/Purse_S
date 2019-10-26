package Living.Purse_Re.Domain;
/** 

* @author 作者 Living（王立伟）: 

* @version 创建时间：2019年10月20日 下午3:15:14 

* 类说明 

*/
public class Team {
	
	private  Integer Team_Id;
	private String Team_Name;
	private Integer Team_LeaderId;
	private String Team_LeaderName;
	private User user;
	
	public Integer getTeam_Id() {
		return Team_Id;
	}
	public void setTeam_Id(Integer team_Id) {
		Team_Id = team_Id;
	}
	public String getTeam_Name() {
		return Team_Name;
	}
	public void setTeam_Name(String team_Name) {
		Team_Name = team_Name;
	}
	public Integer getTeam_LeaderId() {
		return Team_LeaderId;
	}
	public void setTeam_LeaderId(Integer team_LeaderId) {
		Team_LeaderId = team_LeaderId;
	}
	public String getTeam_LeaderName() {
		return Team_LeaderName;
	}
	public void setTeam_LeaderName(String team_LeaderName) {
		Team_LeaderName = team_LeaderName;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	
	
	
}
