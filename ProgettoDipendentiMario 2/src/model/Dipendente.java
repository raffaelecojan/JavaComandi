package model;

public abstract class Dipendente {
	
	private static int counter=1;
	
	protected String nome;
	protected String ruolo;
	private int matricola;
	protected double stipendio;
	
	public String getRuolo() {
		return ruolo;
	}
	
	public String getNome() {
		return nome;
	}
	
	public Dipendente(String nome) {
		this.nome = nome;
		this.matricola = counter++;
	}
	
	public abstract void calcolaStipendio();

	public double getStipendio() {
		return stipendio;
	}

	@Override
	public String toString() {
		return "Dipendente [nome=" + nome + ", ruolo=" + ruolo + ", matricola=" + matricola + ", stipendio=" + stipendio
				+ "]";
	}
	
	
	

}
