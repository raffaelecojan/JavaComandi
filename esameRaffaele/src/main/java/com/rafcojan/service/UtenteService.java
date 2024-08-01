package com.rafcojan.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rafcojan.entities.Utente;
import com.rafcojan.repository.UtenteRepo;


@Service
public class UtenteService {
	@Autowired
	private UtenteRepo dao;
	
	//prendi tutto o uno singolo
	public List<Utente> getAllUtenti(){
        return dao.findAll();
    }
	
	public  Utente getUtenteById(int id){
        return dao.findById(id).orElse(null);
    }
	
	public List<Utente> getByNome(String nome){
        return dao.findByNome(nome);
    }
	
	public List<Utente> getByCognome(String cognome){
        return dao.findByCognome(cognome);
    }
	public List<Utente> getByUserName(String username){
        return dao.findByUserName(username);
    }
	public List<Utente> getByPassword(String password){
        return dao.findByPassword(password);
    }
	public List<Utente> getByEmail(String email){
        return dao.findByEmail(email);
    }
	public List<Utente> getByAmministratore(boolean amministratore){
        return dao.findByAmministratore(amministratore);
    }
	
	//aggiungi e rimuovi
	public Utente saveUtente(Utente u) {
    	return dao.save(u);
    }
	
	public void deleteUtente(int id) {
    	dao.deleteById(id);
    }
	
	//modifica Utente
		public void modificaUtente(int id, Utente utente) {
			deleteUtente(id);
			saveUtente(utente);
		}
}
