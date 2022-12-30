import java.io.*;
class Pr
{
	int n;
	void accept(int num)
	{
		n=num;		
	}
	void display()
	{
	  	System.out.println("The Number Valid");
	}
}
class Primeno
{
public static void main(String []ar) throws IOException
{
		System.out.println("Enter no");
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(br.readLine());
		
			 int i,m=0,flag=0;        
			 m=n/2;      
 			 if(n==0||n==1)
			 {  
			 System.out.println(n+" is not prime number");      
 			 }
			 else
			 {  
 			  for(i=2;i<=m;i++)
			 {      
 			  if(n%i==0)
			 {      
 			  System.out.println(n+" is not prime number");      
			  flag=1;      
 			  break;      
 			 }      
 			 }      
			   if(flag==0)  { System.out.println(n+" is prime number"); }  
 			 }  
		
}
}