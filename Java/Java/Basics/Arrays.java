import java.util.*;
class Arrays{
    public static void main(String[] args){
        System.out.print("Enter the size of the array: ");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int[] arr = new int[x];
        for(int i=0; i<x; i++){
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter the value you want to search: ");
        int key = sc.nextInt();
        for(int i=0; i<x;i++){
            if(arr[i]==key){
                System.out.println("Key : "+key+" found at index "+i);
            }
        }
        sc.close();
    }
}