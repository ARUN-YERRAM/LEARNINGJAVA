import java.util.*;

public class BraceExpression {
    public static String[] expand(String expr) {
        // TreeSet to sort
        TreeSet<String> set = new TreeSet<>();
        if (expr.length() == 0) {
            return new String[]{""};
        } 
        else if (expr.length() == 1) {
            return new String[]{expr};
        }

        if (expr.charAt(0) == '[') {
            int i = 0; // keep track of content in the "[content]"
            while (expr.charAt(i) != ']') {
                i++;
            }
            String sub = expr.substring(1, i);
            String[] subs = sub.split(",");
            String[] strs = expand(expr.substring(i + 1)); // dfs
            for (String subPart : subs) {
                for (String str : strs) {
                    set.add(subPart + str);
                }
            }
        } else {
            String[] strs = expand(expr.substring(1));
            for (String str : strs) {
                set.add(expr.charAt(0) + str);
            }
        }
        return set.toArray(new String[0]);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(Arrays.deepToString(expand(str)));
    }
}
