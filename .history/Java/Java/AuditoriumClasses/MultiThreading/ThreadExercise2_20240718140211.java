import java.io.*;
import java.util.*;


public class ThreadExercise2 {
    public static void main(String[] args) throws Exception {
        Thread t = new Thread(new AddRecords());
        t.start();
        t.join(); // Ensures file is written before sorting

        Thread t1 = new Thread(new Sort1());
        t1.start();

        Thread t2 = new Thread(new Sort2());
        t2.start();
    }
}

class Sort1 implements Runnable {
    @Override
    public void run() {
        try {
            BufferedReader br = new BufferedReader(new FileReader("Hi.txt"));
            String s = 
            List<String> A = new ArrayList<>();
            while (s != null) {
                A.add(s);
                s = br.readLine();
            }
            A.sort(null); // Natural order sorting
            System.out.println(A);
            br.close();
        } catch (Exception e) {
            System.out.println("Some error occurred!");
        }
    }
}

class Sort2 implements Runnable {
    @Override
    public void run() {
        try {
            BufferedReader br = new BufferedReader(new FileReader("Hi.txt"));
            String s = br.readLine();
            List<String> A = new ArrayList<>();
            while (s != null) {
                A.add(s);
                s = br.readLine();
            }
            A.sort(new RevSort()); // Using custom comparator
            System.out.println(A);
            br.close();
        } catch (Exception e) {
            System.out.println("Some error occurred!");
        }
    }
}

class RevSort implements Comparator<String> {
    @Override
    public int compare(String o1, String o2) {
        // Compare based on the third character in each string
        if (o1.charAt(2) > o2.charAt(2)) return 1;
        if (o1.charAt(2) < o2.charAt(2)) return -1;
        return 0;
    }
}

class AddRecords implements Runnable {
    @Override
    public void run() {
        try {
            BufferedWriter br = new BufferedWriter(new FileWriter("Hi.txt"));
            br.append("1,2\n" +
                      "2,4\n" +
                      "3,5\n" +
                      "1,7\n" +
                      "8,9\n" +
                      "9,8\n" +
                      "5,5\n");
            br.append("11,22\n");
            br.append("100,200\n");
            br.append("31,52\n");
            br.close();
            System.out.println("Written data successfully!");
        } catch (Exception e) {
            System.out.println("Some error occurred here!");
        }
    }
}

