package demo;

import java.util.Iterator;
import java.util.List;

import controller.GestioneAziendale;
import db.DipendenteDAO;
import db.DipendenteDAOImpl;
import model.Dipendente;
import model.Dirigente;
import model.Fattorino;
import model.Impiegato;

public class AziendaDemo {

	public static void main(String[] args) {
		
		GestioneAziendale azienda1=new GestioneAziendale("marioTecnology");
		
		Fattorino f1=new Fattorino("davide");
		Fattorino f2=new Fattorino("denis");
		Fattorino f3=new Fattorino("denis 2");
		
		Impiegato i1=new Impiegato("fabio");
		Impiegato i2=new Impiegato("enrico");
		Impiegato i3=new Impiegato("raf");//se non è con la tipa
		
		Dirigente d=new Dirigente("simone");
		
		
		azienda1.addDipendente(f1);
		azienda1.addDipendente(f2);
		azienda1.addDipendente(f3);
		
		azienda1.addDipendente(i1);
		azienda1.addDipendente(i2);
		azienda1.addDipendente(i3);
		
		azienda1.addDipendente(d);
		
		List<Dipendente> dipendenti = azienda1.getDipendenti();
		for (Dipendente dipendente : dipendenti) {
		//	System.out.println(dipendente);
			
			if (dipendente instanceof Fattorino) {
				((Fattorino) dipendente).setConsegne(100);
			}
			if (dipendente instanceof Impiegato) {
				((Impiegato) dipendente).setOreLavorate(160);
			}
			if (dipendente instanceof Dirigente) {
				((Dirigente) dipendente).setNumeroDipendenti(6);
			}
			
		}
		for (Dipendente dipendente : dipendenti) {
			dipendente.calcolaStipendio();
			System.out.println(dipendente);
		}
		DipendenteDAO dao=new DipendenteDAOImpl();
		for (Dipendente dipendente : dipendenti) {
			dao.addDipendente(dipendente);
		}
		
		
	}
	
}
