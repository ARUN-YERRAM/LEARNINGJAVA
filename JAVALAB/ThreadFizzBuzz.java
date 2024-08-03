package JAVALAB;

import java.util.Scanner;
class ThreadFizzBuzz 
{
	public static void main(String[] args) throws Exception
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter n value: ");
		int n=sc.nextInt();
		for(int i=1;i<=n ;i++)
		{
			if (i%15 == 0)
			{				
				C t1 = new C();
				t1.start();
				t1.join();
			}
            		else if (i%5==0)
			{
				B t2 = new B();
				t2.start();
				t2.join();
			}				
				else if (i%3 == 0) 
			{
				A t3=new A();
				t3.start();
				t3.join();
			}                  
            		else 
				System.out.print(i+", ");  
			
		}
	}
}

class A extends Thread
{
	public void run()
	{
		System.out.print("fizz, ");
	}
}
class B extends Thread
{
	public void run()
	{
		System.out.print("buzz" +", ");
	}
}

class C extends Thread
{
	public void run()
	{
		System.out.print("fizzbuzz" +", ");
	}
}
