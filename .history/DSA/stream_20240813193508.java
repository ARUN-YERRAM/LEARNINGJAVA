import java.util.*;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;
public class stream {

    public static void main(String[] args){
        List<Integer>nums = Arrays.asList(2,33,32,4,5);
        nums.stream()
        .filter(n -> n%2 == 1)
            .sorted()
            .map(n->n*4)
                .forEach(n ->System.out.println(n));

        Predicate<Integer>pred = (Integer n){
            return n%2 == 1;
                // if(n%2 == 1)return true;
                // else return false;
            }
        };
        // Stream<Integer>b = data.sorted();
        // Stream<Integer>b = data.map(n->n*3);
        // nums.forEach(System.out::println);
        // b.forEach(n ->System.out.println(n));
        // data.forEach(n ->System.out.println(n));
        // long count = b.count();
        // Stream<integer>b = data.sorted();
        // System.out.println(count);
        
    }
}
