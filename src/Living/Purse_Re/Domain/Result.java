package Living.Purse_Re.Domain;
/** 

* @author 作者 Living（王立伟）: 

* @version 创建时间：2019年10月20日 下午3:51:27 

* 类说明 

*/
public class Result {
	private String success;
	private String errMessage;
	private String userName;
	private String skip;

	public String getSkip() {
		return skip;
	}
	public void setSkip(String skip) {
		this.skip = skip;
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
	public void setErrMessage(String errorMessage) {
		this.errMessage = errorMessage;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
}
