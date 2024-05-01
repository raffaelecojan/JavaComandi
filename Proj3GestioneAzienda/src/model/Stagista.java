package model;

public class Stagista extends Dipendente{
	
	public Stagista(String nome, String cognome, int numMatricola) {
		super(nome, cognome, numMatricola);
	}
	
	public double calcoloStipendio() {
		int stipendio = 1200;
		return stipendio;
	}
	@Override
	public String toString() {
		return "Stagista [nome=" + nome + ", cognome=" + cognome + ", numMatricola=" 
				+ numMatricola + " stipendio :"+calcoloStipendio()+"]";
	}
}
