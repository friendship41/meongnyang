package com.mall.meongnyang.client.community.vo;

public class ClientQnaListPaging {
	private int pageSize; //한화면에 보여질 페이지
	private int currentPage; //현재페이지
	private final int pageBlock = 10; //화면에나오는거
	private int startRow;//시작글번호
	private int endRow;//끝 글번호
	private int startPage;//페이지 단락시작
	private int endPage; 
	private boolean prev;
	private boolean next;
	
	public ClientQnaListPaging() {
		this.pageSize = 9;
		this.currentPage = 1;
	}
	
	public void createPaging(int countList) {
		int lastPage = (int)Math.ceil(countList / (double) pageBlock);
		this.startRow = (currentPage - 1) * pageSize + 1 ; //현재페이지 시작글
		this.endRow = startRow * pageSize; //현재페이지 끝 번호
		//currentPage를 기준으로 하는 블럭의 시작페이지와 끝페이지를 계산
		this.startPage =  (int) ((currentPage - 1)/pageBlock) * pageBlock + 1;
		this.endPage = startPage + pageBlock; 
		this.prev = false;
		this.next = false;
		
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
