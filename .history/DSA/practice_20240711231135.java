public class practice{
    public static void main(String [] args){
        A obj1 = new A();
        B obj2 = new B();

        obj1.start();
        obj2.sart();

    }
}

class A{
    public void run(){
        for(int i = 0;i<=5;i++){
            System.out.println(i+'A');
        }
    }
}

class B{
    public void run(){
        for(int i = 0;i<=5;i++){
            System.out.println(i+'B');
        }
    }
}