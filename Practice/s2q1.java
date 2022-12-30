import java.util.*;
class Array
{
	public static void main(String [] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no of elements in array");
		int n=sc.nextInt();
		ArrayList ar=new ArrayList();	
		System.out.println("Enter the elements in the ArrayList: ");
		for(int i=0;i<n;i++)
		{
			String ele=sc.next();
			ar.add(ele);	
		}
		System.out.println("The elements in the array are: "+ar);
	}	
}