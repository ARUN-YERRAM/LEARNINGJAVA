public class multi {
    public static void main(String [] args){

        System.out.println("hello");

        SortSalary s = new SortSalary();
        YearSorter Y = new YearSorter();
        s.sortSalary();
        Thread t = new Thread(s);
        Thread t1 = new Thread();


    }
}
class SortSalary implements Runnable{

    @Override
    public void run() {

    }
}
