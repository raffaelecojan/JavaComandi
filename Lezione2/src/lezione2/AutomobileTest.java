package lezione2;

public class AutomobileTest {
	
	
	public static void main(String[] args) {
		Lezione2 auto1 = new Lezione2();
		System.out.println(auto1.marca);
		System.out.println(auto1.cilindrata);
		auto1.cilindrata =1200;
		System.out.println(auto1.cilindrata);
		
		Lezione2 auto2 = new Lezione2("opel", "Astra", 1600);
		System.out.println(auto2.marca);
		Lezione2 auto3 = new Lezione2("Peugeot", "2008", 1200, (byte)2, false);
	
		System.out.println(auto3.toString());
	
	
	}
	
}
