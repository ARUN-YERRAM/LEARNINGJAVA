import java.util.*;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;
import java.util.Predicate;
public class stream {

    public static void main(String[] args){
        List<Integer>nums = Arrays.asList(2,33,32,4,5);
        // Predicate<Integer>pred = n -> n%2 == 1;
        nums.stream()
            .filter(pred)
                .sorted()
                    .map(n->n*4)
                        .forEach(n ->System.out.println(n));

        
                // if(n%2 == 1)return true;
                // else return false;
            // }
        
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
