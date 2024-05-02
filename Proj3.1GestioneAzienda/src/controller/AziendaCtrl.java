package controller;

import java.util.ArrayList;

import model.Dipendente;
import model.Manager;

public class AziendaCtrl {
	public String nomeAzienda;
	private int numDipendenti;
	private ArrayList<Dipendente> listaDipendenti;
	
	public AziendaCtrl(String nomeAzienda) {
		this.nomeAzienda = nomeAzienda;
		this.listaDipendenti = new ArrayList<>();
	}
	
	public void addDipendente(String nome, String cognome, String ruolo) {
		Dipendente d = null;
		switch (ruolo) {
		case "Manager":
			d= new Manager(nome, cognome, ruolo);
			break;
		case "Programmatore":
			
			break;
		case "Stagista":
			
			break;
		default:
			System.out.println("Questo ruolo non corrisponde");
			break;
		}
		if(d != null) {
				this.listaDipendenti.add(d);
		}
	}
	
	public ArrayList<Dipendente> getListaDipendenti(){
		return listaDipendenti;
	}
	
}
