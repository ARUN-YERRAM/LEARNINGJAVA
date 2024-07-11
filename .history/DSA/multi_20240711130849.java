import java.io.*;
import java.util.*;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class employee {

    private static final String CSV_FILE = "emp.csv";
    private static List<Employee> employeeData = Arrays.asList(
            new Employee("Alice", 60000, 5),
            new Employee("Bob", 55000, 3),
            new Employee("Charlie", 70000, 7),
            new Employee("David", 50000, 2),
            new Employee("Eve", 65000, 1),
            new Employee("ram", 75000, 1),
            new Employee("deepa", 35000, 3),
            new Employee("niki", 45000, 10),
            new Employee("srikara", 85000, 5),
            new Employee("srinidhi", 95000, 9));
    private static Lock lock = new ReentrantLock();

    public static void main(String[] args) {
        Thread thread1 = new Thread(new WriteToCSV());
        Thread thread2 = new Thread(new SortBySalary());
        Thread thread3 = new Thread(new SortByExperience());

        thread1.start();
        thread2.start();
        thread3.start();

        try {
            thread1.join();
            thread2.join();
            thread3.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("All tasks completed.");
    }

    static class WriteToCSV implements Runnable {
        @Override
        public void run() {
            lock.lock();
            try (PrintWriter writer = new PrintWriter(new FileWriter(CSV_FILE))) {
                writer.println("name,salary,exp");
                for (Employee emp : employeeData) {
                    writer.printf("%s,%d,%d%n", emp.getName(), emp.getSalary(), emp.getExp());
                }
                System.out.println("Data written to " + CSV_FILE);
            } catch (IOException e) {
                e.printStackTrace();
            } finally {
                lock.unlock();
            }
        }
    }

    static class SortBySalary implements Runnable {
        @Override
        public void run() {
            try {
                Thread.sleep(1000); // Ensure this task runs after the data is written
                lock.lock();
                try (BufferedReader reader = new BufferedReader(new FileReader(CSV_FILE))) {
                    List<Employee> sortedData = new ArrayList<>();
                    String line;
                    reader.readLine(); // Skip header
                    while ((line = reader.readLine()) != null) {
                        String[] fields = line.split(",");
                        sortedData
                                .add(new Employee(fields[0], Integer.parseInt(fields[1]), Integer.parseInt(fields[2])));
                    }
                    sortedData.sort(Comparator.comparingInt(Employee::getSalary));
                    System.out.println("Data sorted by salary:");
                    sortedData.forEach(System.out::println);
                } catch (IOException e) {
                    e.printStackTrace();
                } finally {
                    lock.unlock();
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    static class SortByExperience implements Runnable {
        @Override
        public void run() {
            try {
                Thread.sleep(1000); // Ensure this task runs after the data is written
                lock.lock();
                try (BufferedReader reader = new BufferedReader(new FileReader(CSV_FILE))) {
                    List<Employee> sortedData = new ArrayList<>();
                    String line;
                    reader.readLine(); // Skip header
                    while ((line = reader.readLine()) != null) {
                        String[] fields = line.split(",");
                        sortedData
                                .add(new Employee(fields[0], Integer.parseInt(fields[1]), Integer.parseInt(fields[2])));
                    }
                    sortedData.sort(Comparator.comparingInt(Employee::getExp));
                    System.out.println("Data sorted by experience:");
                    sortedData.forEach(System.out::println);
                } catch (IOException e) {
                    e.printStackTrace();
                } finally {
                    lock.unlock();
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    static class Employee {
        private String name;
        private int salary;
        private int exp;

        public Employee(String name, int salary, int exp) {
            this.name = name;
            this.salary = salary;
            this.exp = exp;
        }

        public String getName() {
            return name;
        }

        public int getSalary() {
            return salary;
        }

        public int getExp() {
            return exp;
        }

        @Override
        public String toString() {
            return "Employee{" +
                    "name='" + name + '\'' +
                    ", salary=" + salary +
                    ", exp=" + exp +
                    '}';
        }
    }
}