package loops;
import java.util.Scanner;
public class Patterns {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n =sc.nextInt();
		
		System.out.println("n*n");
		for (int k = 1; k<=n;k++)
		{
			for(int i = 1; i<=n;i++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println("Pyramid");
		for (int k = 1; k<=n;k++)
		{
			for(int i = 1; i<=k;i++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println("BottomUpPyramid");
		for (int k = n; k>=1;k--)
		{
			for(int i = 1; i<=k;i++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println("BottomUpPyramid1");
		for (int i = 1; i<=n;i++)
		{
		
			for(int j = 1; j<=i-1;j++)
			{
				System.out.print(" ");
			}
			for(int j = 1; j<=n-i+1;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println("Pyramid2");
		for (int i = 1; i<=n;i++)
		{
		
			for(int j = 1; j<=n-i;j++)
			{
				System.out.print(" ");
			}
			for(int j = 1; j<=i;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println("Pyramid3");
		for (int i = 1; i<=n;i++)
		{
		
			for(int j = 1; j<=n-i;j++)
			{
				System.out.print("  ");
			}
			for(int j = 1; j<=i;j++)
			{
				System.out.print("*  ");
			}
			System.out.println();
		}
		
		
		System.out.println("Pyramid4");
		int num=1;
		for (int i = 1; i<=n;i++)
		{
			
			for(int j = 1; j<=n-i;j++)
			{
				System.out.print("  ");
			}
			for(int j = 1; j<=i;j++)
			{
				System.out.print(num++ +"  ");
			}
			System.out.println();
		}
		
		System.out.println("Pyramid5");
		for (int k = 1; k<=n;k++)
		{
			for(int i = 1; i<=k;i++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		for (int k = n-1; k>=1;k--)
		{
			for(int i = 1; i<=k;i++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
		
		System.out.println("Pyramid6");
		
		int num1= 2*n - 1;
		
		for (int k = 1; k<=num1;k++)
		{
			if (k <= n)
			{
				for(int i = 1; i<=k;i++)
					{
						System.out.print("*");
					}
				
			}
			else
			{
				for(int i = 1; i<=num1-k+1;i++)
					{
						System.out.print("*");
					}
					
				
			}
			System.out.println();
		}
		
		System.out.println("Pyramid7");
		int m = 1;
		System.out.println("*");
		for(int i = 2 ; i<=m-1;i++)
		{
			System.out.print("*");
			for (int j = 1; j<=i-2;j++)
			{
				System.out.print(" ");
			}
			System.out.print("*");
			System.out.println();
		}
		if(m>1)
		{
			for(int i = 1 ; i<m;i++)
			{
				System.out.print("*");
			}
		}
		
	}

}
