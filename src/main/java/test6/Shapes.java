package test6;

public abstract class Shapes 
{
	int width;
	int height;
	int side1;
	int base;
	int side2;
	
	
	public abstract void area();
	public abstract void perimeter();
	
	public Shapes()
	{
		width=10;
		height=20;
		side1=1;
		base=2;
		side2=3;
	}
	
	
}
