import java.io.*;
class InvalidDate extends Exception
{
}
class MyDate
{
	int day,mon,yr;
	void accept(int d,int m,int y)
	{
		day=d;
		mon=m;
		yr=y;	
	}
	void display()
	{
		System.out.println("Date is valid "+day+"/"+mon+"/"+yr);
	}		
}
class Date
{
	public static void main(String [] ar)throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the date: dd mm yyyy");
		int day=Integer.parseInt(br.readLine());
		int mon=Integer.parseInt(br.readLine());
		int yr=Integer.parseInt(br.readLine());
		int temp=0;
		try
		{
			if(mon<=0 || mon>12)
				throw new InvalidDate();
			else
			{
				if(mon==1 || mon==3 || mon==5 || mon==7 || mon==8 || mon==10 || mon==12)
					{
						if(day>=1 && day<=31)
						temp=1;
						else throw new InvalidDate();	
					}
				else if(mon==2)
				{
					if(yr%4==0)
					{
						if(day>=1 && day<=29)
						temp=1;
						else throw new InvalidDate();	
					}
					else
					{
						if(day>=1 && day<=28)
						temp=1;
						else throw new InvalidDate();	
					}	
				}
				else
				{
					if(mon==4 || mon==6 || mon==9 || mon==11)
					{	if(day>=1 && day<=30)
						 temp=1;
						 else throw new InvalidDate();	
					}
				}	
			} if(temp==1)
				{
					MyDate dt= new MyDate();
					dt.accept(day,mon,yr);
					dt.display();	
				}
		}
		catch(InvalidDate ii)
		{
			System.out.println("Invalid Date");	
		}
	}
}
