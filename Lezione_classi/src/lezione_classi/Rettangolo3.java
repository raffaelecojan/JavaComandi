package lezione_classi;

public class Rettangolo3 {
	
	double altezza, base;
	String nomeFigura;
	
	
	

@Override
	public String toString() {
		return "Rettangolo3 [altezza=" + altezza + ", base=" + base + ", nomeFigura=" + nomeFigura + "]";
	}

	//per generare un costruttore con i campi usare alt-shift-s generate-con-usi-fi
	public Rettangolo3(double altezza, double base, String nomeFigura) {
		super();
		this.altezza = altezza;
		this.base = base;
		this.nomeFigura = nomeFigura;
	}
	
	public double calcolaVolume(double profondita) {
		double volume = calcolaArea() * profondita; 
		return volume;
	}
	
	public double calcolaArea(){
		double area = this.altezza * this.base;
		return area;
	}
	public static void main(String[] args) {
		Rettangolo3 rettangolo = new Rettangolo3(8.5, 6.4, "rettangolino");
		System.out.println("l'area del "+rettangolo.nomeFigura + " vale "+rettangolo.calcolaArea());
		System.out.println("volume vale "+ rettangolo.calcolaVolume(4));
		System.out.println(rettangolo);
	}
	
}
