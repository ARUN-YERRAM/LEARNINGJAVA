import java.util.*;
import java.util.Arrays;
import java.io.*;
public class CC {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int[][] arr = new int[5][5];
        char ch;
        int c;
        // System.out.println(c);
        // System.out.println(ch);
        for(int [] a : arr){
            Arrays.fill(a,-1);
        }
        int a = 10;
        int b = 0;
        String s = "Hello";
        s.concat(" World");
        System.out.println(s);
        try{
            readFile("myFile.txt");
        }catch(FileNotFoundException e){
            System.out.println("That file not exists" + e);
        }
        // System.out.println(a / b);
        // for(int i=0;i<5;i++){
            // for(int j=0;j<5;j++){
                // System.out.println(arr[i][j]);
            // }System.out.println();
        // }

    }

    private static void readFile(String filename) {
        try{
            // FileReader read = new FileReader(filename);
            throws new RuntimeException();
        }catch(Exception e){
            System.out.println("That file not exists");
        }
    }
}