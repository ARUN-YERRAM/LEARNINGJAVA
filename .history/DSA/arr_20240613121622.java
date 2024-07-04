// Java program to demonstrate Autoboxing
package DSA;
import java.util.Collections;
import java.util.ArrayList;
class arr {
	public static void main(String[] args)
	{
		char ch = 'a';

		// Autoboxing- primitive to Character object
		// conversion
		Character a = ch;

		ArrayList<Integer> ar = new ArrayList<Integer>();
        // List<Integer> l = new ArrayList<Integer>();

		ar.add(12);
        ar.add(123);
        Collections.sort(ar);
        // l.add(11);
        // l.add(123);
        // // l.add(345);
        // for(int i=0;i<l.size();i++)
        //     System.out.println(l.get(i));

        for(int i=0;i<ar.size();i++)
            System.out.println(ar.get(i));
		String st = "hello";
        String s1 = "hello";
        
	}
}
