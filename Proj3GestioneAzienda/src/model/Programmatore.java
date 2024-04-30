package model;

public class Programmatore extends Dipendente{

	public Programmatore(String nome, String cognome, int numMatricola) {
		super(nome, cognome, numMatricola);
	}

	public double calcoloStipendio() {
		int stipendio = 1200;
		return stipendio;
	}
	
}
