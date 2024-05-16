import java.util.*;

// import src.O;

// import package src;

public class o {

    public static void welcome(){
        System.out.println("Welcome");
        }
        
    public void sum(int a,int b){
            System.out.println(a+b);
    }
// .....................class ,method,block --------- level scope............
    public void swap(int a,int b){
        int temp = a;
        a = b;
        b = temp;
    }
    public static void main(String[] args){
        System.out.println("Hello World");
        Scanner sc = new Scanner(System.in);
        welcome();
        o obj = new o();
        int a = sc.nextInt();
        int b = sc.nextInt();

        obj.sum(a,b);
        obj.swap(a,b);

        System.out.println(a);
        System.out.println(b);

        for(int i=0;i<a;i++){
            System.out.println(i+1);
        }
    }
}
