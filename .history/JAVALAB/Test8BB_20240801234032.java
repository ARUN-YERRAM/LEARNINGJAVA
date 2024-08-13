package JAVALAB;

import java.util.*;

class Test8BB {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read the list of words
        String s = sc.nextLine();
        String[] arr = s.split(" ");
        
        // Read the number of top words to display
        int k = sc.nextInt();
        
        // Map to count the occurrences of each word
        Map<String, Integer> wordCountMap = new HashMap<>();
        for (String word : arr) {
            int cnt = wordCountMap.getOrDefault(word,0)+1;
            wordCountMap.put(word,cnt);
        }
        
        // TreeMap to sort words by frequency (descending) and lexicographically (ascending)
        Map<String, Integer> sortedMap = new TreeMap<>(new Comparator<String>() {
            @Override
            public int compare(String w1, String w2) {
                int frequencyCompare = wordCountMap.get(w2).compareTo(wordCountMap.get(w1));
                if (frequencyCompare == 0) {
                    return w1.compareTo(w2);
                }
                return frequencyCompare;
            }
        });
        sortedMap.putAll(wordCountMap);
        
        // Display the top k words
        int count = 0;
        for (Map.Entry<String,Integer> entry:sortedMap.entrySet()){
            System.out.println(entry.getKey() + " ");
            if(count == k)break;
        }
    }
}


