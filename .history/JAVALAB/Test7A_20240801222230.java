package JAVALAB;

import java.util.Arrays;
import java.util.Scanner;
class Test7A
{
	public static void main(String[] args) 
	{
		System.out.println("Enter Array Size: ");
		Scanner sc=new Scanner (System.in);
		int n=sc.nextInt();
		int arr[];
		int[] arr = new int[n];
		try
		{
		 if (n>0)		
			arr=new int[n];
		 else
			 throw new IllegalArgumentException() ;
		System.out.println("Enter Array Elements: ");
		for (int i=0;i<n ;i++ )
		{
			arr[i]=sc.nextInt();
		}
		Test7A rs=new Test7A();
		int resultarr[]=rs.addition(arr);
		System.out.println(Arrays.toString(resultarr));
	}
		catch (IllegalArgumentException e)
		{
			System.out.println("Invalid Argument");
		}
	}
   	int[] addition(int[] a) 
   	{
		int sum = 0;
		for (int i = 0; i < a.length; i++) 
		{
			 a[i] +=  sum;			 
			 sum = a[i];			 
		}
  		return a;
	}
}