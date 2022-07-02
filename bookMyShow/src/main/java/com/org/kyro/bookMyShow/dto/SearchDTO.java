package com.org.kyro.bookMyShow.dto;

import java.sql.Timestamp;
import java.util.List;

abstract class SearchDTO {
	List<MovieDTO> searchMovieByNames(String name) {
		return null;

	}

	List<MovieDTO> searchMovieByGenre(GenreEnum genre) {
		return null;
	}

	List<MovieDTO> searchMovieByLanguage(String language) {
		return null;
	}

	List<MovieDTO> searchMovieByDate(Timestamp releaseDate) {
		return null;
	}
}
