import java.io.*;
class Info
{
 int acno;
 String acname;
 float bal;
 static int count;
 Info(String n,float p)
{
  count++;
  acno=count;
  acname=n;
  bal=p;
}
void display()
{
 System.out.println(acno+"\t"+acname+"\t"+bal);
}
float getbal()
{
 return bal;
}
 static void counter()
{
 System.out.println(count+"Object is created");
}
 public static void sortAccount(Info a[],int n)
{
 for(int i=n-1;i>=0;i--)
 {
  for(int j=0;j<1;j++)
  {
   if(a[j].getbal()>a[j+1].getbal())
   {
    Info t=a[j];
    a[j]=a[j+1];
    a[j+1]=t;
   }
 }
}
for(int i=0;i<n;i++)
a[i].display();
}
}
public class Account
{
  public static void main(String[] arg)throws IOException
  {
   BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
   System.out.println("Enter no.of account");
   int n=Integer.parseInt(br.readLine());
   Info p[]=new Info[n];
   for(int i=0;i<n;i++)
   {
    System.out.println("Enter name:");
    String name=br.readLine();
    System.out.println("Enter Balance:");
    float bal=Float.parseFloat(br.readLine());
    p[i]=new Info(name,bal);
    p[i].counter();
   }
 Info.sortAccount(p,Info.count);
}
}
