package operators;

public class ArithmeticOperators {

	public static void main(String[] args) {
//		int a = 24;
//		int b = 6;
//		
//		int c = a + b;
//		int d = a * a + b * b;
//		System.out.println(c);
//		System.out.println(d);
		
		int a = 23;
		int b = 45;
		double c = (double)b/(double)a;
		System.out.println(c);
		 
		int d = b % a; // returns reminder
		System.out.println(d);
		
		int e = b++;
		System.out.println(e);
		System.out.println(b);
		
		int f = ++b;
		System.out.println(f);
		System.out.println(b);
	}

}
