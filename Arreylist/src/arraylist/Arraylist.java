package arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Arraylist {

	public static void main(String[] args) {
//		ArrayList<String> animali = new ArrayList<String>();
//		animali.add("cane");
//		animali.add("gatto");
//		animali.add("Gatto");
//		animali.add("Squalo");
//		
//		System.out.println(animali.get(0));
//		System.out.println(animali.get(2));
//		animali.remove(3);
//		System.out.println("il mioo array è composto da "+ animali.size()+" elementi");
//		
//		
//		
//		ArrayList<Integer> voti = new ArrayList<>();
//		voti.add(10);
//		voti.add(5);
//		voti.add(12);
//		voti.add(1);
//		
//		for(Integer voto : voti) {
//			System.out.println(voto);
//		}
//		
//		List<String> parole = new ArrayList<>();
//		parole.add("ciao");
//		parole.add("come");
//		parole.add("stai");
//		
//		for(String parola : parole) {
//			System.out.println(parola);
//		}
//		
//		List<String> nomi = new ArrayList<>(Arrays.asList("dario","Luisa", "Pasquale", "Gennaro", "Anna", "Luca"));
//		
//		for(String nome : nomi) {
//			System.out.println(nome);
//		}
		
		//creare array partendo da un arraylist
		
		List<String> colori = new ArrayList<>();
		colori.add("rosso");
		colori.add("Giallo");
		colori.add("Blu");
		colori.add("Verde");
		colori.add("Rosa");
		colori.add("Bianco");
		colori.add("Nero");
		
		String[] coloriPR = new String[colori.size()];
		
		for(int i=0; i<colori.size(); i++) {
			coloriPR[i]= colori.get(i);
		}
		
		for(String colore: coloriPR) {
			System.out.println(colore);
		}
		
		Collections.reverse(colori); //colori al contrario
		
		Collections.shuffle(colori); //colori smistati
		Collections.sort(colori); //ordina alfabeticamente
		Collections.sort(colori, Collections.reverseOrder()); //sort e reverse insieme
		
		
		
	}

}
