import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import javax.naming.InsufficientResourcesException;

class SavingAccount{
 int acNo;
 String name;
 double balance;
 public SavingAccount(){
  acNo=0;
  name=null;
  balance=500.0;
 }
 public void accept()throws IOException{
  BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
  System.out.println("Enter the account number, name, and balance for the customer: ");
  acNo=Integer.parseInt(br.readLine());
  name=br.readLine();
  balance=Double.parseDouble(br.readLine());
  
 }
 public void withdraw() throws IOException{
  BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
  System.out.println("Enter the amount you want to withdraw: ");
  double wamt=Double.parseDouble(br.readLine());
  try{
   double bal=balance; bal=bal-wamt;
   if(bal<500)
    throw new InsufficientResourcesException("Insufficient Balance");
   balance=balance-wamt;
   System.out.println("Withdrawal Successful...!!!");
  }
  catch(InsufficientResourcesException e){
   System.out.println("Exception: "+e.getMessage());
  }
 }
 public void deposit() throws IOException{
  BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
  System.out.println("Enter the amount you want to deposit: ");
  double damt=Double.parseDouble(br.readLine());
  balance=balance+damt;
  System.out.println("Deposit Successful....!!");
 }
 public void viewBalance(){
  System.out.println("The balance is "+balance);
 }
 
}

public class a4sa2 {
 public static void main(String [] args) throws IOException{
  System.out.println("Enter the number of customers: ");
  BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
  int n=Integer.parseInt(br.readLine());
  SavingAccount[] sa=new SavingAccount[n];
  for(int i=0;i<n;i++){
   sa[i]=new SavingAccount();
   sa[i].accept();
  }
  int no=0;
  System.out.println("Enter the customer Number");
  no=Integer.parseInt(br.readLine());
  no--;
  int ch=0;
  while(ch!=4){
   System.out.println("1. Withdraw");
   System.out.println("2. Deposit");
   System.out.println("3. View Balance");
   System.out.println("4. Quit");
                        System.out.println("Select Any Option:");
   ch=Integer.parseInt(br.readLine());
   switch(ch){
   case 1: sa[no].withdraw();
   break;
   case 2: sa[no].deposit();
   break;
   case 3: sa[no].viewBalance();
   break;
   }
  }
  }

}
