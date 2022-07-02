package com.org.kyro.bookMyShow.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@ToString
@Entity
@Table(name = "seat")
public class Seat implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue
	private int seatId;

	@Column
	private String seatType;

	@Column
	private String seatStatus;

	@Column
	private double price;
}
