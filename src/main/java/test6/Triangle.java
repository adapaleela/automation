package test6;

public  class Triangle extends Shapes
{

	public void perimeter() 
	{
		int perimeter=side1+base+side2;
		System.out.println(perimeter);
	}
	
	public void area() 
	{
		float area=(base*height)/2;
		System.out.println(area);
	}
	
}
