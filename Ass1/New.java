import java.lang.*;
class Point
{
 double x,y;
 
}
class ColorPoint extends Point 
{
 String x_col;
 String y_col;
 String z_col;

 public void ColorPoint()
 {
  x_col="RED";
  y_col="YELLOW";
  z_col="BLACK";
 }

 public void ColorPoint(String x_col,String y_col,String z_col)
 {
  this.x_col=x_col;
  this.y_col=y_col;
  this.z_col=z_col;
 }

 public void display()
 {
  System.out.println("Color of x is= "+x_col);
  System.out.println("Color of y is= "+y_col);
  System.out.println("Color of z is= "+z_col);
 }
}


class Point3D extends Point
{
 public double z;
 public void Point()
 {
  x=5.0;
  y=3.0;
  z=2.0;
 }
 public void Point(double x,double y,double z)
 {
  this.x=x;
  this.y=y;
  this.z=z;
 }
 public void display()
 {
  System.out.println("Cordinate of x is= "+x);
  System.out.println("Coordinate of y is= "+y);
  System.out.println("Coordinate of z is= "+z);
 }
}
class New
{
 public static void main(String []ar)
 {
  Point3D p=new Point3D();
  p.Point(6.0,7.0,8.0);
  p.display();
  ColorPoint c=new ColorPoint();
  c.ColorPoint("BROWN","BLUE","GRAY");
  c.display();
  
 // t=new Point(1.0,6.0,7.0);
 // System.out.println(t.display()):
 // t=new ColorPoint('BROWN','BLUE','GRAY');
 
 }
}




