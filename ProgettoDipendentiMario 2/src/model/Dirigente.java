package model;

public class Dirigente extends Dipendente {
	
	private double pagaBase=1_000;
	private int numeroDipendenti;
	private double quotaDipendenti=200;

	public Dirigente(String nome) {
		super(nome);
		this.ruolo="dirigente";
		// TODO Auto-generated constructor stub
	}

	@Override
	public void calcolaStipendio() {
		this.stipendio=pagaBase+(numeroDipendenti*quotaDipendenti);
		
		// TODO Auto-generated method stub

	}

	public int getNumeroDipendenti() {
		return numeroDipendenti;
	}

	public void setNumeroDipendenti(int numeroDipendenti) {
		this.numeroDipendenti = numeroDipendenti;
	}

}
