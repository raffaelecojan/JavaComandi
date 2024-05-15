package model;

public class Impiegato extends Dipendente {
	
	private int oreLavorate;
	private double pagaBase=8.5;
	
	
	public Impiegato(String nome) {
		super(nome);
		this.ruolo="impiegato";
		// TODO Auto-generated constructor stub
	}

	@Override
	public void calcolaStipendio() {
		// TODO Auto-generated method stub
		this.stipendio=oreLavorate*pagaBase;
	}

	public int getOreLavorate() {
		return oreLavorate;
	}

	public void setOreLavorate(int oreLavorate) {
		this.oreLavorate = oreLavorate;
	}

}
