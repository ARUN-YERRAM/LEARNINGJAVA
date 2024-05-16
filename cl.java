
// ............class level, method level, and scope level....

class Algebra{
    int a = 10;
    int b = 20;
    int sum(int a,int b){
        return a+b;
    }

    int diff(int a,int b){
        return a - b;
    }

    int prod(int a,int b){
        return a * b;
    }
}
public class cl {
    static void welcome(){
        System.out.println("Welcome");
    }
    public static void main(String[] args) {
        // pack obj = new pack();

        System.out.println("Hello World!");
        Algebra obj = new Algebra();

        System.out.println(obj.sum(123,234));
        welcome();
        int a = 11;
        {
             int b = 10;
        } 
        // System.out.println(a);

        for(int i=0;i<a;i++){
            System.out.println(i+1);
        }
    }
}
