package JAVALAB;

class Test9A {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = input.next();
        input.close(); // Close the scanner after use

        Map<Character, Integer> result = fCount(str);
        System.out.println(result);
    }

    public static Map<Character, Integer> fCount(String str) {
        Map<Character, Integer> map = new LinkedHashMap<>(); // Maintains the order of characters
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            int count = map.getOrDefault(ch, 0) + 1;
            map.put(ch, count);
        }
        return map;
    }
}

