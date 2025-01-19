/*

You are given an unsorted array of integers. Your task is to implement the MergeSort algorithm 

to sort the array in ascending order.



MergeSort is a divide-and-conquer algorithm that:

	Divides the array into two halves.

	Recursively sorts the two halves.

	Merges the two sorted halves to produce the final sorted array.

	Your task is to write a function that sorts the given array using MergeSort.



Input Format:

--------------

Line-1: An integer n (the size of the array).

Line-2: n space-separated integers representing the elements of the array.



Output Format:

---------------

Line-1: Output the sorted array in a single line, with each element separated by a space.



Constraints:

------------

1 ≤ n ≤ 10^5

-10^9 ≤ arr[i] ≤ 10^9





Sample Input-1:

---------------

Enter array size:

5

Enter the numbers:

13 11 9 7 4



Sample Output-1:

-----------------

List before sorting: [13, 11, 9, 7, 4]

List after sorting: [4, 7, 9, 11, 13]



Sample Input-2:

---------------

Enter array size:

5

Enter the numbers:

10 1 2 8 5



Sample Output-2:

----------------

List before sorting: [10, 1, 2, 8, 5]

List after sorting: [1, 2, 5, 8, 10]



*/

import java.util.Scanner;



class Mergesort_recursive {



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



        System.out.println("Enter array size:");

        int n = sc.nextInt();



        int[] arr = new int[n];

        System.out.println("Enter the numbers:");

        for (int i = 0; i < n; i++) {

            arr[i] = sc.nextInt();

        }



        System.out.println("List before sorting: " + java.util.Arrays.toString(arr));



        mergeSort(arr, 0, n - 1);



        System.out.println("List after sorting: " + java.util.Arrays.toString(arr));



        sc.close();

    }

}