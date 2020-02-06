package test6;

public class Test 
{

	public static void main(String[] args) 
	{
		Shapes s=new Rectangle();
		System.out.println("RECTANGLE");
		s.area();
		s.perimeter();
		System.out.println(" ");
		System.out.println("TRIANGLE");
		Shapes s1=new Triangle();
		s1.area();
		s1.perimeter();

	}

}
