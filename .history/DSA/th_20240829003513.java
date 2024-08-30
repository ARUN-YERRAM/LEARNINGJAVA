public class th{
    public static void main(String[] args){
        Th t = new Th();
        Th t1 = new Th();
        t.start();
        
    }

    public static class Th extends Thread{
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
}



