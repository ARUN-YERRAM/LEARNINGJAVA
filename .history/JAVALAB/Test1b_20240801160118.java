package JAVALAB;
import java.util.*;

public class Test1b{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);

		String str = sc.next();

		int l = str.length();
		String s1 = str.charAt(0)+""+str.charAt(l-1);
		int n1 = Integer.parseInt(str);
		int n2 = Integer.parseInt(s1);

		if(l < 3){
			System.out.println("No");
		}else{
			if(n1%n2 == 0)System.out.println("Yes");
			else System.out.println("No");
		}
	}
}