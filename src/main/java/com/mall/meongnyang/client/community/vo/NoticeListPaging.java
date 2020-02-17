package com.mall.meongnyang.client.community.vo;

public class NoticeListPaging {
	
	private int pageSize;
	private int currentPage;
	private final int pageBlock=10;
	private int startRow;
	private int endRow;
	private int startPage;
	private int endPage;
	private boolean prev;
	private boolean next;
	
	public NoticeListPaging() {
		this.pageSize = 9;
		this.currentPage = 1;
		
	}
	
	public void createPaging(int countList) {
		int lastPage = (int) Math.ceil(countList/(double) pageBlock);
		this.startRow = (currentPage -1)*pageSize +1; 
		this.endRow = startRow * pageSize;
		this.startPage = (int) ((currentPage -1)/pageBlock)* pageBlock +1;
		this.endPage = startPage + pageBlock;
		this.prev = false;
		this.next = false;
		
		if(endPage>lastPage) {
			this.endPage = lastPage;
	
		}
		
		if(startPage !=1) {
			this.prev = true;
		}
		
		if(endPage<lastPage) {
			this.next = true;
		}
		
				
	}

	public int getPageSize() {
		return pageSize;
	}

	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}

	public int getCurrentPage() {
		return currentPage;
	}

	public void setCurrentPage(int currentPage) {
		this.currentPage = currentPage;
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
