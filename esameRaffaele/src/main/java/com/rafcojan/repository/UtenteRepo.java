package com.rafcojan.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rafcojan.entities.Utente;

public interface UtenteRepo extends JpaRepository<Utente, Integer>{

	List<Utente> findByNome(String nome);
	List<Utente> findByCognome(String cognome);
	List<Utente> findByUserName(String username);
	List<Utente> findByPassword(String password);
	List<Utente> findByEmail(String email);
	List<Utente> findByAmministratore(String amministratore);

}
