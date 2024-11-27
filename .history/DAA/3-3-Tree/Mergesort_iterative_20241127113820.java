/*
Given an array of integers nums, sort the array in ascending order and return it.

You must solve the problem without using any built-in functions in O(nlog(n)) time complexity 
and with the smallest space complexity possible.

Constraints:

1 <= nums.length <= 5 * 104
-5 * 104 <= nums[i] <= 5 * 104

Sample Input-1:
-------------
Enter Array size
5
Enter numbers 
23 17 19 34 29

Sample Output-1:
---------------
Given Array is : 23 17 19 34 29 
Sorted Array is : 17 19 23 29 34 

Sample Input-2:
---------------
Enter Array size
7
Enter numbers 
26 39 98 53 49 10 78

Sample Output-2:
---------------
Given Array is : 26 39 98 53 49 10 78 
Sorted Array is : 10 26 39 49 53 78 98

*/


import java.util.Scanner;

public class Mergesort_iterative{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Array size");
        int n = scanner.nextInt();
        int[] nums = new int[n];
        System.out.println("Enter numbers");
        for (int i = 0; i < n; i++) {
            nums[i] = scanner.nextInt();
        }
        
        System.out.print("Given Array is : ");
        for (int num : nums) {
            System.out.print(num + " ");
        }
        System.out.println();
        
        quickSort(nums, 0, n - 1);
        
        System.out.print("Sorted Array is : ");
        for (int num : nums) {
            System.out.print(num + " ");
        }
        System.out.println();
        
        scanner.close();
    }

    private static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pi = partition(arr, low, high);
            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }

    private static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = low - 1;
        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {
                i++;
                swap(arr, i, j);
            }
        }
        swap(arr, i + 1, high);
        return i + 1;
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
