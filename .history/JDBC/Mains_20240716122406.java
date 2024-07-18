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
    public void Question(String msg) {
        System.out.println(msg);
    }

    public synchronized void Answer(String msg) {
        System.out.println(msg);
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
