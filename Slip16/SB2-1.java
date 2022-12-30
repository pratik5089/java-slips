class Employee
{
	String name;
	double salary;
	void display()
	{
		System.out.println("Name of the Employee is: "+name);
		System.out.println("Salary of the Employee is: "+salary);	
	}	
}
class Developer extends Employee
{
	String proname;
	public void Developer(String name,double salary,String proname)
	{
		this.name=name;
		this.salary=salary;
		this.proname=proname;
	}
	void display()
	{
		super.display();
		System.out.println("The Project Name is: "+proname);	
	}	
}
class Programmer extends Developer
{
	String prolang;
	public void Programmer(String prolang)
	{
		this.prolang=prolang;	
	}
	void display()
	{
		System.out.println("The Program Language is: "+prolang);	
	}	
}
public class SB2
{
	public static void main(String [] ar)
	{
		Developer d=new Developer();
		d.Developer("Pratik",50000,"Web");
		d.display();
		Programmer p=new Programmer();
		p.Programmer("JAVA");
		p.display();
			
	}	
}