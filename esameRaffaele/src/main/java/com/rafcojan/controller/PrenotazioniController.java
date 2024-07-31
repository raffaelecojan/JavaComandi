package com.rafcojan.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rafcojan.entities.Prenotazioni;
import com.rafcojan.service.PrenotazioniService;



@RestController
@RequestMapping("/api/prenotazioni")

public class PrenotazioniController {

	@Autowired
	private PrenotazioniService prenotazioniService;
	
	@GetMapping
	public List<Prenotazioni> getAllVideoGiochi(){
		return prenotazioniService.getAllprenotazioni();
	}
	
	@GetMapping("/{id}")
	public Prenotazioni getPrenotazioniById(@PathVariable int id) {
		return prenotazioniService.getPrenotazioneById(id);
	}
	
	@PostMapping()
	public Prenotazioni savePrenotazione(@RequestBody  Prenotazioni prenotazioni) {
		return prenotazioniService.savePrenotazione(prenotazioni);
	}
	
	@DeleteMapping("/{id}")
	public void deleteVideoGioco(@PathVariable int id) {
		prenotazioniService.deletePrenotazione(id);
	}
}
