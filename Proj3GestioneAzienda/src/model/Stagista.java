package model;

public class Stagista extends Dipendente{

	public Stagista(String nome, String cognome, int numMatricola) {
		super(nome, cognome, numMatricola);
	}
	
	public double calcoloStipendio() {
		int stipendio = 800;
		return stipendio;
	}
}
