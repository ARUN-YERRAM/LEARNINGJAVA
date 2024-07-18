import java.util.*;


class InputInJava{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String name = sc.next(); // For a single word
        String name2 = sc.nextLine(); // For full line
        //nextInt()
        //nextFloat()
        System.out.println(name);
        System.out.println(name2);
        sc.close();
    }
}