package com.org.kyro.bookMyShow.dto;

import java.util.List;

public class AudiDTO {
	private int audiId;
	private String audiName;
	private int totalSeats;
	private List<ShowDTO> shows;

	public int getAudiId() {
		return audiId;
	}

	public void setAudiId(int audiId) {
		this.audiId = audiId;
	}

	public String getAudiName() {
		return audiName;
	}

	public void setAudiName(String audiName) {
		this.audiName = audiName;
	}

	public int getTotalSeats() {
		return totalSeats;
	}

	public void setTotalSeats(int totalSeats) {
		this.totalSeats = totalSeats;
	}

	public List<ShowDTO> getShows() {
		return shows;
	}

	public void setShows(List<ShowDTO> shows) {
		this.shows = shows;
	}

	@Override
	public String toString() {
		return "AudiDTO [audiId=" + audiId + ", audiName=" + audiName + ", totalSeats=" + totalSeats + ", shows="
				+ shows + "]";
	}

}
