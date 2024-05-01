package model;

public class Programmatore extends Dipendente{

	public Programmatore(String nome, String cognome, int numMatricola) {
		super(nome, cognome, numMatricola);
	}

	public double calcoloStipendio() {
		int stipendio = 1800;
		return stipendio;
	}
	@Override
	public String toString() {
		return "Programmatore [nome=" + nome + ", cognome=" + cognome + ", numMatricola=" 
				+ numMatricola + " stipendio :" +calcoloStipendio()+"]";
	}
}
