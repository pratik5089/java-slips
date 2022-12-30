class Employee
{
	double salary;
	String name;

	void display()
{
	System.out.println("Salary of the Employee: "+salary);
	System.out.println("Name of the Employee: "+name);
}
}
class Developer extends Employee
{
	String projname;
	public void Developer(String name,double salary,String projname)
{
        this.name=name;
        this.salary=salary;
	this.projname=projname;
}
	void display()
{
	super.display();
	System.out.println("The Project Name is: "+projname);
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
	System.out.println("The Program Language: "+prolang);
}
}
public class SB2
{
	public static void main(String []args)
{
       	Developer d=new Developer();
        d.Developer("Pratik",500000,"Web");
        d.display();
	Programmer p=new Programmer();
	p.Programmer("JAVA");
	p.display();
}
}

