package controller;

import java.util.ArrayList;
import java.util.List;

import model.Dipendente;

public class GestioneAziendale {
	
	private List<Dipendente> dipendenti;
	private String nome;
	
	
	public GestioneAziendale(String nome) {
		this.nome = nome;
		this.dipendenti=new ArrayList<Dipendente>();
	}
	
	public void addDipendente(Dipendente d) {
		this.dipendenti.add(d);
	}

	public List<Dipendente> getDipendenti() {
		return dipendenti;
	}
	
	

}
