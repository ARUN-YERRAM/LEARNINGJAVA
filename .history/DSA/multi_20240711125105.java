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
        // t1.join();  

        System.out.println("Bye Bye...");
    }
}

class SortSalary implements Runnable {
    @Override
    public void run() {
        sortSalary();
    }

    public void sortSalary() {
        
        System.out.println("Sorting salary...");
        
        System.out.println("Salary sorted.");
    }
}

class YearSalary implements Runnable {
    @Override
    public void run() {
        // sortYear();
        
    }

    public void sortYear() {
        // Your sorting logic here
        System.out.println("Sorting year...");
        // s.sortSalary();
        
        System.out.println("Year sorted.");
    }
}

