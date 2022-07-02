package com.org.kyro.bookMyShow.dto;

public class UserDTO {
	private int userId;
	private SearchDTO searchObj;

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public SearchDTO getSearchObj() {
		return searchObj;
	}

	public void setSearchObj(SearchDTO searchObj) {
		this.searchObj = searchObj;
	}

}
