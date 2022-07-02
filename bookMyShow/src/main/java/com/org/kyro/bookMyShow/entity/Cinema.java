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
@Table(name = "cinema")
public class Cinema implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int cinemaHallId;

	@Column(name = "name")
	private String cinemaHallName;

	@Column(name = "address")
	private Address address;

	@OneToMany(targetEntity = Audi.class, cascade = CascadeType.ALL)
	@JoinColumn(name = "cinema_audi_fk", referencedColumnName = "cinemaHallId")
	private List<Audi> audiList;

}
