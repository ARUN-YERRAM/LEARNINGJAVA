/*
A strobogrammatic number is a number that looks the same when rotated 180 degrees 
(looked at upside down). 
A strobogrammatic number must consist of only the digits 0, 1, 6, 8, and 9. 
Each of these digits either remains the same or transforms into another valid 
strobogrammatic digit when rotated:
	0 rotates to 0
	1 rotates to 1
	6 rotates to 9
	8 rotates to 8
	9 rotates to 6

Given an integer n, return all strobogrammatic numbers that are of length n.

Input Format:
-------------
Line-1: A single integer n, representing the length of the strobogrammatic numbers to generate.

Output Format:
--------------
line-1: Return a list of all strobogrammatic numbers of length n. The list can be in any order.

Constraints:
------------
1 ≤ n ≤ 14


Sample Input:
2
Sample Output: 
[11, 69, 88, 96]

Sample Input:
1
Sample Output: 
[0, 1, 8]

Sample Input:
3
Sample Output:
[101, 111, 181, 609, 619, 689, 808, 818, 888, 906, 916, 986]

*/

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.*;

public class Strobo{
    
    public static List<String> findStrobogrammatic(int n) {
        return generateStrobogrammatic(n, n);
    }
    
    private static List<String> generateStrobogrammatic(int n, int finalLength) {
        if (n == 0) return new ArrayList<>(List.of(""));
        if (n == 1) return new ArrayList<>(List.of("0", "1", "8"));
        
        List<String> previousList = generateStrobogrammatic(n - 2, finalLength);
        List<String> result = new ArrayList<>();
        
        for (String middle : previousList) {
            if (n != finalLength) {
                result.add("0" + middle + "0");
            }
            result.add("1" + middle + "1");
            result.add("6" + middle + "9");
            result.add("8" + middle + "8");
            result.add("9" + middle + "6");
        }
        
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        List<String> ans = findStrobogrammatic(n); 
        List<Integer> a = new ArrayList<>(); 
        
        for (String s : ans)
            a.add(Integer.parseInt(s)); 
        
        Collections.sort(a);
        System.out.println(a);
        
        sc.close();
    }
}

