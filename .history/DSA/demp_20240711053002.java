
public class demp{
    public static void main(String[] args){
        A obj1 = new A();
        B obj2 = new B();
        System.out.println(obj1.getpriority());
        obj1.start();
        obj2.start();
    }
}

class A extends Thread{
    public void run(){
        for(int i=0;i<=100;i++){
            System.out.print("hi A    ");
        }
    }
}

class B extends Thread{
    public void run(){
        for(int i=0;i<=100;i++){
            System.out.print("hello B     ");
        }
    }
}

