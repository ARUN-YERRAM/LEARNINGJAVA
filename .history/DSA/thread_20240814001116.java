package DSA;

public class thread extends Thread{
    private int threadNumber;

    public thread(int threadNumber){
        this.threadNumber = threadNumber;
    }
    @Override
    public void run(){
        for(int i=0;i<10;i++){
            System.out.println(i+1 +" From threadNumber : " + threadNumber);

            // if(threadNumber == 3){
            //     throw new RuntimeException();
            // }

            try{
                Thread.sleep(1000);
            }catch(InterruptedException e){
                System.out.println(e);
            }
        }
    }
    public static void main(String[] args){

        for(int i=0;i<5;i++){
            thread t = new thread(i);
            // thread t1 = new thread();
            t.start();
            // t1.start();
        }
    }
}
