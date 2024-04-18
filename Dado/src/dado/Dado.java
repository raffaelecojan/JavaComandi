package dado;

import java.util.Random;

public class Dado {
	int numFacce;
	Random numRand;
	
	public Dado(int numFacce) {
		this.numFacce = numFacce;
	}
	
	public int lancia(){
		numRand = new Random();
		int faccia = numRand.nextInt(1, this.numFacce + 1);
		return faccia;
	}
	
	public int truccaDado(){
		numRand = new Random();
		int trucco = numRand.nextInt(3,6);
		return trucco;
	}
	
	
	
	
	
}
