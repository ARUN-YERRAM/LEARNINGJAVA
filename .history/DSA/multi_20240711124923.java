public class Multi {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("hello");

        SortSalary s = new SortSalary();
        YearSalary y = new YearSalary();

        Thread t = new Thread(s);
        Thread t1 = new Thread(y);

        t.start();
        t1.start();

        t.join();
        t1.join();  // Ensure all threads finish before exiting main
    }
}

class SortSalary implements Runnable {
    @Override
    public void run() {
        sortSalary();
    }

    public void sortSalary() {
        // Your sorting logic here
        System.out.println("Sorting salary...");
        try {
            Thread.sleep(2000); 
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Salary sorted.");
    }
}

class YearSalary implements Runnable {
    @Override
    public void run() {
        sortYear();
    }

    public void sortYear() {
        // Your sorting logic here
        System.out.println("Sorting year...");
        
        System.out.println("Year sorted.");
    }
}
