import java.io.*;
import java.util.*;
class S7Q1
{
            public static void main(String args[]) throws Exception
            {
               BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                                    Hashtable ht=new Hashtable();
                                    float per;
                                    String name;
                        System.out.println("\n Enter no of Employee : ");
                        int n=Integer.parseInt(br.readLine());
                        for(int i=0;i<n;i++)
                        {
                                    System.out.print("Enter Employee name :");
                                    name=br.readLine();
                                    System.out.print("Enter Employee's Salary :");
                                    per = Float.parseFloat(br.readLine());
                                    ht.put(name,per);
                        }
                        System.out.println("Hash table = "+ht);
                        Enumeration k = ht.keys();
                        Enumeration v= ht.elements();
                        System.out.println("ID\tName");
                        while(k.hasMoreElements())
                        {
                                    System.out.println(k.nextElement()+"\t"+v.nextElement());
                        }

            }
             
}