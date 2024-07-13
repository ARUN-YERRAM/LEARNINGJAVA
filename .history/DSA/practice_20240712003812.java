public class practice {
    public static void main(String[] args) {
        Increment increment = new Increment();

        A obj1 = new B(increment);
        B obj2 = new B(increment);

        obj1.start();
        obj2.start();
    }
}

class Increment {
    int count;

    // Synchronized method to ensure thread safety
    public synchronized void increment() {
        count++;
        System.out.println(count);
    }
}

class A extends Thread {
    Increment increment;

    public A(Increment increment) {
        this.increment = increment;
    }

    @Override
    public void run() {
        for (int i = 0; i <= 50; i++) {
            increment.increment();
        }
    }
}

class B extends Thread {
    Increment increment;

    public B(Increment increment) {
        this.increment = increment;
    }

    @Override
    public void run() {
        for (int i = 0; i <= 50; i++) {
            increment.increment();
        }
    }
}
