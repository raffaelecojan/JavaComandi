package forme;

public class Segmento {
	public Punto a,b;
	public double lunghezza;
	
	public Segmento(Punto a, Punto b) {
		this.a = a;
		this.b = b;
	}

	public double calcolaLunghezzaSegmento() {
		this.lunghezza=Math.sqrt((Math.pow((b.x-a.x),2))+(Math.pow((b.y-a.y),2)));
	    return this.lunghezza;
	}
	
	
	@Override
	public String toString() {
		return "Segmento [a=" + a + ", b=" + b + ", lunghezza=" + lunghezza + "]";
	}
	
	
}
