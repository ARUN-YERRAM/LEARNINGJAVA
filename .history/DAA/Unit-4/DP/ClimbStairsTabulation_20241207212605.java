/*
Climbing_Stairs
Sharath is playing a game where he has to cross N levels to win. 

The rules of the game allow Sharath to take one of the following steps:
    -Jump 1 level in one step.
    -Jump 2 levels in one step.
    
Your task is to determine the number of distinct ways Sharath can reach the Nth level.

Constraints:

    1 <= N <= 45

Input Format:
-------------
Line-1: An Integer N represents number of levels.
  
Output Format:
--------------
Print an integer.


Sample Input-1:
---------------
2
  
Sample Output-1:
----------------
2

Explanation:
------------
1. 1-level+ 1-level =2
2. 2 levels in one step.
   
Sample Input-2:
---------------
4
  
Sample Output-2:
----------------
5

Explanation:
------------
1. 1-level + 1-level + 1-level + 1-level = 4
2. 1-level + 1-level + 2-levels = 4
3. 1-level + 2-levels + 1-level = 4
4. 2-levels + 1-level + 1-level = 4
5. 2-levels + 2-levels  = 4
*/
import java.util.*;
public class ClimbStairs{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        int[] dp = new int[n+1];
        if(n <= 2){
            System.out.println(n);
            return;
        }
        else{
        dp[0] = 0;
        dp[1] = 1;
        dp[2] = 2;
        for(int i=3;i<=n;i++){
            dp[i] = dp[i-1]+dp[i-2];
        }System.out.println(dp[n]);
        }
    }
}

