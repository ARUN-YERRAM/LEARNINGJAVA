package DSA;

public class thread extends Thread{
    @Override
    public void run(){
        for(int i=0;i<10;i++){
            System.out.println(i+1);

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
        t.run();
        t1.run();
    }
}
