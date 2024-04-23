package forme;

public class Rettangolo {
	Segmento base, altezza;

	public Rettangolo(Segmento basa, Segmento altezza) {
		this.base = basa;
		this.altezza = altezza;
	}
	
	public double getPerimetro() {
		double perimetro = 2*(base.calcolaLunghezzaSegmento() + altezza.calcolaLunghezzaSegmento());
		return perimetro;
	}
	public double getArea() {
		double area = base.calcolaLunghezzaSegmento() * altezza.calcolaLunghezzaSegmento();
		return area;
	}

	@Override
	public String toString() {
		return "Rettangolo [base=" + base + ", altezza=" + altezza + ", getPerimetro()=" + getPerimetro()
				+ ", getArea()=" + getArea() + "]";
	}
	
	
}
