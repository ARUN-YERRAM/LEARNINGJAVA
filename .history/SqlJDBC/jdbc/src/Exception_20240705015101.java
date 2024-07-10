public class Exception {

    public static void main(String[] args) {
        try {
            // Code that may throw an exception
            int result = divide(10, 0);
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            // Handling division by zero exception
            System.out.println("Error: Division by zero is not allowed.");
        } catch (Exception e) {
            // Handling any other exceptions
            System.out.println("An error occurred: " + e.getMessage());
        }
    }

    public static int divide(int a, int b) throws ArithmeticException {
        return a / b;
    }
}
