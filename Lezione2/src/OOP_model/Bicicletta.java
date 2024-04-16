package OOP_model;

public class Bicicletta {
	String modello;
	String marca;
	byte numRuote;
    double velocita = 0;
	int frequenza = 0;
	int numMarce;
	
	public Bicicletta(String marca, String modello, byte numRuote, int numMarce) {
		this.modello = modello;
		this.marca = marca;
		this.numRuote = numRuote;
		this.numMarce = numMarce;
	}
	
	public void accelera(int incFrequenza) {
		frequenza = frequenza + incFrequenza;
		System.out.println("Stai accelerando, la frequenza attuale è "+frequenza);
	}

	public void rallenta(int incFrequenza) {
		frequenza = frequenza - incFrequenza;
		System.out.println("stai decelerando, la frequenza attuale è "+frequenza);
	}
	public void calcolaVelocitaMax() {
		velocita = frequenza * numMarce;
		System.out.println("la velocità massima è "+velocita);
	}
	@Override
	public String toString() {
		return "Bicicletta [marca=" + marca + ", modello=" + modello + ", numRuote=" + numRuote + ", velocita="
				+ velocita + ", frequenza=" + frequenza + ", numMarce=" + numMarce + "]";
	}
	
	
}
