public class Test {
    public static void main(String [] args) {
        String Ray = "";
        String Ben = "";
        String Kevin = "";

        while(!Ray.isEmpty() || !Ben.isEmpty()) { // Changed condition
            if (Ben.isEmpty() && !Ray.isEmpty()) { // Add condition to avoid substring on empty string
                Ben = Ben + Ray.substring(0, 1);
                Ray = Ray.substring(1);
            } else if (Kevin.isEmpty()) {
                Kevin = Kevin + Ben.substring(Ben.length() - 1);
                Ben = Ben.substring(0, Ben.length() - 1);
            } else if (Kevin.charAt(0) >= Ben.charAt(Ben.length() - 1)) {
                Kevin = Kevin + Ben.substring(Ben.length() - 1);
                Ben = Ben.substring(0, Ben.length() - 1);
            } else if (Kevin.charAt(0) < Ben.charAt(Ben.length() - 1)) {
                Ben = Ben + Ray.substring(0, 1);
                Ray = Ray.substring(1);
            }
        }
        System.out.println(Kevin);
    }
}