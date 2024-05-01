package model;

public class Dipendente {
	String nome, cognome, ruolo;
	int numMatricola;

	public Dipendente(String nome, String cognome, int numMatricola) {
		this.nome = nome;
		this.cognome = cognome;
		this.numMatricola = numMatricola;
	}
	

	public Dipendente(String nome, String cognome, int numMatricola, String ruolo) {
		this.nome = nome;
		this.cognome = cognome;
		this.numMatricola = numMatricola;
		this.ruolo = ruolo;
	}


	@Override
	public String toString() {
		return "Dipendente [nome=" + nome + ", cognome=" + cognome + ", numMatricola="
				+ numMatricola + "]";
	}


	
	
	
	
}
