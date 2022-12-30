import java.lang.*;
public class SBQ1
{
 private static int number;
 public SBQ1()
{ 
 number=0;
}
 public SBQ1(int n)
{
this.number=n;
}
public boolean isNegative()
{
 if(number<0)
 return true;
 else 
 return false;
} 
public boolean isPositive()
{
 if(number>=0)
 return true;
 else 
return false;
}
 public boolean isOdd()
{
 if(number%2!=0)
 return true;
 else 
 return false;

}
public boolean isEven()
{
 if(number%2==0)
 return true;
 else
 return false;
 
}

public static void  main(String[] args)
{ 
 number=Integer.parseInt(args[0]);
 SBQ1 s1=new SBQ1();
 SBQ1 s2=new SBQ1(n);
if(s1.isNegative())
System.out.println("number is negative");
  
if(s2.isNegative())
System.out.println("number is negative");

if(s1.isPositive())
System.out.println("Number is Positive");

if(s2.isPositive())
System.out.println("Number is Positive");

if(s1.isOdd())
System.out.println("Number is Odd");

if(s2.isOdd())
System.out.println("Number is Odd");

if(s1.isEven())
System.out.println("Number is Even");

if(s2.isEven())
System.out.println("Number is Even");

}
}  
 

