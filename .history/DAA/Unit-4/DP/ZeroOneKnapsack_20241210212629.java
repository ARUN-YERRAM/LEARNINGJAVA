
/*
Mr. Dharma went to D-mart, and picked a basket with a capacity C.
There are N products in Dharma's wishlist.
You will be given desired cost and quantity of each Product.
Out of the wishlist Mr Dharma has, he wants to purchase the products in the following way:
	- The sum of quantities taken into the basket is less than or equal to C.
	- The sum of cost of the products in the basket is maximum among all 
	the possible combinations of products.

Your task is to help, Mr. Dharma to purachase the products with maximum cost, 
with the given basket capacity. 

Input Format:
-------------
Line-1: Two space separated integers, N and C.
Next N lines: Two space separated integers, Ci and Qi.
        			cost and quantity of i-th product.

Output Format:
--------------
Print an integer, Maximum cost to pay to D-Mart.


Sample Input-1:
---------------
4 15
10 2
10 4
12 6
18 9

Sample Output-1:
----------------
38

Explanation:
------------
Quantity = 2 + 4 + 9 = 15
Cost = 10 + 10 + 18 = 38


Sample Input-2:
---------------
4 21
18 6
20 3
14 5
18 9

Sample Output-2:
----------------
56

Explanation:
------------
Quantity = 6 + 3 + 9 = 18
Cost = 18 + 20 + 18 = 56
*/

import java.util.*;

class ZeroOneKnapsack {
    public int maxCost(int N, int C, int[][] products) {
        // Create a DP array where dp[j] represents the maximum cost for capacity j
        int[] dp = new int[C + 1];

        // Iterate through each product
        for (int i = 0; i < N; i++) {
            int cost = products[i][0];
            int quantity = products[i][1];

            // Update dp array in reverse to avoid overwriting
            for (int j = C; j >= quantity; j--) {
                dp[j] = Math.max(dp[j], dp[j - quantity] + cost);
            }
        }

        // The maximum cost for the given capacity C
        return dp[C];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int C = sc.nextInt();
        int[][] products = new int[N][2];

        for (int i = 0; i < N; i++) {
            products[i][0] = sc.nextInt(); // Cost
            products[i][1] = sc.nextInt(); // Quantity
        }

        ZeroOneKnapsack solution = new ZeroOneKnapsack();
        System.out.println(solution.maxCost(N, C, products));
    }
}


