            
public class Main {
    public static void main(String[] args) {
        MyThread t1 = new MyThread();
        MyThread t2 = new MyThread();
        t1.start();
        t2.start();
    }
}

            
class MyThread extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < q0; i++) {
            System.out.println(Thread.currentThread().getName() + " - " + i);
            try {
                Thread.sleep(500); // Sleep for 500 milliseconds
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}


// class MyRunnable implements Runnable {
//     @Override
//     public void run() {
//         for (int i = 0; i < 5; i++) {
//             System.out.println(Thread.currentThread().getName() + " - " + i);
//             try {
//                 Thread.sleep(500); // Sleep for 500 milliseconds
//             } catch (InterruptedException e) {
//                 System.out.println(e);
//             }
//         }
//     }
// }

// public class Main {
//     public static void main(String[] args) {
//         Thread t1 = new Thread(new MyRunnable());
//         Thread t2 = new Thread(new MyRunnable());
//         t1.start();
//         t2.start();
//     }
// }

// class Counter {
//     private int count = 0;

//     public synchronized void increment() {
//         count++;
//     }

//     public int getCount() {
//         return count;
//     }
// }

// public class Main {
//     public static void main(String[] args) throws InterruptedException {
//         Counter counter = new Counter();

//         Thread t1 = new Thread(() -> {
//             for (int i = 0; i < 1000; i++) {
//                 counter.increment();
//             }
//         });

//         Thread t2 = new Thread(() -> {
//             for (int i = 0; i < 1000; i++) {
//                 counter.increment();
//             }
//         });

//         t1.start();
//         t2.start();

//         t1.join();
//         t2.join();

//         System.out.println("Count: " + counter.getCount());
//     }
// }


// class Counter {
//     private int count = 0;
//     private final Object lock = new Object();

//     public void increment() {
//         synchronized (lock) {
//             count++;
//         }
//     }

//     public int getCount() {
//         return count;
//     }
// }

// public class Main {
//     public static void main(String[] args) throws InterruptedException {
//         Counter counter = new Counter();

//         Thread t1 = new Thread(() -> {
//             for (int i = 0; i < 1000; i++) {
//                 counter.increment();
//             }
//         });

//         Thread t2 = new Thread(() -> {
//             for (int i = 0; i < 1000; i++) {
//                 counter.increment();
//             }
//         });

//         t1.start();
//         t2.start();

//         t1.join();
//         t2.join();

//         System.out.println("Count: " + counter.getCount());
//     }
// }


// class SharedResource {
//     private int value = 0;
//     private boolean hasValue = false;

//     public synchronized void produce(int value) throws InterruptedException {
//         while (hasValue) {
//             wait();
//         }
//         this.value = value;
//         hasValue = true;
//         System.out.println("Produced: " + value);
//         notify();
//     }

//     public synchronized void consume() throws InterruptedException {
//         while (!hasValue) {
//             wait();
//         }
//         System.out.println("Consumed: " + value);
//         hasValue = false;
//         notify();
//     }
// }

// public class Main {
//     public static void main(String[] args) {
//         SharedResource resource = new SharedResource();

//         Thread producer = new Thread(() -> {
//             for (int i = 0; i < 5; i++) {
//                 try {
//                     resource.produce(i);
//                     Thread.sleep(500);
//                 } catch (InterruptedException e) {
//                     System.out.println(e);
//                 }
//             }
//         });

//         Thread consumer = new Thread(() -> {
//             for (int i = 0; i < 5; i++) {
//                 try {
//                     resource.consume();
//                     Thread.sleep(1000);
//                 } catch (InterruptedException e) {
//                     System.out.println(e);
//                 }
//             }
//         });

//         producer.start();
//         consumer.start();
//     }
// }
