package conditionalStatements;

public class IfClass {

	public static void main(String[] args) {
		int age = 25;
		if (age >= 18)
		{
			System.out.println("Vote");
		}
		else
		{
			System.out.println("Not allowed");
		}
		
		int noOfPetals = 5;
		if (noOfPetals % 2 == 0 )
		{
			System.out.println("He loves me not");
		}
		else
		{
			System.out.println("He loves me");
		}
		
		int num = 34;
		if (num <20)
		{
			System.out.println(" num <20 ");
		}
		else if ( num >20 && num <= 40)
		{
			System.out.println("num >20 and num <= 40");
		}
		else
		{
			System.out.println("num > 40");
		}
	}

}
