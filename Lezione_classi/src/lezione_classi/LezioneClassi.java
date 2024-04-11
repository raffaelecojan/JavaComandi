package lezione_classi;

public class LezioneClassi {
	double altezza, base;
	
	public LezioneClassi() {
		super();
	}
	
	public LezioneClassi(double altezza, double base) {
		this.altezza = altezza;
		this.base = base;
	}
	
	public static void main(String[] args) {
		LezioneClassi rettangolo = new LezioneClassi(4.2, 7.4);
		System.out.println(rettangolo.altezza);
		System.out.println(rettangolo.base);
		
		double area = rettangolo.altezza * rettangolo.base;
		double perimetro = (rettangolo.altezza + rettangolo.base)*2;
		
		System.out.println("area = "+area);
		System.out.println("perimetro = "+perimetro);
	}
	
	
	
}
