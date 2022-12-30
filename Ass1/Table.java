import java.io.*;
class Table
{
	public static void main(String [] ar)throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter Number : ");
		int n=Integer.parseInt(br.readLine());
		System.out.println("***MULTIPLICATION TABLE***");
		for(int i=1;i<=10;i++)
		{
			System.out.println(n+"*"+i+"="+n*i);	
		}
	}	
}