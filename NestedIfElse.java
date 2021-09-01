package conditionalStatements;

public class NestedIfElse {
	public static void main(String[] args) {
		int a = 23;
		int b = 45;
		int c = 222;
		
		if (a > b)
		{
			if (a > c)
			{
				System.out.println("Max " + a);
			}
			else
			{
				System.out.println("Max " + c);
			}
		
		}
		else
		{
			if (b > c)
			{
				System.out.println("Max " + b);
			}
			else
			{
				System.out.println("Max " + c);
			}
			
		}
		
		int result = ( a > b ? a > c ? a : c : b > c ? b : c ); 
		System.out.println("Max " + result);
		
	}

}
