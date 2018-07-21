package Lab1.NameOfTheProgram;

public class Rounding {
	public static void main(String[]args) {
		double x ; 
		x = Math.random() * 100 ; 
		System.out.println(x);
		x = Math.round(x);
		System.out.println(x);
		int r = (int)Math.round(x);
		System.out.println(r);
		
	}
}
