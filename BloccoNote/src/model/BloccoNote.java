package model;

public class BloccoNote {
	
	public String nome = "Blocco note di Raffaele";
	Nota[] elencoNote = new Nota[10];	
	
	public void addNota(String titolo, String descrizione, int posizione) {
	
		Nota n = new Nota(titolo, descrizione);
		elencoNote[posizione] = n;
	
	}
	
	public void stampa() {
		for(int i = 0; i<elencoNote.length; i++) {
				if(elencoNote[i] != null) 
					System.out.println(elencoNote[i].stampaNota());
				}
	}
	public void pulisciBloccoNote() {
		for(int i=0;i<elencoNote.length; i++) {
			elencoNote[i]=null;
		
	}
		}
	}	
