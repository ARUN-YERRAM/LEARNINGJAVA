import java.io.*;
import java.util.*;
class Sort1 implements Runnable {
    @Override
    public void run() {
        try{
            BufferedReader br = new BufferedReader(new FileReader("Hi.txt"));
            String s = br.readLine();
            List<String> A = new ArrayList<String>();
            while(s!=null) {
                A.add(s);
                s = br.readLine();
            }
            A.sort(null);
            System.out.println(A);
            br.close();
        } catch (Exception e) {
            System.out.println("Some error occured!");
        }
    }
}
class Sort2 implements Runnable {
    @Override
    public void run() {
        try{
            BufferedReader br = new BufferedReader(new FileReader("Hi.txt"));
            String s = br.readLine();
            List<String> A = new ArrayList<String>();
            while(s!=null) {
                A.add(s);
                s = b.readLine();
            }
            A.sort(new RevSort());
            System.out.println(A);
            br.close();
        } catch (Exception e) {
            System.out.println("Some error occured!");
        }
    }
}
class RevSort implements Comparator {
    @Override
    public int compare(Object o1, Object o2) {
        o1 = (String)o1;
        o2 = (String)o2;
        if(o1.toString().charAt(2)>o2.toString().charAt(2)) return 1;
        if(o1.toString().charAt(2)<o2.toString().charAt(2)) return -1;
        return 0;
    }
}
class AddRecords implements Runnable {
    @Override
    public void run() {
        try {
            BufferedWriter br = new BufferedWriter(new FileWriter("Hi.txt"));
            br.append("1,2\n"+
                    "2,4\n"+
                    "3,5\n"+
                    "1,7\n"+
                    "8,9\n"+
                    "9,8\n"+
                    "5,5\n",0,28
                    );
            br.append("11,22\n", 0, 6);
            br.append("100,200\n", 0, 8);
            br.append("31,52\n", 0, 6);
            br.close();
            System.out.println("Written data successfully!");
        } catch (Exception e) {
            System.out.println("Some error occured here!");
        }
    }
}
public class ThreadExercise2 {
    public static void main(String[] args) throws Exception{
        Thread t = new Thread(new AddRecords());
        t.start();
        t.join();
        Thread t1 = new Thread(new Sort1());
        t1.start();
        Thread t2 = new Thread(new Sort2());
        t2.start();
    }
}
