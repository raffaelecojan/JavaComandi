package com.rafcojan.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.rafcojan.entities.Prenotazioni;
import com.rafcojan.service.PrenotazioniService;



@RestController
@RequestMapping("/api/prenotazioni")
public class PrenotazioniController {

	@Autowired
	private PrenotazioniService prenotazioniService;
	
	@GetMapping("/allPrenotazioni")
	public List<Prenotazioni> getAllPrenotazioni(){
		return prenotazioniService.getAllprenotazioni();
	}
	
	@GetMapping("/idPrenotazioni")
	public Prenotazioni getPrenotazioniById(@RequestParam int id) {
		return prenotazioniService.getPrenotazioneById(id);
	}
	
	@PostMapping("/savePrenotazione")
	public Prenotazioni savePrenotazione(@RequestBody  Prenotazioni prenotazioni) {
		return prenotazioniService.savePrenotazione(prenotazioni);
	}
	
	@DeleteMapping("/deletePrenotazioni")
	public void deletePrenotazione(@RequestParam int id) {
		prenotazioniService.deletePrenotazione(id);
	}
	
	@GetMapping("/tutorIdPrenotazioni")
	public List<Prenotazioni> getBytourId(@RequestParam int tourId){
		return prenotazioniService.getBytourId(tourId);
	}
	
	@GetMapping("/userIdPrenotazioni")
	public List<Prenotazioni> getByUserId(@RequestParam int userId){
		return prenotazioniService.getBytourId(userId);
	}
	
	@GetMapping("/userIdPrenotazioni")
	public List<Prenotazioni> getByBookingDate(@RequestParam String bookingDate){
		return prenotazioniService.getByBookingDate(bookingDate);
	}
	
}
