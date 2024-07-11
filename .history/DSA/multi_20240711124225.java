public class multi {
    public static void main(String [] args){

        System.out.println("hello");

        SortSalary s = new SortSalary();
        YearSorter Y = new YearSorter();
        
        Thread t = new Thread(s);


    }
}
class SortSalary implements Runnable{

    @Override
    public void run() {

    }
}
