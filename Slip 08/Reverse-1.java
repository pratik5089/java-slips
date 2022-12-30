public class Reverse
{
 public static void main(String[] arg)
{
 int num,rev=0,rem;
 num=Integer.parseInt(arg[0]);
 int n=num;
 while(num!=0)
{
 rem=num%10;
 rev=(rev*10)+rem;
 num=num/10;
}
 System.out.println("Reverse of "+n+"is"+rev);
}
}
 
