/*
Generalized_Abbreviation
With the growing trend of shorthand writing, 
people often replace parts of a word with their lengths to create short-forms. 
A valid short-form can be created by replacing non-overlapping and non-adjacent 
substrings with their respective lengths.

You are given a word as input. 
Your task is to generate all possible short-forms of the given word and return 
them in lexicographical order.

Input Format:
--------------
Line-1: A single string W representing the word.

Output Format:
---------------
A list of strings representing all possible short-forms of the word W in 
lexicographical order.

Constraints:
-------------
1 ≤ len(W) ≤ 10
The word W consists of lowercase English letters only.

Sample Input-1:
---------------
kmit

Sample Output-1:
----------------
[1m1t, 1m2, 1mi1, 1mit, 2i1, 2it, 3t, 4, k1i1, k1it, k2t, k3, km1t, km2, kmi1, kmit]


Sample Input-2:
---------------
cse

Sample Output-2:
----------------
[1s1, 1se, 2e, 3, c1e, c2, cs1, cse]
*/

import java.util.*;

class GenerateAbbreviations {
    public List<String> makeShortcutWords(String word) {
        TreeSet<String> ans = new TreeSet<>(); // Use TreeSet to automatically sort results lexicographically
        backtrack(ans, new StringBuilder(), word, 0, 0);
        return new ArrayList<>(ans); // Convert TreeSet to List
    }

    /* i is the current position, k is the count of consecutive abbreviated characters */
    private void backtrack(Set<String> ans, StringBuilder builder, String word, int i, int k) {
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

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        List<String> result = new GenerateAbbreviations().makeShortcutWords(s);
        System.out.println(result);
        sc.close();
    }
}
