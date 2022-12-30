import java.io.*;
public class DateMonth
{
	static long dd,mm,yy;
	public DateMonth()// Default constructor
	{
		dd=10;
		mm=8;
		yy=2003;
	}
	public DateMonth(long dd,long mm,long yy)// Parameterised Constructor
	{
		this.dd=dd;
		this.mm=mm;
		this.yy=yy;	
	}
	public void display()
	{
		System.out.println(dd+"-"+mm+"-"+yy);	
	}

	public static void main(String[]ar)throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the day: ");
		long dd=Long.parseLong(br.readLine());
		System.out.println("Enter the Month: ");
		long mm=Long.parseLong(br.readLine());
		System.out.println("Enter the Month: ");
		long yy=Long.parseLong(br.readLine());
		DateMonth a=new DateMonth(dd,mm,yy);
		a.display();
	}		
}