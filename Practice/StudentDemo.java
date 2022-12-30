// Write a java program to accepty the age og the student in given range if it is not is in the range then throw the exception and cheal the name
import java.io.*;
class Ageexception extends Exception
{	
}
class NameException extends Exception
{	
}
class Student
{
	int roll,age;
	String name,course;
	Student()
	{
		roll=0;
		age=0;
		name=null;
		course=null;	
	}
	Student(int r,int a,String n,String c)	
	{
		roll=r;
		course=c;
		int I;
		I=n.length();
		try
		{
			for(int i=0;i<I;i++)
			{
				char ch;
				ch=n.charAt(i);
				if(ch<'A' || ch>'Z' && ch<'a' || ch>'z')
				{
					 throw new NameException();
				}
				else
				{
					name=n;
				}	
			}
		}
		catch(NameException obj1)
		{
			System.out.println("Imvalid name");		
		}
		try
		{
			if(a>15 && a<=21 )
			age=a;
			else
			throw new Ageexception();
		}
		catch(Ageexception ojb2)	
		{
			System.out.println("Invalid Age");	
		}
	}
	void display()
	{
		System.out.println("Roll Name Age Course");	
		System.out.println("_________________________________");
		System.out.println(roll+"  "+name+"  "+age+"  "+course);
	}
}
class StudentDemo
{
	public static void main(String [] ar)throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the roll,name.age,course");
		int r=Integer.parseInt(br.readLine());
		String n=br.readLine();
		int a=Integer.parseInt(br.readLine());
		String c=br.readLine();
		Student s=new Student(r,a,n,c);
		s.display();
	}

}