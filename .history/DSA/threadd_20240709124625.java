public class threadd {
    public static void main(String [] args){
        Counter c = new Counter();
        // Task t = new Task();
        Thread t1 = new Thread(c,"Seetha");
        Thread t2 = new Thread(t,"Sri");
        t1.start();
        t2.start();
        System.out.println("in main method about");

    }
}

class Counter implements Runnable{
    public void run(){
        for(int i=0;i<5;i++){
            System.out.println(Thread.currentThread().getName()+" "+i);
        }
    }
}


