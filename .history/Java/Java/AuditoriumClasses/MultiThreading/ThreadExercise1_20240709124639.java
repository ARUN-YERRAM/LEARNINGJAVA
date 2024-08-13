import java.util.Scanner;

class Task1 implements Runnable {
    @Override
    public void run() {
        // TODO Auto-generated method stub
        for(int i=1; i<=100; i++) {
            System.out.println(i + " " + Thread.currentThread().getName());
        }
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter from task 1: ");
        String s1 = sc.nextLine();
        System.out.println(s1);
        sc.close();
    }
}
class Task2 implements Runnable {
    @Override
    public void run() {
        // TODO Auto-generated method stub
        for(int i=500; i<=1000; i++) {
            System.out.println(i + " " + Thread.currentThread().getName());
        }
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter from task 2: ");
        String s1 = sc.nextLine();
        System.out.println(s1);
        sc.close();
    }
}
class Task3 implements Runnable {
    @Override
    public void run() {
        // TODO Auto-generated method stub
        for(int i=2000; i<=2500; i++) {
            System.out.println(i + " " + Thread.currentThread().getName());
        }
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter from task 3: ");
        String s1 = sc.nextLine();
        System.out.println(s1);
        sc.close();
    }
}

public class ThreadExercise1 {
    public static void main(String[] args) {
        Thread t1 = new Thread(new Task1(),"T1");
        Thread t2 = new Thread(new Task2(),"T2");
        Thread t3 = new Thread(new Task3(),"T3");

        t1.start();
        t2.start();
        t3.start();

        System.out.println("Main method ended....");
    }
}
