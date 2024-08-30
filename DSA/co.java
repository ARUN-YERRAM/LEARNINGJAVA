public class co {
    private static String $;
    public static void main(String[] args){

        String str = "     xsslalalaalalss        ";
        String st = "cjvgchercer";
        String[] arg = str.split("l");
        String s="cbek";
        System.out.println($);
        System.out.println(s);

        String s1 = "Java";
        String s2 = "Java";
        StringBuilder sb1 = new StringBuilder();
        sb1.append("Ja").append("va");
        System.out.println(s1 == s2);
        System.out.println(s1.equals(s2));
        System.out.println(sb1.toString() == s1);
        System.out.println(sb1.toString().equals(s1));
        

        // System.out.println(arg);
        System.out.println(str.toLowerCase());
        System.out.println(str.toUpperCase());
        System.out.println(str.trim());
        System.out.println(str.length());
        System.out.println(str.substring(2,10));
        System.out.println(str.charAt(2));
        // System.out.println(str.substring);
        char[] ch = st.toCharArray();
        System.out.println(ch);
    }
}
