import java.util.*;
public class Arrays2 {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int[] array = new int[20]; //1
    int[] array2 = {1,2,3,4,5}; //2
    
    int[] array3;
    array3 = new int[20]; //3
    
    System.out.println(array2.length);
    for(int i=0; i<array2.length; i++){
      array3[i] = sc.nextInt();
    }
    for(int i=0; i<array2.length; i++){
      System.out.println(array3[i]);
    }
    sc.close();
  }
}
