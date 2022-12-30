import java.io.*;
class Trash
{
    public int id;
    String name;
    float price;
    public static int count=0;

    
    
    Trash(String b,float c)
    {
        count++;
        this.id=count;
        this.name=b;
        this.price=c;
    }
    public float getPrice()
    {
        return price;
    }
    public void display()
    {
        System.out.println("ID--> "+id+" Name--> "+name+" Price--> "+price);
        System.out.println("------------------------------------------------------");
    }
    public static void sortProduct(Trash p[],int n)
    {
        for(int i=0;i<p.length;i++)
        {
            for(int j=i+1;j<p.length;j++)
            {
                if(p[i].getPrice()>p[j].getPrice())
                {
                    Trash t=p[i];
                    p[i]=p[j];
                    p[j]=t;
                }
            }
        }
        //for(int i=0;i<n;i++)
            p[0].display();
        
        
    }
}
class Product
{
    public static void main(String []ar)throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the number of Products--> ");
        int n=Integer.parseInt(br.readLine());
        Trash m[]=new Trash[n];
        for(int i=0;i<n;i++)
        {
            System.out.println("Enter Id --> ");
            int id=Integer.parseInt(br.readLine());
            System.out.println("Enter Name --> ");
            String name=br.readLine();
            System.out.println("Enter Price --> ");
            float price=Float.parseFloat(br.readLine());
            m[i]=new Trash(name,price);

        }
        Trash.sortProduct(m,Trash.count);

        
    }
}