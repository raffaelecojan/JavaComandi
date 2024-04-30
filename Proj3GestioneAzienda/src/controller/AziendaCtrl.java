package controller;

import java.util.ArrayList;

import model.Dipendente;
import model.Manager;

public class AziendaCtrl {
	
	public ArrayList<Dipendente> dipendenti;

	public AziendaCtrl() {
		this.dipendenti = new ArrayList<Dipendente>();
	}
	
	public void aggiungiDipendente(String nome, String cognome, int n, String ruolo) {
//		Dipendente dip1 = new Dipendente(nome,cognome,n,ruolo);
//		this.dipendenti.add(dip1);
		switch (ruolo) {
		case "Manager":
			Manager m1 = new Manager(nome, cognome, n);
			break;
		case
	}
	
	public void mostraDipendenti() {
		for(Dipendente dipendente : dipendenti) {
			System.out.println(dipendente);
		}
		System.out.println("numero di dipendenti: "+dipendenti.size());
	}
	
}
