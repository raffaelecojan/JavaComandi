package OOP_test;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import OOP_model.Libro;

public class Libreria {
	public static void main(String[] args) {
	ArrayList<Libro> scaffale = new ArrayList<Libro>();
	ArrayList<String> generiLibro1 = new ArrayList<String>();
	generiLibro1.add("fantasy");
	generiLibro1.add("Avventura");
	
	Libro libro1 = new Libro("Il Signore degli anelli", "J.R.Tolkien", generiLibro1, 1200, "utet", false, 16.80);
	
	scaffale.add(libro1);
	ArrayList<String> generiLibro2 = new ArrayList<String>();
	generiLibro2.add("fantastico");
	generiLibro2.add("Avventura");
	
	Libro libro1 = new Libro("il visconte", "Calvino", generiLibro2, 150, "feltrinelli", true, 12.50);
    System.out.println("Comandi utente: t per titolo, s pewr stampare tutto, 0 per uscire");
	Scanner input = new Scanner(System.in);
	String comando, titolo;
	do {
	comando = input.nextLine();
	if(comando.equals("t")) {
		System.out.println("inserisci il titolo");
		titolo = input.nextLine();
		for(Libro libro : scaffale) {
			if(libro.titolo.equals(titolo)) {
				System.out.println("libro trovato");
				System.out.println(libro.toString());	
			}else {
				System.out.println("mi spiace, questo titolo non esiste");
			}
		}
	}else if(comando.equals("s")) {
		System.out.println("stampo tutti i libri");
		for(Libro libro : scaffale) {
			System.out.println(libro.toString());
		}
	}
		
	}while(comando != "0");
	}
}
