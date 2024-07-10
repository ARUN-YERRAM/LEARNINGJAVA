public class Exception {
    public static void main(String [] args){
        // int result = 10 / 0;
        try{
            int result = 10 / 0;
            // System.out.println("The value is " + result);
        }catch(ArithmeticException e){
            System.out.println("Exception caught",e);
        }
    }
}