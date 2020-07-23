package Domain;
/** 

* @author 作者 Living（王立伟）: 

* @version 创建时间：2019年10月28日 下午10:55:09 

* 类说明 

*/
public class Result {
	
	private String success;
	private String errMessage;
	private String userName;
	private String skip;
	private String loadName;
	
	public String getLoadName() {
		return loadName;
	}
	public void setLoadName(String loadName) {
		this.loadName = loadName;
	}
	public String getSuccess() {
		return success;
	}
	public void setSuccess(String success) {
		this.success = success;
	}
	public String getErrMessage() {
		return errMessage;
	}
	public void setErrMessage(String errMessage) {
		this.errMessage = errMessage;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getSkip() {
		return skip;
	}
	public void setSkip(String skip) {
		this.skip = skip;
	}

}
