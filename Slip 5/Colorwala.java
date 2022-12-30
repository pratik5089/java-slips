import java.lang.*;
class Point
{
	double x;
	double y;	
}
class ColorPoint extends Point
{
	String x_col;
	String y_col;
	String z_col;	
	public void ColorPoint()
	{
		x_col="GREEN";
		y_col="RED";
		z_col="BLUE";	
	}
	public void ColorPoint(String x_col,String y_col,String z_col)
	{
		this.x_col=x_col;
		this.y_col=y_col;
		this.z_col=z_col;	
	}
	public void display()
	{
		System.out.println("Color of  x is: "+x_col);
		System.out.println("Color of y is: "+y_col);
		System.out.println("Color of z is: "+z_col);	
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
		System.out.println("Co-ordinate of X is= "+x);
		System.out.println("Co-ordinate of Y is= "+y);
		System.out.println("Co-ordinate of Z is= "+z);
	}	
}
class Colorwala
{
	public static void main(String []ar)
	{
		Point3d t=new Point3d();
		t.Point(2.00,5.00,8.00);
		t.display();
		ColorPoint p=new ColorPoint();
		p.ColorPoint("BLACK","GREEN","RED");
		p.display();	
	}	
}