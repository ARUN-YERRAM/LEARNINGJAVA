class Chat {
    boolean questionAsked = false;
    public synchronized void Question(String msg) {
        if(questionAsked) {
            try {
                wait();
            } catch (Exception e) {
                System.out.println("Some error occured!");
            }
        }
        c
        System.out.println(msg);
        questionAsked = true;
        notify();
    }
    public synchronized void Answer(String msg) {
        if(!questionAsked) {
            try {
                wait();
            } catch (Exception e) {
                System.out.println("Some error occured!");
            }
        }
        System.out.println(msg);
        questionAsked = false;
        notifyAll();
    }
}
class QRunnable implements Runnable {
    Chat m;
    QRunnable (Chat m) {
        this.m = m;
    }
    @Override
    public void run() {
        for(int i=0; i<4; i++)
            m.Question(i + " - Hello! What is your name?");
    }
}
class ARunnable1 implements Runnable {
    Chat m;
    ARunnable1 (Chat m) {
        this.m = m;
    }
    @Override
    public void run() {
            m.Answer(1 + " - Hello! My name is Srikar");
    }
}
class ARunnable2 implements Runnable {
    Chat m;
    ARunnable2 (Chat m) {
        this.m = m;
    }
    @Override
    public void run() {
            m.Answer(2 + " - Hello! My name is Srikar");
    }
}
class ARunnable3 implements Runnable {
    Chat m;
    ARunnable3 (Chat m) {
        this.m = m;
    }
    @Override
    public void run() {
            m.Answer(3 + " - Hello! My name is Srikar");
    }
}
public class ProducerConsumerProblem {
    public static void main(String[] args) throws Exception{
        Chat m = new Chat();
        QRunnable q = new QRunnable(m);
        ARunnable1 a1 = new ARunnable1(m);
        ARunnable2 a2 = new ARunnable2(m);
        ARunnable3 a3 = new ARunnable3(m);
        Thread question = new Thread(q);
        Thread answer1 = new Thread(a1);
        Thread answer2 = new Thread(a2);
        Thread answer3 = new Thread(a3);
        question.start();
        answer1.start();
        answer2.start();
        answer3.start();
    }
}
