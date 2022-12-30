import java.io.*;
class EmpSal
{
    int id;
    String name;
    float salary;
    public static int count=0;

    EmpSal(String n,float s)
    {
        count++;
        this.id=count;
        this.name=n;
        this.salary=s;
    }
    public float getSal()
    {
        return salary;
    }
    public void display()
    {
        System.out.println("Id->> "+id+" Name--> "+name+" Salary --> "+salary);
    }
    public static void sortSalary(EmpSal e[],int num)
    {
        for(int i=1;i<=e.length;i++)
        {
            for(int j=i+1;j<e.length;j++)
            {
                if(e[i].getSal()<e[j].getSal())
                {
                EmpSal t=e[i];
                e[i]=e[j];
                e[j]=t;
                }
            }
        }
//         for(int i=0;i<num;i++)
           e[0].display();
    }
    
}
class Employee
{
    public static void main(String []ar)throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter how many employees you wnat--> ");
        int num=Integer.parseInt(br.readLine());

        EmpSal s[]=new EmpSal[num];

        for(int i=0;i<num;i++)
        {
            System.out.println("Enter Id of emp--> ");
            int id=Integer.parseInt(br.readLine());
            System.out.println("Enter name of emp--> ");
            String name=br.readLine();
            System.out.println("Enter salary of emp--> ");
            float salary=Float.parseFloat(br.readLine());
            
            s[i]=new EmpSal(name, salary);
        }
        EmpSal.sortSalary(s, EmpSal.count);
            
    }
}