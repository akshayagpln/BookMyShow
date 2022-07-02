package com.org.kyro.bookMyShow.dto;

import java.sql.Timestamp;

public class PaymentDTO {
	private double amount;
	private Timestamp paymentDate;
	private int transactionId;
	private PaymentStatusEnum paymentStatus;

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public Timestamp getPaymentDate() {
		return paymentDate;
	}

	public void setPaymentDate(Timestamp paymentDate) {
		this.paymentDate = paymentDate;
	}

	public int getTransactionId() {
		return transactionId;
	}

	public void setTransactionId(int transactionId) {
		this.transactionId = transactionId;
	}

	public PaymentStatusEnum getPaymentStatus() {
		return paymentStatus;
	}

	public void setPaymentStatus(PaymentStatusEnum paymentStatus) {
		this.paymentStatus = paymentStatus;
	}

	@Override
	public String toString() {
		return "PaymentDTO [amount=" + amount + ", paymentDate=" + paymentDate + ", transactionId=" + transactionId
				+ ", paymentStatus=" + paymentStatus + "]";
	}

}
