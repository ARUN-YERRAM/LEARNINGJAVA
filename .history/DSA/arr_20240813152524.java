// Java program to demonstrate Autoboxing
package DSA;
import java.util.Collections;
import java.util.ArrayList;
class arr {
	public static void main(String[] args)
	{
		char ch = 'a';
        StringBuilder str = new StringBuilder("Arun");
        str = new StringBuilder("Yerram");
        System.out.println(str);
		// Autoboxing- primitive to Character object
		// conversion
		Character a = ch;
        String s = new String("Java");
        STring sr = "Java";
        if(s == sr){
            System.out.println("Equal");
        }

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
        // String s1 = "hello";
        // System.out.println(st == s1);

        String s = "hello";
        String s1 = "hello";
        String s2= "Kimt";
        String s3 = "World";

        System.out.println(s);
        System.out.println(s+s2);
        System.out.println(s2);
        System.out.println(s3);
        char[] c = {'t','r','y','o','w'};
        String t = new String(c);
        System.out.println(t);

        
	}
}
