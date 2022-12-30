import java.io.*;
public class MyNumber
{
       private static int  number;
	public MyNumber()
	{
		number=0;	
	}
	public MyNumber(int n)
	{
		this.number=n;	
	}
	public boolean isNegative()
	{
		if(number<0)
		return true;
		else 
		return false;	
	}	
	public boolean isPositive()
	{
		if(number>=0)
		return true;
		else return false;	
	}
	public boolean isOdd()
	{
		if(number%2!=0)
		return true;
		else return false;	
	}
	public boolean isEven()
	{
		if(number%2==0)
		return true;
		else return false;	
	}
	
public static void main(String []ar)throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter The Number");
		number=Integer.parseInt(br.readLine());
		MyNumber m1=new MyNumber();
		MyNumber m2=new MyNumber();
		if(m1.isNegative())
		System.out.println("Number is negative");
		if(m2.isNegative())
		System.out.println("Number  is negative");
		if(m1.isPositive())
		System.out.println("Number is Positive");
		if(m2.isPositive())
		System.out.println("Number  is Positive");
		if(m1.isOdd())
		System.out.println("Number is Odd");
		if(m2.isOdd())
		System.out.println("Number  is Odd");
		if(m1.isEven())
		System.out.println("Number is Even");
		if(m2.isEven())
		System.out.println("Number  is Even");
	}
}