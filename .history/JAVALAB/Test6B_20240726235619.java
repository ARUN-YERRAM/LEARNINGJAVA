package JAVALAB;

import java.util.*;
import java.io.*;

public class Test6B {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        FileReader fr = new FileReader("logfile.txt");
        BufferedReader br = new BufferedReader(fr);
        String line;
        String[] data;
        ArrayList<Data> al = new ArrayList<Data>();

        while ((line = br.readLine()) != null) {
            data = line.split("\t");
            if (data.length == 3) {
                Data d = new Data(data[0], data[1], data[2]);
                al.add(d);
            } else {
                System.out.println("Invalid line format: " + line);
            }
        }
        br.close();

        // Remove duplicates with similar plang and ip within 20 seconds
        Set<Data> toRemove = new HashSet<>();
        int n = al.size();

        for (int i = 0; i < n - 1; i++) {
            Data current = al.get(i);
            for (int j = i + 1; j < n; j++) {
                Data other = al.get(j);
                if (current.plang.equals(other.plang) && current.ip.equals(other.ip)) {
                    try {
                        int t1 = Integer.parseInt(current.timestamp);
                        int t2 = Integer.parseInt(other.timestamp);
                        if (Math.abs(t2 - t1) <= 20) {
                            toRemove.add(other); // Mark for removal
                        }
                    } catch (NumberFormatException e) {
                        System.out.println("Invalid timestamp format: " + e.getMessage());
                    }
                }
            }
        }

        al.removeAll(toRemove); // Remove all duplicates in one go

        // Count votes
        HashMap<String, Integer> votes = new HashMap<>();
        for (Data d : al) {
            int x = votes.getOrDefault(d.plang, 0) + 1;
            votes.put(d.plang, x);
        }

        // Print results
        Set<Map.Entry<String, Integer>> s1 = votes.entrySet();
        for (Map.Entry<String, Integer> e : s1) {
            System.out.println(e.getKey() + " " + e.getValue());
        }
    }
}
