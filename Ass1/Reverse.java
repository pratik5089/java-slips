import java.io.*;
class Reverse
{
 public static void main(String[] arg)throws IOException
{
 BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
 System.out.println("Enter the no: ");
 int num=Integer.parseInt(br.readLine());
 int rev=0,rem;
 int n=num;
 while(num!=0)
{
 rem=num%10;
 rev=(rev*10)+rem;
 num=num/10;
}
 System.out.println("Reverse of  "+n+"  is  "+rev);
}
}
 
