public class Mains {
    public static void main(String [] args){
        Thread question = new Thread();
        Thread answer = new Thread();
    }
}

class chat{
    public void Question(){

    } 
}

class QRunnable implements Runnable{
    chat m;
    public void QRunnable(){

    }
    @Override
    public void run(){

        m.Question("What is Your Name");

    }

}

