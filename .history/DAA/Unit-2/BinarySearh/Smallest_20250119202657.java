/*
You are given an m x n matrix mat where each row is sorted in non-decreasing 
order.

Your task is to find the smallest common element in all rows. If there is no 
common element, return -1.

Input Format:
--------------
Line-1: Two integers m and n, representing the number of rows and columns, 
respectively.
Line-2: The next m lines contain n space-separated integers each, representing 
the elements of the matrix. Each row of the matrix is sorted in non-decreasing 
order.

Output Format:
---------------
Line-1: Print a single integer, the smallest common element in all rows. 
If no common element exists, print -1.

Constraints:
-------------
1 ≤ m, n ≤ 500
1 ≤ mat[i][j] ≤ 10^4
Each row is sorted in non-decreasing order.

Sample Input-1:
----------------
3 4
1 2 3 4
2 3 5 7
3 5 6 7

Sample Output-1:
-----------------
3

Explanation: The number 3 is the smallest common element in all rows.


Sample Input-2:
---------------
2 3
1 2 3
4 5 6

Sample Output-2:
----------------
-1

Explanation: There is no common element in all rows, so the output is -1.
*/

// import java.util.HashMap;
// import java.util.Map;
// import java.util.Scanner;

// public class Smallest {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
//         int m = scanner.nextInt();
//         int n = scanner.nextInt();
//         int[][] mat = new int[m][n];

//         for (int i = 0; i < m; i++) {
//             for (int j = 0; j < n; j++) {
//                 mat[i][j] = scanner.nextInt();
//             }
//         }

//         System.out.println(findSmallestCommonElement(mat));
//         scanner.close();
//     }

//     private static int findSmallestCommonElement(int[][] mat) {
//         Map<Integer, Integer> countMap = new HashMap<>();
//         int rows = mat.length;

//         for (int i = 0; i < rows; i++) {


//             for (int num : mat[i]) {
//                 countMap.put(num, countMap.getOrDefault(num, 0) + 1);
//                 if (countMap.get(num) == rows) {
//                     return num;
//                 }
//             }
//         }



//         return -1;
//     }
// }




/*
You are given an m x n matrix mat where each row is sorted in non-decreasing 
order.

Your task is to find the smallest common element in all rows. If there is no 
common element, return -1.

Input Format:
--------------
Line-1: Two integers m and n, representing the number of rows and columns, 
respectively.
Line-2: The next m lines contain n space-separated integers each, representing 
the elements of the matrix. Each row of the matrix is sorted in non-decreasing 
order.

Output Format:
---------------
Line-1: Print a single integer, the smallest common element in all rows. 
If no common element exists, print -1.

Constraints:
-------------
1 ≤ m, n ≤ 500
1 ≤ mat[i][j] ≤ 10^4
Each row is sorted in non-decreasing order.

Sample Input-1:
----------------
3 4
1 2 3 4
2 3 5 7
3 5 6 7

Sample Output-1:
-----------------
3

Explanation: The number 3 is the smallest common element in all rows.


Sample Input-2:
---------------
2 3
1 2 3
4 5 6

Sample Output-2:
----------------
-1

Explanation: There is no common element in all rows, so the output is -1.
*/import java.util.Scanner;
import java.util.Scanner;

public class Smallest {

    // Method to find the smallest common element using binary search
    public static int smallestCommonElement(int[][] mat) {
        int m = mat.length, n = mat[0].length;

        for (int num : mat[0]) { // Traverse each element in the first row
            boolean isCommon = true;

            for (int i = 1; i < m; i++) { // Check in each subsequent row
                if (!binarySearch(mat[i], num)) {
                    isCommon = false;
                    break;
                }
            }

            if (isCommon) {
                return num;
            }
        }

        return -1; // No common element found
    }

    // Helper method for binary search
    private static boolean binarySearch(int[] row, int target) {
        int low = 0, high = row.length - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (row[mid] == target) {
                return true;
            } else if (row[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return false;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read matrix dimensions
        int m = sc.nextInt();
        int n = sc.nextInt();
        int[][] mat = new int[m][n];

        // Read matrix elements
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                mat[i][j] = sc.nextInt();
            }
        }

        // Output the smallest common element
        System.out.println(smallestCommonElement(mat));
        sc.close();
    }
}
