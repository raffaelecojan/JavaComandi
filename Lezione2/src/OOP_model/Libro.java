package OOP_model;

import java.util.ArrayList;
import java.util.List;

public class Libro {
	public String titolo;
	String autore;
	List<String> generi = new ArrayList<String> ();
	int numparine;
	String casaEditrice;
	boolean isNuovo;
	double prezzo;
	
	public Libro(String titolo, String autore, List<String> generi, int numparine, String casaEditrice, boolean isNuovo,
			double prezzo) {
		super();
		this.titolo = titolo;
		this.autore = autore;
		this.generi = generi;
		this.numparine = numparine;
		this.casaEditrice = casaEditrice;
		this.isNuovo = isNuovo;
		this.prezzo = prezzo;
	}

	@Override
	public String toString() {
		String condizione;
		if(isNuovo) 
			condizione = "nuovo";
		else {
			condizione = "Usato";
		}
		return "Libro [titolo=" + titolo + ", autore=" + autore + ", generi=" + generi + ", numparine=" + numparine
				+ ", casaEditrice=" + casaEditrice + ", isNuovo=" + isNuovo + ", prezzo=" + prezzo + "]";
	}
	




}
