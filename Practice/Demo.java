interface Shape
{
	void input();
	void area();	
}
class Circle implements Shape
{
	int r=0;
	double pi=3.14;
	double ar=0;
	//override
	public void input()
	{
		r=5;	
	}
	public void area()
	{
		ar=pi*r*r;
		System.out.println("Area of the circle is : "+ar);	
	}	
}
class Reactangle extends Circle implements Shape
{
	int l=0,b=0;
	double ar=0;
	public void input()
	{
		super.input();
		l=6;
		b=4;	
	}
	public void area()
	{
		super.area();
		ar=l*b;
		System.out.println("Area of the rectangle is : "+ar);	
	}	
}
public class Demo
{
	public static void main(String [] args)
	{
		Reactangle p=new Reactangle();
		p.input();
		p.area();	
	}	
}