package DSA;

import java.util.ArrayList;

public class ArrayListE{
    public static void main(String[] args){
        ArrayList<String>list = new ArrayList<>();

        list.add("hello");
        list.add("two");
        list.add("3");

        System.out.println(list);

        list.remove("hello");
        for(String it:list)
            System.out.println(it);
        System.out.println(list.get(1);

        int n = list.size();

        if(list.contains("3"))System.out.println("Yes");
        else System.out.println("No");

        System.out.println(n);
        list.clear();

        if(list.isEmpty()){
            System.out.println("Empty");
        }else{
            System.out.println("Not empty");
        }
    }
}