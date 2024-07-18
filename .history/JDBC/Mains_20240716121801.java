public class Mains {
    public static void main(String [] args){
        chat m = new chat();
        QRunnable q = new QRunnable();
        ARunnable a = new ARunnable();
        Thread question = new Thread(q);
        Thread answer = new Thread(a);

        question.start();
        answer.start();
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

        for(int i=0;i<3;i++){
        m.Question("What is Your Name");
        }

    }

}


class ARunnable implements Runnable{
    chat m;
    public void ARunnable(chat m){
        this.m = m;
    }
    
    @Override
    public void run(){

        m.Q("My Name is Arun Yerram");

    }

}

