package loops;

import java.util.Scanner;

public class WhileLoop {

	public static void main(String[] args) {
		// when we dont know how many itration we will running
		// Number of deigit = log_10(n) + 1
		int sum = 0;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number :");

		int n = sc.nextInt();
		int numberOfDigits = (int) (Math.log10(n)+1);
		System.out.println(numberOfDigits);

		while(n>0)
		{
			sum = sum + n%10;
			n = n/10;
			
		}
		System.out.println(sum);

	}

}
