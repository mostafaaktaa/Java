package Uebung05;

public class BruchTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stu
		Bruch a = new Bruch();
		Bruch b = new Bruch(3, 12);

		System.out.println(a.zaehler);
		b.zaehler = 3;
		b.nenner = 12;
		b.ausgeben();

		System.out.print("\nUnd nach dem K?rzen: ");
		b.kuerzen();
		b.ausgeben();
	    
		
	}

}
