package JAVALAB;

import java.util.*;
import java.io.*;

class Data {
    String plang, ip, timestamp;

    Data(String plang, String ip, String timestamp) {
        this.plang = plang;
        this.ip = ip;
        this.timestamp = timestamp;
    }
}

public class Test6B {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        FileReader fr = new FileReader("logfile.txt");
        BufferedReader br = new BufferedReader(fr);
        String line;
        String[] data;
        ArrayList<Data> al = new ArrayList<Data>();

        // Read and parse the log file
        while ((line = br.readLine()) != null) {
            data = line.split("\t");
            if (data.length == 3) {
                Data d = new Data(data[0], data[1], data[2]);
                al.add(d);
            } else {
                System.out.println("Invalid line format: " + line);
            }
        }

        // Display the data
        for (Data d : al) {
            System.out.println(d.plang + "," + d.ip + "," + d.timestamp);
        }

        // Remove duplicates with similar plang and ip within 20 seconds
        int n = al.size();
        ListIterator<Data> iterator = al.listIterator();
        Set<Integer> removedIndexes = new HashSet<>();
        
        while (iterator.hasNext()) {
            Data current = iterator.next();
            int index = iterator.nextIndex() - 1;
            
            for (int j = index + 1; j < n; j++) {
                Data other = al.get(j);
                
                if (current.plang.equals(other.plang) && current.ip.equals(other.ip)) {
                    try {
                        int t1 = Integer.parseInt(current.timestamp);
                        int t2 = Integer.parseInt(other.timestamp);
                        if (Math.abs(t2 - t1) <= 20) {
                            removedIndexes.add(j);
                        }
                    } catch (NumberFormatException e) {
                        System.out.println("Invalid timestamp format: " + e.getMessage());
                    }
                }
            }
        }
        
        Iterator<Data> it = al.iterator();
        int currentIndex = 0;
        while (it.hasNext()) {
            it.next();
            if (removedIndexes.contains(currentIndex)) {
                it.remove();
            }
            currentIndex++;
        }

        // Count occurrences of each programming language
        HashMap<String, Integer> votes = new HashMap<>();
        for (Data d : al) {
            int x = votes.getOrDefault(d.plang, 0) + 1;
            votes.put(d.plang, x);
        }

        // Display results
        Set<Map.Entry<String, Integer>> s1 = votes.entrySet();
        for (Map.Entry<String, Integer> e : s1) {
            System.out.println(e.getKey() + " " + e.getValue());
        }

        br.close();
    }
}
