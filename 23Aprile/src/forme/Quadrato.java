package forme;

public class Quadrato extends Rettangolo {
 public Segmento lato;

public Quadrato(Segmento lato) {
	super(lato, lato);
	this.lato = lato;
}

@Override
public String toString() {
	return "Quadrato [lato=" + lato + "]";
}
 
}
