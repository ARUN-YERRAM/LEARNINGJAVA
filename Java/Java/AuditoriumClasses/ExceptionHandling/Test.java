class Base {

}

class Derived extends Base{

}

public class Test {
    public static void main(String[] args) {
        try{
            // int a =5;
            // int b =0;
            // int c =a/b;
            // System.exit(0); // Using this will terminate the program.
            // System.out.println("Exception was encountered"); // This line and the below ones won't be executed because exception occured before this line.


            Derived d =(Derived) new Base();

        } catch (RuntimeException re) { // Even without the catch blocks, the finally block will be executed
            System.out.println("Runtime exception was handled");
        } finally { // It is used to write the cleanup codes.
            System.out.println("Finally block executed");
        }
    }
}
