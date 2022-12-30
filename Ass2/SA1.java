import java.lang.*;
 class Point
{
	double x;
	double y;
}
class ColorPoint extends Point
{
	String x_color;
        String y_color;
        String z_color;
	public void ColorPoint()
	{
	 x_color="GREEN";
	 y_color="YELLOW";
	 z_color="PINK";
	}
	public void ColorPoint(String x_color,String y_color,String z_color)
	{
	 this.x_color=x_color;
	 this.y_color=y_color;
	 this.z_color=z_color;
	}
	public void display()
	{
	 System.out.println("Color of X is : " +x_color);
	 System.out.println("Color of Y is : " +y_color);
         System.out.println("Color of Z is : " +z_color);
	}
}
class Point3d extends Point
{
	public double z;
	public void Point()
	{
	 x=2.0;
	 y=3.0;
	 z=4.0;
	}
	public void Point(double x,double y,double z)
	{
	 this.x=x;
	 this.y=y;
	 this.z=z;
	}
	public void display()
	{
	 System.out.println("Coordinate of X is=" +x);
	 System.out.println("Coordinate of y is=" +y);
	 System.out.println("Coordinate of z is=" +z);
	}
}
class SA1
{
	public static void main(String[]ar)
	{
	 Point3d t=new Point3d();
	 t.Point();
	 t.display();
	 ColorPoint c=new ColorPoint();
	 c.ColorPoint("BROWN","PINK","WHITE");
	 c.display();
	}
}
