import java.io.*;
public class Sumofarray
{
 public static void main(String[] arg)throws IOException
{
 int A[]=new int[6]={9,5,6,3,2,4};
 int i;
 int j;
 int temp=0;
 int sum=0;
 for(i=0;i<A.length;i++)
 {
  sum=sum+A[i];
 
 }
 System.out.println("Array elements"+A[i]);

 System.out.println("Sum of array element"+sum);
 for(i=0;i<A.length;i++)//Ascending order
 {
  for(j=i+1;j<A.length;j++)
  {
   if(A[i]>A[j])
   {
    temp=A[i];
    A[i]=A[j];
    A[j]=temp;
   }
 }
}
 
 System.out.println("Array elements in ascending order:");
 for(i=0;i<A.length;i++)
 {
  System.out.println(A[i]+" ");
 }
}
}

