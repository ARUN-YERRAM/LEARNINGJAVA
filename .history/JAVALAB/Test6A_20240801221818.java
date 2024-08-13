package JAVALAB;

import java.io.*;
import java.util.*;

public class Test6A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Hashtable<String, String> ht = new Hashtable<>();
        Hashtable<String, String> ht = new Hashtable<>();
        
        // Use try-with-resources to ensure resources are closed properly
        try (BufferedReader br = new BufferedReader(new FileReader("Phonebook.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] s = line.split("\\s+");
                // Ensure there are at least 2 parts (name and mobile number)
                if (s.length >= 2) {
                    ht.put(s[0], s[1]);
                } else {
                    System.out.println("Invalid line format: " + line);
                }
            }
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
        
        System.out.println(ht);
        System.out.print("Enter name: ");
        String name = sc.next();
        if (ht.containsKey(name)) {
            System.out.println("Mobile number is " + ht.get(name));
        } else {
            System.out.println("Not Found");
        }
        
        System.out.print("Enter mobile number: ");
        String mobile = sc.next();
        if (ht.containsValue(mobile)) {
            Set<Map.Entry<String,String>> s1
            for (Map.Entry<String, String> e : s1) {
                if (mobile.equals(e.getValue())) {
                    System.out.println("Name is " + e.getKey());
                }
            }
        } else {
            System.out.println("Not Found");
        }
    }
}
