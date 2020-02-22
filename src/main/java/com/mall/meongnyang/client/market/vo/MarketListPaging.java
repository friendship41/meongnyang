package com.mall.meongnyang.client.market.vo;

public class MarketListPaging {
	
	private int pageSize; //한화면에 보여질 페이지
	private int currentPage; //현재 페이지
	private final int pageBlock = 10; //한화면에 보여지는 총 페이지 수
	private int startRow; //현재페이지의 시작글번호
	private int endRow; //현재페이지의 끝 글번호
	private int startPage; //페이지 단락의 시작
	private int endPage; //페이지 끝 시작
	private boolean prev; //이전페이지 활성
	private boolean next; //다음페이지 활성
	
	public MarketListPaging(int currentPage) {
		this.pageSize = 9;
		this.currentPage = currentPage;
	}
	
	public void createPaging(int countList) {
		int lastPage = (int) Math.ceil(countList /(double) pageSize);

		this.startRow = (currentPage - 1) * pageSize + 1; //현재페이지의 시작글번호
		this.endRow = currentPage * pageSize; //현재페이지의 끝 글번호
		this.startPage = (int) ((currentPage - 1)/pageBlock) * pageBlock + 1; //페이지 단락의 시작
		this.endPage = startPage + pageBlock-1; //페이지 끝 시작
		this.prev = false; //이전페이지 활성
		this.next = false; //다음페이지 활성

		if(endPage > lastPage) {
			this.endPage = lastPage;
		}
		
		if(startPage != 1) {
			this.prev = true;
		}
		
		if(endPage < lastPage) {
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
