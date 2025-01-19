/* 
Your task is to implement the QuickSort algorithm to sort the array in ascending order.

QuickSort is a divide-and-conquer algorithm that:
	Picks an element as a pivot and partitions the given array around the pivot.
	Recursively applies the same process to the subarrays on the left and right of the pivot.
	You need to implement QuickSort using the Lomuto partition scheme (where the pivot is 
	chosen as the last element of the array).

Input Format:
-------------
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
6
10 7 8 9 1 5
Sample Output-1:
----------------
1 5 7 8 9 10


Sample Input-2:
---------------
5
3 2 1 5 4
Sample Output-2:
----------------
1 2 3 4 5
*/
import java.util.*;

public class QSolution{
    public static int partition(List<Integer>ls,int low,int high){
        int i = low-1;
        int j = low;
        int pi = ls.get(high);
        
        for(;j<high;j++){
            if(ls.get(j) < pi){
                i++;
                Collections.swap(ls,i,j);
            }
        }Collections.swap(ls,i+1,high);
        return i+1;
    }
    public static void quick(List<Integer>ls,int low,int high){
        if(low > high)return;
        
        int pi = partition(ls,low,high);
        
        quick(ls,low,pi-1);
        quick(ls,pi+1,high);
    }
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        List<Integer>ls = new ArrayList<>();
        for(int i=0;i<n;i++){
            int m = sc.nextInt();
            ls.add(m);
        }
        // Collections.sort(ls);
        quick(ls,0,n-1);
        for(int i=0;i<n;i++)
        System.out.print(ls.get(i) + " ");
    }
}

