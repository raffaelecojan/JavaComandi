package tester;

import java.util.Scanner;

import model.BloccoNote;

public class BloccoNoteController {
	
	
	public static void main(String[] args) {
		
		BloccoNote blocco = new BloccoNote();
		System.out.println("benvenuto nel tuo blocco note, "+ blocco.nome);
		System.out.println("aggiungi una nuova nota");
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Titolo: ");
		String titolo = input.nextLine();
		
		System.out.println("Descrizione: ");
		String descrizione = input.nextLine();
		
		System.out.println("Posizione: ");
		int posizione = input.nextInt();
		
		blocco.addNota(titolo, descrizione, posizione);
		blocco.stampa();
	}
}
