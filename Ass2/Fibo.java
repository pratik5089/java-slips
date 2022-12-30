package Series;
public class Fibo
{
 public void fibo_range(int no)
{    
 int n1=0,n2=1,n3,i,count=no;    
 System.out.print(n1+"\n"+n2);//printing 0 and 1    
    
 for(i=2;i<count;++i)//loop starts from 2 because 0 and 1 are already printed    
 {    
  n3=n1+n2;    
  System.out.print("\n"+n3);    
  n1=n2;    
  n2=n3;    
 }    
  
}


}
