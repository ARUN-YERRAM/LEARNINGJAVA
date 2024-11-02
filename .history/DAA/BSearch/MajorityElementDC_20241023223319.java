// 
// Given an array nums of size n, return the majority element. 
// The majority element is the element that appears more than ⌊n / 2⌋ times.

// You may assume that the majority element always exists in the array.

// Input Format:
// --------------
// Line-1: An integer n (the size of the array).
// Line-2: n space-separated integers representing the elements of the array.

// Output Format:
// --------------
// Line-1: Output a single integer, the majority element.

// Constraints:
// -------------
// 1 ≤ n ≤ 5 * 10^4
// -10^9 ≤ nums[i] ≤ 10^9


// Sample Input-1:
// ---------------
// 3
// 3 2 3

// Sample Output-1:
// 3

// Explanation:
// The number 3 appears more than n/2 times, so it is the majority element.

// Sample Input-2:
// ---------------
// 7
// 2 2 1 1 1 2 2

// Sample Output-2:
// ----------------
// 2

// Explanation:
// The number 2 appears 4 times, which is more than n/2 = 3.5, so it is the majority element.

// 
import java.util.*;

class MajorityElementDC{
    public static void main (String args[]){
        MajorityElementDC s = new MajorityElementDC();
        Scanner sc=new Scanner(System.in);
        System.out.println("enter array size");
        int n = sc.nextInt();
        int a[]=new int[n];
        System.out.println("enter the elements of array ");
        for(int i=0;i<n;i++){
            a[i] =sc.nextInt();
        }
        System.out.println(s.getMajorityElement(a,n));
    }
    
    static int getMajorityElement (int X[], int n){
        return getMajority(X, 0, n-1) ;
    }
    
    static int getMajority (int X[], int l, int r){
        if (l==r)
            return X[l];
        int mid = (r-l)/2 + l;
        int leftMajority = getMajority (X, l, mid);
        int rightMajority = getMajority (X, mid + 1, r);
        if(leftMajority==rightMajority)
            return leftMajority;
        int leftCount = countFrequency(X, l, r, leftMajority);
        int rightCount = countFrequency(X, l, r, rightMajority);
        if(leftCount > (r-l+1)/2)
            return leftMajority;
        else if( rightCount > (r-l+1)/2)
            return rightMajority;
        else
            return -1;
    }
    
    static int countFrequency (int X[], int l, int r, int majority){
        int count =0;
        for (int i = l; i <= r; i = i + 1){
            if (X[i] == majority)
                count = count + 1;
        }
        return count;
    }
}
