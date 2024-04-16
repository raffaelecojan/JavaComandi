package OOP_test;

import OOP_model.Motocicletta;

public class MotociclettaTest {

	public static void main(String[] args) {
		Motocicletta moto1 = new Motocicletta("2750", 750);
		Motocicletta moto2 = new Motocicletta("ninja", 1000);
		Motocicletta moto3 = new Motocicletta("2800", 799);
		System.out.println(moto1.toString());
		System.out.println(moto2.toString());
		System.out.println(moto3.toString());
		System.out.println();
	}

}
