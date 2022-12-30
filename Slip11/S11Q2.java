abstract class Shape
{
	abstract void area();
	abstract void volume();	
}
class Sphere extends Shape
{
	double PI=3.14;
	double radius=4.35;
	void area()
	{
		double ar=4*PI*radius*radius;
		System.out.println("The area of the Sphere is : "+ ar);		
	}
	void volume()
	{
		double vol=(4/3)*(PI*radius*radius*radius);
		System.out.println("The volume of sphere is"+vol);	
	}
	public static void main(String [] args)
	{
		Sphere a=new Sphere();
		a.area();
		a.volume();	
	}		
}