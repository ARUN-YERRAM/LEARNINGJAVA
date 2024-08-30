public class th{
    public static void main(String[] args){
        th t = new th();
        t.start();
    }
}

public class Th extends Thread{
    @Override
    public void run(){
        for(int i=0;i<5;i++){
            System.out.println(i);
            try{
                Thread.sleep(1000);
            }catch(InterruptedException  e){
                System.out.println(e);
            }
        }
    }
}

