import java.io.*;

class S_stud
{
    int rollno;
    String name;
    float perc;
    S_stud()
    {
        rollno=0;
        name="";
        perc=0;

    }
    S_stud(int a,String b,float c)
    {
        this.rollno=a;
        this.name=b;
        this.perc=c;
    }
   
    public void display()
    {
        System.out.println("\nRoll No--> "+rollno+"\nName --> "+name+"\nPercentage --> "+perc);
        System.out.println("------------------------------------------------------------------");
    }



}
class Stud
{

    public static void main(String []ar)throws IOException
    {
        
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter number of students: ");
        int num=Integer.parseInt(br.readLine());
        S_stud q[]=new S_stud[num];
        for(int i=0;i<num;i++)
        {
            System.out.println("Enter roll no: ");
            int rollno=Integer.parseInt(br.readLine());
            System.out.println("Enter Name: ");
            String name=br.readLine();
            System.out.println("Enter percentage: ");
            float perc=Float.parseFloat(br.readLine());
            q[i]=new S_stud(rollno,name,perc);
        }
        for(int i=0;i<num;i++)
        {
            q[i].display();
        }
    }    
}