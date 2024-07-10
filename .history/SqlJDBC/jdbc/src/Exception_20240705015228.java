public class Exception {

    public static void main(String[] args) {
        try {
            // Example code that could throw an exception
            int result = 10 / 0; // This will cause an ArithmeticException
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) { // Corrected catch block
            // Handle exception
            System.out.println("An error occurred: " + e);
        }
    }
}
