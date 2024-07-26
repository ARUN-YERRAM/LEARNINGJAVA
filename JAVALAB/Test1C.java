package JAVALAB;
import java.util.*;

public class Test1C
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Has he played for India?");
		char c1=sc.next().charAt(0);
		System.out.println("Has he played IPL?");
		char c2=sc.next().charAt(0);
		float amount=0.0f;
		
		if(c1=='y')
		{
			System.out.println("Enter no of Testmatches");
			int test=sc.nextInt();
			System.out.println("Enter no of ODIs");
			int odi=sc.nextInt();
			System.out.println("Enter the number of man of the matches");
			int mom=sc.nextInt();
			if(test>10 && odi>100)
			{
				amount+=50000;
			}
			else if(test>10)
			{
				amount+=25000;
			}
			else if(odi>100)
			{
				amount+=15000;
			}
			else
			{
			   amount+=10000; 
			}
			amount+=amount*0.25f*mom;
			System.out.println(amount);
			System.exit(100);
		}
		else if(c2=='y')
		{
			System.out.println("Enter the number of man of the matches");
			int mom=sc.nextInt();
			amount+=8000;
			amount+=amount*0.25f*mom;
			System.out.println(amount);
			System.exit(100);
		}
		else
		{
			amount+=7000;
			System.out.println(amount);
			System.exit(100);
		}
	}
}
