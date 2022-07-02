package com.org.kyro.bookMyShow.entity;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@ToString
@Entity
@Table(name = "movie")
public class Movie implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int movieId;

	@Column(name = "name")
	private String MovieName;

	@Column(name = "duration")
	private int duration;

	@Column(name = "language")
	private String language;

	@Column(name = "genre")
	private String genre;

	@OneToMany(targetEntity = CinemaShow.class, cascade = CascadeType.ALL)
	@JoinColumn(name = "movie_show_fk", referencedColumnName = "movieId")
	private Map<String, List<CinemaShow>> cityShowMap;

}
