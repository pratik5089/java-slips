import java.io.*;
class DateMonth
{
   static long DD,MM,YY;
 
 public DateMonth()//Deaflat
{
 DD=12;
 MM=8;
 YY=1999;
}
public DateMonth(long DD,long MM,long YY)//parametries
 {
 this.DD=DD;
 this.MM=MM;
 this.YY=YY;
 }
public void display()
{
 System.out.println(DD+"-"+MM+"-"+YY);
}
 public void dis2()
{ 
  System.out.println(DD+"-"+MM+"-"+YY);
}
public static void main(String[] args)throws IOException
{
 BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
 System.out.println("Enter the Day");
 DD=Long.parseLong(br.readLine());
 System.out.println("Enter the Month");
 MM=Long.parseLong(br.readLine());
 System.out.println("Enter the Year");
 YY=Long.parseLong(br.readLine());
 DDMMYY s1=new DDMMYY(DD,MM,YY);
 DDMMYY s2=new DDMMYY();
 s2.dis2();
 s1.display();
 

}
}
