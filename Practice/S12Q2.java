abstract class Shape
{
	abstract void area();
	abstract void volume();	
}
class Cylinder extends Shape
{
	double PI=3.14;
	double r=5.5;
	double h=8.8;
	void area()
	{
		double A=(2*PI*r*r)+(2*PI*r*h);
		System.out.println("Area of the Cylinder is: "+A);
	}	
	void volume()
	{
	double V=PI*r*r*h;
	System.out.println("Volume of the Cylinder is: "+V);	
	}
	public static void main(String [] args)
	{
	Cylinder c=new Cylinder();
	c.area();
	c.volume();
	}
}