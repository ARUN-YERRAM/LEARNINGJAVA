// package DSA;

// public class thread implements Runnable{
//     private int threadNumber;

//     public thread(int threadNumber){
//         this.threadNumber = threadNumber;
//     }
//     @Override
//     public void run(){
//         for(int i=0;i<5;i++){
//             System.out.println(i+1 +" From threadNumber : " + threadNumber);

//             // if(threadNumber == 3){
//             //     throw new RuntimeException();
//             // }

//             try{
//                 Thread.sleep(0000);
//             }catch(InterruptedException e){
//                 System.out.println(e);
//             }
//         }
//     }

//     public static void main(String[] args){

//         for(int i=0;i<5;i++){
//             thread t = new thread(i);
//             Thread o1 = new Thread(t);
//             // thread t1 = new thread();
//             o1.run();
//             try{
//             o1.join();
//             }catch(InterruptedException e){
//                 e.printStackTrace();
//             }
//             o1.isAlive();
//             // t1.start();
//         }
//     }
// }

public class thread {
    public static void main(String[] args) {
        MyThread thread1 = new MyThread("Thread 1");
        MyThread thread2 = new MyThread("Thread 2");
        MyThread thread3 = new MyThread("Thread 3");

        // Setting priorities
        thread1.setPriority(Thread.MIN_PRIORITY); // 1
        thread2.setPriority(Thread.NORM_PRIORITY); // 5
        thread3.setPriority(Thread.MAX_PRIORITY); // 10

        // Starting threads
        thread1.start();
        thread2.start();
        thread3.start();
    }
}


for(Map.Entry<String,Integer>)

class MyThread extends Thread {
    public MyThread(String name) {
        super(name);
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " with priority " + Thread.currentThread().getPriority() + " is running");
    }
}
