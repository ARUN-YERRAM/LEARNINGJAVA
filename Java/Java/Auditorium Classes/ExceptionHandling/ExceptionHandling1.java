/* 
Only Critical Section parts should be in Try block. 

When an exception occurs, it is reported to the JVM by Runtime. JVM Checks what the reason is causing the problem and it will check what class this exception will come into. It will then take that class, and create an object of that class. This object is given back to the running program.

After coming back, the program looks if the program is under try catch block. If the catch block has the required class, it will execute the catch block.

UncheckedException(RuntimeException), CheckedException(CompiletimeException)

Base class exception's Catch block should always be defined below the Derived class exception's Catch block.
*/
import java.util.*;

public class ExceptionHandling1 {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int j = sc.nextInt();
		int h = 0;
		
		try{
			h = 500/j; // Critical Section
		}		
		catch (ArithmeticException e) {
			// e.printStackTrace();
			System.out.println("Your input went wrong. Therefore Aka Meher Archana is dumb.");
		}
		catch (Exception e) {
			System.out.println("You caught a general exception. Therefore Aka Meher Archana is soo dumb.");
		}
		for(int i=0; i<3; i++)
			System.out.println("Aka Meher Archana is Dumb");
		System.out.println("Bye");
		
	}
}
