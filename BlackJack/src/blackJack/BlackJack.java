package blackJack;

import java.util.ArrayList;
import java.util.Scanner;

public class BlackJack {

	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
		String scelta;
		int soldi= 10000;
		double playerCasuale = 0;
		int player =0;
		double bancoCasuale = 0;
		int banco=0;
		int manoPlayer =0;
		int manoBanco =0;
		System.out.println("scrivere carta o sto, hai "+soldi+" soldi");
		
		ArrayList<Integer> numeroEstratto = new ArrayList<Integer>();
		
		
         for (int i = 0; i < 2; i ++) {
			
			playerCasuale = Math.random()*13;
			player = (int) Math.ceil(playerCasuale);
			bancoCasuale = Math.random()*13;
			banco = (int) Math.ceil(bancoCasuale);
			if (numeroEstratto.contains(player) == false || numeroEstratto.contains(banco)) {
				numeroEstratto.add(player);
				numeroEstratto.add(banco);
				switch (player){
				case 2,3,4,5,6,7,8,9,10:
					manoPlayer = manoPlayer+player;
					System.out.println("carta per il player "+player);
					break;
				case 11,12,13:
					manoPlayer = manoPlayer+10;
				    System.out.println("carta per il player "+10);
					break;
				case 1:
					manoPlayer = manoPlayer+11;
					System.out.println("carta per il player asso");
					break;
				}
				switch (banco){
				case 2,3,4,5,6,7,8,9,10:
					manoBanco = manoBanco+banco;
				    System.out.println("carta per il banco "+banco);
					break;
				case 11,12,13:
					manoBanco = manoBanco+10;
				    System.out.println("carta per il banco "+10);
					break;
				case 1:
					manoBanco = manoBanco+11;
					System.out.println("carta per il banco asso");
					break;
				}
					
			} else {
				i--;
			}
		}
		System.out.println("mano player "+manoPlayer);
		System.out.println("mano banco "+manoBanco);
		
		
		scelta = input.nextLine();
		while(scelta.equals("carta")) {
			playerCasuale = Math.random()*13;
			player = (int) Math.ceil(playerCasuale);
			if (numeroEstratto.contains(player) == false) {
				numeroEstratto.add(player);
				switch (player){
				case 2,3,4,5,6,7,8,9,10:
					manoPlayer = manoPlayer+player;
					System.out.println("carta per il player "+player);
					break;
				case 11,12,13:
					manoPlayer = manoPlayer+10;
				    System.out.println("carta per il player "+10);
					break;
				case 1:
					manoPlayer = manoPlayer+11;
					System.out.println("carta per il player asso");
					break;
				}
				System.out.println("mano player "+manoPlayer);
				if(manoPlayer>21) {
					System.out.println("hai perso");
					break;
				}
				System.out.println("chiedi carta o stai?");
				scelta = input.nextLine();
				
			}
		
		}
		if(manoPlayer<=21) {
		if(manoPlayer>21) 
			System.out.println("hai perso");
		else {
		
			while(manoBanco<17) {
				bancoCasuale = Math.random()*13;
				banco = (int) Math.ceil(bancoCasuale);
					if (numeroEstratto.contains(banco) == false) {
						numeroEstratto.add(banco);
						switch (banco){
						case 2,3,4,5,6,7,8,9,10:
							manoBanco = manoBanco+banco;
						    System.out.println("carta per il banco "+banco);
							break;
						case 11,12,13:
							manoBanco = manoBanco+10;
						    System.out.println("carta per il banco "+10);
							break;
						case 1:
							manoBanco = manoBanco+11;
							System.out.println("carta per il banco asso");
							break;
						}
					} 
					System.out.println("mano banco "+manoBanco);	
			}
		}	
		if(manoBanco>21) 
			System.out.println("hai vinto");
		else if(manoPlayer>manoBanco)
			System.out.println("hai vinto");
		else if(manoPlayer==manoBanco) 
			System.out.println("hai pushato");
		else if(manoPlayer<manoBanco)
			System.out.println("hai perso");
		}

	}

}
