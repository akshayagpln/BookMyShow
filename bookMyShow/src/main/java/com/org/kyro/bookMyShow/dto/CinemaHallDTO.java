package com.org.kyro.bookMyShow.dto;

import java.sql.Timestamp;
import java.util.List;

abstract class CinemaHallDTO {
	private int cinemaHallId;
	private String cinemaHallName;
	private AddressDTO adress;
	private List<AudiDTO> audiList;

	public int getCinemaHallId() {
		return cinemaHallId;
	}

	public void setCinemaHallId(int cinemaHallId) {
		this.cinemaHallId = cinemaHallId;
	}

	public String getCinemaHallName() {
		return cinemaHallName;
	}

	public void setCinemaHallName(String cinemaHallName) {
		this.cinemaHallName = cinemaHallName;
	}

	public AddressDTO getAdress() {
		return adress;
	}

	public void setAdress(AddressDTO adress) {
		this.adress = adress;
	}

	public List<AudiDTO> getAudiList() {
		return audiList;
	}

	public void setAudiList(List<AudiDTO> audiList) {
		this.audiList = audiList;
	}

	List<MovieDTO> getMovies(Timestamp date, String City) {
		return null;

	}

	List<CinemaHallDTO> getCinemaHall(String City) {
		return null;
	}
}
