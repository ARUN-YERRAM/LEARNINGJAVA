import java.util.*;

public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        
        // Split input into words
        String[] stringArray = str.split(" ");
        
        // Use a Map to group anagrams
        Map<String, List<String>> anagramGroups = new HashMap<>();
        
        // Process each word
        for (String word : stringArray) {
            // Convert the word to a character array and sort it
            char[] charArray = word.toCharArray();
            Arrays.sort(charArray);
            String sortedWord = new String(charArray);
            
            // Add the original word to the list in the map
            anagramGroups.computeIfAbsent(sortedWord, k -> new ArrayList<>()).add(word);
        }
        
        // Print the anagram groups
        for (List<String> group : anagramGroups.values()) {
            System.out.println(String.join(" ", group));
        }
        
        sc.close();
    }
}
