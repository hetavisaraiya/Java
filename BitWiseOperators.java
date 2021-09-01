package operators;

public class BitWiseOperators {

	public static void main(String[] args) {
		// 5 - 101
		// 6 - 110
		// 4 - 100 (and)
		// 7 - 111 (or)
		// Right shift -> divide by 2 (with floor value for odd numbers) -> 1101 -> 0110 -> 0011 -> 0001 ->0000
		// left shift -> multiply by 2 

		
		int a = 5;
		int b = 6;
		int c = a & b;
		int d = a | b;
		System.out.println(c);
		System.out.println(d);
		
		int e = b >> 1; //->3
		int f = b >> 2; //-> 1
		System.out.println(e);
		System.out.println(f);		
		int g = b << 1; // ->12
		int h = b << 2; // ->24
		System.out.println(g);
		System.out.println(h);
	}

}
