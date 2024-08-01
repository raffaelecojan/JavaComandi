package com.rafcojan.entities;

//import jakarta.persistence.CascadeType;
//import jakarta.persistence.JoinColumn;
//import jakarta.persistence.ManyToMany;
//import jakarta.persistence.ManyToOne;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import jakarta.persistence.Table;

@Entity
@Table(name = "prenotazioni")
public class Prenotazioni {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int userId;
	
//	@ManyToOne(cascade = CascadeType.ALL)
//	@JoinColumn(name = "tourId")
    private Tour tour;
//	
//	@ManyToMany(cascade = CascadeType.ALL)
//	@JoinColumn(name = "utenteId")
    private Utente utente;
	
    private String bookingDate;
    
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
