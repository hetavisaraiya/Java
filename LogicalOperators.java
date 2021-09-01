package operators;

public class LogicalOperators {

	public static void main(String[] args) {
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
		int grade = 11;
		if (grade == 10 || grade == 12) {
			System.out.println("you can give board exam!");
		}
		
		int grade1 = 11;
		if(! (grade1 == 10 || grade1 == 12)) {
			System.out.println("you can not give board exam!");
		}
	}
	

}
