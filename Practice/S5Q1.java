import java.io.*;
class ZeroException extends Exception
{
}
class Factorial
{
	public static void main(String []args) throws IOException
	{
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));	
		System.out.println("Enter the number: ");
		int n=Integer.parseInt(br.readLine());
		try
		{
			if(n==0)
			{
				throw new ZeroException();
					
			}
			else
			{
				  int fact=1;     
  				for(int i=1;i<=n;i++)
  				{    
      				fact=fact*i;    
  				}    
				  System.out.println("Factorial of "+n+" is: "+fact);    
			}
			System.out.println("The number is valid");	
		}
		catch(ZeroException z)
		{
			System.out.println("Zero is not valid");	
		}
		
	}
}
