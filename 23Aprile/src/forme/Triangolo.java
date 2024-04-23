package forme;

public class Triangolo {
	public Punto a, b, c; 
	public Segmento ab,bc,ca;
	
	public Triangolo(Punto a, Punto b, Punto c) {
		this.a = a;
		this.b = b;
		this.c = c;
		this.ab = new Segmento(a, b);
		this.bc = new Segmento(b, c);
		this.ca = new Segmento(c, a);
	}
	
	public double getPerimetro() {
		double perimetro = ab.calcolaLunghezzaSegmento() + bc.calcolaLunghezzaSegmento() + ca.calcolaLunghezzaSegmento();
		return perimetro;
	}
	public double getArea() {
		double sp=getPerimetro()/2;
		double area=Math.sqrt(sp*(sp-ab.calcolaLunghezzaSegmento())*(sp-bc.calcolaLunghezzaSegmento())*(sp-ca.calcolaLunghezzaSegmento()));
		return area;
	}
	
}
