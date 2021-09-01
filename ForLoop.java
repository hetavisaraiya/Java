package loops;

import java.util.Scanner;

public class ForLoop {

	public static void main(String[] args) {
		int sum = 0;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number :");

		int n = sc.nextInt();
		for (int i = 1 ; i<=10; i ++)
		{
			sum = n * i;
			System.out.println(n + "*" + i + "=" + sum);
		}
//		
//		for(int i = 1 ; i <= n ; i++)
//		{
//			sum += i;
//		}
//		System.out.println(sum);
	}

}
