public class Mains {
    public static void main(String [] args){
        chat m = new chat();
        QRunnable q = new QRunnable();
        ARunnable a = new ARunnable();
        Thread question = new Thread(q);
        Thread answer = new Thread(a);
    }
}

class chat{
    public void Question(){
        
    } 
}

class QRunnable implements Runnable{
    chat m;
    public void QRunnable(chat m){
        this.m = m;
    }

    @Override
    public void run(){

        m.Question("What is Your Name");

    }

}


class ARunnable implements Runnable{
    chat m;
    public void ARunnable(chat m){
        this.m = m;
    }
    
    @Override
    public void run(){

        m.Question("My Name is Arun Yerram");

    }

}

