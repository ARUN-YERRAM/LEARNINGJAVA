import java.util.*;

public class prac {
    static void welcome(){
        System.out.println("You are welcome");
    }


    public int sum(int a,int b){
        return a + b;
    }

    static void diff(int c,int d){
        // return c - d;
        System.out.println("asd");
    }

    abstract void wel(){
        // System.out.println("Welcome to");
    }

// static variable ------  single copy for whole class.......     
// instance   variable   ------------  all objects will make their own copy........


// ...........................abstract  and final...............

    public static void main(String[] args){
        int a,b;
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();

        prac obj = new prac();

        System.out.println(obj.sum(a,b));
        // System.out.println(diff(2,3));
        diff(2,3);
        welcome();

        obj.wel();




    }
}
