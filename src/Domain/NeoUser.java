package Domain;
/** 

* @author 作者 Living（王立伟）: 

* @version 创建时间：2019年12月2日 下午6:46:05 

* 类说明 

*/
public class NeoUser {
	private int registrantId;
	private String registrantName;
	private String registrantPass;
	
	public int getRegistrantId() {
		return registrantId;
	}
	public void setRegistrantId(int registrantId) {
		this.registrantId = registrantId;
	}
	public String getRegistrantName() {
		return registrantName;
	}
	public void setRegistrantName(String registrantName) {
		this.registrantName = registrantName;
	}
	public String getRegistrantPass() {
		return registrantPass;
	}
	public void setRegistrantPass(String registrantPass) {
		this.registrantPass = registrantPass;
	}
}
