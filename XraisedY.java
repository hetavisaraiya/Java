package loops;

import java.util.Scanner;

public class XraisedY {

	public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			int a = sc.nextInt();
			int b = sc.nextInt();
			int result  = 1;
			for(int i = b ;i>=1; i-- )
			{
				result *=a;
			}
			System.out.println(result);
	}

}
