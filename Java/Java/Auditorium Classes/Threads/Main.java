/* To create a thread, first we create a runnable class which implements the default interface Runnable. Now, this Runnable class should be given to a  */

class Runnable1 implements Runnable {
    public void run() {

        for(int i=0; i<10; i++)
        System.out.println("I am thread-1");
    }
}
class Runnable2 implements Runnable {
    public void run() {

        for(int i=0; i<10; i++)
        System.out.println("I am thread-2");
    }
}
class Runnable3 implements Runnable {
    public void run() {

        for(int i=0; i<10; i++)
        System.out.println("I am thread-3");
    }
}

public class Main {
    public static void main(String[] args) throws InterruptedException{
        Runnable1 r1 = new Runnable1();
        Runnable2 r2 = new Runnable2();
        Runnable3 r3 = new Runnable3();

        Thread t1 = new Thread(r1);
        Thread t2 = new Thread(r2);
        Thread t3 = new Thread(r3);


        t1.start();
        t2.start();
        t3.start();

        t1.join(); // Indicates that the next few lines will only run after t1 has stopped running 
        t2.join();
        t3.join();
        System.out.println("I am main thread!");
    }
}