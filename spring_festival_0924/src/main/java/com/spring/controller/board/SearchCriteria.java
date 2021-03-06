package com.spring.controller.board;

//Criteria의 기능을 확장
public class SearchCriteria extends Criteria {
	private String searchType;			//검색 구분
	private String keyword;				//검색어
	private String listSort;
	
	
	
	public SearchCriteria() {
		this("","","new");
	}
	
	public SearchCriteria(String searchType, String keyword, String listSort) {
		super();
		this.searchType = searchType;
		this.keyword = keyword;
	}
	
	public String getSearchType() {
		return searchType;
	}
	public void setSearchType(String searchType) {
		this.searchType = searchType;
	}
	public String getKeyword() {
		return keyword;
	}
	public void setKeyword(String keyword) {
		this.keyword = keyword;
	}

	public String getListSort() {
		return listSort;
	}

	public void setListSort(String listSort) {
		this.listSort = listSort;
	}

	@Override
	public String toString() {
		return "SearchCriteria [searchType=" + searchType + ", keyword=" + keyword + ", listSort=" + listSort + "]";
	}
	
	

}
