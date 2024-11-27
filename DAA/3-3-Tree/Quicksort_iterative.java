/*
Given an array of integers nums, sort the array in ascending order and return it.

You must solve the problem without using any built-in functions in O(nlog(n)) time complexity and with the smallest space complexity possible.

 

Example 1:

Input: nums = [5,2,3,1]
Output: [1,2,3,5]
Explanation: After sorting the array, the positions of some numbers are not changed (for example, 2 and 3), while the positions of other numbers are changed (for example, 1 and 5).
Example 2:

Input: nums = [5,1,1,2,0,0]
Output: [0,0,1,1,2,5]
Explanation: Note that the values of nums are not necessairly unique.
 

Constraints:

1 <= nums.length <= 5 * 104
-5 * 104 <= nums[i] <= 5 * 104
*/

import java.util.*; 
 
class Quicksort_iterative{ 

    static int partition(int numArray[], int low, int high) { 
        int pivot = numArray[high]; 
        int i = (low - 1); 
        for (int j = low; j <= high - 1; j++) { 
            if (numArray[j] <= pivot) {
                i++;
                int temp = numArray[i]; 
                numArray[i] = numArray[j]; 
                numArray[j] = temp; 
            } 
        } 
        int temp = numArray[i + 1]; 
        numArray[i + 1] = numArray[high]; 
        numArray[high] = temp; 
        return i + 1; 
    } 
 
    static void quickSort(int numArray[], int low, int high){ 
        int[] intStack = new int[high - low + 1]; 
        int top = -1; 
        intStack[++top] = low; 
        intStack[++top] = high; 
        while (top >= 0) { 
            high = intStack[top--]; 
            low = intStack[top--]; 
            int pivot = partition(numArray, low, high); 
            if (pivot - 1 > low) { 
                intStack[++top] = low; 
                intStack[++top] = pivot - 1; 
            } 
            if (pivot + 1 < high) { 
                intStack[++top] = pivot + 1; 
                intStack[++top] = high; 
            } 
        }
    }
    public static void main(String args[]) 
    { 
        Scanner sc=new Scanner(System.in);
        System.out.println("enter array size");
        int n = sc.nextInt(); 
        int a[]=new int[n];
        System.out.println("enter the elements of array ");
        for(int i=0;i<n;i++){
        a[i] =sc.nextInt();
        }
        System.out.println("Original Array:" + Arrays.toString(a)); 
        quickSort(a, 0, n - 1); 
        System.out.println("\nSorted Array:" + Arrays.toString(a));
        sc.close(); 
    } 
}