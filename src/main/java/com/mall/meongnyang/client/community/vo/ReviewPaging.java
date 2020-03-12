package com.mall.meongnyang.client.community.vo;

public class ReviewPaging {
	
	private int currentPage;
	private int pageSize;
	private final int pageBlock = 10;
	private int startRow;
	private int endRow;
	private int startPage;
	private int endPage;
	private boolean prev;
	private boolean next;
	
	public ReviewPaging(int currentPage) {
		this.currentPage = currentPage;
		this.pageSize = 9;
	}
	
	public void creatPage(int reviewCount) {
		int lastPage = ((reviewCount - 1) / pageSize) + 1;
		
		startRow = (currentPage-1) * pageSize + 1;
		endRow = currentPage * pageSize;
		startPage = ((currentPage - 1) / pageBlock) * pageBlock + 1; 
		endPage = startPage + pageBlock - 1;
		prev = false;
		next = false;
		
		if(endPage > lastPage) {
			endPage = lastPage;
		}
		
		if(startPage > 1) {
			prev = true;
		}
		if(endPage < lastPage) {
			next = true;
		}
	}

	public int getCurrentPage() {
		return currentPage;
	}

	public void setCurrentPage(int currentPage) {
		this.currentPage = currentPage;
	}

	public int getPageSize() {
		return pageSize;
	}

	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}

	public int getStartRow() {
		return startRow;
	}

	public void setStartRow(int startRow) {
		this.startRow = startRow;
	}

	public int getEndRow() {
		return endRow;
	}

	public void setEndRow(int endRow) {
		this.endRow = endRow;
	}

	public int getStartPage() {
		return startPage;
	}

	public void setStartPage(int startPage) {
		this.startPage = startPage;
	}

	public int getEndPage() {
		return endPage;
	}

	public void setEndPage(int endPage) {
		this.endPage = endPage;
	}

	public boolean isPrev() {
		return prev;
	}

	public void setPrev(boolean prev) {
		this.prev = prev;
	}

	public boolean isNext() {
		return next;
	}

	public void setNext(boolean next) {
		this.next = next;
	}

	public int getPageBlock() {
		return pageBlock;
	}

}
