interface Operation
{
	void area();
	void volume();	
}
class Circle implements Operation
{
	double PI=3.14;
	double r=5;
	public void area()
	{
		double A=PI*r*r;
		System.out.println("Area of the circle is: "+A);	
	}
	public void volume()
	{
			
	}

	public static void main(String [] args)
	{
		Circle a= new Circle();
		a.area();
		a.volume();
	}

}