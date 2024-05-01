package view;

import java.util.ArrayList;

import controller.AziendaCtrl;
import model.Dipendente;

public class Tester {
	
	public static void main(String[] args) {
	
		AziendaCtrl azienda = new AziendaCtrl();
		azienda.aggiungiDipendente("raffaele", "cojan", 1, "Manager");
		azienda.aggiungiDipendente("fabio", "cojan", 2, "Stagista");
		azienda.aggiungiDipendente("armando", "bianchi", 3, "dipendente");
		azienda.aggiungiDipendente("francesca", "totti", 4, "dipendente");
		azienda.aggiungiDipendente("lorenzo", "totti", 5, "Programmatore");
		azienda.aggiungiDipendente("chiara", "rossi", 6, "Manager");
		azienda.mostraDipendenti();
		azienda.info();
	}
}
