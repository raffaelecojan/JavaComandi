package model;

import java.util.Date;

public class Nota {

	String titolo;
	String descizione;
	Date dataCreazione = new Date();
	
	public Nota(String titolo, String descizione) {
		super();
		this.titolo = titolo;
		this.descizione = descizione;
	}
	
	public String stampaNota() {
		return this.titolo + " " + this.descizione + " " + this.dataCreazione;
	
	}
	public int calcolaPosizioneRestanti() {
		int posRes = 0;
	}
	
}
