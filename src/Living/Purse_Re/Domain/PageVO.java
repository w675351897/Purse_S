package Living.Purse_Re.Domain;

import java.util.List;

/** 

* @author 作者 Living（王立伟）: 

* @version 创建时间：2019年10月22日 上午9:18:37 

* 类说明 

*/
public class PageVO<T> {
private List<T> list;
	
	//当前页的页码
	private int page;
	
	//每页的记录数量
	private int recordOfPage;
	
	//总记录数
	private int recordCount;
	
	//总页数
	private int pageCount;

	public List<T> getList() {
		return list;
	}

	public void setList(List<T> list) {
		this.list = list;
	}

	public int getPage() {
		return page;
	}

	public void setPage(int page) {
		this.page = page;
	}

	public int getRecordOfPage() {
		return recordOfPage;
	}

	public void setRecordOfPage(int recordOfPage) {
		this.recordOfPage = recordOfPage;
	}

	public int getRecordCount() {
		return recordCount;
	}

	public void setRecordCount(int recordCount) {
		this.recordCount = recordCount;
	}

	public int getPageCount() {
		return pageCount;
	}

	public void setPageCount(int pageCount) {
		this.pageCount = pageCount;
	}
	
}
