
interface Operation 
{
double area();
}
class Circle implements Operation
{
double radius;
Circle(double radius)
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
public class Shape
{
public static void main(String[]args)
{
Operation o;
o=new Circle(5.2);
System.out.println("Area of circle is :"+ o.area());
o=new Cylinder(5,2.5);
System.out.println("Volume of cylinder is :"+o.area());

}

}
