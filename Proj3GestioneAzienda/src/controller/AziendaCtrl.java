package controller;

import java.util.ArrayList;

import model.Dipendente;
import model.Manager;
import model.Programmatore;
import model.Stagista;

public class AziendaCtrl {
	String nomeAzienda = "bho";
	
	public ArrayList<Dipendente> dipendenti;
	public ArrayList<Manager> manager;
	public ArrayList<Programmatore> programmatore;
	public ArrayList<Stagista> stagista;

	public AziendaCtrl() {
		this.dipendenti = new ArrayList<Dipendente>();
		this.manager = new ArrayList<Manager>();
		this.programmatore = new ArrayList<Programmatore>();
		this.stagista = new ArrayList<Stagista>();
		
	}
	
	public void aggiungiDipendente(String nome, String cognome, int n, String ruolo) {
		
		switch (ruolo) {
		case "Manager":
			Manager m1 = new Manager(nome, cognome, n);
			this.manager.add(m1);
			break;
		case "Programmatore":
			Programmatore p1 = new Programmatore(nome, cognome, n);
			this.programmatore.add(p1);
			break;
		case "Stagista":
			Stagista s1 = new Stagista(nome, cognome, n);
			this.stagista.add(s1);
			break;
		default:
			Dipendente dip1 = new Dipendente(nome,cognome,n,ruolo);
			this.dipendenti.add(dip1);
			break;
		}
		
	}
	
	public void mostraDipendenti() {
		
		for(Manager managere : manager) {
			System.out.println(managere);
		}
		for(Programmatore programmator : programmatore) {
			System.out.println(programmator);
		}
		for(Stagista stagist : stagista) {
			System.out.println(stagist);
		}
		for(Dipendente dipendente : dipendenti) {
			System.out.println(dipendente);
		}
		
		
	}
	public void info() {
		System.out.println("nome del Azienda "+nomeAzienda);
		System.out.println("numero di Manager: "+manager.size());
		System.out.println("numero di Programmatori: "+programmatore.size());
		System.out.println("numero di stagisti: "+stagista.size());
		System.out.println("numero di Dipendenti: "+dipendenti.size());
		System.out.println("numero totale di collaboratori: "+(dipendenti.size()+manager.size()+programmatore.size()+stagista.size()));
	}
	
}
