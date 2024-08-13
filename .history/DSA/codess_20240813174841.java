package DSA;
import java.util.*;
public class codess {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[10];
        int [] a = new int[20];

        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        int max = 0;
        for(int i=0; i<n; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        System.out.println(max);

        int[][] ja = n
    }
}
