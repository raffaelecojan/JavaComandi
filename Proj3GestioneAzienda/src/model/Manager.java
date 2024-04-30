package model;

public class Manager extends Dipendente{

	public Manager(String nome, String cognome, int numMatricola) {
		super(nome, cognome, numMatricola);
	}
	
	public double calcoloStipendio() {
		int stipendio = 2000;
		return stipendio;
	}
}
