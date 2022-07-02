package com.org.kyro.bookMyShow.dto;

import java.util.List;

abstract class MemberDTO extends SystemMember {

	private BookingDTO makeBooking(BookingDTO booking) {
		return booking;

	}

	private List<BookingDTO> getBooking() {
		return null;

	}

}
