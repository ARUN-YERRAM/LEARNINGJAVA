package DSA;

public class thread extends Thread{
    @Override
    public void run(){
        for(int i=0;i<10;i++){
            System.out.println(i+1);
        }
    }
    public static void main(String[] args){

    }
}