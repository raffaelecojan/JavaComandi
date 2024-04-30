package view;

import java.util.ArrayList;

import controller.AziendaCtrl;
import model.Dipendente;

public class Tester {
	
	public static void main(String[] args) {
	
		ArrayList<Dipendente> dipendente1 = new ArrayList<>();
		AziendaCtrl azienda = new AziendaCtrl();
		azienda.aggiungiDipendente("raffaele", "cojan", 1, "Manager");
		azienda.aggiungiDipendente("dario", "coo", 2, "Programmatore");
		azienda.aggiungiDipendente("simone", "gnoo", 2, "Stagista");
		azienda.mostraDipendenti();
	}
}
