// All exception classes which are derived from RuntimeException is Unchecked, except that, all are checked exception
// Checked Exception -> Compiletime exception
// 'throws IOException' will enable exception propagation in Java, if not written, JVM will not let the code compile
// In unchecked exception, exception proagation will automatically happen.
import java.io.*;
import java.util.*;
public class ExceptionHandling2 {
	public static void main (String[] args) throws IOException {
		/* int arr[] = new int[10];
		arr[11] = 20;*/ // Runtime Exception Ex
		
		/*m1();*/
		
		Scanner sc = new Scanner(System.in);
		try {
			int age = sc.nextInt();
			if(age<0){
				throw new AgeException();
			}
		} catch (AgeException e) {
			System.out.println(e.getMessage());
		} catch (Exception e) {
			System.out.println("Some error occured!");
		} 
		System.out.println("Bye bye");
	}
	static void m1() throws IOException {
		// Checked Exception
		File f = new File("Marks.txt");
		FileInputStream fis = new FileInputStream(f);
	}
}
