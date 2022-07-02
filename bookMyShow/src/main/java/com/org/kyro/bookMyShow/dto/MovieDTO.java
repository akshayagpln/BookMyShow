package com.org.kyro.bookMyShow.dto;

import java.util.List;
import java.util.Map;

public class MovieDTO {
	private int movieId;
	private String MovieName;
	private int duration;
	private String language;
	private GenreEnum genre;
	Map<String, List<ShowDTO>> cityShowMap;

	public int getMovieId() {
		return movieId;
	}

	public void setMovieId(int movieId) {
		this.movieId = movieId;
	}

	public String getMovieName() {
		return MovieName;
	}

	public void setMovieName(String movieName) {
		MovieName = movieName;
	}

	public int getDuration() {
		return duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public GenreEnum getGenre() {
		return genre;
	}

	public void setGenre(GenreEnum genre) {
		this.genre = genre;
	}

	public Map<String, List<ShowDTO>> getCityShowMap() {
		return cityShowMap;
	}

	public void setCityShowMap(Map<String, List<ShowDTO>> cityShowMap) {
		this.cityShowMap = cityShowMap;
	}

	@Override
	public String toString() {
		return "MovieDTO [movieId=" + movieId + ", MovieName=" + MovieName + ", duration=" + duration + ", language="
				+ language + ", genre=" + genre + ", cityShowMap=" + cityShowMap + "]";
	}

}
