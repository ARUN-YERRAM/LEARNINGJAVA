public class threadd {
    public static void main(String [] args){
        Counter c = new Counter();
        Task t = new task();
        Thread t1 = new Thread(c,"Seetha");
        Thread t2 = new Thread(t,"Sri");
        t1.start();
        t2.start();
        System.out.println("in mainmethos")

    }
}
