package com.org.kyro.bookMyShow.entity;

import java.io.Serializable;
import java.util.List;

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
@Table(name = "audi")
public class Audi implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int audiId;

	@Column(name = "name")
	private String audiName;

	@Column(name = "seats")
	private int totalSeats;

	@OneToMany(targetEntity=CinemaShow.class, cascade = CascadeType.ALL)
	@JoinColumn(name = "audi_show_fk", referencedColumnName = "audiId")
	private List<CinemaShow> shows;
}
