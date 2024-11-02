package DAA.BSearch;

/*
You are given a sorted array of integers and a target integer. 
Your task is to write a program that uses binary search to find the index of the 
target integer in the array. 
If the target is found, return its index. If the target is not found, return -1.

Your solution must have a time complexity of O(log n), where n is the number of 
elements in the array.

Input Format:
--------------
Line-1: An integer n (the number of elements in the array).
Line-2: n space-separated integers, representing the sorted array.
Line-3: An integer target, the value you need to search for in the array.

Output Format:
---------------
Line-1: Print a single integer, which is the index of the target element 
in the array. If the target is not found, print -1.

Constraints:
-------------
1 ≤ n ≤ 10^6 (size of the array)
-10^9 ≤ arr[i], target ≤ 10^9 (array elements and target value)
The array is sorted in non-decreasing order.


Sample Input-1:
---------------
Enter Array size
6
Enter the elements of Array 
1 3 5 7 9 11
Enter the search key
5

Sample Output-1:
----------------
Sorted array[]: [1, 3, 5, 7, 9, 11]
Element found at index 2

Sample Input-2:
---------------
Enter Array size
5
Enter the elements of Array 
2 4 6 8 10
Enter the search key
7

Sample Output-2:
----------------
Sorted array[]: [2, 4, 6, 8, 10]
Element not found

*/

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch_Iterative {

    public static int B_search(int[] arr, int tar) {
        int i = 0;
        int j = arr.length - 1;

        while (i <= j) {
            int mid = i + (j - i) / 2;

            if (arr[mid] == tar) {
                return mid;
            } else if (arr[mid] > tar) {
                j = mid - 1;
            } else {
                i = mid + 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Array size");
        int n = sc.nextInt();

        System.out.println("Enter the elements of Array");
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter the search key");
        int k = sc.nextInt();

        Arrays.sort(arr);
        System.out.println("Sorted Array[]: " + Arrays.toString(arr));

        int idx = B_search(arr, k);

        if (idx != -1) {
            System.out.println("Element found at index " + idx);
        } else {
            System.out.println("Element not found");
        }

        sc.close();
    }
}




