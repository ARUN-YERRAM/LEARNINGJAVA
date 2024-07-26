package JAVALAB;

import java.util.*;
class Test4A
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		String s1=sc.next();
		String s2=sc.next();
		int i=0,j=0,m=0,c=0;
		for(i=0;i<s1.length();i++)
		{
			for(j=m;j<s2.length();j++)
			{
				if(s1.charAt(i)==s2.charAt(j))
				{
					c=c+1;
					m=j+1;
					break;
				}
			}
		}
		System.out.println("Length of longest substring:"+c);
	}
}


