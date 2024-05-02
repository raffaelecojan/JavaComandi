package view;

import controller.AziendaCtrl;
import model.Dipendente;

public class App {
	public static void main(String[] args) {
		AziendaCtrl azienda = new AziendaCtrl("Plutos&pippos");
		azienda.addDipendente("mario", "rossi", "Manager");
		azienda.addDipendente("mario", "rossi", "Manager");
		azienda.addDipendente("mario", "rossi", "Manager");
	}
	
	for(Dipendente dip: azienda.getListDipendenti()) {
		System.out.println(dip.presentati());
		System.out.println(dip.getStipendio());
	}
}
