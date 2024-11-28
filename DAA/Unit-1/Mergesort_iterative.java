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

class Mergesort_iterative {

    private static void merge(int[] arr, int left, int mid, int right) {
        int n1 = mid - left + 1;
        int n2 = right - mid;

        int[] leftArray = new int[n1];
        int[] rightArray = new int[n2];

        for (int i = 0; i < n1; i++)
            leftArray[i] = arr[left + i];
        for (int j = 0; j < n2; j++)
            rightArray[j] = arr[mid + 1 + j];

        int i = 0, j = 0, k = left;

        while (i < n1 && j < n2) {
            if (leftArray[i] <= rightArray[j]) {
                arr[k] = leftArray[i];
                i++;
            } else {
                arr[k] = rightArray[j];
                j++;
            }
            k++;
        }

        while (i < n1) {
            arr[k] = leftArray[i];
            i++;
            k++;
        }

        while (j < n2) {
            arr[k] = rightArray[j];
            j++;
            k++;
        }
    }

    private static void mergeSort(int[] arr, int left, int right) {
        if (left < right) {
            int mid = left + (right - left) / 2;
            mergeSort(arr, left, mid);
            mergeSort(arr, mid + 1, right);
            merge(arr, left, mid, right);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Array size");
        int n = sc.nextInt();

        int[] nums = new int[n];
        System.out.println("Enter numbers");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        System.out.print("Given Array is : ");
        for (int num : nums) {
            System.out.print(num + " ");
        }
        System.out.println();

        mergeSort(nums, 0, n - 1);

        System.out.print("Sorted Array is : ");
        for (int num : nums) {
            System.out.print(num + " ");
        }

        sc.close();
    }
}