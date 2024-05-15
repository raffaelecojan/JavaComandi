package db;

import java.util.List;

import model.Dipendente;

public interface DipendenteDAO {
	
	String FIND_ALL="select * from dipendenti";
	String ADD_DIPENDENTE="INSERT INTO dipendenti (nome, ruolo) VALUES (?,?)";
	
	List<Dipendente> getDipendenti();
	
	void addDipendente(Dipendente d);
	

}
