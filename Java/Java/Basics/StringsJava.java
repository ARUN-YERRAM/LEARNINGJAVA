import java.util.*;
class StringsJava{
    public static void main(String[] args){
        // String name = "Srikar";
        // String fullName = "Srikar Veluvali";
        // String sentence = "My name is Srikar Veluvali";

        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        System.out.print(name);
        sc.close();
        // String fname = "Srikar";
        // String lname = "Veluvali";
        // String fullName = fname + " " + lname;
        // System.out.println(fullName);
        // length
        // System.out.println(fullName.length());

        //charAt
        // System.out.println(fullName.charAt(10));


        // String name1 = "Tony";
        // String name2 = "Ton";

        // s1 == s2: 0
        // s1 < s2: -1
        // s1 > s2: 1
        // System.out.println(name1.compareTo(name2));

        // String s = "This is a sentence";
        // String name = s.substring(10, s.length());
        // System.out.println(name);

        // Strings are immutable
    }
}