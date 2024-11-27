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
import java.util.*;
public class Mergesort_recursive{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size:");
        int n = sc.nextInt();
        System.out.println("Enter the numbers:");
        int [] arr = new int[n];
        for(int i=0;i<n;i++){
            int a = sc.nextInt();
            arr[i] = a;
        }
        System.out.print("List before sorting: ");
        System.out.print("[");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]);
            if(i < n-1)System.out.print(", ");
        }System.out.print("]");
        System.out.println();
        Arrays.sort(arr);
        System.out.print("List after sorting: ");
        System.out.print("[");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]);
            if(i < n-1)
            System.out.print(", ");
        }System.out.print("]");
    }
}