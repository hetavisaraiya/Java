package loops;

import java.util.Scanner;

public class Continue {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		for (int i =0;i<=100;i++)
		{
			if(i>=40 && i<=50)
			{
				continue;
			}
			System.out.println(i);
		}

	}

}
