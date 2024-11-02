package DAA.BSearch;

/*
Given an array of integers nums which is sorted in ascending order, and an 
integer target, write a function to search target in nums. If target exists, 
then return its index. Otherwise, return -1.

You must write an algorithm with O(log n) runtime complexity.

Sample Input:
-------------
Enter Array size
5
Enter the elements of Array 
-19 -34 -28 -42 -11
Enter the key
-34
Sample Output:
---------------
Sorted Array[]:[-42, -34, -28, -19, -11]
Element found at index 1

Sample Input:
-------------
Enter Array size
4
Enter the elements of Array 
25 83 45 62
Enter the key
44

Sample Output:
---------------
Sorted Array[]:[25, 45, 62, 83]
Element Not found



*/

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch_recursive{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking input for array size
        System.out.println("Enter Array size");
        int size = sc.nextInt();

        // Taking input for array elements
        int[] nums = new int[size];
        System.out.println("Enter the elements of Array");
        for (int i = 0; i < size; i++) {
            nums[i] = sc.nextInt();
        }

        // Taking input for the target element
        System.out.println("Enter the key");
        int target = sc.nextInt();

        // Sorting the array
        Arrays.sort(nums);
        System.out.println("Sorted Array[]:" + Arrays.toString(nums));

        // Performing binary search
        int result = binarySearch(nums, target);

        // Output the result
        if (result != -1) {
            System.out.println("Element found at index " + result);
        } else {
            System.out.println("Element Not found");
        }

        sc.close();
    }

    // Binary search function
    public static int binarySearch(int[] nums, int target) {
        int left = 0, right = nums.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            // Check if the target is at mid
            if (nums[mid] == target) {
                return mid;
            }

            // If target is greater, ignore the left half
            if (nums[mid] < target) {
                left = mid + 1;
            } 
            // If target is smaller, ignore the right half
            else {
                right = mid - 1;
            }
        }

        // Target not found
        return -1;
    }
}

