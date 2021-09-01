package classObject;

class Add
{
	int a, b;
	
	Add()
	{
		a = 10;
		b = 20;
	}
	
	public void print()
	{
		System.out.println ("a = " + a + " b = " + b);
	}
}

public class ClassObjectAdd {

	public static void main(String[] args) {
		Add obj1 = new Add();
		Add obj2 = obj1;

		obj1.a += 1;
		obj1.b += 1;

		System.out.println ("values of obj1 : ");
		obj1.print();
		System.out.println ("values of obj2 : ");
		obj2.print();


	}

}
