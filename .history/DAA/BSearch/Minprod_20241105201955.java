/*
Minimum product subset of an array

Given an array a, we have to find the minimum product possible with the subset 
of elements present in the array. The minimum product can be a single element also.

Examples: 

Input : a[] = { -1, -1, -2, 4, 3 }
Output : -24
Explanation : Minimum product will be ( -2 * -1 * -1 * 4 * 3 ) = -24

Input : a[] = { -1, 0 }
Output : -1
Explanation : -1(single element) is minimum product possible
 
Input : a[] = { 0, 0, 0 }
Output : 0

A simple solution is to generate all subsets, find the product of every subset
and return the minimum product.

A better solution is to use the below facts.  

->If there are even number of negative numbers and no zeros, the result is the product
   of all except the largest valued negative number.
->If there are an odd number of negative numbers and no zeros, the result is simply 
   the product of all.
->If there are zeros and positive, no negative, the result is 0. The exceptional 
   case is when there is no negative number and all other elements positive then our 
   result should be the first minimum positive number.

Complexity Analysis:

Time Complexity : O(n) 
Auxiliary Space : O(1)
*/

import java.util.*; 
 
class Minprod
{ 
 
    static int minProductSubset(int a[], int n) 
    { 
        if (n == 1) 
            return a[0]; 
 
 /*Find count of negative numbers,count of zeros, maximum valued negative number, minimum valued 
positive number and product of non-zero numbers */ 
 
        int negmax = Integer.MIN_VALUE; 
        int posmin = Integer.MAX_VALUE; 
             int count_neg = 0; 
  int count_zero = 0; 
         int product = 1; 
 
        for (int i = 0; i < n; i++) { 
 
            // if number is zero,count it  but dont multiply 
          
   if (a[i] == 0) { 
                count_zero++; 
                continue; 
   } 
 
    // count the negative numbers  and find the max negative number 
            if (a[i] < 0) { 
                count_neg++; 
                negmax = Math.max(negmax, a[i]); 
            } 
 
            // find the minimum positive number 
            if (a[i] > 0 && a[i] < posmin) 
                posmin = a[i]; 
 
            product *= a[i]; 
        } 

        
 if (count_zero == n  || (count_neg == 0 && count_zero > 0)) 
            return 0; 
 
        // If there are all positive 
        if (count_neg == 0) 
            return posmin; 
 
        // If there are even number except 
        // zero of negative numbers 
        if (count_neg % 2 == 0 && count_neg != 0) { 
 
            // Otherwise result is product of 
            // all non-zeros divided by maximum 
            // valued negative. 
            product = product / negmax; 
        } 
 
        return product; 
    } 
    
 public static void main(String[] args) 
    { 
 
        Scanner sc=new Scanner(System.in); 
        System.out.println("enter size of the array"); 
        int n=sc.nextInt(); 
            System.out.println("enter elements"); 
            int a[]=new int[n]; 
        for(int i=0;i<n;i++) 
        { 
            a[i]=sc.nextInt(); 
        } 
        System.out.println(minProductSubset(a, n)); 
} 
}