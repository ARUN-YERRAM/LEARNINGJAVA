// Java program to demonstrate Autoboxing
package DSA;

import java.util.ArrayList;
class arr {
	public static void main(String[] args)
	{
		char ch = 'a';

		// Autoboxing- primitive to Character object
		// conversion
		Character a = ch;

		ArrayList<Integer> ar = new ArrayList<Integer>();
        List<Integer> l = new ArrayList<Integer>();

		ar.add(12);
        ar.add(123);
        l.add(11)
        for(int i=0;i<2;i++)
            System.out.println(ar.get(i));
		
	}
}
