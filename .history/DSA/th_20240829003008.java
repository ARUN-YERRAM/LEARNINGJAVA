public class th extends Thread{

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

public class Th{
    public static void main(String[] args){
        
    }
}
