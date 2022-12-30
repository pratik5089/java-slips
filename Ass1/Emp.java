import java.util.Scanner;

public class Emp
{
	int Eno;
	String name;
	float salary;	
	public void getdata()
	{
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the Employee ID: ");
		Eno=in.nextInt();
		System.out.println("Enter the Employee Name: ");
		name=in.next();
		System.out.println("Enter the Employee Salary: ");
		salary=in.nextFloat();
	}
	public void display()
	{
		System.out.println("Employee ID: "+Eno);
		System.out.println("Employee Name: "+name);
		System.out.println("Employee Salary: "+ salary);
	}
	public static void main(String[]ar)
	{
		Emp e[]=new Emp[5];
		for(int i=0;i<5;i++)
		{
		e[i]=new Emp();
		e[i].getdata();	
		}
		System.out.println("****DATA ENTERED AS BELOW***");
		for(int i=0;i<5;i++)
		{
			e[i].display();	
		}	
	}
	
}