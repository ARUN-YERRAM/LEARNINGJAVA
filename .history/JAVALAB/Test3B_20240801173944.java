package JAVALAB;

import java.util.*;
public class Test3B
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
	    	int n=sc.nextInt();
        		int rowBegin = 0;
        		int rowEnd = n-1;
        		int colBegin = 0;
        		int colEnd = n- 1;
        		int[][] a=new int[n][n];

	        	while (rowBegin <= rowEnd && colBegin <= colEnd) 
		{
            		// Traverse Right
            		for (int j = colBegin; j <= colEnd; j ++) 
			{
                		a[rowBegin][j]=sc.nextInt();
            		}
            		rowBegin++;

            		// Traverse Down
            		for (int j = rowBegin; j <= rowEnd; j ++) 
			{
                		a[j][colEnd]=sc.nextInt();
            		}
            		colEnd--;

            		if (rowBegin <= rowEnd) 
			{
                		// Traverse Left
                		for (int j = colEnd; j >= colBegin; j --) 
			{
                    			a[rowEnd][j]=sc.nextInt();
                		}
            		}
            		rowEnd--;

            		if (colBegin <= colEnd) 
			{
                		// Traver Up
                		for (int j = rowEnd; j >= rowBegin; j --) 
				{
                    			a[j][colBegin]=sc.nextInt();
                		}
            		}
            		colBegin ++;
        		}
	       	 for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
                			System.out.print(a[i][j]+" ");
            		}
            		System.out.println();
        		}
    	}
}	


