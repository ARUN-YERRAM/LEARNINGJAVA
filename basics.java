import java.util.*;

public class basics {
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);

//         System.out.println("123");
//         int num = sc.nextInt();

//         System.out.println(num);

//         String str = sc.next();
//         System.out.println(str);

//         float f = sc.nextFloat();
//         System.out.println(f);




//         // methods are called by objects
//         // functions are called by name itself.......

//         // User defined methods....

//         // Standard library methods....





//     }
    public void welcome(){
        System.out.println("Welcome");
    }
// .................default is static............     
// Both static variables and methods are exists
// public class Main{
    static int sum(int a,int b){
            return a+b;

        }
        

    public static void main(String[] args){
        System.out.println(sum(12,23));

        basics obj = new basics();
        // System.out.println(obj.welcome());
        obj.welcome();
        System.out.println(Math.floor(2.4)); // double
        System.out.println(Math.sqrt(24)); // double
        System.out.println(Math.pow(2,3));  // double   
        System.out.println(Math.min(2,3));
        System.out.println(Math.max(2,3));
        System.out.println(Math.ceil(2.4));  // double   

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int num = sc.nextInt();
        if(num%2==0){
            System.out.println("Even");
        }else{
            System.out.println("Odd");
        }

        for(int i=0;i<10;i++){
            System.out.println(i+1);
            System.out.println("\n");
        }

        // constructors........................ and Access modifiers...........  

        
    }
}


// print() , sqrt(),floor(), returns double data type.......
// pow(),min(),max()  ,ceil()..



