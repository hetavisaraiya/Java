package conditionalStatements;

public class TernaryOperator {

	public static void main(String[] args) {
		int a = 15;
		int b = 18;
		int maxOfBothNumbers = 0;
		System.out.println("Max of both numbers " + (a > b ? a : b ));
		if (a>b)
		{
			maxOfBothNumbers = a;
		}
		else
		{
			maxOfBothNumbers = b;
		}
		System.out.println("Max of both numbers " + maxOfBothNumbers);
		
	}

}
