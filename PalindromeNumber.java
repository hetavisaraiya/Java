package loops;

import java.util.Scanner;

public class PalindromeNumber {

	public static void main(String[] args) {
		int sum = 0;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number :");

		int n = sc.nextInt();
		int numberOfDigits = (int) (Math.log10(n)+1);
		System.out.println(numberOfDigits);
		int reversedNumber = 0;
		int temp = n;
		while(temp>0)
		{
			int lastdigit = temp % 10;
			reversedNumber = reversedNumber*10 + lastdigit;
			temp = temp/10;
		}
		if(n == reversedNumber)
		{
			System.out.println("Palindrome");
		}
		else System.out.println("Not Palindrome");
		

	}

}
