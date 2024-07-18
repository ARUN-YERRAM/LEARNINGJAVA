import java.util.*;
class TwoDArrays{
    public static void main(String[] args){
        int x, y;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
        x = sc.nextInt();
        System.out.println("Enter the number of columns: ");
        y = sc.nextInt();
        int[][] arr = new int[x][y];
        for(int i=0; i<x; i++){
            for(int j=0; j<y; j++){
                arr[i][j] = sc.nextInt();
            }
        }

        System.out.print("Enter the value you want to search: ");
        int key = sc.nextInt();
        for(int i=0; i<x; i++){
            for(int j=0; j<y; j++){
                if(arr[i][j] == key){
                    System.out.println("Key "+key+" found at index "+ i + " "+ j);
                }
            }
        }
        
        sc.close();
    }
}