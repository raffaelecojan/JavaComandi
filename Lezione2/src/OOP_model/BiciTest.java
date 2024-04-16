package OOP_model;

public class BiciTest {
	
	public static void main(String[] args) {
		Bicicletta bici1 = new Bicicletta("Cannonda", "c-bike", (byte)2, 21);
		System.out.println("la mia bici è una : "+bici1.toString());
		bici1.accelera(200);
		bici1.accelera(100);
		bici1.rallenta(60);
		System.out.println(bici1.toString());
		Bicicletta bici2 = new Bicicletta("bianchi", "Bartali", (byte)2, 10);
		bici2.accelera(800);
		bici2.calcolaVelocitaMax();
		System.out.println(bici2.toString());
		
		
		
		
		
		
		
	}
	
}
