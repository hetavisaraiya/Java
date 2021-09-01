package loops;

public class TableInOne {

	public static void main(String[] args) {
		int n =23;
		int sum =1;
		for (int k =1; k<=11;k++)
		{
		for (int i = 1 ; i<=20; i ++)
		{
			sum = k * i;
			System.out.print(sum);
		}
		System.out.println();
		}

	}

}
