package switchCase;

public class SwitchCase {

	public static void main(String[] args) {
		int day = 1;
		switch(day)
		{
			case 1: 
			{
			System.out.println("Monday!");
			break;
			}
			case 2:
			case 3:
			case 4:
			case 5:
			{
			System.out.println("In office!");
			break;
			}
			default:
			{
			System.out.println("Dont know!");
			}
		}

	}

}

//If you are taking string after int then you have to code sc.nextLine(); char op = sc.nextLine().charAt(0);