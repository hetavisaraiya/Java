package userInput;
import java.util.Scanner;
public class UserInput {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		System.out.println(x);
		double y = sc.nextDouble();
		System.out.println(y);
		float f = sc.nextFloat();
		System.out.println(f);
		long l = sc.nextLong();
		System.out.println(l);
		
		String hello = sc.nextLine(); // String is non-primitive datatype
		System.out.println("hello " + hello);
	}

}
