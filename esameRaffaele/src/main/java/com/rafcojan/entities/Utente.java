package com.rafcojan.entities;

//import jakarta.persistence.FetchType;
//import java.util.List;
//import jakarta.persistence.OneToMany;
//import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import jakarta.persistence.Table;

@Entity
@Table(name = "utente")
public class Utente {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int utenteId;
	private String nome;
	private String cognome;
	private String username;
	private String password;
	private String email;
	private boolean amministratore;
	
//	@OneToMany(fetch = FetchType.LAZY, mappedBy = "utente", cascade = CascadeType.ALL)
//    private List<Prenotazioni> prenotazione;
	
	

//	public List<Prenotazioni> getPrenotazione() {
//		return prenotazione;
//	}
//
//	public void setPrenotazione(List<Prenotazioni> prenotazione) {
//		this.prenotazione = prenotazione;
//	}

	public int getUtenteId() {
		return utenteId;
	}

	public void setUtenteId(int utenteId) {
		this.utenteId = utenteId;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCognome() {
		return cognome;
	}

	public void setCognome(String cognome) {
		this.cognome = cognome;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public boolean getAmministratore() {
		return amministratore;
	}

	public void setAmministratore(boolean amministratore) {
		this.amministratore = amministratore;
	}
	
	
	
	

    
}
