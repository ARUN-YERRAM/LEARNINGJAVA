/* Finding the GCD using the Euclidean algorithm.

Algorithm: Calculate GCD of Two Numbers
1. Start.
2. Read two integers, a and b.
3. Check Base Cases:
    If a == 0, return b as the GCD.
    If b == 0, return a as the GCD.
    If a == b, return a as the GCD.
4. Recursive Step:
    If a > b, recursively call calculateGCD(a % b, b).
    Otherwise, recursively call calculateGCD(a, b % a).
5. Return the value obtained from the recursive call.
6. Display the GCD.
7. End.

Explanation:
Step 3 handles the base cases. If one of the numbers is zero, the GCD is the other number. If both numbers are equal, the GCD is that number itself.
Step 4 applies the Euclidean algorithm recursively until one of the numbers becomes zero, at which point the other number is the GCD.
Step 5 returns the result of the recursive calls, and Step 6 prints the final GCD to the user.
This is a recursive approach to finding the GCD using the Euclidean algorithm.
------------------------------------------------------------------------------------------------
Sample Input:
Enter first number
2
Enter second number
7
Sample Output:
The GCD of 2 and 7 is: 1

Sample Input:
Enter first number
12
Enter second number
16
Sample Output:
The GCD of 12 and 16 is: 4
*/

import java.util.*;

public class GCD{
    public static int gcd(int a,int b){
        if(a == 0)return b;
        if(b == 0)return a;
        
        // if(a == b)return a;
        
        if(a > b){
            return gcd(a%b,b);
        }else{
            return gcd(a,b%a);
        }
    }
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();
        
        System.out.println("Enter first number");
        int n1 =  sc.nextInt();
        System.out.println("Enter second number");
        int n2 = sc.nextInt();
        
        int ans = gcd(n1,n2);
        System.out.println("The GCD of " + n1 +" and " + n2+ " is: " + ans);
    }
}