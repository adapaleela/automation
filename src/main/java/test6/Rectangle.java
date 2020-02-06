package test6;

public class Rectangle extends Shapes
{
	public void area()
	{
		int area=width*height;
		System.out.println(area);
	}
	
	public void perimeter()
	{
		int perimeter=2*(width+height);
		System.out.println(perimeter);
	}
}
