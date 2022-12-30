import java.util.Scanner;

public class Emp {

 int empid;
 String name;
 float salary;
 
 public void getInput() {
 
  Scanner in = new Scanner(System.in);
  System.out.print("Enter the empid :: ");
  empid = in.nextInt();
  System.out.print("Enter the name :: ");
  name = in.next();
  System.out.print("Enter the salary :: ");
  salary = in.nextFloat();
 }
 
 public void display() {
  
  System.out.println("Employee id = " + empid);
  System.out.println("Employee name = " + name);
  System.out.println("Employee salary = " + salary);
 }
 
 public static void main(String[] args) {
 
  Emp e[] = new Emp[5];
  
  for(int i=0; i<5; i++) {
   
   e[i] = new Emp();
   e[i].getInput();
  }
  
  System.out.println("**** Data Entered as below ****");
  
  for(int i=0; i<5; i++) {
   
   e[i].display();
  }
 }
}
