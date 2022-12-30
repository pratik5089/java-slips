import Series.*;
import java.io.*;
class Package
{
	public static void main(String [] ar) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the number : ");
		int no=Integer.parseInt(br.readLine());
		Fibo F=new Fibo();
		System.out.println("Fibonassi Series: ");
		F.fibo_range(no);		

		Cube C=new Cube();
		System.out.println("\nCubes are: ");
		C.cube_no(no);

		Square S=new Square();
		System.out.println("Squares are: ");
		S.square_no(no);
	}
}

