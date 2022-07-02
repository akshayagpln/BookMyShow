package com.org.kyro.bookMyShow.dto;

import java.sql.Timestamp;
import java.util.List;

public class ShowDTO {
	private int showId;
	private MovieDTO movieId;
	private Timestamp startTime;
	private Timestamp endTime;
	private CinemaHallDTO cinemaPlayedAt;
	private List<SeatDTO> seats;

	public int getShowId() {
		return showId;
	}

	public void setShowId(int showId) {
		this.showId = showId;
	}

	public MovieDTO getMovieId() {
		return movieId;
	}

	public void setMovieId(MovieDTO movieId) {
		this.movieId = movieId;
	}

	public Timestamp getStartTime() {
		return startTime;
	}

	public void setStartTime(Timestamp startTime) {
		this.startTime = startTime;
	}

	public Timestamp getEndTime() {
		return endTime;
	}

	public void setEndTime(Timestamp endTime) {
		this.endTime = endTime;
	}

	public CinemaHallDTO getCinemaPlayedAt() {
		return cinemaPlayedAt;
	}

	public void setCinemaPlayedAt(CinemaHallDTO cinemaPlayedAt) {
		this.cinemaPlayedAt = cinemaPlayedAt;
	}

	public List<SeatDTO> getSeats() {
		return seats;
	}

	public void setSeats(List<SeatDTO> seats) {
		this.seats = seats;
	}

}
