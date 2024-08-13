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

        int[][] ja = new int[10][];
        ja[0] = new int[1];
        ja[1] = new int[10];
        ja[2] = new int[20];
        ja[3] = new int[30];

        for(int i=0;i<ja.length;i++){
            for(int j=0;j<ja[0].length;j++){
                ja[i][j] = sc.nextInt();
            }
        }

        for(int i=0;i<ja.length;i++){
            for(int j=0;j<ja[i].length;j++){
                System.out.println(ja[i][j]);
            }
        }

    }
}
