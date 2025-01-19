/* Longest_Common_Prefix
Given an array of strings strs, find the longest common prefix among all strings.

If there is no common prefix, return an empty string "".

NOTE: Solve Using Binary Search

Input Format:
-------------
Line-1: An integer n, the number of strings in the array.
Line-2: The next n lines contain n space-separated strings representing the 
elements of the string array strs.

Output Format:
--------------
Line-1: Print a single string, which is the longest common prefix among all the 
strings. If no common prefix exists, print an empty string.

Constraints:
------------
1 ≤ n ≤ 200
0 ≤ strs[i].length ≤ 200
strs[i] consists of only lowercase English letters.


Sample Input-1:
---------------
3
flower flow flight

Sample Output-1:
----------------
fl

Explanation:
The longest common prefix of the strings flower, flow, and flight is "fl".

Sample Input-2:
---------------
3
dog racecar car

Sample Output-2:
----------------
""

Explanation:
There is no common prefix among the input strings.
*/
import java.util.Scanner;

class LongestCommonPrefix {

    static int findMinLength(String arr[], int n) {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            if (arr[i].length() < min) {
                min = arr[i].length();
            }
        }
        return min;
    }

    public static String longestCommonPrefix(String[] strs, int n) {
        if (strs == null || strs.length == 0) {
            return "";
        }
        
        int index = findMinLength(strs, n);
        int prefixLen = -1;
        int low = 0, high = index;

        while (low <= high) {
            int mid = (low + high) / 2;
            if (isCommon(strs, mid)) {
                low = mid + 1;
                prefixLen = mid;
            } else {
                high = mid - 1;
            }
        }

        return prefixLen == -1 ? "" : strs[0].substring(0, prefixLen);
    }

    public static boolean isCommon(String[] strs, int len) {
        String pre = strs[0].substring(0, len);
        for (int i = 1; i < strs.length; i++) {
            if (!strs[i].startsWith(pre)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        // Read the number of strings
        int n = Integer.parseInt(sc.nextLine());
        String[] words = new String[n];

        // Read the strings
        for (int i = 0; i < n; i++) {
            words[i] = sc.next();
        }

        // Output the longest common prefix
        System.out.println(longestCommonPrefix(words, words.length));
    }
}
