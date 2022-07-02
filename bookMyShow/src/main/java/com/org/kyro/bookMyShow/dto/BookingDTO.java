package com.org.kyro.bookMyShow.dto;

import java.sql.Timestamp;
import java.util.List;

public class BookingDTO {
	private int bookingId;
	private Timestamp bookingDate;
	private MemberDTO member;
	private ShowDTO show;
	private AudiDTO audi;
	private BookingStatusEnum bookingStatus;
	private double amount;
	private List<SeatDTO> seats;
	private PaymentDTO paymentObj;

	public int getBookingId() {
		return bookingId;
	}

	public void setBookingId(int bookingId) {
		this.bookingId = bookingId;
	}

	public Timestamp getBookingDate() {
		return bookingDate;
	}

	public void setBookingDate(Timestamp bookingDate) {
		this.bookingDate = bookingDate;
	}

	public MemberDTO getMember() {
		return member;
	}

	public void setMember(MemberDTO member) {
		this.member = member;
	}

	public ShowDTO getShow() {
		return show;
	}

	public void setShow(ShowDTO show) {
		this.show = show;
	}

	public AudiDTO getAudi() {
		return audi;
	}

	public void setAudi(AudiDTO audi) {
		this.audi = audi;
	}

	public BookingStatusEnum getBookingStatus() {
		return bookingStatus;
	}

	public void setBookingStatus(BookingStatusEnum bookingStatus) {
		this.bookingStatus = bookingStatus;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public List<SeatDTO> getSeats() {
		return seats;
	}

	public void setSeats(List<SeatDTO> seats) {
		this.seats = seats;
	}

	public PaymentDTO getPaymentObj() {
		return paymentObj;
	}

	public void setPaymentObj(PaymentDTO paymentObj) {
		this.paymentObj = paymentObj;
	}

	@Override
	public String toString() {
		return "BookingDTO [bookingId=" + bookingId + ", bookingDate=" + bookingDate + ", member=" + member + ", show="
				+ show + ", audi=" + audi + ", bookingStatus=" + bookingStatus + ", amount=" + amount + ", seats="
				+ seats + ", paymentObj=" + paymentObj + "]";
	}

}
