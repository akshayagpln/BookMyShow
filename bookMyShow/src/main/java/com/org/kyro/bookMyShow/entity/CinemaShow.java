package com.org.kyro.bookMyShow.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
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
@Table(name = "shows")
public class CinemaShow implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue
	@Column(name = "showId")
	private int showId;

	@Column(name = "movieShowing")
	private Movie movieShowing;

	@Column(name = "startTime")
	private String startTime;

	@Column(name = "endTime")
	private String endTime;

	@Column(name = "cinemaPlayedAt")
	private Cinema cinemaPlayedAt;

	@OneToMany(targetEntity = Seat.class, cascade = CascadeType.ALL)
	@JoinColumn(name = "show_seat_fk", referencedColumnName = "showId")
	private List<Seat> seats;
}
