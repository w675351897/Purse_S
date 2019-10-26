package Living.Purse_Re.Domain;
/** 

* @author 作者 Living（王立伟）: 

* @version 创建时间：2019年10月20日 下午2:57:41 

* 类说明 

*/
public class Account {
	private Integer Account_Id;
	private double Account_Price;
	private Integer Account_Uid;
	private String Account_Date;
	private Integer DeleteStauts;
	private Integer Account_PL;//statement of profit or loss
	
	private Integer AccountTypeId;
	private AccountType accountType;
	
	
	public Integer getAccountTypeId() {
		return AccountTypeId;
	}
	public void setAccountTypeId(Integer accountTypeId) {
		AccountTypeId = accountTypeId;
	}
	public Integer getAccount_Id() {
		return Account_Id;
	}
	public void setAccount_Id(Integer account_Id) {
		Account_Id = account_Id;
	}
	public double getAccount_Price() {
		return Account_Price;
	}
	public void setAccount_Price(double account_Price) {
		Account_Price = account_Price;
	}
	public Integer getAccount_Uid() {
		return Account_Uid;
	}
	public void setAccount_Uid(Integer account_Uid) {
		Account_Uid = account_Uid;
	}
	public String getAccount_Date() {
		return Account_Date;
	}
	public void setAccount_Date(String account_Date) {
		Account_Date = account_Date;
	}
	public Integer getDeleteStauts() {
		return DeleteStauts;
	}
	public void setDeleteStauts(Integer deleteStauts) {
		DeleteStauts = deleteStauts;
	}
	public Integer getAccount_PL() {
		return Account_PL;
	}
	public void setAccount_PL(Integer account_PL) {
		Account_PL = account_PL;
	}
	public AccountType getAccountType() {
		return accountType;
	}
	public void setAccountType(AccountType accountType) {
		this.accountType = accountType;
	}

	
	
}
