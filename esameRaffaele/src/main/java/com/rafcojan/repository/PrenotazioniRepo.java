package com.rafcojan.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rafcojan.entities.Prenotazioni;

public interface PrenotazioniRepo extends JpaRepository<Prenotazioni, Integer>{

	List<Prenotazioni> findByTourId(int tourId);
	List<Prenotazioni> findByUserId(int userId);
	List<Prenotazioni> findByBookingDate(String bookingDate);

	

}
