package com.rafcojan.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Prenotazioni {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private int tourId;
    private int userId;
    private String bookingDate;
    
	public Prenotazioni(int id, int tourId, int userId, String bookingDate) {
		super();
		this.id = id;
		this.tourId = tourId;
		this.userId = userId;
		this.bookingDate = bookingDate;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getTourId() {
		return tourId;
	}

	public void setTourId(int tourId) {
		this.tourId = tourId;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getBookingDate() {
		return bookingDate;
	}

	public void setBooking_date(String bookingDate) {
		this.bookingDate = bookingDate;
	}
   
}
