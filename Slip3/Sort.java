import java.io.*;
class Account
{
	int acno;
	String acname;
	float bal;
	static int count;
	
	Account(){}
	Account(String n,float p)
	{
	count++;
	acno=count;
	acname=n;
	bal=p;
	}
void display()
{
	System.out.println(acno+"\t"+acno+"\t"+bal);
}
float getbal()
{
	return bal;
}
static void counter()
{
	System.out.println(count+"Object Is Created");
}
public static void sortAccount(Account a[],int n)
{
	for(int i=n-1;i>=0;i--)
{
	for(int j=0;j<i;j++)
{
	if(a[j].getbal()>a[j+1].getbal())
{
	Account t=a[j];
	a[j]=a[j+1];
	a[j+1]=t;
}
}
}
	for(int i=0;i<n;i++)
	a[i].display();
}
}
public class Sort
{
public static void main(String ar[])throws IOException
{
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	System.out.println("Enter the no of Accounts: ");
	int n=Integer.parseInt(br.readLine());
	Account p[]=new Account[n];
	for(int i=0;i<n;i++)
{
	System.out.println("Enter Name: ");
	String name=br.readLine();
	System.out.println("Enter Balance: ");
	float bal=Float.parseFloat(br.readLine());
	p[i]=new Account(name,bal);
	p[i].counter();
}
Account.sortAccount(p,Account.count);
}
}





