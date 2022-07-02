package com.org.kyro.bookMyShow.dto;

public class SeatDTO {
	private int seatId;
	private SeatTypeEnum seatType;
	private SeatStatusEnum seatStatus;
	private double price;

	public int getSeatId() {
		return seatId;
	}

	public void setSeatId(int seatId) {
		this.seatId = seatId;
	}

	public SeatTypeEnum getSeatType() {
		return seatType;
	}

	public void setSeatType(SeatTypeEnum seatType) {
		this.seatType = seatType;
	}

	public SeatStatusEnum getSeatStatus() {
		return seatStatus;
	}

	public void setSeatStatus(SeatStatusEnum seatStatus) {
		this.seatStatus = seatStatus;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
}
