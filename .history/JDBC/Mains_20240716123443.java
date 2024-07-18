public class Mains {
    public static void main(String[] args) {
        chat m = new chat();
        QRunnable q = new QRunnable(m);
        ARunnable a = new ARunnable(m);
        Thread Question = new Thread(q);
        Thread Answer = new Thread(a);

        Question.start();
        Answer.start();
    }
}

class chat {
        boolean flag = false;
        int count = 0;
    public synchronized void Question (String msg) {
        if(flag)
        
        try{
            wait();
        }catch(InterruptedException e){
            e.printStackTrace();
        }
        System.out.println(msg);
        flag = true;
        if(count == 50)
            notify();
    }

    public synchronized void Answer(String msg) {

        if(!flag)
        try{
            wait();
        }catch(InterruptedException e){
            e.printStackTrace();
        }

        System.out.println(msg);

        flag = false;

        notify();
    }
}

class QRunnable implements Runnable {
    chat m;

    public QRunnable(chat m) {
        this.m = m;
    }

    @Override
    public void run() {
        for (int i = 0; i < 3; i++) {
            m.Question("What is Your Name");
        }
    }
}

class ARunnable implements Runnable {
    chat m;

    public ARunnable(chat m) {
        this.m = m;
    }

    @Override
    public void run() {
        for (int i = 0; i < 3; i++) {
            m.Answer("My Name is Arun Yerram");
        }
    }
}
