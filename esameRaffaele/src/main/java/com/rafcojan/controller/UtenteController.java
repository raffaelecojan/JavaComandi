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

import com.rafcojan.entities.Utente;
import com.rafcojan.service.UtenteService;



@RestController
@RequestMapping("/api/utente")

public class UtenteController {
	@Autowired
	private UtenteService utenteService;
	
	@GetMapping("/allUtenti")
	public List<Utente> getAllUtenti(){
		return utenteService.getAllUtenti();
	}
	
	@GetMapping("/idUtente")
	public Utente getUtenteById(@RequestParam int id) {
		return utenteService.getUtenteById(id);
	}
	
	@PostMapping("/saveUtente")
	public Utente saveUtente(@RequestBody  Utente utente) {
		return utenteService.saveUtente(utente);
	}
	
	@DeleteMapping("/deleteUtente")
	public void deleteUtente(@RequestParam int id) {
		utenteService.deleteUtente(id);
	}
	
	@GetMapping("/NomeUtente")
	public List<Utente> getByNome(@RequestParam String nome) {
		return utenteService.getByNome(nome);	}
	
	@GetMapping("/CognomeUtente")
	public List<Utente> getByCognome(@RequestParam String cognome) {
		return utenteService.getByCognome(cognome);	}
	
	@GetMapping("/UserNameUtente")
	public List<Utente> getByUserName(@RequestParam String username) {
		return utenteService.getByUserName(username);	}
	
	@GetMapping("/PasswordUtente")
	public List<Utente> getByPassword(@RequestParam String password) {
		return utenteService.getByPassword(password);	}
	
	@GetMapping("/EmailUtente")
	public List<Utente> getByEmail(@RequestParam String email) {
		return utenteService.getByEmail(email);	}
	
	@GetMapping("/AmministratoreUtente")
	public List<Utente> getByAmministratore(@RequestParam boolean amministratore) {
		return utenteService.getByAmministratore(amministratore);	}
	
	
	
	
	
	
	
	
	
	

}
