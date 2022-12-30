
interface Operation 
{
double area();
double volume();
final double PI=3.142;
}
class Circle implements Operation
{
double radius;
Circle(double radius)//CONSTRUCTOR
{
this.radius=radius;
}
public double area ()
{
return PI*radius*radius;
}
public double volume()
{
return 0;
}
}
class Cylinder extends Circle implements Operation
{
double height;
Cylinder(double radius,double height)//constructor
{
super(radius);
this.height=height;
}
public double area() //overriding
{
System.out.println("Area of circle " +super.area());
return 2*PI*radius*height+2*PI*radius*radius;
}
public double volume()
{

return PI*radius*radius*height;
}
}
public class Tests
{
public static void main(String[]args)
{
Cylinder c;;
//c=new Circle(5.2);
//System.out.println("Area of circle is :"+ c.area());
c=new Cylinder(5,2.5);
System.out.println("Area of cylinder is :"+c.area());
System.out.println("Volume of cylinder is :"+c.volume());

}

}
