package DSA;

public class thread extends Thread{
    @Override
    public void run(){
        for(int i=0;i<10;i++){
            System.out.println(i+1);

            try{
                Thread.sleep(1000);
            }catch(Interupted Exception e){
                System.out.println(e);
            }
        }
    }
    public static void main(String[] args){
        thread t = new thread();
        t.start();
    }
}
