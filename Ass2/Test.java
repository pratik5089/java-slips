interface Shape 
{
	double area();
	double volume();
}
		class Circle implements Shape
{
	double radius;
	Circle(double radius)//constructor
{
	this.radius=radius;
}
	public double area ()
{
		return java.lang.Math.PI*radius*radius;
}
}
	class Cylinder extends Circle
{
	double height;
		Cylinder(double radius,double height)
{
	super(radius);
	this.height=height;
}
	public double area() //overriding
{
		return java.lang.Math.PI*radius*radius*height;
}
}
	public class Test
{
public static void main(String[]args)
{
Shape o;
o=new Circle(5.2);
System.out.println("Area of circle is :"+ o.area());
o=new Cylinder(5,2.5);
System.out.println("Volume of cylinder is :"+o.area());

}

}
