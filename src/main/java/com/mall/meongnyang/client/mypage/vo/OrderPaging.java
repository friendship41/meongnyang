package com.mall.meongnyang.client.mypage.vo;

public class OrderPaging {

	private int currentPage;//현재페이지
	private int pageSize; //한페이지에 들어올 게시글 수
//	private int orderCount; //총 게시글수
	private final int pageBlock = 5; //페이지블럭의 단위개수
	private int startRow; //페이지의 시작게시글번호
	private int endRow; //페이지의 마지막 게시글 번호
	private int startBlock; //첫페이지
	private int endBlock; //페이지 블럭에 마지막 페이지;
	private boolean prev = false;
	private boolean next = false;
	
	public OrderPaging(int currentPage) {
		this.currentPage = currentPage;
		this.pageSize = 5;
	}
	
	public void createPage(int orderCount) {
		int lastPage = (orderCount - 1 / pageSize) + 1;
		startRow = (currentPage - 1)*pageSize + 1;
		endRow = startRow*pageSize;
		
		startBlock = ((currentPage - 1)/pageBlock)*pageBlock + 1;
		endBlock = startBlock + pageBlock - 1;
		
		if(endBlock > lastPage) {
			endBlock = lastPage;
		}
		
		if(startBlock > 1) {
			prev = true;
		}
		
		if(endBlock < lastPage) {
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
	
	public int getPageBlock() {
		return pageBlock;
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
	public int getStartBlock() {
		return startBlock;
	}
	public void setStartBlock(int startBlock) {
		this.startBlock = startBlock;
	}
	public int getEndBlock() {
		return endBlock;
	}
	public void setEndBlock(int endBlock) {
		this.endBlock = endBlock;
	}


	public boolean isPrev() {
		return prev;
	}


	public boolean isNext() {
		return next;
	}


	public void setPrev(boolean prev) {
		this.prev = prev;
	}


	public void setNext(boolean next) {
		this.next = next;
	}
}
