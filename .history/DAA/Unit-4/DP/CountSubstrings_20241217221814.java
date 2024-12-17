


/*
Count Substrings with Only One Distinct Letter

Given a string s , return the number of substrings that have only one distinct letter.

Example 1:

Input: s = "aaaba"
Output: 8

Explanation: The substrings with one distinct letter are "aaa", "aa", "a", "b".

"aaa" occurs 1 time.
"aa" occurs 2 times.
"a" occurs 4 times.
"b" occurs 1 time.

So the answer is 1 + 2 + 4 + 1 = 8.

Example 2:

Input: s = "aaaaaaaaaa"
Output: 55

Constraints:
1 <= s.length <= 1000
s[i] consists of only lowercase English letters.

*/
import java.util.*;

public class CountSubstrings{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        String s = sc.next();
        int n = s.length();
        int tot = 0;
        int cnt= 0;
        int i = 0;
        while(i < n){
            char ch = s.charAt(i);
            cnt = 0;
            while(i<n && ch == s.charAt(i)){
                cnt++;
                i++;
            }tot += (cnt*(cnt+1))/2;
        }System.out.println(tot);
    }
}
