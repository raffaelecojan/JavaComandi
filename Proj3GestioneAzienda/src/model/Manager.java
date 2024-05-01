package model;

public class Manager extends Dipendente{
	
	public Manager(String nome, String cognome, int numMatricola) {
		super(nome, cognome, numMatricola);
	}
	
	public double calcoloStipendio() {
		int stipendio = 3000;
		return stipendio;
	}

	@Override
	public String toString() {
		return "Manager [nome=" + nome + ", cognome=" + cognome + ", numMatricola=" 
				+ numMatricola + " stipendio :"+calcoloStipendio()+"]";
	}
	
}
