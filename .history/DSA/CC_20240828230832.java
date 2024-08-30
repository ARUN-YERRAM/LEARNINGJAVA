import java.util.*;
public class CC {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int[][] arr = new int[5][5];
        for(int [] a : arr){
            Arrays.fill(a,-1);
        }
        for(int i=0;i<5;i++){
            for(int j=0;j<5;j++){
                System.out.println(arr[i][j]);
            }System.out.println();
        }
    }
}
