import java.util.*;
class InvalidNameException extends Exception
{}
class DoctorName
{
public static void main(String []ar)
{
	Scanner s=new Scanner(System.in);
	System.out.println("Enter the doctor name: ");
	String name=s.next();
	
	try
	{
	 for(int i=0;i<name.length();i++)
		{
		 int ch=(int)name.charAt(i);
		 if((ch>=65&&ch<=90)||(ch>=97&&ch<=122))
		 	{
			}
		 else
			{
				throw new InvalidNameException();
			}
		}
	System.out.println("Doctor name is : " +name);
	}
	catch(InvalidNameException e)
	{
	 System.out.println("INVALID NAME");
	}
}
}
