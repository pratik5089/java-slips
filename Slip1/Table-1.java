import java.io.*;

 
class Table
{
    public static void main(String args[]) throws IOException
    {
 
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
 
        System.out.println("Enter Number: ");
        int num=Integer.parseInt(br.readLine());
 
        System.out.println("*****MULTIPLICATION TABLE*****");
 
 
            for(int j=1; j<=10; j++)
            {
                System.out.println(num+ "*" +j+ "="  +num*j );
            }
 
    }
}
