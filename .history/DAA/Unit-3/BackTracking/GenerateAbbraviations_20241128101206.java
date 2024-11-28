import java.util.*;

class GenerateAbbreviations {
    public List<String> makeShortcutWords(String word) {
        List<String> ans = new ArrayList<String>();
        backtrack(ans, new StringBuilder(), word, 0, 0);
        return ans;
    }

    /* i is the current position, k is the count of consecutive abbreviated characters */
    private void backtrack(List<String> ans, StringBuilder builder, String word, int i, int k) {
        int len = builder.length(); // keep the length of builder

        // Base case: reached the end of the word
        if (i == word.length()) {
            if (k != 0)
                builder.append(k); // append the last k if non-zero
            ans.add(builder.toString());
        } else {
            // Branch where the current character is abbreviated
            backtrack(ans, builder, word, i + 1, k + 1);

            // Branch where the current character is kept
            if (k != 0)
                builder.append(k); // append the abbreviation count
            builder.append(word.charAt(i));
            backtrack(ans, builder, word, i + 1, 0);
        }

        // Backtrack: reset builder to its original state
        builder.setLength(len);
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the word: ");
        String s = sc.next();
        System.out.println(new GenerateAbbreviations().makeShortcutWords(s));
        sc.close();
    }
}
