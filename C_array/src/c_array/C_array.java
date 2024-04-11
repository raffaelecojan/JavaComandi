package c_array;

import java.util.Arrays;

public class C_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 
//		int[] voti = new int[12];
//		 
//		for(int i=0; i<voti.length; i++) {
//		    double voto= Math.ceil(Math.random() * 30);
//		    voti[i] = (int)voto;
//		    System.out.println(voti[i]);
//		    }
		
//		int contatore=1;
//		int[] [] matrice = new int[5][6];
//			for(int i=0; i<matrice.length; i++) {
//				for(int j=0; j<matrice[i].length; j++) {
//					matrice[i][j]= contatore;
//					contatore++;
//					System.out.print(matrice[i][j]+"   ");
//				}
//				System.out.println();
//			}
		
		String[] parole = {"ciao", "come", "stai", "tutto", "bene", "grazie"};
		Arrays.sort(parole);
		for(int i =0; i<parole.length; i++) {
			System.out.println(parole[i]);
		}
		
	}
}
