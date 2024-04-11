package lezione_classi;

public class Lezione_classi {

	int base, altezza;
	
	public static void main(String[] args) {
		
		Lezione_classi rettangolo = new Lezione_classi();
		
		rettangolo.altezza = 5;
		rettangolo.base = 6;
		
		int area = rettangolo.altezza * rettangolo.base;
		int perimetro = (rettangolo.altezza + rettangolo.base)*2;
		
		System.out.println("altezza vale : " + rettangolo.altezza);
		System.out.println("base vale : " + rettangolo.base);
		System.out.println("area vale : " + area);
		System.out.println("perimetro vale : " + perimetro);
		
		
		Lezione_classi rettangolo2 = new Lezione_classi();
		rettangolo2.base = 4;
		rettangolo2.altezza= 8;
		
		int area2 = rettangolo2.altezza * rettangolo2.base;
	}

}
