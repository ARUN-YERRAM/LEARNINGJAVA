public class practice{
    public static void main(String [] args){
        A obj1 = new A();
        B obj2 = new B();

        obj1.start();
        obj2.start();
    }
}

class A extends Thread{
    @Override
    public void run(){
        for(int i = 0;i<=50;i++){
            System.out.println(i+"A");
        }
    }
}

class B extends Thread{
    public void run(){
        for(int i = 0;i<=50;i++){
            System.out.println(i+"B");
        }
    }
}