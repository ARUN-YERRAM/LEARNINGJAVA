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
    public synchronized void Question(String msg) {
        if(flag)wait();
        System.out.println(msg);
        flag = true;
        notify();
    }

    public void Answer(String msg) {

        if(!flag)wait();
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
