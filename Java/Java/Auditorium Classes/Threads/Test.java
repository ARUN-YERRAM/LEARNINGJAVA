class Shared {
    int d;
    Shared(int v){
        d = v;
    }
    void increment() throws InterruptedException{
        Thread.sleep(1000);
        d+=1;
    }
    int get() throws InterruptedException{
        Thread.sleep(1000);
        return d;
    }
}

class Producer implements Runnable {
    Shared s;
    Producer(Shared s1) {
        s = s1;
    }
    public void run(){
        try {
        for(int i=0; i<10; i++){
            
                s.increment();
            } 
        }catch (InterruptedException ie) {
                System.out.println(ie.getMessage());
            }
        }
    }

class Consumer implements Runnable {
    Shared s;
    Consumer(Shared s1){
        s = s1;
    }
    public void run(){
        try{
                for(int i=0; i<10; i++){
                    System.out.println(s.get());
                }
        } catch (InterruptedException ie) {
            System.out.println(ie.getMessage());
        }
    }
}

public class Test{
    public static void main(String[] args) throws InterruptedException{
        Shared s = new Shared(5);
        Producer p = new Producer(s);
        Consumer c = new Consumer(s);
    
        Thread t1 = new Thread(p);
        Thread t2 = new Thread(c);
    
        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println("End of main");
    }
}
