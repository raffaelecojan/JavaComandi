package forme;

public class geometriaTester {
	public static void main(String[] args) {
		
		Punto a = new Punto(2, 3);
		Punto b = new Punto(5, 3);
		Punto c = new Punto(4, 8);
		
		Segmento ab = new Segmento(a, b);
		System.out.println(ab.calcolaLunghezzaSegmento());
	
		Segmento bc = new Segmento(b, c);
		System.out.println();
		
		Quadrato ql = new Quadrato(ab);
		System.out.println("l'area vale "+ql.getArea());
		System.out.println("il perimetro vale "+ql.getPerimetro());
		System.out.println(ql.toString());
		
		Triangolo tr1 = new Triangolo(a, b, c);
		System.out.println(tr1.toString());
		System.out.println("il perimetro del triangolo " + tr1.getPerimetro());
		System.out.println("l'are vale "+tr1.getArea());
	
		Rettangolo re1= new Rettangolo(ab, bc);
		System.out.println("il perimetro del rettangolo " + re1.getPerimetro());
		System.out.println("l'are vale "+re1.getArea());
	}
	
}
