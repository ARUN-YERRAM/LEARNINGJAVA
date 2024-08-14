package DSA;

public class thread implements Runnable{
    private int threadNumber;

    public thread(int threadNumber){
        this.threadNumber = threadNumber;
    }
    @Override
    public void run(){
        for(int i=0;i<5;i++){
            System.out.println(i+1 +" From threadNumber : " + threadNumber);

            // if(threadNumber == 3){
            //     throw new RuntimeException();
            // }

            try{
                Thread.sleep(0000);
            }catch(InterruptedException e){
                System.out.println(e);
            }
        }
    }
    public static void main(String[] args){

        for(int i=0;i<5;i++){
            thread t = new thread(i);
            Thread o1 = new Thread(t);
            // thread t1 = new thread();
            o1.run();
            try{
            o1.join();
            }catch(Interrupted Exception e){
                e.printTrace();
            }
            // o1.isAlive();
            // t1.start();
        }
    }
}
