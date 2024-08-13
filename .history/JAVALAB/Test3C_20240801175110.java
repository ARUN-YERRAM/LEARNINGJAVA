package JAVALAB;

import java.util.*;

public class Test3C{ 
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		int arr[] = {3,0,0,2,0,4};
		int n = arr.length;
		System.out.println(maxWater(arr,n));
	}

	public static int maxWater(int [] arr,int n){
		int res = 0;
		for(int i=1;i<n-1;i++){
			int lmax = arr[i];
			int rmax= arr[i];

			for(int j=0;j<i;j++){
				lmax = Math.max(lmax,arr[i]);
			}
		}
	}
}