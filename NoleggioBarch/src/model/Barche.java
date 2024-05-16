package model;

public class Barche {
	private String nome;
	private String marca;
	private int velocita;
	private int capienzaPersone;
	private String disponibilita;
	
	public Barche(String nome, String marca, int velocita, int capienzaPersone, String disponibilita) {
		super();
		this.nome = nome;
		this.marca = marca;
		this.velocita = velocita;
		this.capienzaPersone = capienzaPersone;
		this.disponibilita = disponibilita;
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public int getVelocita() {
		return velocita;
	}

	public void setVelocita(int velocita) {
		this.velocita = velocita;
	}

	public int getCapienzaPersone() {
		return capienzaPersone;
	}

	public void setCapienzaPersone(int capienzaPersone) {
		this.capienzaPersone = capienzaPersone;
	}

	public String getDisponibilita() {
		return disponibilita;
	}

	public void setDisponibilita(String disponibilita) {
		this.disponibilita = disponibilita;
	}

	@Override
	public String toString() {
		return "Barca: nome=" + nome + ", marca=" + marca + ", velocita=" + velocita + ", capienzaPersone="
				+ capienzaPersone + ", disponibilita=" + disponibilita;
	}
	
	
}
