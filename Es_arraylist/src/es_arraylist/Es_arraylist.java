package es_arraylist;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Es_arraylist {

	public static void main(String[] args) {
		
		List<String> nomi = new ArrayList<>(Arrays.asList("raffaele","fabio","luca","lorenzo","matteo","jack","daniele","tomas","andrea","francesca"));
		Collections.sort(nomi);
		
		for(int i=0; i<nomi.size(); i++) {
			System.out.println((i+1)+". "+nomi.get(i));
		}
		int x=1;
		for(String nome: nomi) {
			System.out.println(x+" "+nome);
			x++;
		}
		
		System.out.println("la lista ha "+nomi.size()+" elementi");
		
		nomi.removeAll(nomi);
		if(nomi.size()==0)
			System.out.println("lista vuota");
			
	}

}
