package DSA;

public class HashSetE{
    public static void main(String[] args){
        Set<String>set = new HashSet<>();

        set.add("1");
        set.add("2");
        set.add("3");

        System.out.println(set.size());

        set.remove("3");
        System.out.println(set);

        if(set.contains("3"))System.out.println("yes");
        else System.out.println("No");

        if(set.isEmpty())System.out.println("Yes");
        else System.out.println("No")

        set.clear();

        System.out.println(set);

    }
}