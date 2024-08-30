package DSA;
import java.util.*;
public class practiceee{
    public static void main(String[] args){
        ArrayList<Integer>ls = new ArrayList<>();
        Vector<Integer>vec=  new Vector<>();
        ls.add(1);
        ls.add(2);
        ls.add(34);

        for(Integer it :ls){
            System.out.println(it);
        }
        ls.set(2,234);
        System.out.println(ls);
        ls.remove(2);
        for(Integer it :ls){
            System.out.print(it);
        }System.out.println();

        System.out.println(ls.get(1));
        System.out.println(ls.contains(234));
        
        Map<String,Integer>map = new HashMap<>();
        map.put("1",1);
        map.put("2",2);
        map.put("3",3);
        System.out.println(map);
        System.out.println(map.size());
        map.remove("2");
        System.out.println(map.get("1"));
        System.out.println(map.containsKey("0"));
        for(Map.Entry<String,Integer>entry:map.entrySet()){
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
        System.out.println(map.containsValue("0"));
        // map.clear();
        // map.clear();

        for(Map.Entry<String,Integer> entry : map.entrySet()){
            System.out.println(entry.getKey() + "  " + entry.getValue());
        }
                // map.clear();
        map.clear();
        System.out.println(map);

        // 
    }
}