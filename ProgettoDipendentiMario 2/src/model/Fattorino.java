package model;

public class Fattorino extends Dipendente {
	
	private int consegne;
	private double pagaBase=5;
	
	

	public Fattorino(String nome) {
		super(nome);
		this.ruolo="fattorino";
		
		// TODO Auto-generated constructor stub
	}

	@Override
	public void calcolaStipendio() {
		this.stipendio=consegne*pagaBase;
		// TODO Auto-generated method stub

	}

	public int getConsegne() {
		return consegne;
	}

	public void setConsegne(int consegne) {
		this.consegne = consegne;
	}

}
