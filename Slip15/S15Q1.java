import java.util.*;

public class S13
{
	public static void main(String [] ar)
	{
	LinkedList l=new LinkedList();
	l.add("Apple");
	l.add("PineApple");
	l.add("Chiku");
	l.add("Mango");
	l.add("Banana");
	
	Iterator i=l.iterator();
	System.out.println("Contents of the LInkedList Are: \n");
	while(i.hasNext())
	{
		String s=(String)i.next();
		System.out.println(s);
	}
	Collections.reverse(l);
	System.out.println("Reverse LinkedList are :" +l);
	}		
}