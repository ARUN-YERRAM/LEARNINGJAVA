// Create a task
// Create a thread
// Assign the task to the thread
// Start the thread

// 1 to 100
// 500 to 1000
// 2000 to 3000
class Counter implements Runnable {
    public void run() {
        for(int i=0; i<100; i++) {
            System.out.println(i + " " + Thread.currentThread().getName()); 
        }
        // System.out.println("Hi");
    }
}
public class TestThread {
    public static void main(String[] args) {
        Counter c = new Counter();
        Thread t1  = new Thread(c, "T1");
        Thread t2 = new Thread(c, "T2");
        Thread t3 = new Thread(c, "T3");
        t1.start();
        t2.start();
        t3.start();
        System.out.println("In main method, about to exit..........."+ " " + Thread.currentThread().getName());
    }
}