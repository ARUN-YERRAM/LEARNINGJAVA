package DSA;
import java.util.*;
public class practiceee{
    public static void main(String[] args){
        ArrayList<Integer>ls = new ArrayList<>();
        ls.add(1);
        ls.add(2);
        ls.add(34);
z
        for(Integer it :ls){
            System.out.println(it);
        }
        ls.set(2,234);
        System.out.println(ls);
        ls.remove(2);
        for(Integer it :ls){
            System.out.println(it);
        }
        
    }
}