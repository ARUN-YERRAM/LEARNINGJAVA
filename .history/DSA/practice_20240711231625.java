public class practice{
    public static void main(String [] args){
        A obj1 = new A();
        B obj2 = new B();

        obj1.start();
        obj2.start();
    }
}
class increment{
    int count;

    public int increment(){
        count++;
        System.out.println(count);
    }
}

class A extends Thread{
    @Override
    // int count;
    public void run(){
        for(int i = 0;i<=50;i++){
            // System.out.println(i+"A");
            increment();
        }
    }
}

class B extends Thread{
    @Override
    public void run(){
        for(int i = 0;i<=50;i++){
            // System.out.println(i+"B");
            increment();
        }
    }
}