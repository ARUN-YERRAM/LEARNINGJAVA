package JAVALAB;

import java.util.*;

class Test9B {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        HashMap<String, String> mapOne = new HashMap<>();
        HashMap<String, String> mapTwo = new HashMap<>();

        // Input for HashMap 1
        System.out.print("Enter how many pairs in HashMap 1: ");
        int mapOneSize = input.nextInt();
        input.nextLine(); // Consume newline

        System.out.println("Enter your " + mapOneSize + " pairs of String ");
        for (int i = 0; i < mapOneSize; i++) {
            System.out.println("Enter Pair " + (i + 1));
            String[] pairs = input.nextLine().split(" ");
            mapOne.put(pairs[0], pairs[1]);
        }

        // Input for HashMap 2
        System.out.print("Enter how many pairs in HashMap 2: ");
        int mapTwoSize = input.nextInt();
        input.nextLine(); // Consume newline

        System.out.println("Enter your " + mapTwoSize + " pairs of String ");
        for (int i = 0; i < mapTwoSize; i++) {
            System.out.println("Enter Pair " + (i + 1));
            String[] pairs = input.nextLine()
            mapTwo.put(pairs[0], pairs[1]);
        }

        // Find common key-value pairs
        int count = 0;
        for (Map.Entry<String, String> entry : mapOne.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();

            if (mapTwo.containsKey(key) && mapTwo.get(key).equals(value)) {
                count++;
            }
        }
        System.out.println("The number of key/value pairs are: " + count);
    }
}

