import java.util.*;
import java.util.Arrays;
import java.util.List;
public class stream {

    public static void main(String[] args){
        List<Integer>nums = Arrays.aslist(2,3,4,5);
        Stream<Integer>data = nums.stream();
        // nums.forEach(System.out::println);
        data.forEach(n ->System.out.println(n));
    }
}