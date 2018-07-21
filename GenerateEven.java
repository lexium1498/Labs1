package Lab1.NameOfTheProgram;

public class GenerateEven {
	public static void main(String[]args) {
		double x ; 
		x = Math.random() * 100; 
		int n = (int)Math.round(x);
		if(n % 2 == 0 ) {
			System.out.println(n);
		}else {
			if(n % 2 == 1) {
				System.out.println(n+1);
			}
		}
		
	}
}
