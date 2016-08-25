package goshare.filter;

import goshare.domain.OrderDirection;

public class PostFilter {
	

	private int pageSize = 100;
	private int pageNum = 1;
	private String orderBy = "id";
	private OrderDirection dir = OrderDirection.DESC;
	
	
	public int getPageSize() {
		return pageSize;
	}
	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}
	public int getPageNum() {
		return pageNum;
	}
	public void setPageNum(int pageNum) {
		this.pageNum = pageNum;
	}
	public String getOrderBy() {
		return orderBy;
	}
	public void setOrderBy(String orderBy) {
		this.orderBy = orderBy;
	}
	public OrderDirection getDir() {
		return dir;
	}
	public void setDir(OrderDirection dir) {
		this.dir = dir;
	}

}
