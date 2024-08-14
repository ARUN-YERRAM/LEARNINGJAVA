package DSA;

public class thread extends Thread{
    private threadNumber;

    public thread(int threadNumber){
        this.threadNumber = threadNumber;
    }
    @Override
    public void run(){
        for(int i=0;i<10;i++){
            System.out.println(i+1,+ "From threadNum"threadNumber);

            try{
                Thread.sleep(1000);
            }catch(InterruptedException e){
                System.out.println(e);
            }
        }
    }
    public static void main(String[] args){

        for(int i=0;i<5;i++){
            thread t = new thread();
            thread t1 = new thread();
            t.start();
            t1.start();
        }
    }
}
