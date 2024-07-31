package com.rafcojan.service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rafcojan.entities.Prenotazioni;
import com.rafcojan.repository.PrenotazioniRepo;



@Service
public class PrenotazioniService {

	@Autowired
	private PrenotazioniRepo dao;
	
	//prendi tutto o uno singolo
	public List<Prenotazioni> getAllprenotazioni(){
        return dao.findAll();
    }
	
	public  Prenotazioni getPrenotazioneById(int id){
        return dao.findById(id).orElse(null);
    }
	
	public List<Prenotazioni> getBytourId(int tourId){
        return dao.findByTourId(tourId);
    }
	
	public List<Prenotazioni> getByUserId(int userId){
        return dao.findByUserId(userId);
    }
	public List<Prenotazioni> getByUserBookingDate(String bookingDate){
        return dao.findByBookingDate(bookingDate);
    }

	
	//aggiungi e rimuovi
	public Prenotazioni savePrenotazione(Prenotazioni p) {
    	return dao.save(p);
    }
	
	public void deletePrenotazione(int id) {
    	dao.deleteById(id);
    }
	
	//modifica tour
		public void modificaTour(int id, Prenotazioni prenotazioni) {
			deletePrenotazione(id);
			savePrenotazione(prenotazioni);
		}
	
	
}
