package es_classi;

import java.util.Scanner;

public class Esclassi {
	double num1,num2;
	String simbolo;
	
	public Esclassi(double num1, double num2, String simbolo) {
		super();
		this.num1 = num1;
		this.num2 = num2;
		this.simbolo = simbolo;
		
	}
	
	public double calcolaSomma() {
		double somma = this.num1 + num2;
		return somma;
	}

	public double calcolaDifferenza() {
		double dif = this.num1 - this.num2;
		return dif;
	}
	 public double calcolaQuoziente() {
		 double quo = this.num1 / this.num2;
		 return quo;
	 }
	 public double calcolaProdotto() {
		 double pro = this.num1 * this.num2;
		 return pro;
	 }

	 public double calcola(){
		 double x=0;
		 switch(this.simbolo) {
		 case "+":
			  x = calcolaSomma();
			  break;
		 case "-":
			  x = calcolaDifferenza();
			  break;
		 case "/":
			  x = calcolaQuoziente();
			  break;
		 case "*":
			  x = calcolaProdotto();
			  break;
		 }
		return x;
		
	 }



	public static void main(String[] args) {
		Scanner inputNum = new Scanner(System.in);
		double n1, n2;
		String operazione;
		
		System.out.println("inserisci 2 valori");
		n1=inputNum.nextDouble();
		n2=inputNum.nextDouble();
		
		
		System.out.println("inserisci l'operazione che vuoi fare");
		
		operazione=inputNum.next();
		System.out.println(operazione);
		
		Esclassi cost = new Esclassi(n1, n2, operazione);
		System.out.println("l'operazione vale"+cost.calcola());
		
		}

}
