class UserDefinedException extends Exception{
    public UserDefinedException(String str){
        super(str);
    }
}

public class ExcepHandle{
    public static void main(String[] args) {
        // throw new ArithmeticException("Hello world");
        try{
            throw new UserDefinedException("I am a user-defined custom made exception");
        } catch (UserDefinedException ude) {
            System.out.println("Caught the expression");
            System.out.println(ude.getMessage());
        }
    }
}