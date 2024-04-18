package dado;

import java.util.ArrayList;
import java.util.Scanner;

public class DadoTest {
	
	private static void imbroglio(int lancio6, int lancio12, int lancio20) {
		System.out.println("hai eseguito i seguenti lanci: "+ lancio6 + " - "+lancio12+" - "+lancio20);
		if(lancio6 == lancio12 && lancio12 == lancio20) {
			System.out.println("complimenti sei super fortunato tutti i dadi hanno lo stesso numero + 100 punti");
		}
		else {System.out.println("mi spiace non sei cosi fortunato");}
	}
	
	
	private static void superLukcy(int lancio6, int lancio12, int lancio20) {
		System.out.println("hai eseguito i seguenti lanci: "+ lancio6 + " - "+lancio12+" - "+lancio20);
		ArrayList<Integer> lanci = new ArrayList<>();
		lanci.add(lancio6);
		lanci.add(lancio12);
		lanci.add(lancio20);
		int risultato = 0;
		if(lancio6 == lancio12 && lancio12 == lancio20) {
			System.out.println("complimenti sei super fortunato tutti i dadi hanno lo stesso numero");
			risultato += 100;
		}
		else {System.out.println("mi spiace non sei cosi fortunato");}
		System.out.println("Hai totalizzato "+risultato + " punti");
	}
	
	private static void calcolaRisultato(int lancio6, int lancio12, int lancio20) {
		System.out.println("hai eseguito i seguenti lanci: "+ lancio6 + " - "+lancio12+" - "+lancio20);
		ArrayList<Integer> lanci = new ArrayList<>();
		lanci.add(lancio6);
		lanci.add(lancio12);
		lanci.add(lancio20);
		
		int risultato = 0;
		int somma = lancio6 + lancio12+lancio20;
		if(somma>26) {
				risultato +=10;
		}
		for(Integer LancioSingolo : lanci) {
			if(LancioSingolo % 2 == 0)
				risultato +=6;
		}
		System.out.println("Hai totalizzato "+risultato + " punti");
	}
	
	
	public static void main(String[] args) {
		Dado dado6 = new Dado(6);
		Dado dado12 = new Dado(12);
		Dado dado20 = new Dado(20);
		

		
	System.out.println("Gioco dei 3 dani");
	boolean condizioneUscita = true;
	while(condizioneUscita) {
		System.out.println("inserisci un comando : L pre laciare, S per la superLucky, 0 per chiudere");
		Scanner input = new Scanner(System.in);
	    String comando = input.nextLine();
	    
	    switch(comando) {
	    case "L" :
	    	int lancio6 = dado6.lancia();
	    	int lancio12 = dado12.lancia();
	    	int lancio20 = dado20.lancia();
	    	
	    	calcolaRisultato(lancio6,lancio12,lancio20);
	    	break;
	    case "S":
	    	lancio6 = dado6.lancia();
    		lancio12 = dado12.lancia();
    		lancio20 = dado20.lancia();
    		superLukcy(lancio6,lancio12,lancio20);
	    	break;
	    	
	    case "pippo":
	    	lancio6 = dado6.truccaDado();
    		lancio12 = dado12.truccaDado();
    		lancio20 = dado20.truccaDado();
    		imbroglio(lancio6,lancio12,lancio20);
    		break;
    		
	    case "0":
	    	System.out.println("Hai chiuso il gioco");
	    	condizioneUscita = false;
	    	break;
	    	
	    default:
	    	System.out.println("non capisco il comando");
	    	break;
	    }
	    

	
	}
	
	}

	


	

	
}
