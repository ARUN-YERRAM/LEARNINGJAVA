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
        for(auto it:list)
            System.out.println(it);
        list.get(1);

        int n = list.size();

        if(list.contains())

        System.out.println(n);
        list.clear();

        if(list.isEmpty()){
            System.out.println("Empty");
        }else{
            System.out.println("Not empty");
        }
    }
}