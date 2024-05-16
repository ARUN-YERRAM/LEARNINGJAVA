import java.util.*;
class c{
    public static void main(String[] args){
        String str = new String();
        str = "Arun";

        StringBuffer sb = new StringBuffer("Arun");
        
        System.out.println(sb.length());
        System.out.println(sb.capacity());
        sb.append("Yerram");
        System.out.println(sb);

        sb.deleteCharAt(2);
        sb.insert(2,"as");
        System.out.println(sb);
        System.out.println(sb.charAt(3));
        System.out.println(sb.indexOf("A"));
        sb.replace(2,3,"S");
        System.out.println(sb);

        String st = "how are you?";

        char[] chr = st.toCharArray();

        for(char c:chr){
            System.out.print(c + " ");
        }

        String s = "Hello World, This is Java Programming";
        
        // Create a new StringTokenizer object
        StringTokenizer tokenizer = new StringTokenizer(s, " ,");

        // Iterate through the tokens
        while (tokenizer.hasMoreTokens()) {
            // Get the next token
            String token = tokenizer.nextToken();
            System.out.println(token);
        }
    }
}



