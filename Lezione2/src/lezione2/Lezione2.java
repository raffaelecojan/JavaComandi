package lezione2;

public class Lezione2 {
	
	
	String marca = "fiat";
	String modello;
	int cilindrata;
	byte ruoteMotrici = 2;
	boolean statoMotore = false;
	
	public Lezione2() {}
		
	public Lezione2(String marca) {this.marca = marca;}
	
	public Lezione2(String marca, String modello, int cilindrata) {
		this.marca = marca;
		this.modello = modello;
		this.cilindrata = cilindrata;			
	}
	public Lezione2(String marca, String modello, int cilindrata, byte ruoteMotrici, boolean statoMotore) {
		this.marca = marca;
		this.modello = modello;
		this.cilindrata = cilindrata;	
		this.ruoteMotrici = ruoteMotrici;
		this.statoMotore = statoMotore;
	}

	@Override
	public String toString() {
		return "Lezione2 [marca=" + marca + ", modello=" + modello + ", cilindrata=" + cilindrata + ", ruoteMotrici="
				+ ruoteMotrici + ", statoMotore=" + statoMotore + "]";
	}


}
