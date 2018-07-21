package Lab1.NameOfTheProgram;

public class Random {
	public static void main(String []args) {
		double x; 
		//Generate random varaible in range between -1 to 1;
		x = Math.random()* ((0 - (-1))+ 1) + -1; 
		System.out.println(x);
		/*for range 1 to 10 
		 Math.random() * 9 + 1; */
		
	}
}
