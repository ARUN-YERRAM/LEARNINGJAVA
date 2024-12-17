
/*
Valid Word Abbreviation

Given a non-empty string s and an abbreviation abbr , return whether the string 
matches with the given abbreviation.
A string such as "word" contains only the following valid abbreviations:

["word", "1ord", "w1rd", "wo1d", "wor1", "2rd", "w2d", "wo2", "1o1d", "1or1", 
"w1r1", "1o2", "2r1", "3d", "w3", "4"]

Notice that only the above abbreviations are valid abbreviations of the string 
"word" . Any other string is not a valid abbreviation of "word" .

Note: Assume s contains only lowercase letters and abbr contains only lowercase 
letters and digits.

Example 1:
Given s = "internationalization", abbr = "i12iz4n":
Return true.

Example 2:
Given s = "apple", abbr = "a2e":
Return false.
*/


import java.util.*;

public class ValidWordAbbreviation{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String s1 = sc.next();
        String s2 = sc.next();
        
        int n1 = s1.length();
        int n2 = s2.length();
        int i = 0, j = 0;
        boolean f = true;
        if(n1 == 0 && n2 == 0){
            System.out.println(true);
        }else{
        
        while (i < n1 && j < n2) {
            if (s1.charAt(i) == s2.charAt(j)) {
                i++;
                j++;
            } else {
                if (Character.isDigit(s2.charAt(j))) {
                    StringBuilder str = new StringBuilder();
                    while (j < n2 && Character.isDigit(s2.charAt(j))) {
                        if(str.length() == 0 && s2.charAt(j) == '0'){
                            f = false;
                            break;
                        }
                        str.append(s2.charAt(j));
                        j++;
                    }if(!f)break;
                    int n = Integer.parseInt(str.toString());
                    // j += n;
                    i += n;
                } else {
                    f = false;
                    break;
                }
            }if(!f)break;
        }
        
        if (!f) {
            System.out.println(false);
        } else {
            System.out.println(true);
        }
        }
        sc.close();
    }
}

/*
Valid Word Abbreviation

Given a non-empty string s and an abbreviation abbr , return whether the string 
matches with the given abbreviation.
A string such as "word" contains only the following valid abbreviations:

["word", "1ord", "w1rd", "wo1d", "wor1", "2rd", "w2d", "wo2", "1o1d", "1or1", 
"w1r1", "1o2", "2r1", "3d", "w3", "4"]

Notice that only the above abbreviations are valid abbreviations of the string 
"word" . Any other string is not a valid abbreviation of "word" .

Note: Assume s contains only lowercase letters and abbr contains only lowercase 
letters and digits.

Example 1:
Given s = "internationalization", abbr = "i12iz4n":
Return true.

Example 2:
Given s = "apple", abbr = "a2e":
Return false.
*/


import java.util.*;

public class ValidWordAbbreviation{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String s1 = sc.next();
        String s2 = sc.next();
        
        int n1 = s1.length();
        int n2 = s2.length();
        int i = 0, j = 0;
        boolean f = true;
        if(n1 == 0 && n2 == 0){
            System.out.println(true);
        }else{
        
        while (i < n1 && j < n2) {
            if (s1.charAt(i) == s2.charAt(j)) {
                i++;
                j++;
            } else {
                if (Character.isDigit(s2.charAt(j))) {
                    StringBuilder str = new StringBuilder();
                    while (j < n2 && Character.isDigit(s2.charAt(j))) {
                        if(str.length() == 0 && s2.charAt(j) == '0'){
                            f = false;
                            break;
                        }
                        str.append(s2.charAt(j));
                        j++;
                    }if(!f)break;
                    int n = Integer.parseInt(str.toString());
                    // j += n;
                    i += n;
                } else {
                    f = false;
                    break;
                }
            }if(!f)break;
        }
        
        if (!f) {
            System.out.println(false);
        } else {
            System.out.println(true);
        }
        }
        sc.close();
    }
}

/*
Valid Word Abbreviation

Given a non-empty string s and an abbreviation abbr , return whether the string 
matches with the given abbreviation.
A string such as "word" contains only the following valid abbreviations:

["word", "1ord", "w1rd", "wo1d", "wor1", "2rd", "w2d", "wo2", "1o1d", "1or1", 
"w1r1", "1o2", "2r1", "3d", "w3", "4"]

Notice that only the above abbreviations are valid abbreviations of the string 
"word" . Any other string is not a valid abbreviation of "word" .

Note: Assume s contains only lowercase letters and abbr contains only lowercase 
letters and digits.

Example 1:
Given s = "internationalization", abbr = "i12iz4n":
Return true.

Example 2:
Given s = "apple", abbr = "a2e":
Return false.
*/


import java.util.*;

public class ValidWordAbbreviation{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String s1 = sc.next();
        String s2 = sc.next();
        
        int n1 = s1.length();
        int n2 = s2.length();
        int i = 0, j = 0;
        boolean f = true;
        if(n1 == 0 && n2 == 0){
            System.out.println(true);
        }else{
        
        while (i < n1 && j < n2) {
            if (s1.charAt(i) == s2.charAt(j)) {
                i++;
                j++;
            } else {
                if (Character.isDigit(s2.charAt(j))) {
                    StringBuilder str = new StringBuilder();
                    while (j < n2 && Character.isDigit(s2.charAt(j))) {
                        if(str.length() == 0 && s2.charAt(j) == '0'){
                            f = false;
                            break;
                        }
                        str.append(s2.charAt(j));
                        j++;
                    }if(!f)break;
                    int n = Integer.parseInt(str.toString());
                    // j += n;
                    i += n;
                } else {
                    f = false;
                    break;
                }
            }if(!f)break;
        }
        
        if (!f) {
            System.out.println(false);
        } else {
            System.out.println(true);
        }
        }
        sc.close();
    }
}

/*
Valid Word Abbreviation

Given a non-empty string s and an abbreviation abbr , return whether the string 
matches with the given abbreviation.
A string such as "word" contains only the following valid abbreviations:

["word", "1ord", "w1rd", "wo1d", "wor1", "2rd", "w2d", "wo2", "1o1d", "1or1", 
"w1r1", "1o2", "2r1", "3d", "w3", "4"]

Notice that only the above abbreviations are valid abbreviations of the string 
"word" . Any other string is not a valid abbreviation of "word" .

Note: Assume s contains only lowercase letters and abbr contains only lowercase 
letters and digits.

Example 1:
Given s = "internationalization", abbr = "i12iz4n":
Return true.

Example 2:
Given s = "apple", abbr = "a2e":
Return false.
*/


import java.util.*;

public class ValidWordAbbreviation{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String s1 = sc.next();
        String s2 = sc.next();
        
        int n1 = s1.length();
        int n2 = s2.length();
        int i = 0, j = 0;
        boolean f = true;
        if(n1 == 0 && n2 == 0){
            System.out.println(true);
        }else{
        
        while (i < n1 && j < n2) {
            if (s1.charAt(i) == s2.charAt(j)) {
                i++;
                j++;
            } else {
                if (Character.isDigit(s2.charAt(j))) {
                    StringBuilder str = new StringBuilder();
                    while (j < n2 && Character.isDigit(s2.charAt(j))) {
                        if(str.length() == 0 && s2.charAt(j) == '0'){
                            f = false;
                            break;
                        }
                        str.append(s2.charAt(j));
                        j++;
                    }if(!f)break;
                    int n = Integer.parseInt(str.toString());
                    // j += n;
                    i += n;
                } else {
                    f = false;
                    break;
                }
            }if(!f)break;
        }
        
        if (!f) {
            System.out.println(false);
        } else {
            System.out.println(true);
        }
        }
        sc.close();
    }
}

/*
Valid Word Abbreviation

Given a non-empty string s and an abbreviation abbr , return whether the string 
matches with the given abbreviation.
A string such as "word" contains only the following valid abbreviations:

["word", "1ord", "w1rd", "wo1d", "wor1", "2rd", "w2d", "wo2", "1o1d", "1or1", 
"w1r1", "1o2", "2r1", "3d", "w3", "4"]

Notice that only the above abbreviations are valid abbreviations of the string 
"word" . Any other string is not a valid abbreviation of "word" .

Note: Assume s contains only lowercase letters and abbr contains only lowercase 
letters and digits.

Example 1:
Given s = "internationalization", abbr = "i12iz4n":
Return true.

Example 2:
Given s = "apple", abbr = "a2e":
Return false.
*/


import java.util.*;

public class ValidWordAbbreviation{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String s1 = sc.next();
        String s2 = sc.next();
        
        int n1 = s1.length();
        int n2 = s2.length();
        int i = 0, j = 0;
        boolean f = true;
        if(n1 == 0 && n2 == 0){
            System.out.println(true);
        }else{
        
        while (i < n1 && j < n2) {
            if (s1.charAt(i) == s2.charAt(j)) {
                i++;
                j++;
            } else {
                if (Character.isDigit(s2.charAt(j))) {
                    StringBuilder str = new StringBuilder();
                    while (j < n2 && Character.isDigit(s2.charAt(j))) {
                        if(str.length() == 0 && s2.charAt(j) == '0'){
                            f = false;
                            break;
                        }
                        str.append(s2.charAt(j));
                        j++;
                    }if(!f)break;
                    int n = Integer.parseInt(str.toString());
                    // j += n;
                    i += n;
                } else {
                    f = false;
                    break;
                }
            }if(!f)break;
        }
        
        if (!f) {
            System.out.println(false);
        } else {
            System.out.println(true);
        }
        }
        sc.close();
    }
}

/*
Valid Word Abbreviation

Given a non-empty string s and an abbreviation abbr , return whether the string 
matches with the given abbreviation.
A string such as "word" contains only the following valid abbreviations:

["word", "1ord", "w1rd", "wo1d", "wor1", "2rd", "w2d", "wo2", "1o1d", "1or1", 
"w1r1", "1o2", "2r1", "3d", "w3", "4"]

Notice that only the above abbreviations are valid abbreviations of the string 
"word" . Any other string is not a valid abbreviation of "word" .

Note: Assume s contains only lowercase letters and abbr contains only lowercase 
letters and digits.

Example 1:
Given s = "internationalization", abbr = "i12iz4n":
Return true.

Example 2:
Given s = "apple", abbr = "a2e":
Return false.
*/


import java.util.*;

public class ValidWordAbbreviation{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String s1 = sc.next();
        String s2 = sc.next();
        
        int n1 = s1.length();
        int n2 = s2.length();
        int i = 0, j = 0;
        boolean f = true;
        if(n1 == 0 && n2 == 0){
            System.out.println(true);
        }else{
        
        while (i < n1 && j < n2) {
            if (s1.charAt(i) == s2.charAt(j)) {
                i++;
                j++;
            } else {
                if (Character.isDigit(s2.charAt(j))) {
                    StringBuilder str = new StringBuilder();
                    while (j < n2 && Character.isDigit(s2.charAt(j))) {
                        if(str.length() == 0 && s2.charAt(j) == '0'){
                            f = false;
                            break;
                        }
                        str.append(s2.charAt(j));
                        j++;
                    }if(!f)break;
                    int n = Integer.parseInt(str.toString());
                    // j += n;
                    i += n;
                } else {
                    f = false;
                    break;
                }
            }if(!f)break;
        }
        
        if (!f) {
            System.out.println(false);
        } else {
            System.out.println(true);
        }
        }
        sc.close();
    }
}

/*
Valid Word Abbreviation

Given a non-empty string s and an abbreviation abbr , return whether the string 
matches with the given abbreviation.
A string such as "word" contains only the following valid abbreviations:

["word", "1ord", "w1rd", "wo1d", "wor1", "2rd", "w2d", "wo2", "1o1d", "1or1", 
"w1r1", "1o2", "2r1", "3d", "w3", "4"]

Notice that only the above abbreviations are valid abbreviations of the string 
"word" . Any other string is not a valid abbreviation of "word" .

Note: Assume s contains only lowercase letters and abbr contains only lowercase 
letters and digits.

Example 1:
Given s = "internationalization", abbr = "i12iz4n":
Return true.

Example 2:
Given s = "apple", abbr = "a2e":
Return false.
*/


import java.util.*;

public class ValidWordAbbreviation{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String s1 = sc.next();
        String s2 = sc.next();
        
        int n1 = s1.length();
        int n2 = s2.length();
        int i = 0, j = 0;
        boolean f = true;
        if(n1 == 0 && n2 == 0){
            System.out.println(true);
        }else{
        
        while (i < n1 && j < n2) {
            if (s1.charAt(i) == s2.charAt(j)) {
                i++;
                j++;
            } else {
                if (Character.isDigit(s2.charAt(j))) {
                    StringBuilder str = new StringBuilder();
                    while (j < n2 && Character.isDigit(s2.charAt(j))) {
                        if(str.length() == 0 && s2.charAt(j) == '0'){
                            f = false;
                            break;
                        }
                        str.append(s2.charAt(j));
                        j++;
                    }if(!f)break;
                    int n = Integer.parseInt(str.toString());
                    // j += n;
                    i += n;
                } else {
                    f = false;
                    break;
                }
            }if(!f)break;
        }
        
        if (!f) {
            System.out.println(false);
        } else {
            System.out.println(true);
        }
        }
        sc.close();
    }
}

/*
Valid Word Abbreviation

Given a non-empty string s and an abbreviation abbr , return whether the string 
matches with the given abbreviation.
A string such as "word" contains only the following valid abbreviations:

["word", "1ord", "w1rd", "wo1d", "wor1", "2rd", "w2d", "wo2", "1o1d", "1or1", 
"w1r1", "1o2", "2r1", "3d", "w3", "4"]

Notice that only the above abbreviations are valid abbreviations of the string 
"word" . Any other string is not a valid abbreviation of "word" .

Note: Assume s contains only lowercase letters and abbr contains only lowercase 
letters and digits.

Example 1:
Given s = "internationalization", abbr = "i12iz4n":
Return true.

Example 2:
Given s = "apple", abbr = "a2e":
Return false.
*/


import java.util.*;

public class ValidWordAbbreviation{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String s1 = sc.next();
        String s2 = sc.next();
        
        int n1 = s1.length();
        int n2 = s2.length();
        int i = 0, j = 0;
        boolean f = true;
        if(n1 == 0 && n2 == 0){
            System.out.println(true);
        }else{
        
        while (i < n1 && j < n2) {
            if (s1.charAt(i) == s2.charAt(j)) {
                i++;
                j++;
            } else {
                if (Character.isDigit(s2.charAt(j))) {
                    StringBuilder str = new StringBuilder();
                    while (j < n2 && Character.isDigit(s2.charAt(j))) {
                        if(str.length() == 0 && s2.charAt(j) == '0'){
                            f = false;
                            break;
                        }
                        str.append(s2.charAt(j));
                        j++;
                    }if(!f)break;
                    int n = Integer.parseInt(str.toString());
                    // j += n;
                    i += n;
                } else {
                    f = false;
                    break;
                }
            }if(!f)break;
        }
        
        if (!f) {
            System.out.println(false);
        } else {
            System.out.println(true);
        }
        }
        sc.close();
    }
}

/*
Valid Word Abbreviation

Given a non-empty string s and an abbreviation abbr , return whether the string 
matches with the given abbreviation.
A string such as "word" contains only the following valid abbreviations:

["word", "1ord", "w1rd", "wo1d", "wor1", "2rd", "w2d", "wo2", "1o1d", "1or1", 
"w1r1", "1o2", "2r1", "3d", "w3", "4"]

Notice that only the above abbreviations are valid abbreviations of the string 
"word" . Any other string is not a valid abbreviation of "word" .

Note: Assume s contains only lowercase letters and abbr contains only lowercase 
letters and digits.

Example 1:
Given s = "internationalization", abbr = "i12iz4n":
Return true.

Example 2:
Given s = "apple", abbr = "a2e":
Return false.
*/


import java.util.*;

public class ValidWordAbbreviation{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String s1 = sc.next();
        String s2 = sc.next();
        
        int n1 = s1.length();
        int n2 = s2.length();
        int i = 0, j = 0;
        boolean f = true;
        if(n1 == 0 && n2 == 0){
            System.out.println(true);
        }else{
        
        while (i < n1 && j < n2) {
            if (s1.charAt(i) == s2.charAt(j)) {
                i++;
                j++;
            } else {
                if (Character.isDigit(s2.charAt(j))) {
                    StringBuilder str = new StringBuilder();
                    while (j < n2 && Character.isDigit(s2.charAt(j))) {
                        if(str.length() == 0 && s2.charAt(j) == '0'){
                            f = false;
                            break;
                        }
                        str.append(s2.charAt(j));
                        j++;
                    }if(!f)break;
                    int n = Integer.parseInt(str.toString());
                    // j += n;
                    i += n;
                } else {
                    f = false;
                    break;
                }
            }if(!f)break;
        }
        
        if (!f) {
            System.out.println(false);
        } else {
            System.out.println(true);
        }
        }
        sc.close();
    }
}

/*
Valid Word Abbreviation

Given a non-empty string s and an abbreviation abbr , return whether the string 
matches with the given abbreviation.
A string such as "word" contains only the following valid abbreviations:

["word", "1ord", "w1rd", "wo1d", "wor1", "2rd", "w2d", "wo2", "1o1d", "1or1", 
"w1r1", "1o2", "2r1", "3d", "w3", "4"]

Notice that only the above abbreviations are valid abbreviations of the string 
"word" . Any other string is not a valid abbreviation of "word" .

Note: Assume s contains only lowercase letters and abbr contains only lowercase 
letters and digits.

Example 1:
Given s = "internationalization", abbr = "i12iz4n":
Return true.

Example 2:
Given s = "apple", abbr = "a2e":
Return false.
*/


import java.util.*;

public class ValidWordAbbreviation{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String s1 = sc.next();
        String s2 = sc.next();
        
        int n1 = s1.length();
        int n2 = s2.length();
        int i = 0, j = 0;
        boolean f = true;
        if(n1 == 0 && n2 == 0){
            System.out.println(true);
        }else{
        
        while (i < n1 && j < n2) {
            if (s1.charAt(i) == s2.charAt(j)) {
                i++;
                j++;
            } else {
                if (Character.isDigit(s2.charAt(j))) {
                    StringBuilder str = new StringBuilder();
                    while (j < n2 && Character.isDigit(s2.charAt(j))) {
                        if(str.length() == 0 && s2.charAt(j) == '0'){
                            f = false;
                            break;
                        }
                        str.append(s2.charAt(j));
                        j++;
                    }if(!f)break;
                    int n = Integer.parseInt(str.toString());
                    // j += n;
                    i += n;
                } else {
                    f = false;
                    break;
                }
            }if(!f)break;
        }
        
        if (!f) {
            System.out.println(false);
        } else {
            System.out.println(true);
        }
        }
        sc.close();
    }
}

/*
Valid Word Abbreviation

Given a non-empty string s and an abbreviation abbr , return whether the string 
matches with the given abbreviation.
A string such as "word" contains only the following valid abbreviations:

["word", "1ord", "w1rd", "wo1d", "wor1", "2rd", "w2d", "wo2", "1o1d", "1or1", 
"w1r1", "1o2", "2r1", "3d", "w3", "4"]

Notice that only the above abbreviations are valid abbreviations of the string 
"word" . Any other string is not a valid abbreviation of "word" .

Note: Assume s contains only lowercase letters and abbr contains only lowercase 
letters and digits.

Example 1:
Given s = "internationalization", abbr = "i12iz4n":
Return true.

Example 2:
Given s = "apple", abbr = "a2e":
Return false.
*/


import java.util.*;

public class ValidWordAbbreviation{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String s1 = sc.next();
        String s2 = sc.next();
        
        int n1 = s1.length();
        int n2 = s2.length();
        int i = 0, j = 0;
        boolean f = true;
        if(n1 == 0 && n2 == 0){
            System.out.println(true);
        }else{
        
        while (i < n1 && j < n2) {
            if (s1.charAt(i) == s2.charAt(j)) {
                i++;
                j++;
            } else {
                if (Character.isDigit(s2.charAt(j))) {
                    StringBuilder str = new StringBuilder();
                    while (j < n2 && Character.isDigit(s2.charAt(j))) {
                        if(str.length() == 0 && s2.charAt(j) == '0'){
                            f = false;
                            break;
                        }
                        str.append(s2.charAt(j));
                        j++;
                    }if(!f)break;
                    int n = Integer.parseInt(str.toString());
                    // j += n;
                    i += n;
                } else {
                    f = false;
                    break;
                }
            }if(!f)break;
        }
        
        if (!f) {
            System.out.println(false);
        } else {
            System.out.println(true);
        }
        }
        sc.close();
    }
}

/*
Valid Word Abbreviation

Given a non-empty string s and an abbreviation abbr , return whether the string 
matches with the given abbreviation.
A string such as "word" contains only the following valid abbreviations:

["word", "1ord", "w1rd", "wo1d", "wor1", "2rd", "w2d", "wo2", "1o1d", "1or1", 
"w1r1", "1o2", "2r1", "3d", "w3", "4"]

Notice that only the above abbreviations are valid abbreviations of the string 
"word" . Any other string is not a valid abbreviation of "word" .

Note: Assume s contains only lowercase letters and abbr contains only lowercase 
letters and digits.

Example 1:
Given s = "internationalization", abbr = "i12iz4n":
Return true.

Example 2:
Given s = "apple", abbr = "a2e":
Return false.
*/


import java.util.*;

public class ValidWordAbbreviation{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String s1 = sc.next();
        String s2 = sc.next();
        
        int n1 = s1.length();
        int n2 = s2.length();
        int i = 0, j = 0;
        boolean f = true;
        if(n1 == 0 && n2 == 0){
            System.out.println(true);
        }else{
        
        while (i < n1 && j < n2) {
            if (s1.charAt(i) == s2.charAt(j)) {
                i++;
                j++;
            } else {
                if (Character.isDigit(s2.charAt(j))) {
                    StringBuilder str = new StringBuilder();
                    while (j < n2 && Character.isDigit(s2.charAt(j))) {
                        if(str.length() == 0 && s2.charAt(j) == '0'){
                            f = false;
                            break;
                        }
                        str.append(s2.charAt(j));
                        j++;
                    }if(!f)break;
                    int n = Integer.parseInt(str.toString());
                    // j += n;
                    i += n;
                } else {
                    f = false;
                    break;
                }
            }if(!f)break;
        }
        
        if (!f) {
            System.out.println(false);
        } else {
            System.out.println(true);
        }
        }
        sc.close();
    }
}

/*
Valid Word Abbreviation

Given a non-empty string s and an abbreviation abbr , return whether the string 
matches with the given abbreviation.
A string such as "word" contains only the following valid abbreviations:

["word", "1ord", "w1rd", "wo1d", "wor1", "2rd", "w2d", "wo2", "1o1d", "1or1", 
"w1r1", "1o2", "2r1", "3d", "w3", "4"]

Notice that only the above abbreviations are valid abbreviations of the string 
"word" . Any other string is not a valid abbreviation of "word" .

Note: Assume s contains only lowercase letters and abbr contains only lowercase 
letters and digits.

Example 1:
Given s = "internationalization", abbr = "i12iz4n":
Return true.

Example 2:
Given s = "apple", abbr = "a2e":
Return false.
*/


import java.util.*;

public class ValidWordAbbreviation{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String s1 = sc.next();
        String s2 = sc.next();
        
        int n1 = s1.length();
        int n2 = s2.length();
        int i = 0, j = 0;
        boolean f = true;
        if(n1 == 0 && n2 == 0){
            System.out.println(true);
        }else{
        
        while (i < n1 && j < n2) {
            if (s1.charAt(i) == s2.charAt(j)) {
                i++;
                j++;
            } else {
                if (Character.isDigit(s2.charAt(j))) {
                    StringBuilder str = new StringBuilder();
                    while (j < n2 && Character.isDigit(s2.charAt(j))) {
                        if(str.length() == 0 && s2.charAt(j) == '0'){
                            f = false;
                            break;
                        }
                        str.append(s2.charAt(j));
                        j++;
                    }if(!f)break;
                    int n = Integer.parseInt(str.toString());
                    // j += n;
                    i += n;
                } else {
                    f = false;
                    break;
                }
            }if(!f)break;
        }
        
        if (!f) {
            System.out.println(false);
        } else {
            System.out.println(true);
        }
        }
        sc.close();
    }
}

/*
Valid Word Abbreviation

Given a non-empty string s and an abbreviation abbr , return whether the string 
matches with the given abbreviation.
A string such as "word" contains only the following valid abbreviations:

["word", "1ord", "w1rd", "wo1d", "wor1", "2rd", "w2d", "wo2", "1o1d", "1or1", 
"w1r1", "1o2", "2r1", "3d", "w3", "4"]

Notice that only the above abbreviations are valid abbreviations of the string 
"word" . Any other string is not a valid abbreviation of "word" .

Note: Assume s contains only lowercase letters and abbr contains only lowercase 
letters and digits.

Example 1:
Given s = "internationalization", abbr = "i12iz4n":
Return true.

Example 2:
Given s = "apple", abbr = "a2e":
Return false.
*/


import java.util.*;

public class ValidWordAbbreviation{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String s1 = sc.next();
        String s2 = sc.next();
        
        int n1 = s1.length();
        int n2 = s2.length();
        int i = 0, j = 0;
        boolean f = true;
        if(n1 == 0 && n2 == 0){
            System.out.println(true);
        }else{
        
        while (i < n1 && j < n2) {
            if (s1.charAt(i) == s2.charAt(j)) {
                i++;
                j++;
            } else {
                if (Character.isDigit(s2.charAt(j))) {
                    StringBuilder str = new StringBuilder();
                    while (j < n2 && Character.isDigit(s2.charAt(j))) {
                        if(str.length() == 0 && s2.charAt(j) == '0'){
                            f = false;
                            break;
                        }
                        str.append(s2.charAt(j));
                        j++;
                    }if(!f)break;
                    int n = Integer.parseInt(str.toString());
                    // j += n;
                    i += n;
                } else {
                    f = false;
                    break;
                }
            }if(!f)break;
        }
        
        if (!f) {
            System.out.println(false);
        } else {
            System.out.println(true);
        }
        }
        sc.close();
    }
}

/*
Valid Word Abbreviation

Given a non-empty string s and an abbreviation abbr , return whether the string 
matches with the given abbreviation.
A string such as "word" contains only the following valid abbreviations:

["word", "1ord", "w1rd", "wo1d", "wor1", "2rd", "w2d", "wo2", "1o1d", "1or1", 
"w1r1", "1o2", "2r1", "3d", "w3", "4"]

Notice that only the above abbreviations are valid abbreviations of the string 
"word" . Any other string is not a valid abbreviation of "word" .

Note: Assume s contains only lowercase letters and abbr contains only lowercase 
letters and digits.

Example 1:
Given s = "internationalization", abbr = "i12iz4n":
Return true.

Example 2:
Given s = "apple", abbr = "a2e":
Return false.
*/


import java.util.*;

public class ValidWordAbbreviation{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String s1 = sc.next();
        String s2 = sc.next();
        
        int n1 = s1.length();
        int n2 = s2.length();
        int i = 0, j = 0;
        boolean f = true;
        if(n1 == 0 && n2 == 0){
            System.out.println(true);
        }else{
        
        while (i < n1 && j < n2) {
            if (s1.charAt(i) == s2.charAt(j)) {
                i++;
                j++;
            } else {
                if (Character.isDigit(s2.charAt(j))) {
                    StringBuilder str = new StringBuilder();
                    while (j < n2 && Character.isDigit(s2.charAt(j))) {
                        if(str.length() == 0 && s2.charAt(j) == '0'){
                            f = false;
                            break;
                        }
                        str.append(s2.charAt(j));
                        j++;
                    }if(!f)break;
                    int n = Integer.parseInt(str.toString());
                    // j += n;
                    i += n;
                } else {
                    f = false;
                    break;
                }
            }if(!f)break;
        }
        
        if (!f) {
            System.out.println(false);
        } else {
            System.out.println(true);
        }
        }
        sc.close();
    }
}

/*
Valid Word Abbreviation

Given a non-empty string s and an abbreviation abbr , return whether the string 
matches with the given abbreviation.
A string such as "word" contains only the following valid abbreviations:

["word", "1ord", "w1rd", "wo1d", "wor1", "2rd", "w2d", "wo2", "1o1d", "1or1", 
"w1r1", "1o2", "2r1", "3d", "w3", "4"]

Notice that only the above abbreviations are valid abbreviations of the string 
"word" . Any other string is not a valid abbreviation of "word" .

Note: Assume s contains only lowercase letters and abbr contains only lowercase 
letters and digits.

Example 1:
Given s = "internationalization", abbr = "i12iz4n":
Return true.

Example 2:
Given s = "apple", abbr = "a2e":
Return false.
*/


import java.util.*;

public class ValidWordAbbreviation{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String s1 = sc.next();
        String s2 = sc.next();
        
        int n1 = s1.length();
        int n2 = s2.length();
        int i = 0, j = 0;
        boolean f = true;
        if(n1 == 0 && n2 == 0){
            System.out.println(true);
        }else{
        
        while (i < n1 && j < n2) {
            if (s1.charAt(i) == s2.charAt(j)) {
                i++;
                j++;
            } else {
                if (Character.isDigit(s2.charAt(j))) {
                    StringBuilder str = new StringBuilder();
                    while (j < n2 && Character.isDigit(s2.charAt(j))) {
                        if(str.length() == 0 && s2.charAt(j) == '0'){
                            f = false;
                            break;
                        }
                        str.append(s2.charAt(j));
                        j++;
                    }if(!f)break;
                    int n = Integer.parseInt(str.toString());
                    // j += n;
                    i += n;
                } else {
                    f = false;
                    break;
                }
            }if(!f)break;
        }
        
        if (!f) {
            System.out.println(false);
        } else {
            System.out.println(true);
        }
        }
        sc.close();
    }
}

/*
Valid Word Abbreviation

Given a non-empty string s and an abbreviation abbr , return whether the string 
matches with the given abbreviation.
A string such as "word" contains only the following valid abbreviations:

["word", "1ord", "w1rd", "wo1d", "wor1", "2rd", "w2d", "wo2", "1o1d", "1or1", 
"w1r1", "1o2", "2r1", "3d", "w3", "4"]

Notice that only the above abbreviations are valid abbreviations of the string 
"word" . Any other string is not a valid abbreviation of "word" .

Note: Assume s contains only lowercase letters and abbr contains only lowercase 
letters and digits.

Example 1:
Given s = "internationalization", abbr = "i12iz4n":
Return true.

Example 2:
Given s = "apple", abbr = "a2e":
Return false.
*/


import java.util.*;

public class ValidWordAbbreviation{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String s1 = sc.next();
        String s2 = sc.next();
        
        int n1 = s1.length();
        int n2 = s2.length();
        int i = 0, j = 0;
        boolean f = true;
        if(n1 == 0 && n2 == 0){
            System.out.println(true);
        }else{
        
        while (i < n1 && j < n2) {
            if (s1.charAt(i) == s2.charAt(j)) {
                i++;
                j++;
            } else {
                if (Character.isDigit(s2.charAt(j))) {
                    StringBuilder str = new StringBuilder();
                    while (j < n2 && Character.isDigit(s2.charAt(j))) {
                        if(str.length() == 0 && s2.charAt(j) == '0'){
                            f = false;
                            break;
                        }
                        str.append(s2.charAt(j));
                        j++;
                    }if(!f)break;
                    int n = Integer.parseInt(str.toString());
                    // j += n;
                    i += n;
                } else {
                    f = false;
                    break;
                }
            }if(!f)break;
        }
        
        if (!f) {
            System.out.println(false);
        } else {
            System.out.println(true);
        }
        }
        sc.close();
    }
}

/*
Valid Word Abbreviation

Given a non-empty string s and an abbreviation abbr , return whether the string 
matches with the given abbreviation.
A string such as "word" contains only the following valid abbreviations:

["word", "1ord", "w1rd", "wo1d", "wor1", "2rd", "w2d", "wo2", "1o1d", "1or1", 
"w1r1", "1o2", "2r1", "3d", "w3", "4"]

Notice that only the above abbreviations are valid abbreviations of the string 
"word" . Any other string is not a valid abbreviation of "word" .

Note: Assume s contains only lowercase letters and abbr contains only lowercase 
letters and digits.

Example 1:
Given s = "internationalization", abbr = "i12iz4n":
Return true.

Example 2:
Given s = "apple", abbr = "a2e":
Return false.
*/


import java.util.*;

public class ValidWordAbbreviation{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String s1 = sc.next();
        String s2 = sc.next();
        
        int n1 = s1.length();
        int n2 = s2.length();
        int i = 0, j = 0;
        boolean f = true;
        if(n1 == 0 && n2 == 0){
            System.out.println(true);
        }else{
        
        while (i < n1 && j < n2) {
            if (s1.charAt(i) == s2.charAt(j)) {
                i++;
                j++;
            } else {
                if (Character.isDigit(s2.charAt(j))) {
                    StringBuilder str = new StringBuilder();
                    while (j < n2 && Character.isDigit(s2.charAt(j))) {
                        if(str.length() == 0 && s2.charAt(j) == '0'){
                            f = false;
                            break;
                        }
                        str.append(s2.charAt(j));
                        j++;
                    }if(!f)break;
                    int n = Integer.parseInt(str.toString());
                    // j += n;
                    i += n;
                } else {
                    f = false;
                    break;
                }
            }if(!f)break;
        }
        
        if (!f) {
            System.out.println(false);
        } else {
            System.out.println(true);
        }
        }
        sc.close();
    }
}

/*
Valid Word Abbreviation

Given a non-empty string s and an abbreviation abbr , return whether the string 
matches with the given abbreviation.
A string such as "word" contains only the following valid abbreviations:

["word", "1ord", "w1rd", "wo1d", "wor1", "2rd", "w2d", "wo2", "1o1d", "1or1", 
"w1r1", "1o2", "2r1", "3d", "w3", "4"]

Notice that only the above abbreviations are valid abbreviations of the string 
"word" . Any other string is not a valid abbreviation of "word" .

Note: Assume s contains only lowercase letters and abbr contains only lowercase 
letters and digits.

Example 1:
Given s = "internationalization", abbr = "i12iz4n":
Return true.

Example 2:
Given s = "apple", abbr = "a2e":
Return false.
*/


import java.util.*;

public class ValidWordAbbreviation{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String s1 = sc.next();
        String s2 = sc.next();
        
        int n1 = s1.length();
        int n2 = s2.length();
        int i = 0, j = 0;
        boolean f = true;
        if(n1 == 0 && n2 == 0){
            System.out.println(true);
        }else{
        
        while (i < n1 && j < n2) {
            if (s1.charAt(i) == s2.charAt(j)) {
                i++;
                j++;
            } else {
                if (Character.isDigit(s2.charAt(j))) {
                    StringBuilder str = new StringBuilder();
                    while (j < n2 && Character.isDigit(s2.charAt(j))) {
                        if(str.length() == 0 && s2.charAt(j) == '0'){
                            f = false;
                            break;
                        }
                        str.append(s2.charAt(j));
                        j++;
                    }if(!f)break;
                    int n = Integer.parseInt(str.toString());
                    // j += n;
                    i += n;
                } else {
                    f = false;
                    break;
                }
            }if(!f)break;
        }
        
        if (!f) {
            System.out.println(false);
        } else {
            System.out.println(true);
        }
        }
        sc.close();
    }
}

/*
Valid Word Abbreviation

Given a non-empty string s and an abbreviation abbr , return whether the string 
matches with the given abbreviation.
A string such as "word" contains only the following valid abbreviations:

["word", "1ord", "w1rd", "wo1d", "wor1", "2rd", "w2d", "wo2", "1o1d", "1or1", 
"w1r1", "1o2", "2r1", "3d", "w3", "4"]

Notice that only the above abbreviations are valid abbreviations of the string 
"word" . Any other string is not a valid abbreviation of "word" .

Note: Assume s contains only lowercase letters and abbr contains only lowercase 
letters and digits.

Example 1:
Given s = "internationalization", abbr = "i12iz4n":
Return true.

Example 2:
Given s = "apple", abbr = "a2e":
Return false.
*/


import java.util.*;

public class ValidWordAbbreviation{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String s1 = sc.next();
        String s2 = sc.next();
        
        int n1 = s1.length();
        int n2 = s2.length();
        int i = 0, j = 0;
        boolean f = true;
        if(n1 == 0 && n2 == 0){
            System.out.println(true);
        }else{
        
        while (i < n1 && j < n2) {
            if (s1.charAt(i) == s2.charAt(j)) {
                i++;
                j++;
            } else {
                if (Character.isDigit(s2.charAt(j))) {
                    StringBuilder str = new StringBuilder();
                    while (j < n2 && Character.isDigit(s2.charAt(j))) {
                        if(str.length() == 0 && s2.charAt(j) == '0'){
                            f = false;
                            break;
                        }
                        str.append(s2.charAt(j));
                        j++;
                    }if(!f)break;
                    int n = Integer.parseInt(str.toString());
                    // j += n;
                    i += n;
                } else {
                    f = false;
                    break;
                }
            }if(!f)break;
        }
        
        if (!f) {
            System.out.println(false);
        } else {
            System.out.println(true);
        }
        }
        sc.close();
    }
}

/*
Valid Word Abbreviation

Given a non-empty string s and an abbreviation abbr , return whether the string 
matches with the given abbreviation.
A string such as "word" contains only the following valid abbreviations:

["word", "1ord", "w1rd", "wo1d", "wor1", "2rd", "w2d", "wo2", "1o1d", "1or1", 
"w1r1", "1o2", "2r1", "3d", "w3", "4"]

Notice that only the above abbreviations are valid abbreviations of the string 
"word" . Any other string is not a valid abbreviation of "word" .

Note: Assume s contains only lowercase letters and abbr contains only lowercase 
letters and digits.

Example 1:
Given s = "internationalization", abbr = "i12iz4n":
Return true.

Example 2:
Given s = "apple", abbr = "a2e":
Return false.
*/


import java.util.*;

public class ValidWordAbbreviation{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String s1 = sc.next();
        String s2 = sc.next();
        
        int n1 = s1.length();
        int n2 = s2.length();
        int i = 0, j = 0;
        boolean f = true;
        if(n1 == 0 && n2 == 0){
            System.out.println(true);
        }else{
        
        while (i < n1 && j < n2) {
            if (s1.charAt(i) == s2.charAt(j)) {
                i++;
                j++;
            } else {
                if (Character.isDigit(s2.charAt(j))) {
                    StringBuilder str = new StringBuilder();
                    while (j < n2 && Character.isDigit(s2.charAt(j))) {
                        if(str.length() == 0 && s2.charAt(j) == '0'){
                            f = false;
                            break;
                        }
                        str.append(s2.charAt(j));
                        j++;
                    }if(!f)break;
                    int n = Integer.parseInt(str.toString());
                    // j += n;
                    i += n;
                } else {
                    f = false;
                    break;
                }
            }if(!f)break;
        }
        
        if (!f) {
            System.out.println(false);
        } else {
            System.out.println(true);
        }
        }
        sc.close();
    }
}

/*
Valid Word Abbreviation

Given a non-empty string s and an abbreviation abbr , return whether the string 
matches with the given abbreviation.
A string such as "word" contains only the following valid abbreviations:

["word", "1ord", "w1rd", "wo1d", "wor1", "2rd", "w2d", "wo2", "1o1d", "1or1", 
"w1r1", "1o2", "2r1", "3d", "w3", "4"]

Notice that only the above abbreviations are valid abbreviations of the string 
"word" . Any other string is not a valid abbreviation of "word" .

Note: Assume s contains only lowercase letters and abbr contains only lowercase 
letters and digits.

Example 1:
Given s = "internationalization", abbr = "i12iz4n":
Return true.

Example 2:
Given s = "apple", abbr = "a2e":
Return false.
*/


import java.util.*;

public class ValidWordAbbreviation{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String s1 = sc.next();
        String s2 = sc.next();
        
        int n1 = s1.length();
        int n2 = s2.length();
        int i = 0, j = 0;
        boolean f = true;
        if(n1 == 0 && n2 == 0){
            System.out.println(true);
        }else{
        
        while (i < n1 && j < n2) {
            if (s1.charAt(i) == s2.charAt(j)) {
                i++;
                j++;
            } else {
                if (Character.isDigit(s2.charAt(j))) {
                    StringBuilder str = new StringBuilder();
                    while (j < n2 && Character.isDigit(s2.charAt(j))) {
                        if(str.length() == 0 && s2.charAt(j) == '0'){
                            f = false;
                            break;
                        }
                        str.append(s2.charAt(j));
                        j++;
                    }if(!f)break;
                    int n = Integer.parseInt(str.toString());
                    // j += n;
                    i += n;
                } else {
                    f = false;
                    break;
                }
            }if(!f)break;
        }
        
        if (!f) {
            System.out.println(false);
        } else {
            System.out.println(true);
        }
        }
        sc.close();
    }
}

/*
Valid Word Abbreviation

Given a non-empty string s and an abbreviation abbr , return whether the string 
matches with the given abbreviation.
A string such as "word" contains only the following valid abbreviations:

["word", "1ord", "w1rd", "wo1d", "wor1", "2rd", "w2d", "wo2", "1o1d", "1or1", 
"w1r1", "1o2", "2r1", "3d", "w3", "4"]

Notice that only the above abbreviations are valid abbreviations of the string 
"word" . Any other string is not a valid abbreviation of "word" .

Note: Assume s contains only lowercase letters and abbr contains only lowercase 
letters and digits.

Example 1:
Given s = "internationalization", abbr = "i12iz4n":
Return true.

Example 2:
Given s = "apple", abbr = "a2e":
Return false.
*/


import java.util.*;

public class ValidWordAbbreviation{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String s1 = sc.next();
        String s2 = sc.next();
        
        int n1 = s1.length();
        int n2 = s2.length();
        int i = 0, j = 0;
        boolean f = true;
        if(n1 == 0 && n2 == 0){
            System.out.println(true);
        }else{
        
        while (i < n1 && j < n2) {
            if (s1.charAt(i) == s2.charAt(j)) {
                i++;
                j++;
            } else {
                if (Character.isDigit(s2.charAt(j))) {
                    StringBuilder str = new StringBuilder();
                    while (j < n2 && Character.isDigit(s2.charAt(j))) {
                        if(str.length() == 0 && s2.charAt(j) == '0'){
                            f = false;
                            break;
                        }
                        str.append(s2.charAt(j));
                        j++;
                    }if(!f)break;
                    int n = Integer.parseInt(str.toString());
                    // j += n;
                    i += n;
                } else {
                    f = false;
                    break;
                }
            }if(!f)break;
        }
        
        if (!f) {
            System.out.println(false);
        } else {
            System.out.println(true);
        }
        }
        sc.close();
    }
}

/*
Valid Word Abbreviation

Given a non-empty string s and an abbreviation abbr , return whether the string 
matches with the given abbreviation.
A string such as "word" contains only the following valid abbreviations:

["word", "1ord", "w1rd", "wo1d", "wor1", "2rd", "w2d", "wo2", "1o1d", "1or1", 
"w1r1", "1o2", "2r1", "3d", "w3", "4"]

Notice that only the above abbreviations are valid abbreviations of the string 
"word" . Any other string is not a valid abbreviation of "word" .

Note: Assume s contains only lowercase letters and abbr contains only lowercase 
letters and digits.

Example 1:
Given s = "internationalization", abbr = "i12iz4n":
Return true.

Example 2:
Given s = "apple", abbr = "a2e":
Return false.
*/


import java.util.*;

public class ValidWordAbbreviation{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String s1 = sc.next();
        String s2 = sc.next();
        
        int n1 = s1.length();
        int n2 = s2.length();
        int i = 0, j = 0;
        boolean f = true;
        if(n1 == 0 && n2 == 0){
            System.out.println(true);
        }else{
        
        while (i < n1 && j < n2) {
            if (s1.charAt(i) == s2.charAt(j)) {
                i++;
                j++;
            } else {
                if (Character.isDigit(s2.charAt(j))) {
                    StringBuilder str = new StringBuilder();
                    while (j < n2 && Character.isDigit(s2.charAt(j))) {
                        if(str.length() == 0 && s2.charAt(j) == '0'){
                            f = false;
                            break;
                        }
                        str.append(s2.charAt(j));
                        j++;
                    }if(!f)break;
                    int n = Integer.parseInt(str.toString());
                    // j += n;
                    i += n;
                } else {
                    f = false;
                    break;
                }
            }if(!f)break;
        }
        
        if (!f) {
            System.out.println(false);
        } else {
            System.out.println(true);
        }
        }
        sc.close();
    }
}

/*
Valid Word Abbreviation

Given a non-empty string s and an abbreviation abbr , return whether the string 
matches with the given abbreviation.
A string such as "word" contains only the following valid abbreviations:

["word", "1ord", "w1rd", "wo1d", "wor1", "2rd", "w2d", "wo2", "1o1d", "1or1", 
"w1r1", "1o2", "2r1", "3d", "w3", "4"]

Notice that only the above abbreviations are valid abbreviations of the string 
"word" . Any other string is not a valid abbreviation of "word" .

Note: Assume s contains only lowercase letters and abbr contains only lowercase 
letters and digits.

Example 1:
Given s = "internationalization", abbr = "i12iz4n":
Return true.

Example 2:
Given s = "apple", abbr = "a2e":
Return false.
*/


import java.util.*;

public class ValidWordAbbreviation{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String s1 = sc.next();
        String s2 = sc.next();
        
        int n1 = s1.length();
        int n2 = s2.length();
        int i = 0, j = 0;
        boolean f = true;
        if(n1 == 0 && n2 == 0){
            System.out.println(true);
        }else{
        
        while (i < n1 && j < n2) {
            if (s1.charAt(i) == s2.charAt(j)) {
                i++;
                j++;
            } else {
                if (Character.isDigit(s2.charAt(j))) {
                    StringBuilder str = new StringBuilder();
                    while (j < n2 && Character.isDigit(s2.charAt(j))) {
                        if(str.length() == 0 && s2.charAt(j) == '0'){
                            f = false;
                            break;
                        }
                        str.append(s2.charAt(j));
                        j++;
                    }if(!f)break;
                    int n = Integer.parseInt(str.toString());
                    // j += n;
                    i += n;
                } else {
                    f = false;
                    break;
                }
            }if(!f)break;
        }
        
        if (!f) {
            System.out.println(false);
        } else {
            System.out.println(true);
        }
        }
        sc.close();
    }
}

/*
Valid Word Abbreviation

Given a non-empty string s and an abbreviation abbr , return whether the string 
matches with the given abbreviation.
A string such as "word" contains only the following valid abbreviations:

["word", "1ord", "w1rd", "wo1d", "wor1", "2rd", "w2d", "wo2", "1o1d", "1or1", 
"w1r1", "1o2", "2r1", "3d", "w3", "4"]

Notice that only the above abbreviations are valid abbreviations of the string 
"word" . Any other string is not a valid abbreviation of "word" .

Note: Assume s contains only lowercase letters and abbr contains only lowercase 
letters and digits.

Example 1:
Given s = "internationalization", abbr = "i12iz4n":
Return true.

Example 2:
Given s = "apple", abbr = "a2e":
Return false.
*/


import java.util.*;

public class ValidWordAbbreviation{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String s1 = sc.next();
        String s2 = sc.next();
        
        int n1 = s1.length();
        int n2 = s2.length();
        int i = 0, j = 0;
        boolean f = true;
        if(n1 == 0 && n2 == 0){
            System.out.println(true);
        }else{
        
        while (i < n1 && j < n2) {
            if (s1.charAt(i) == s2.charAt(j)) {
                i++;
                j++;
            } else {
                if (Character.isDigit(s2.charAt(j))) {
                    StringBuilder str = new StringBuilder();
                    while (j < n2 && Character.isDigit(s2.charAt(j))) {
                        if(str.length() == 0 && s2.charAt(j) == '0'){
                            f = false;
                            break;
                        }
                        str.append(s2.charAt(j));
                        j++;
                    }if(!f)break;
                    int n = Integer.parseInt(str.toString());
                    // j += n;
                    i += n;
                } else {
                    f = false;
                    break;
                }
            }if(!f)break;
        }
        
        if (!f) {
            System.out.println(false);
        } else {
            System.out.println(true);
        }
        }
        sc.close();
    }
}

/*
Valid Word Abbreviation

Given a non-empty string s and an abbreviation abbr , return whether the string 
matches with the given abbreviation.
A string such as "word" contains only the following valid abbreviations:

["word", "1ord", "w1rd", "wo1d", "wor1", "2rd", "w2d", "wo2", "1o1d", "1or1", 
"w1r1", "1o2", "2r1", "3d", "w3", "4"]

Notice that only the above abbreviations are valid abbreviations of the string 
"word" . Any other string is not a valid abbreviation of "word" .

Note: Assume s contains only lowercase letters and abbr contains only lowercase 
letters and digits.

Example 1:
Given s = "internationalization", abbr = "i12iz4n":
Return true.

Example 2:
Given s = "apple", abbr = "a2e":
Return false.
*/


import java.util.*;

public class ValidWordAbbreviation{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String s1 = sc.next();
        String s2 = sc.next();
        
        int n1 = s1.length();
        int n2 = s2.length();
        int i = 0, j = 0;
        boolean f = true;
        if(n1 == 0 && n2 == 0){
            System.out.println(true);
        }else{
        
        while (i < n1 && j < n2) {
            if (s1.charAt(i) == s2.charAt(j)) {
                i++;
                j++;
            } else {
                if (Character.isDigit(s2.charAt(j))) {
                    StringBuilder str = new StringBuilder();
                    while (j < n2 && Character.isDigit(s2.charAt(j))) {
                        if(str.length() == 0 && s2.charAt(j) == '0'){
                            f = false;
                            break;
                        }
                        str.append(s2.charAt(j));
                        j++;
                    }if(!f)break;
                    int n = Integer.parseInt(str.toString());
                    // j += n;
                    i += n;
                } else {
                    f = false;
                    break;
                }
            }if(!f)break;
        }
        
        if (!f) {
            System.out.println(false);
        } else {
            System.out.println(true);
        }
        }
        sc.close();
    }
}

/*
Valid Word Abbreviation

Given a non-empty string s and an abbreviation abbr , return whether the string 
matches with the given abbreviation.
A string such as "word" contains only the following valid abbreviations:

["word", "1ord", "w1rd", "wo1d", "wor1", "2rd", "w2d", "wo2", "1o1d", "1or1", 
"w1r1", "1o2", "2r1", "3d", "w3", "4"]

Notice that only the above abbreviations are valid abbreviations of the string 
"word" . Any other string is not a valid abbreviation of "word" .

Note: Assume s contains only lowercase letters and abbr contains only lowercase 
letters and digits.

Example 1:
Given s = "internationalization", abbr = "i12iz4n":
Return true.

Example 2:
Given s = "apple", abbr = "a2e":
Return false.
*/


import java.util.*;

public class ValidWordAbbreviation{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String s1 = sc.next();
        String s2 = sc.next();
        
        int n1 = s1.length();
        int n2 = s2.length();
        int i = 0, j = 0;
        boolean f = true;
        if(n1 == 0 && n2 == 0){
            System.out.println(true);
        }else{
        
        while (i < n1 && j < n2) {
            if (s1.charAt(i) == s2.charAt(j)) {
                i++;
                j++;
            } else {
                if (Character.isDigit(s2.charAt(j))) {
                    StringBuilder str = new StringBuilder();
                    while (j < n2 && Character.isDigit(s2.charAt(j))) {
                        if(str.length() == 0 && s2.charAt(j) == '0'){
                            f = false;
                            break;
                        }
                        str.append(s2.charAt(j));
                        j++;
                    }if(!f)break;
                    int n = Integer.parseInt(str.toString());
                    // j += n;
                    i += n;
                } else {
                    f = false;
                    break;
                }
            }if(!f)break;
        }
        
        if (!f) {
            System.out.println(false);
        } else {
            System.out.println(true);
        }
        }
        sc.close();
    }
}

/*
Valid Word Abbreviation

Given a non-empty string s and an abbreviation abbr , return whether the string 
matches with the given abbreviation.
A string such as "word" contains only the following valid abbreviations:

["word", "1ord", "w1rd", "wo1d", "wor1", "2rd", "w2d", "wo2", "1o1d", "1or1", 
"w1r1", "1o2", "2r1", "3d", "w3", "4"]

Notice that only the above abbreviations are valid abbreviations of the string 
"word" . Any other string is not a valid abbreviation of "word" .

Note: Assume s contains only lowercase letters and abbr contains only lowercase 
letters and digits.

Example 1:
Given s = "internationalization", abbr = "i12iz4n":
Return true.

Example 2:
Given s = "apple", abbr = "a2e":
Return false.
*/


import java.util.*;

public class ValidWordAbbreviation{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String s1 = sc.next();
        String s2 = sc.next();
        
        int n1 = s1.length();
        int n2 = s2.length();
        int i = 0, j = 0;
        boolean f = true;
        if(n1 == 0 && n2 == 0){
            System.out.println(true);
        }else{
        
        while (i < n1 && j < n2) {
            if (s1.charAt(i) == s2.charAt(j)) {
                i++;
                j++;
            } else {
                if (Character.isDigit(s2.charAt(j))) {
                    StringBuilder str = new StringBuilder();
                    while (j < n2 && Character.isDigit(s2.charAt(j))) {
                        if(str.length() == 0 && s2.charAt(j) == '0'){
                            f = false;
                            break;
                        }
                        str.append(s2.charAt(j));
                        j++;
                    }if(!f)break;
                    int n = Integer.parseInt(str.toString());
                    // j += n;
                    i += n;
                } else {
                    f = false;
                    break;
                }
            }if(!f)break;
        }
        
        if (!f) {
            System.out.println(false);
        } else {
            System.out.println(true);
        }
        }
        sc.close();
    }
}

/*
Valid Word Abbreviation

Given a non-empty string s and an abbreviation abbr , return whether the string 
matches with the given abbreviation.
A string such as "word" contains only the following valid abbreviations:

["word", "1ord", "w1rd", "wo1d", "wor1", "2rd", "w2d", "wo2", "1o1d", "1or1", 
"w1r1", "1o2", "2r1", "3d", "w3", "4"]

Notice that only the above abbreviations are valid abbreviations of the string 
"word" . Any other string is not a valid abbreviation of "word" .

Note: Assume s contains only lowercase letters and abbr contains only lowercase 
letters and digits.

Example 1:
Given s = "internationalization", abbr = "i12iz4n":
Return true.

Example 2:
Given s = "apple", abbr = "a2e":
Return false.
*/


import java.util.*;

public class ValidWordAbbreviation{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String s1 = sc.next();
        String s2 = sc.next();
        
        int n1 = s1.length();
        int n2 = s2.length();
        int i = 0, j = 0;
        boolean f = true;
        if(n1 == 0 && n2 == 0){
            System.out.println(true);
        }else{
        
        while (i < n1 && j < n2) {
            if (s1.charAt(i) == s2.charAt(j)) {
                i++;
                j++;
            } else {
                if (Character.isDigit(s2.charAt(j))) {
                    StringBuilder str = new StringBuilder();
                    while (j < n2 && Character.isDigit(s2.charAt(j))) {
                        if(str.length() == 0 && s2.charAt(j) == '0'){
                            f = false;
                            break;
                        }
                        str.append(s2.charAt(j));
                        j++;
                    }if(!f)break;
                    int n = Integer.parseInt(str.toString());
                    // j += n;
                    i += n;
                } else {
                    f = false;
                    break;
                }
            }if(!f)break;
        }
        
        if (!f) {
            System.out.println(false);
        } else {
            System.out.println(true);
        }
        }
        sc.close();
    }
}

/*
Valid Word Abbreviation

Given a non-empty string s and an abbreviation abbr , return whether the string 
matches with the given abbreviation.
A string such as "word" contains only the following valid abbreviations:

["word", "1ord", "w1rd", "wo1d", "wor1", "2rd", "w2d", "wo2", "1o1d", "1or1", 
"w1r1", "1o2", "2r1", "3d", "w3", "4"]

Notice that only the above abbreviations are valid abbreviations of the string 
"word" . Any other string is not a valid abbreviation of "word" .

Note: Assume s contains only lowercase letters and abbr contains only lowercase 
letters and digits.

Example 1:
Given s = "internationalization", abbr = "i12iz4n":
Return true.

Example 2:
Given s = "apple", abbr = "a2e":
Return false.
*/


import java.util.*;

public class ValidWordAbbreviation{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String s1 = sc.next();
        String s2 = sc.next();
        
        int n1 = s1.length();
        int n2 = s2.length();
        int i = 0, j = 0;
        boolean f = true;
        if(n1 == 0 && n2 == 0){
            System.out.println(true);
        }else{
        
        while (i < n1 && j < n2) {
            if (s1.charAt(i) == s2.charAt(j)) {
                i++;
                j++;
            } else {
                if (Character.isDigit(s2.charAt(j))) {
                    StringBuilder str = new StringBuilder();
                    while (j < n2 && Character.isDigit(s2.charAt(j))) {
                        if(str.length() == 0 && s2.charAt(j) == '0'){
                            f = false;
                            break;
                        }
                        str.append(s2.charAt(j));
                        j++;
                    }if(!f)break;
                    int n = Integer.parseInt(str.toString());
                    // j += n;
                    i += n;
                } else {
                    f = false;
                    break;
                }
            }if(!f)break;
        }
        
        if (!f) {
            System.out.println(false);
        } else {
            System.out.println(true);
        }
        }
        sc.close();
    }
}

/*
Valid Word Abbreviation

Given a non-empty string s and an abbreviation abbr , return whether the string 
matches with the given abbreviation.
A string such as "word" contains only the following valid abbreviations:

["word", "1ord", "w1rd", "wo1d", "wor1", "2rd", "w2d", "wo2", "1o1d", "1or1", 
"w1r1", "1o2", "2r1", "3d", "w3", "4"]

Notice that only the above abbreviations are valid abbreviations of the string 
"word" . Any other string is not a valid abbreviation of "word" .

Note: Assume s contains only lowercase letters and abbr contains only lowercase 
letters and digits.

Example 1:
Given s = "internationalization", abbr = "i12iz4n":
Return true.

Example 2:
Given s = "apple", abbr = "a2e":
Return false.
*/


import java.util.*;

public class ValidWordAbbreviation{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String s1 = sc.next();
        String s2 = sc.next();
        
        int n1 = s1.length();
        int n2 = s2.length();
        int i = 0, j = 0;
        boolean f = true;
        if(n1 == 0 && n2 == 0){
            System.out.println(true);
        }else{
        
        while (i < n1 && j < n2) {
            if (s1.charAt(i) == s2.charAt(j)) {
                i++;
                j++;
            } else {
                if (Character.isDigit(s2.charAt(j))) {
                    StringBuilder str = new StringBuilder();
                    while (j < n2 && Character.isDigit(s2.charAt(j))) {
                        if(str.length() == 0 && s2.charAt(j) == '0'){
                            f = false;
                            break;
                        }
                        str.append(s2.charAt(j));
                        j++;
                    }if(!f)break;
                    int n = Integer.parseInt(str.toString());
                    // j += n;
                    i += n;
                } else {
                    f = false;
                    break;
                }
            }if(!f)break;
        }
        
        if (!f) {
            System.out.println(false);
        } else {
            System.out.println(true);
        }
        }
        sc.close();
    }
}

/*
Valid Word Abbreviation

Given a non-empty string s and an abbreviation abbr , return whether the string 
matches with the given abbreviation.
A string such as "word" contains only the following valid abbreviations:

["word", "1ord", "w1rd", "wo1d", "wor1", "2rd", "w2d", "wo2", "1o1d", "1or1", 
"w1r1", "1o2", "2r1", "3d", "w3", "4"]

Notice that only the above abbreviations are valid abbreviations of the string 
"word" . Any other string is not a valid abbreviation of "word" .

Note: Assume s contains only lowercase letters and abbr contains only lowercase 
letters and digits.

Example 1:
Given s = "internationalization", abbr = "i12iz4n":
Return true.

Example 2:
Given s = "apple", abbr = "a2e":
Return false.
*/


import java.util.*;

public class ValidWordAbbreviation{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String s1 = sc.next();
        String s2 = sc.next();
        
        int n1 = s1.length();
        int n2 = s2.length();
        int i = 0, j = 0;
        boolean f = true;
        if(n1 == 0 && n2 == 0){
            System.out.println(true);
        }else{
        
        while (i < n1 && j < n2) {
            if (s1.charAt(i) == s2.charAt(j)) {
                i++;
                j++;
            } else {
                if (Character.isDigit(s2.charAt(j))) {
                    StringBuilder str = new StringBuilder();
                    while (j < n2 && Character.isDigit(s2.charAt(j))) {
                        if(str.length() == 0 && s2.charAt(j) == '0'){
                            f = false;
                            break;
                        }
                        str.append(s2.charAt(j));
                        j++;
                    }if(!f)break;
                    int n = Integer.parseInt(str.toString());
                    // j += n;
                    i += n;
                } else {
                    f = false;
                    break;
                }
            }if(!f)break;
        }
        
        if (!f) {
            System.out.println(false);
        } else {
            System.out.println(true);
        }
        }
        sc.close();
    }
}

/*
Valid Word Abbreviation

Given a non-empty string s and an abbreviation abbr , return whether the string 
matches with the given abbreviation.
A string such as "word" contains only the following valid abbreviations:

["word", "1ord", "w1rd", "wo1d", "wor1", "2rd", "w2d", "wo2", "1o1d", "1or1", 
"w1r1", "1o2", "2r1", "3d", "w3", "4"]

Notice that only the above abbreviations are valid abbreviations of the string 
"word" . Any other string is not a valid abbreviation of "word" .

Note: Assume s contains only lowercase letters and abbr contains only lowercase 
letters and digits.

Example 1:
Given s = "internationalization", abbr = "i12iz4n":
Return true.

Example 2:
Given s = "apple", abbr = "a2e":
Return false.
*/


import java.util.*;

public class ValidWordAbbreviation{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String s1 = sc.next();
        String s2 = sc.next();
        
        int n1 = s1.length();
        int n2 = s2.length();
        int i = 0, j = 0;
        boolean f = true;
        if(n1 == 0 && n2 == 0){
            System.out.println(true);
        }else{
        
        while (i < n1 && j < n2) {
            if (s1.charAt(i) == s2.charAt(j)) {
                i++;
                j++;
            } else {
                if (Character.isDigit(s2.charAt(j))) {
                    StringBuilder str = new StringBuilder();
                    while (j < n2 && Character.isDigit(s2.charAt(j))) {
                        if(str.length() == 0 && s2.charAt(j) == '0'){
                            f = false;
                            break;
                        }
                        str.append(s2.charAt(j));
                        j++;
                    }if(!f)break;
                    int n = Integer.parseInt(str.toString());
                    // j += n;
                    i += n;
                } else {
                    f = false;
                    break;
                }
            }if(!f)break;
        }
        
        if (!f) {
            System.out.println(false);
        } else {
            System.out.println(true);
        }
        }
        sc.close();
    }
}

/*
Valid Word Abbreviation

Given a non-empty string s and an abbreviation abbr , return whether the string 
matches with the given abbreviation.
A string such as "word" contains only the following valid abbreviations:

["word", "1ord", "w1rd", "wo1d", "wor1", "2rd", "w2d", "wo2", "1o1d", "1or1", 
"w1r1", "1o2", "2r1", "3d", "w3", "4"]

Notice that only the above abbreviations are valid abbreviations of the string 
"word" . Any other string is not a valid abbreviation of "word" .

Note: Assume s contains only lowercase letters and abbr contains only lowercase 
letters and digits.

Example 1:
Given s = "internationalization", abbr = "i12iz4n":
Return true.

Example 2:
Given s = "apple", abbr = "a2e":
Return false.
*/


import java.util.*;

public class ValidWordAbbreviation{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String s1 = sc.next();
        String s2 = sc.next();
        
        int n1 = s1.length();
        int n2 = s2.length();
        int i = 0, j = 0;
        boolean f = true;
        if(n1 == 0 && n2 == 0){
            System.out.println(true);
        }else{
        
        while (i < n1 && j < n2) {
            if (s1.charAt(i) == s2.charAt(j)) {
                i++;
                j++;
            } else {
                if (Character.isDigit(s2.charAt(j))) {
                    StringBuilder str = new StringBuilder();
                    while (j < n2 && Character.isDigit(s2.charAt(j))) {
                        if(str.length() == 0 && s2.charAt(j) == '0'){
                            f = false;
                            break;
                        }
                        str.append(s2.charAt(j));
                        j++;
                    }if(!f)break;
                    int n = Integer.parseInt(str.toString());
                    // j += n;
                    i += n;
                } else {
                    f = false;
                    break;
                }
            }if(!f)break;
        }
        
        if (!f) {
            System.out.println(false);
        } else {
            System.out.println(true);
        }
        }
        sc.close();
    }
}

/*
Valid Word Abbreviation

Given a non-empty string s and an abbreviation abbr , return whether the string 
matches with the given abbreviation.
A string such as "word" contains only the following valid abbreviations:

["word", "1ord", "w1rd", "wo1d", "wor1", "2rd", "w2d", "wo2", "1o1d", "1or1", 
"w1r1", "1o2", "2r1", "3d", "w3", "4"]

Notice that only the above abbreviations are valid abbreviations of the string 
"word" . Any other string is not a valid abbreviation of "word" .

Note: Assume s contains only lowercase letters and abbr contains only lowercase 
letters and digits.

Example 1:
Given s = "internationalization", abbr = "i12iz4n":
Return true.

Example 2:
Given s = "apple", abbr = "a2e":
Return false.
*/


import java.util.*;

public class ValidWordAbbreviation{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String s1 = sc.next();
        String s2 = sc.next();
        
        int n1 = s1.length();
        int n2 = s2.length();
        int i = 0, j = 0;
        boolean f = true;
        if(n1 == 0 && n2 == 0){
            System.out.println(true);
        }else{
        
        while (i < n1 && j < n2) {
            if (s1.charAt(i) == s2.charAt(j)) {
                i++;
                j++;
            } else {
                if (Character.isDigit(s2.charAt(j))) {
                    StringBuilder str = new StringBuilder();
                    while (j < n2 && Character.isDigit(s2.charAt(j))) {
                        if(str.length() == 0 && s2.charAt(j) == '0'){
                            f = false;
                            break;
                        }
                        str.append(s2.charAt(j));
                        j++;
                    }if(!f)break;
                    int n = Integer.parseInt(str.toString());
                    // j += n;
                    i += n;
                } else {
                    f = false;
                    break;
                }
            }if(!f)break;
        }
        
        if (!f) {
            System.out.println(false);
        } else {
            System.out.println(true);
        }
        }
        sc.close();
    }
}

/*
Valid Word Abbreviation

Given a non-empty string s and an abbreviation abbr , return whether the string 
matches with the given abbreviation.
A string such as "word" contains only the following valid abbreviations:

["word", "1ord", "w1rd", "wo1d", "wor1", "2rd", "w2d", "wo2", "1o1d", "1or1", 
"w1r1", "1o2", "2r1", "3d", "w3", "4"]

Notice that only the above abbreviations are valid abbreviations of the string 
"word" . Any other string is not a valid abbreviation of "word" .

Note: Assume s contains only lowercase letters and abbr contains only lowercase 
letters and digits.

Example 1:
Given s = "internationalization", abbr = "i12iz4n":
Return true.

Example 2:
Given s = "apple", abbr = "a2e":
Return false.
*/


import java.util.*;

public class ValidWordAbbreviation{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String s1 = sc.next();
        String s2 = sc.next();
        
        int n1 = s1.length();
        int n2 = s2.length();
        int i = 0, j = 0;
        boolean f = true;
        if(n1 == 0 && n2 == 0){
            System.out.println(true);
        }else{
        
        while (i < n1 && j < n2) {
            if (s1.charAt(i) == s2.charAt(j)) {
                i++;
                j++;
            } else {
                if (Character.isDigit(s2.charAt(j))) {
                    StringBuilder str = new StringBuilder();
                    while (j < n2 && Character.isDigit(s2.charAt(j))) {
                        if(str.length() == 0 && s2.charAt(j) == '0'){
                            f = false;
                            break;
                        }
                        str.append(s2.charAt(j));
                        j++;
                    }if(!f)break;
                    int n = Integer.parseInt(str.toString());
                    // j += n;
                    i += n;
                } else {
                    f = false;
                    break;
                }
            }if(!f)break;
        }
        
        if (!f) {
            System.out.println(false);
        } else {
            System.out.println(true);
        }
        }
        sc.close();
    }
}

/*
Valid Word Abbreviation

Given a non-empty string s and an abbreviation abbr , return whether the string 
matches with the given abbreviation.
A string such as "word" contains only the following valid abbreviations:

["word", "1ord", "w1rd", "wo1d", "wor1", "2rd", "w2d", "wo2", "1o1d", "1or1", 
"w1r1", "1o2", "2r1", "3d", "w3", "4"]

Notice that only the above abbreviations are valid abbreviations of the string 
"word" . Any other string is not a valid abbreviation of "word" .

Note: Assume s contains only lowercase letters and abbr contains only lowercase 
letters and digits.

Example 1:
Given s = "internationalization", abbr = "i12iz4n":
Return true.

Example 2:
Given s = "apple", abbr = "a2e":
Return false.
*/


import java.util.*;

public class ValidWordAbbreviation{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String s1 = sc.next();
        String s2 = sc.next();
        
        int n1 = s1.length();
        int n2 = s2.length();
        int i = 0, j = 0;
        boolean f = true;
        if(n1 == 0 && n2 == 0){
            System.out.println(true);
        }else{
        
        while (i < n1 && j < n2) {
            if (s1.charAt(i) == s2.charAt(j)) {
                i++;
                j++;
            } else {
                if (Character.isDigit(s2.charAt(j))) {
                    StringBuilder str = new StringBuilder();
                    while (j < n2 && Character.isDigit(s2.charAt(j))) {
                        if(str.length() == 0 && s2.charAt(j) == '0'){
                            f = false;
                            break;
                        }
                        str.append(s2.charAt(j));
                        j++;
                    }if(!f)break;
                    int n = Integer.parseInt(str.toString());
                    // j += n;
                    i += n;
                } else {
                    f = false;
                    break;
                }
            }if(!f)break;
        }
        
        if (!f) {
            System.out.println(false);
        } else {
            System.out.println(true);
        }
        }
        sc.close();
    }
}

/*
Valid Word Abbreviation

Given a non-empty string s and an abbreviation abbr , return whether the string 
matches with the given abbreviation.
A string such as "word" contains only the following valid abbreviations:

["word", "1ord", "w1rd", "wo1d", "wor1", "2rd", "w2d", "wo2", "1o1d", "1or1", 
"w1r1", "1o2", "2r1", "3d", "w3", "4"]

Notice that only the above abbreviations are valid abbreviations of the string 
"word" . Any other string is not a valid abbreviation of "word" .

Note: Assume s contains only lowercase letters and abbr contains only lowercase 
letters and digits.

Example 1:
Given s = "internationalization", abbr = "i12iz4n":
Return true.

Example 2:
Given s = "apple", abbr = "a2e":
Return false.
*/


import java.util.*;

public class ValidWordAbbreviation{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String s1 = sc.next();
        String s2 = sc.next();
        
        int n1 = s1.length();
        int n2 = s2.length();
        int i = 0, j = 0;
        boolean f = true;
        if(n1 == 0 && n2 == 0){
            System.out.println(true);
        }else{
        
        while (i < n1 && j < n2) {
            if (s1.charAt(i) == s2.charAt(j)) {
                i++;
                j++;
            } else {
                if (Character.isDigit(s2.charAt(j))) {
                    StringBuilder str = new StringBuilder();
                    while (j < n2 && Character.isDigit(s2.charAt(j))) {
                        if(str.length() == 0 && s2.charAt(j) == '0'){
                            f = false;
                            break;
                        }
                        str.append(s2.charAt(j));
                        j++;
                    }if(!f)break;
                    int n = Integer.parseInt(str.toString());
                    // j += n;
                    i += n;
                } else {
                    f = false;
                    break;
                }
            }if(!f)break;
        }
        
        if (!f) {
            System.out.println(false);
        } else {
            System.out.println(true);
        }
        }
        sc.close();
    }
}

/*
Valid Word Abbreviation

Given a non-empty string s and an abbreviation abbr , return whether the string 
matches with the given abbreviation.
A string such as "word" contains only the following valid abbreviations:

["word", "1ord", "w1rd", "wo1d", "wor1", "2rd", "w2d", "wo2", "1o1d", "1or1", 
"w1r1", "1o2", "2r1", "3d", "w3", "4"]

Notice that only the above abbreviations are valid abbreviations of the string 
"word" . Any other string is not a valid abbreviation of "word" .

Note: Assume s contains only lowercase letters and abbr contains only lowercase 
letters and digits.

Example 1:
Given s = "internationalization", abbr = "i12iz4n":
Return true.

Example 2:
Given s = "apple", abbr = "a2e":
Return false.
*/


import java.util.*;

public class ValidWordAbbreviation{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String s1 = sc.next();
        String s2 = sc.next();
        
        int n1 = s1.length();
        int n2 = s2.length();
        int i = 0, j = 0;
        boolean f = true;
        if(n1 == 0 && n2 == 0){
            System.out.println(true);
        }else{
        
        while (i < n1 && j < n2) {
            if (s1.charAt(i) == s2.charAt(j)) {
                i++;
                j++;
            } else {
                if (Character.isDigit(s2.charAt(j))) {
                    StringBuilder str = new StringBuilder();
                    while (j < n2 && Character.isDigit(s2.charAt(j))) {
                        if(str.length() == 0 && s2.charAt(j) == '0'){
                            f = false;
                            break;
                        }
                        str.append(s2.charAt(j));
                        j++;
                    }if(!f)break;
                    int n = Integer.parseInt(str.toString());
                    // j += n;
                    i += n;
                } else {
                    f = false;
                    break;
                }
            }if(!f)break;
        }
        
        if (!f) {
            System.out.println(false);
        } else {
            System.out.println(true);
        }
        }
        sc.close();
    }
}

/*
Valid Word Abbreviation

Given a non-empty string s and an abbreviation abbr , return whether the string 
matches with the given abbreviation.
A string such as "word" contains only the following valid abbreviations:

["word", "1ord", "w1rd", "wo1d", "wor1", "2rd", "w2d", "wo2", "1o1d", "1or1", 
"w1r1", "1o2", "2r1", "3d", "w3", "4"]

Notice that only the above abbreviations are valid abbreviations of the string 
"word" . Any other string is not a valid abbreviation of "word" .

Note: Assume s contains only lowercase letters and abbr contains only lowercase 
letters and digits.

Example 1:
Given s = "internationalization", abbr = "i12iz4n":
Return true.

Example 2:
Given s = "apple", abbr = "a2e":
Return false.
*/


import java.util.*;

public class ValidWordAbbreviation{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String s1 = sc.next();
        String s2 = sc.next();
        
        int n1 = s1.length();
        int n2 = s2.length();
        int i = 0, j = 0;
        boolean f = true;
        if(n1 == 0 && n2 == 0){
            System.out.println(true);
        }else{
        
        while (i < n1 && j < n2) {
            if (s1.charAt(i) == s2.charAt(j)) {
                i++;
                j++;
            } else {
                if (Character.isDigit(s2.charAt(j))) {
                    StringBuilder str = new StringBuilder();
                    while (j < n2 && Character.isDigit(s2.charAt(j))) {
                        if(str.length() == 0 && s2.charAt(j) == '0'){
                            f = false;
                            break;
                        }
                        str.append(s2.charAt(j));
                        j++;
                    }if(!f)break;
                    int n = Integer.parseInt(str.toString());
                    // j += n;
                    i += n;
                } else {
                    f = false;
                    break;
                }
            }if(!f)break;
        }
        
        if (!f) {
            System.out.println(false);
        } else {
            System.out.println(true);
        }
        }
        sc.close();
    }
}

/*
Valid Word Abbreviation

Given a non-empty string s and an abbreviation abbr , return whether the string 
matches with the given abbreviation.
A string such as "word" contains only the following valid abbreviations:

["word", "1ord", "w1rd", "wo1d", "wor1", "2rd", "w2d", "wo2", "1o1d", "1or1", 
"w1r1", "1o2", "2r1", "3d", "w3", "4"]

Notice that only the above abbreviations are valid abbreviations of the string 
"word" . Any other string is not a valid abbreviation of "word" .

Note: Assume s contains only lowercase letters and abbr contains only lowercase 
letters and digits.

Example 1:
Given s = "internationalization", abbr = "i12iz4n":
Return true.

Example 2:
Given s = "apple", abbr = "a2e":
Return false.
*/


import java.util.*;

public class ValidWordAbbreviation{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String s1 = sc.next();
        String s2 = sc.next();
        
        int n1 = s1.length();
        int n2 = s2.length();
        int i = 0, j = 0;
        boolean f = true;
        if(n1 == 0 && n2 == 0){
            System.out.println(true);
        }else{
        
        while (i < n1 && j < n2) {
            if (s1.charAt(i) == s2.charAt(j)) {
                i++;
                j++;
            } else {
                if (Character.isDigit(s2.charAt(j))) {
                    StringBuilder str = new StringBuilder();
                    while (j < n2 && Character.isDigit(s2.charAt(j))) {
                        if(str.length() == 0 && s2.charAt(j) == '0'){
                            f = false;
                            break;
                        }
                        str.append(s2.charAt(j));
                        j++;
                    }if(!f)break;
                    int n = Integer.parseInt(str.toString());
                    // j += n;
                    i += n;
                } else {
                    f = false;
                    break;
                }
            }if(!f)break;
        }
        
        if (!f) {
            System.out.println(false);
        } else {
            System.out.println(true);
        }
        }
        sc.close();
    }
}

/*
Valid Word Abbreviation

Given a non-empty string s and an abbreviation abbr , return whether the string 
matches with the given abbreviation.
A string such as "word" contains only the following valid abbreviations:

["word", "1ord", "w1rd", "wo1d", "wor1", "2rd", "w2d", "wo2", "1o1d", "1or1", 
"w1r1", "1o2", "2r1", "3d", "w3", "4"]

Notice that only the above abbreviations are valid abbreviations of the string 
"word" . Any other string is not a valid abbreviation of "word" .

Note: Assume s contains only lowercase letters and abbr contains only lowercase 
letters and digits.

Example 1:
Given s = "internationalization", abbr = "i12iz4n":
Return true.

Example 2:
Given s = "apple", abbr = "a2e":
Return false.
*/


import java.util.*;

public class ValidWordAbbreviation{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String s1 = sc.next();
        String s2 = sc.next();
        
        int n1 = s1.length();
        int n2 = s2.length();
        int i = 0, j = 0;
        boolean f = true;
        if(n1 == 0 && n2 == 0){
            System.out.println(true);
        }else{
        
        while (i < n1 && j < n2) {
            if (s1.charAt(i) == s2.charAt(j)) {
                i++;
                j++;
            } else {
                if (Character.isDigit(s2.charAt(j))) {
                    StringBuilder str = new StringBuilder();
                    while (j < n2 && Character.isDigit(s2.charAt(j))) {
                        if(str.length() == 0 && s2.charAt(j) == '0'){
                            f = false;
                            break;
                        }
                        str.append(s2.charAt(j));
                        j++;
                    }if(!f)break;
                    int n = Integer.parseInt(str.toString());
                    // j += n;
                    i += n;
                } else {
                    f = false;
                    break;
                }
            }if(!f)break;
        }
        
        if (!f) {
            System.out.println(false);
        } else {
            System.out.println(true);
        }
        }
        sc.close();
    }
}

/*
Valid Word Abbreviation

Given a non-empty string s and an abbreviation abbr , return whether the string 
matches with the given abbreviation.
A string such as "word" contains only the following valid abbreviations:

["word", "1ord", "w1rd", "wo1d", "wor1", "2rd", "w2d", "wo2", "1o1d", "1or1", 
"w1r1", "1o2", "2r1", "3d", "w3", "4"]

Notice that only the above abbreviations are valid abbreviations of the string 
"word" . Any other string is not a valid abbreviation of "word" .

Note: Assume s contains only lowercase letters and abbr contains only lowercase 
letters and digits.

Example 1:
Given s = "internationalization", abbr = "i12iz4n":
Return true.

Example 2:
Given s = "apple", abbr = "a2e":
Return false.
*/


import java.util.*;

public class ValidWordAbbreviation{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String s1 = sc.next();
        String s2 = sc.next();
        
        int n1 = s1.length();
        int n2 = s2.length();
        int i = 0, j = 0;
        boolean f = true;
        if(n1 == 0 && n2 == 0){
            System.out.println(true);
        }else{
        
        while (i < n1 && j < n2) {
            if (s1.charAt(i) == s2.charAt(j)) {
                i++;
                j++;
            } else {
                if (Character.isDigit(s2.charAt(j))) {
                    StringBuilder str = new StringBuilder();
                    while (j < n2 && Character.isDigit(s2.charAt(j))) {
                        if(str.length() == 0 && s2.charAt(j) == '0'){
                            f = false;
                            break;
                        }
                        str.append(s2.charAt(j));
                        j++;
                    }if(!f)break;
                    int n = Integer.parseInt(str.toString());
                    // j += n;
                    i += n;
                } else {
                    f = false;
                    break;
                }
            }if(!f)break;
        }
        
        if (!f) {
            System.out.println(false);
        } else {
            System.out.println(true);
        }
        }
        sc.close();
    }
}

/*
Valid Word Abbreviation

Given a non-empty string s and an abbreviation abbr , return whether the string 
matches with the given abbreviation.
A string such as "word" contains only the following valid abbreviations:

["word", "1ord", "w1rd", "wo1d", "wor1", "2rd", "w2d", "wo2", "1o1d", "1or1", 
"w1r1", "1o2", "2r1", "3d", "w3", "4"]

Notice that only the above abbreviations are valid abbreviations of the string 
"word" . Any other string is not a valid abbreviation of "word" .

Note: Assume s contains only lowercase letters and abbr contains only lowercase 
letters and digits.

Example 1:
Given s = "internationalization", abbr = "i12iz4n":
Return true.

Example 2:
Given s = "apple", abbr = "a2e":
Return false.
*/


import java.util.*;

public class ValidWordAbbreviation{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String s1 = sc.next();
        String s2 = sc.next();
        
        int n1 = s1.length();
        int n2 = s2.length();
        int i = 0, j = 0;
        boolean f = true;
        if(n1 == 0 && n2 == 0){
            System.out.println(true);
        }else{
        
        while (i < n1 && j < n2) {
            if (s1.charAt(i) == s2.charAt(j)) {
                i++;
                j++;
            } else {
                if (Character.isDigit(s2.charAt(j))) {
                    StringBuilder str = new StringBuilder();
                    while (j < n2 && Character.isDigit(s2.charAt(j))) {
                        if(str.length() == 0 && s2.charAt(j) == '0'){
                            f = false;
                            break;
                        }
                        str.append(s2.charAt(j));
                        j++;
                    }if(!f)break;
                    int n = Integer.parseInt(str.toString());
                    // j += n;
                    i += n;
                } else {
                    f = false;
                    break;
                }
            }if(!f)break;
        }
        
        if (!f) {
            System.out.println(false);
        } else {
            System.out.println(true);
        }
        }
        sc.close();
    }
}

/*
Valid Word Abbreviation

Given a non-empty string s and an abbreviation abbr , return whether the string 
matches with the given abbreviation.
A string such as "word" contains only the following valid abbreviations:

["word", "1ord", "w1rd", "wo1d", "wor1", "2rd", "w2d", "wo2", "1o1d", "1or1", 
"w1r1", "1o2", "2r1", "3d", "w3", "4"]

Notice that only the above abbreviations are valid abbreviations of the string 
"word" . Any other string is not a valid abbreviation of "word" .

Note: Assume s contains only lowercase letters and abbr contains only lowercase 
letters and digits.

Example 1:
Given s = "internationalization", abbr = "i12iz4n":
Return true.

Example 2:
Given s = "apple", abbr = "a2e":
Return false.
*/


import java.util.*;

public class ValidWordAbbreviation{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String s1 = sc.next();
        String s2 = sc.next();
        
        int n1 = s1.length();
        int n2 = s2.length();
        int i = 0, j = 0;
        boolean f = true;
        if(n1 == 0 && n2 == 0){
            System.out.println(true);
        }else{
        
        while (i < n1 && j < n2) {
            if (s1.charAt(i) == s2.charAt(j)) {
                i++;
                j++;
            } else {
                if (Character.isDigit(s2.charAt(j))) {
                    StringBuilder str = new StringBuilder();
                    while (j < n2 && Character.isDigit(s2.charAt(j))) {
                        if(str.length() == 0 && s2.charAt(j) == '0'){
                            f = false;
                            break;
                        }
                        str.append(s2.charAt(j));
                        j++;
                    }if(!f)break;
                    int n = Integer.parseInt(str.toString());
                    // j += n;
                    i += n;
                } else {
                    f = false;
                    break;
                }
            }if(!f)break;
        }
        
        if (!f) {
            System.out.println(false);
        } else {
            System.out.println(true);
        }
        }
        sc.close();
    }
}

/*
Valid Word Abbreviation

Given a non-empty string s and an abbreviation abbr , return whether the string 
matches with the given abbreviation.
A string such as "word" contains only the following valid abbreviations:

["word", "1ord", "w1rd", "wo1d", "wor1", "2rd", "w2d", "wo2", "1o1d", "1or1", 
"w1r1", "1o2", "2r1", "3d", "w3", "4"]

Notice that only the above abbreviations are valid abbreviations of the string 
"word" . Any other string is not a valid abbreviation of "word" .

Note: Assume s contains only lowercase letters and abbr contains only lowercase 
letters and digits.

Example 1:
Given s = "internationalization", abbr = "i12iz4n":
Return true.

Example 2:
Given s = "apple", abbr = "a2e":
Return false.
*/


import java.util.*;

public class ValidWordAbbreviation{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String s1 = sc.next();
        String s2 = sc.next();
        
        int n1 = s1.length();
        int n2 = s2.length();
        int i = 0, j = 0;
        boolean f = true;
        if(n1 == 0 && n2 == 0){
            System.out.println(true);
        }else{
        
        while (i < n1 && j < n2) {
            if (s1.charAt(i) == s2.charAt(j)) {
                i++;
                j++;
            } else {
                if (Character.isDigit(s2.charAt(j))) {
                    StringBuilder str = new StringBuilder();
                    while (j < n2 && Character.isDigit(s2.charAt(j))) {
                        if(str.length() == 0 && s2.charAt(j) == '0'){
                            f = false;
                            break;
                        }
                        str.append(s2.charAt(j));
                        j++;
                    }if(!f)break;
                    int n = Integer.parseInt(str.toString());
                    // j += n;
                    i += n;
                } else {
                    f = false;
                    break;
                }
            }if(!f)break;
        }
        
        if (!f) {
            System.out.println(false);
        } else {
            System.out.println(true);
        }
        }
        sc.close();
    }
}

/*
Valid Word Abbreviation

Given a non-empty string s and an abbreviation abbr , return whether the string 
matches with the given abbreviation.
A string such as "word" contains only the following valid abbreviations:

["word", "1ord", "w1rd", "wo1d", "wor1", "2rd", "w2d", "wo2", "1o1d", "1or1", 
"w1r1", "1o2", "2r1", "3d", "w3", "4"]

Notice that only the above abbreviations are valid abbreviations of the string 
"word" . Any other string is not a valid abbreviation of "word" .

Note: Assume s contains only lowercase letters and abbr contains only lowercase 
letters and digits.

Example 1:
Given s = "internationalization", abbr = "i12iz4n":
Return true.

Example 2:
Given s = "apple", abbr = "a2e":
Return false.
*/


import java.util.*;

public class ValidWordAbbreviation{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String s1 = sc.next();
        String s2 = sc.next();
        
        int n1 = s1.length();
        int n2 = s2.length();
        int i = 0, j = 0;
        boolean f = true;
        if(n1 == 0 && n2 == 0){
            System.out.println(true);
        }else{
        
        while (i < n1 && j < n2) {
            if (s1.charAt(i) == s2.charAt(j)) {
                i++;
                j++;
            } else {
                if (Character.isDigit(s2.charAt(j))) {
                    StringBuilder str = new StringBuilder();
                    while (j < n2 && Character.isDigit(s2.charAt(j))) {
                        if(str.length() == 0 && s2.charAt(j) == '0'){
                            f = false;
                            break;
                        }
                        str.append(s2.charAt(j));
                        j++;
                    }if(!f)break;
                    int n = Integer.parseInt(str.toString());
                    // j += n;
                    i += n;
                } else {
                    f = false;
                    break;
                }
            }if(!f)break;
        }
        
        if (!f) {
            System.out.println(false);
        } else {
            System.out.println(true);
        }
        }
        sc.close();
    }
}

/*
Valid Word Abbreviation

Given a non-empty string s and an abbreviation abbr , return whether the string 
matches with the given abbreviation.
A string such as "word" contains only the following valid abbreviations:

["word", "1ord", "w1rd", "wo1d", "wor1", "2rd", "w2d", "wo2", "1o1d", "1or1", 
"w1r1", "1o2", "2r1", "3d", "w3", "4"]

Notice that only the above abbreviations are valid abbreviations of the string 
"word" . Any other string is not a valid abbreviation of "word" .

Note: Assume s contains only lowercase letters and abbr contains only lowercase 
letters and digits.

Example 1:
Given s = "internationalization", abbr = "i12iz4n":
Return true.

Example 2:
Given s = "apple", abbr = "a2e":
Return false.
*/


import java.util.*;

public class ValidWordAbbreviation{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String s1 = sc.next();
        String s2 = sc.next();
        
        int n1 = s1.length();
        int n2 = s2.length();
        int i = 0, j = 0;
        boolean f = true;
        if(n1 == 0 && n2 == 0){
            System.out.println(true);
        }else{
        
        while (i < n1 && j < n2) {
            if (s1.charAt(i) == s2.charAt(j)) {
                i++;
                j++;
            } else {
                if (Character.isDigit(s2.charAt(j))) {
                    StringBuilder str = new StringBuilder();
                    while (j < n2 && Character.isDigit(s2.charAt(j))) {
                        if(str.length() == 0 && s2.charAt(j) == '0'){
                            f = false;
                            break;
                        }
                        str.append(s2.charAt(j));
                        j++;
                    }if(!f)break;
                    int n = Integer.parseInt(str.toString());
                    // j += n;
                    i += n;
                } else {
                    f = false;
                    break;
                }
            }if(!f)break;
        }
        
        if (!f) {
            System.out.println(false);
        } else {
            System.out.println(true);
        }
        }
        sc.close();
    }
}

/*
Valid Word Abbreviation

Given a non-empty string s and an abbreviation abbr , return whether the string 
matches with the given abbreviation.
A string such as "word" contains only the following valid abbreviations:

["word", "1ord", "w1rd", "wo1d", "wor1", "2rd", "w2d", "wo2", "1o1d", "1or1", 
"w1r1", "1o2", "2r1", "3d", "w3", "4"]

Notice that only the above abbreviations are valid abbreviations of the string 
"word" . Any other string is not a valid abbreviation of "word" .

Note: Assume s contains only lowercase letters and abbr contains only lowercase 
letters and digits.

Example 1:
Given s = "internationalization", abbr = "i12iz4n":
Return true.

Example 2:
Given s = "apple", abbr = "a2e":
Return false.
*/


import java.util.*;

public class ValidWordAbbreviation{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String s1 = sc.next();
        String s2 = sc.next();
        
        int n1 = s1.length();
        int n2 = s2.length();
        int i = 0, j = 0;
        boolean f = true;
        if(n1 == 0 && n2 == 0){
            System.out.println(true);
        }else{
        
        while (i < n1 && j < n2) {
            if (s1.charAt(i) == s2.charAt(j)) {
                i++;
                j++;
            } else {
                if (Character.isDigit(s2.charAt(j))) {
                    StringBuilder str = new StringBuilder();
                    while (j < n2 && Character.isDigit(s2.charAt(j))) {
                        if(str.length() == 0 && s2.charAt(j) == '0'){
                            f = false;
                            break;
                        }
                        str.append(s2.charAt(j));
                        j++;
                    }if(!f)break;
                    int n = Integer.parseInt(str.toString());
                    // j += n;
                    i += n;
                } else {
                    f = false;
                    break;
                }
            }if(!f)break;
        }
        
        if (!f) {
            System.out.println(false);
        } else {
            System.out.println(true);
        }
        }
        sc.close();
    }
}

/*
Valid Word Abbreviation

Given a non-empty string s and an abbreviation abbr , return whether the string 
matches with the given abbreviation.
A string such as "word" contains only the following valid abbreviations:

["word", "1ord", "w1rd", "wo1d", "wor1", "2rd", "w2d", "wo2", "1o1d", "1or1", 
"w1r1", "1o2", "2r1", "3d", "w3", "4"]

Notice that only the above abbreviations are valid abbreviations of the string 
"word" . Any other string is not a valid abbreviation of "word" .

Note: Assume s contains only lowercase letters and abbr contains only lowercase 
letters and digits.

Example 1:
Given s = "internationalization", abbr = "i12iz4n":
Return true.

Example 2:
Given s = "apple", abbr = "a2e":
Return false.
*/


import java.util.*;

public class ValidWordAbbreviation{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String s1 = sc.next();
        String s2 = sc.next();
        
        int n1 = s1.length();
        int n2 = s2.length();
        int i = 0, j = 0;
        boolean f = true;
        if(n1 == 0 && n2 == 0){
            System.out.println(true);
        }else{
        
        while (i < n1 && j < n2) {
            if (s1.charAt(i) == s2.charAt(j)) {
                i++;
                j++;
            } else {
                if (Character.isDigit(s2.charAt(j))) {
                    StringBuilder str = new StringBuilder();
                    while (j < n2 && Character.isDigit(s2.charAt(j))) {
                        if(str.length() == 0 && s2.charAt(j) == '0'){
                            f = false;
                            break;
                        }
                        str.append(s2.charAt(j));
                        j++;
                    }if(!f)break;
                    int n = Integer.parseInt(str.toString());
                    // j += n;
                    i += n;
                } else {
                    f = false;
                    break;
                }
            }if(!f)break;
        }
        
        if (!f) {
            System.out.println(false);
        } else {
            System.out.println(true);
        }
        }
        sc.close();
    }
}

/*
Valid Word Abbreviation

Given a non-empty string s and an abbreviation abbr , return whether the string 
matches with the given abbreviation.
A string such as "word" contains only the following valid abbreviations:

["word", "1ord", "w1rd", "wo1d", "wor1", "2rd", "w2d", "wo2", "1o1d", "1or1", 
"w1r1", "1o2", "2r1", "3d", "w3", "4"]

Notice that only the above abbreviations are valid abbreviations of the string 
"word" . Any other string is not a valid abbreviation of "word" .

Note: Assume s contains only lowercase letters and abbr contains only lowercase 
letters and digits.

Example 1:
Given s = "internationalization", abbr = "i12iz4n":
Return true.

Example 2:
Given s = "apple", abbr = "a2e":
Return false.
*/


import java.util.*;

public class ValidWordAbbreviation{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String s1 = sc.next();
        String s2 = sc.next();
        
        int n1 = s1.length();
        int n2 = s2.length();
        int i = 0, j = 0;
        boolean f = true;
        if(n1 == 0 && n2 == 0){
            System.out.println(true);
        }else{
        
        while (i < n1 && j < n2) {
            if (s1.charAt(i) == s2.charAt(j)) {
                i++;
                j++;
            } else {
                if (Character.isDigit(s2.charAt(j))) {
                    StringBuilder str = new StringBuilder();
                    while (j < n2 && Character.isDigit(s2.charAt(j))) {
                        if(str.length() == 0 && s2.charAt(j) == '0'){
                            f = false;
                            break;
                        }
                        str.append(s2.charAt(j));
                        j++;
                    }if(!f)break;
                    int n = Integer.parseInt(str.toString());
                    // j += n;
                    i += n;
                } else {
                    f = false;
                    break;
                }
            }if(!f)break;
        }
        
        if (!f) {
            System.out.println(false);
        } else {
            System.out.println(true);
        }
        }
        sc.close();
    }
}

/*
Valid Word Abbreviation

Given a non-empty string s and an abbreviation abbr , return whether the string 
matches with the given abbreviation.
A string such as "word" contains only the following valid abbreviations:

["word", "1ord", "w1rd", "wo1d", "wor1", "2rd", "w2d", "wo2", "1o1d", "1or1", 
"w1r1", "1o2", "2r1", "3d", "w3", "4"]

Notice that only the above abbreviations are valid abbreviations of the string 
"word" . Any other string is not a valid abbreviation of "word" .

Note: Assume s contains only lowercase letters and abbr contains only lowercase 
letters and digits.

Example 1:
Given s = "internationalization", abbr = "i12iz4n":
Return true.

Example 2:
Given s = "apple", abbr = "a2e":
Return false.
*/


import java.util.*;

public class ValidWordAbbreviation{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String s1 = sc.next();
        String s2 = sc.next();
        
        int n1 = s1.length();
        int n2 = s2.length();
        int i = 0, j = 0;
        boolean f = true;
        if(n1 == 0 && n2 == 0){
            System.out.println(true);
        }else{
        
        while (i < n1 && j < n2) {
            if (s1.charAt(i) == s2.charAt(j)) {
                i++;
                j++;
            } else {
                if (Character.isDigit(s2.charAt(j))) {
                    StringBuilder str = new StringBuilder();
                    while (j < n2 && Character.isDigit(s2.charAt(j))) {
                        if(str.length() == 0 && s2.charAt(j) == '0'){
                            f = false;
                            break;
                        }
                        str.append(s2.charAt(j));
                        j++;
                    }if(!f)break;
                    int n = Integer.parseInt(str.toString());
                    // j += n;
                    i += n;
                } else {
                    f = false;
                    break;
                }
            }if(!f)break;
        }
        
        if (!f) {
            System.out.println(false);
        } else {
            System.out.println(true);
        }
        }
        sc.close();
    }
}

/*
Valid Word Abbreviation

Given a non-empty string s and an abbreviation abbr , return whether the string 
matches with the given abbreviation.
A string such as "word" contains only the following valid abbreviations:

["word", "1ord", "w1rd", "wo1d", "wor1", "2rd", "w2d", "wo2", "1o1d", "1or1", 
"w1r1", "1o2", "2r1", "3d", "w3", "4"]

Notice that only the above abbreviations are valid abbreviations of the string 
"word" . Any other string is not a valid abbreviation of "word" .

Note: Assume s contains only lowercase letters and abbr contains only lowercase 
letters and digits.

Example 1:
Given s = "internationalization", abbr = "i12iz4n":
Return true.

Example 2:
Given s = "apple", abbr = "a2e":
Return false.
*/


import java.util.*;

public class ValidWordAbbreviation{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String s1 = sc.next();
        String s2 = sc.next();
        
        int n1 = s1.length();
        int n2 = s2.length();
        int i = 0, j = 0;
        boolean f = true;
        if(n1 == 0 && n2 == 0){
            System.out.println(true);
        }else{
        
        while (i < n1 && j < n2) {
            if (s1.charAt(i) == s2.charAt(j)) {
                i++;
                j++;
            } else {
                if (Character.isDigit(s2.charAt(j))) {
                    StringBuilder str = new StringBuilder();
                    while (j < n2 && Character.isDigit(s2.charAt(j))) {
                        if(str.length() == 0 && s2.charAt(j) == '0'){
                            f = false;
                            break;
                        }
                        str.append(s2.charAt(j));
                        j++;
                    }if(!f)break;
                    int n = Integer.parseInt(str.toString());
                    // j += n;
                    i += n;
                } else {
                    f = false;
                    break;
                }
            }if(!f)break;
        }
        
        if (!f) {
            System.out.println(false);
        } else {
            System.out.println(true);
        }
        }
        sc.close();
    }
}

/*
Valid Word Abbreviation

Given a non-empty string s and an abbreviation abbr , return whether the string 
matches with the given abbreviation.
A string such as "word" contains only the following valid abbreviations:

["word", "1ord", "w1rd", "wo1d", "wor1", "2rd", "w2d", "wo2", "1o1d", "1or1", 
"w1r1", "1o2", "2r1", "3d", "w3", "4"]

Notice that only the above abbreviations are valid abbreviations of the string 
"word" . Any other string is not a valid abbreviation of "word" .

Note: Assume s contains only lowercase letters and abbr contains only lowercase 
letters and digits.

Example 1:
Given s = "internationalization", abbr = "i12iz4n":
Return true.

Example 2:
Given s = "apple", abbr = "a2e":
Return false.
*/


import java.util.*;

public class ValidWordAbbreviation{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String s1 = sc.next();
        String s2 = sc.next();
        
        int n1 = s1.length();
        int n2 = s2.length();
        int i = 0, j = 0;
        boolean f = true;
        if(n1 == 0 && n2 == 0){
            System.out.println(true);
        }else{
        
        while (i < n1 && j < n2) {
            if (s1.charAt(i) == s2.charAt(j)) {
                i++;
                j++;
            } else {
                if (Character.isDigit(s2.charAt(j))) {
                    StringBuilder str = new StringBuilder();
                    while (j < n2 && Character.isDigit(s2.charAt(j))) {
                        if(str.length() == 0 && s2.charAt(j) == '0'){
                            f = false;
                            break;
                        }
                        str.append(s2.charAt(j));
                        j++;
                    }if(!f)break;
                    int n = Integer.parseInt(str.toString());
                    // j += n;
                    i += n;
                } else {
                    f = false;
                    break;
                }
            }if(!f)break;
        }
        
        if (!f) {
            System.out.println(false);
        } else {
            System.out.println(true);
        }
        }
        sc.close();
    }
}

/*
Valid Word Abbreviation

Given a non-empty string s and an abbreviation abbr , return whether the string 
matches with the given abbreviation.
A string such as "word" contains only the following valid abbreviations:

["word", "1ord", "w1rd", "wo1d", "wor1", "2rd", "w2d", "wo2", "1o1d", "1or1", 
"w1r1", "1o2", "2r1", "3d", "w3", "4"]

Notice that only the above abbreviations are valid abbreviations of the string 
"word" . Any other string is not a valid abbreviation of "word" .

Note: Assume s contains only lowercase letters and abbr contains only lowercase 
letters and digits.

Example 1:
Given s = "internationalization", abbr = "i12iz4n":
Return true.

Example 2:
Given s = "apple", abbr = "a2e":
Return false.
*/


import java.util.*;

public class ValidWordAbbreviation{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String s1 = sc.next();
        String s2 = sc.next();
        
        int n1 = s1.length();
        int n2 = s2.length();
        int i = 0, j = 0;
        boolean f = true;
        if(n1 == 0 && n2 == 0){
            System.out.println(true);
        }else{
        
        while (i < n1 && j < n2) {
            if (s1.charAt(i) == s2.charAt(j)) {
                i++;
                j++;
            } else {
                if (Character.isDigit(s2.charAt(j))) {
                    StringBuilder str = new StringBuilder();
                    while (j < n2 && Character.isDigit(s2.charAt(j))) {
                        if(str.length() == 0 && s2.charAt(j) == '0'){
                            f = false;
                            break;
                        }
                        str.append(s2.charAt(j));
                        j++;
                    }if(!f)break;
                    int n = Integer.parseInt(str.toString());
                    // j += n;
                    i += n;
                } else {
                    f = false;
                    break;
                }
            }if(!f)break;
        }
        
        if (!f) {
            System.out.println(false);
        } else {
            System.out.println(true);
        }
        }
        sc.close();
    }
}

/*
Valid Word Abbreviation

Given a non-empty string s and an abbreviation abbr , return whether the string 
matches with the given abbreviation.
A string such as "word" contains only the following valid abbreviations:

["word", "1ord", "w1rd", "wo1d", "wor1", "2rd", "w2d", "wo2", "1o1d", "1or1", 
"w1r1", "1o2", "2r1", "3d", "w3", "4"]

Notice that only the above abbreviations are valid abbreviations of the string 
"word" . Any other string is not a valid abbreviation of "word" .

Note: Assume s contains only lowercase letters and abbr contains only lowercase 
letters and digits.

Example 1:
Given s = "internationalization", abbr = "i12iz4n":
Return true.

Example 2:
Given s = "apple", abbr = "a2e":
Return false.
*/


import java.util.*;

public class ValidWordAbbreviation{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String s1 = sc.next();
        String s2 = sc.next();
        
        int n1 = s1.length();
        int n2 = s2.length();
        int i = 0, j = 0;
        boolean f = true;
        if(n1 == 0 && n2 == 0){
            System.out.println(true);
        }else{
        
        while (i < n1 && j < n2) {
            if (s1.charAt(i) == s2.charAt(j)) {
                i++;
                j++;
            } else {
                if (Character.isDigit(s2.charAt(j))) {
                    StringBuilder str = new StringBuilder();
                    while (j < n2 && Character.isDigit(s2.charAt(j))) {
                        if(str.length() == 0 && s2.charAt(j) == '0'){
                            f = false;
                            break;
                        }
                        str.append(s2.charAt(j));
                        j++;
                    }if(!f)break;
                    int n = Integer.parseInt(str.toString());
                    // j += n;
                    i += n;
                } else {
                    f = false;
                    break;
                }
            }if(!f)break;
        }
        
        if (!f) {
            System.out.println(false);
        } else {
            System.out.println(true);
        }
        }
        sc.close();
    }
}

/*
Valid Word Abbreviation

Given a non-empty string s and an abbreviation abbr , return whether the string 
matches with the given abbreviation.
A string such as "word" contains only the following valid abbreviations:

["word", "1ord", "w1rd", "wo1d", "wor1", "2rd", "w2d", "wo2", "1o1d", "1or1", 
"w1r1", "1o2", "2r1", "3d", "w3", "4"]

Notice that only the above abbreviations are valid abbreviations of the string 
"word" . Any other string is not a valid abbreviation of "word" .

Note: Assume s contains only lowercase letters and abbr contains only lowercase 
letters and digits.

Example 1:
Given s = "internationalization", abbr = "i12iz4n":
Return true.

Example 2:
Given s = "apple", abbr = "a2e":
Return false.
*/


import java.util.*;

public class ValidWordAbbreviation{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String s1 = sc.next();
        String s2 = sc.next();
        
        int n1 = s1.length();
        int n2 = s2.length();
        int i = 0, j = 0;
        boolean f = true;
        if(n1 == 0 && n2 == 0){
            System.out.println(true);
        }else{
        
        while (i < n1 && j < n2) {
            if (s1.charAt(i) == s2.charAt(j)) {
                i++;
                j++;
            } else {
                if (Character.isDigit(s2.charAt(j))) {
                    StringBuilder str = new StringBuilder();
                    while (j < n2 && Character.isDigit(s2.charAt(j))) {
                        if(str.length() == 0 && s2.charAt(j) == '0'){
                            f = false;
                            break;
                        }
                        str.append(s2.charAt(j));
                        j++;
                    }if(!f)break;
                    int n = Integer.parseInt(str.toString());
                    // j += n;
                    i += n;
                } else {
                    f = false;
                    break;
                }
            }if(!f)break;
        }
        
        if (!f) {
            System.out.println(false);
        } else {
            System.out.println(true);
        }
        }
        sc.close();
    }
}

/*
Valid Word Abbreviation

Given a non-empty string s and an abbreviation abbr , return whether the string 
matches with the given abbreviation.
A string such as "word" contains only the following valid abbreviations:

["word", "1ord", "w1rd", "wo1d", "wor1", "2rd", "w2d", "wo2", "1o1d", "1or1", 
"w1r1", "1o2", "2r1", "3d", "w3", "4"]

Notice that only the above abbreviations are valid abbreviations of the string 
"word" . Any other string is not a valid abbreviation of "word" .

Note: Assume s contains only lowercase letters and abbr contains only lowercase 
letters and digits.

Example 1:
Given s = "internationalization", abbr = "i12iz4n":
Return true.

Example 2:
Given s = "apple", abbr = "a2e":
Return false.
*/


import java.util.*;

public class ValidWordAbbreviation{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String s1 = sc.next();
        String s2 = sc.next();
        
        int n1 = s1.length();
        int n2 = s2.length();
        int i = 0, j = 0;
        boolean f = true;
        if(n1 == 0 && n2 == 0){
            System.out.println(true);
        }else{
        
        while (i < n1 && j < n2) {
            if (s1.charAt(i) == s2.charAt(j)) {
                i++;
                j++;
            } else {
                if (Character.isDigit(s2.charAt(j))) {
                    StringBuilder str = new StringBuilder();
                    while (j < n2 && Character.isDigit(s2.charAt(j))) {
                        if(str.length() == 0 && s2.charAt(j) == '0'){
                            f = false;
                            break;
                        }
                        str.append(s2.charAt(j));
                        j++;
                    }if(!f)break;
                    int n = Integer.parseInt(str.toString());
                    // j += n;
                    i += n;
                } else {
                    f = false;
                    break;
                }
            }if(!f)break;
        }
        
        if (!f) {
            System.out.println(false);
        } else {
            System.out.println(true);
        }
        }
        sc.close();
    }
}

/*
Valid Word Abbreviation

Given a non-empty string s and an abbreviation abbr , return whether the string 
matches with the given abbreviation.
A string such as "word" contains only the following valid abbreviations:

["word", "1ord", "w1rd", "wo1d", "wor1", "2rd", "w2d", "wo2", "1o1d", "1or1", 
"w1r1", "1o2", "2r1", "3d", "w3", "4"]

Notice that only the above abbreviations are valid abbreviations of the string 
"word" . Any other string is not a valid abbreviation of "word" .

Note: Assume s contains only lowercase letters and abbr contains only lowercase 
letters and digits.

Example 1:
Given s = "internationalization", abbr = "i12iz4n":
Return true.

Example 2:
Given s = "apple", abbr = "a2e":
Return false.
*/


import java.util.*;

public class ValidWordAbbreviation{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String s1 = sc.next();
        String s2 = sc.next();
        
        int n1 = s1.length();
        int n2 = s2.length();
        int i = 0, j = 0;
        boolean f = true;
        if(n1 == 0 && n2 == 0){
            System.out.println(true);
        }else{
        
        while (i < n1 && j < n2) {
            if (s1.charAt(i) == s2.charAt(j)) {
                i++;
                j++;
            } else {
                if (Character.isDigit(s2.charAt(j))) {
                    StringBuilder str = new StringBuilder();
                    while (j < n2 && Character.isDigit(s2.charAt(j))) {
                        if(str.length() == 0 && s2.charAt(j) == '0'){
                            f = false;
                            break;
                        }
                        str.append(s2.charAt(j));
                        j++;
                    }if(!f)break;
                    int n = Integer.parseInt(str.toString());
                    // j += n;
                    i += n;
                } else {
                    f = false;
                    break;
                }
            }if(!f)break;
        }
        
        if (!f) {
            System.out.println(false);
        } else {
            System.out.println(true);
        }
        }
        sc.close();
    }
}

/*
Valid Word Abbreviation

Given a non-empty string s and an abbreviation abbr , return whether the string 
matches with the given abbreviation.
A string such as "word" contains only the following valid abbreviations:

["word", "1ord", "w1rd", "wo1d", "wor1", "2rd", "w2d", "wo2", "1o1d", "1or1", 
"w1r1", "1o2", "2r1", "3d", "w3", "4"]

Notice that only the above abbreviations are valid abbreviations of the string 
"word" . Any other string is not a valid abbreviation of "word" .

Note: Assume s contains only lowercase letters and abbr contains only lowercase 
letters and digits.

Example 1:
Given s = "internationalization", abbr = "i12iz4n":
Return true.

Example 2:
Given s = "apple", abbr = "a2e":
Return false.
*/


import java.util.*;

public class ValidWordAbbreviation{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String s1 = sc.next();
        String s2 = sc.next();
        
        int n1 = s1.length();
        int n2 = s2.length();
        int i = 0, j = 0;
        boolean f = true;
        if(n1 == 0 && n2 == 0){
            System.out.println(true);
        }else{
        
        while (i < n1 && j < n2) {
            if (s1.charAt(i) == s2.charAt(j)) {
                i++;
                j++;
            } else {
                if (Character.isDigit(s2.charAt(j))) {
                    StringBuilder str = new StringBuilder();
                    while (j < n2 && Character.isDigit(s2.charAt(j))) {
                        if(str.length() == 0 && s2.charAt(j) == '0'){
                            f = false;
                            break;
                        }
                        str.append(s2.charAt(j));
                        j++;
                    }if(!f)break;
                    int n = Integer.parseInt(str.toString());
                    // j += n;
                    i += n;
                } else {
                    f = false;
                    break;
                }
            }if(!f)break;
        }
        
        if (!f) {
            System.out.println(false);
        } else {
            System.out.println(true);
        }
        }
        sc.close();
    }
}

/*
Valid Word Abbreviation

Given a non-empty string s and an abbreviation abbr , return whether the string 
matches with the given abbreviation.
A string such as "word" contains only the following valid abbreviations:

["word", "1ord", "w1rd", "wo1d", "wor1", "2rd", "w2d", "wo2", "1o1d", "1or1", 
"w1r1", "1o2", "2r1", "3d", "w3", "4"]

Notice that only the above abbreviations are valid abbreviations of the string 
"word" . Any other string is not a valid abbreviation of "word" .

Note: Assume s contains only lowercase letters and abbr contains only lowercase 
letters and digits.

Example 1:
Given s = "internationalization", abbr = "i12iz4n":
Return true.

Example 2:
Given s = "apple", abbr = "a2e":
Return false.
*/


import java.util.*;

public class ValidWordAbbreviation{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String s1 = sc.next();
        String s2 = sc.next();
        
        int n1 = s1.length();
        int n2 = s2.length();
        int i = 0, j = 0;
        boolean f = true;
        if(n1 == 0 && n2 == 0){
            System.out.println(true);
        }else{
        
        while (i < n1 && j < n2) {
            if (s1.charAt(i) == s2.charAt(j)) {
                i++;
                j++;
            } else {
                if (Character.isDigit(s2.charAt(j))) {
                    StringBuilder str = new StringBuilder();
                    while (j < n2 && Character.isDigit(s2.charAt(j))) {
                        if(str.length() == 0 && s2.charAt(j) == '0'){
                            f = false;
                            break;
                        }
                        str.append(s2.charAt(j));
                        j++;
                    }if(!f)break;
                    int n = Integer.parseInt(str.toString());
                    // j += n;
                    i += n;
                } else {
                    f = false;
                    break;
                }
            }if(!f)break;
        }
        
        if (!f) {
            System.out.println(false);
        } else {
            System.out.println(true);
        }
        }
        sc.close();
    }
}

/*
Valid Word Abbreviation

Given a non-empty string s and an abbreviation abbr , return whether the string 
matches with the given abbreviation.
A string such as "word" contains only the following valid abbreviations:

["word", "1ord", "w1rd", "wo1d", "wor1", "2rd", "w2d", "wo2", "1o1d", "1or1", 
"w1r1", "1o2", "2r1", "3d", "w3", "4"]

Notice that only the above abbreviations are valid abbreviations of the string 
"word" . Any other string is not a valid abbreviation of "word" .

Note: Assume s contains only lowercase letters and abbr contains only lowercase 
letters and digits.

Example 1:
Given s = "internationalization", abbr = "i12iz4n":
Return true.

Example 2:
Given s = "apple", abbr = "a2e":
Return false.
*/


import java.util.*;

public class ValidWordAbbreviation{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String s1 = sc.next();
        String s2 = sc.next();
        
        int n1 = s1.length();
        int n2 = s2.length();
        int i = 0, j = 0;
        boolean f = true;
        if(n1 == 0 && n2 == 0){
            System.out.println(true);
        }else{
        
        while (i < n1 && j < n2) {
            if (s1.charAt(i) == s2.charAt(j)) {
                i++;
                j++;
            } else {
                if (Character.isDigit(s2.charAt(j))) {
                    StringBuilder str = new StringBuilder();
                    while (j < n2 && Character.isDigit(s2.charAt(j))) {
                        if(str.length() == 0 && s2.charAt(j) == '0'){
                            f = false;
                            break;
                        }
                        str.append(s2.charAt(j));
                        j++;
                    }if(!f)break;
                    int n = Integer.parseInt(str.toString());
                    // j += n;
                    i += n;
                } else {
                    f = false;
                    break;
                }
            }if(!f)break;
        }
        
        if (!f) {
            System.out.println(false);
        } else {
            System.out.println(true);
        }
        }
        sc.close();
    }
}

/*
Valid Word Abbreviation

Given a non-empty string s and an abbreviation abbr , return whether the string 
matches with the given abbreviation.
A string such as "word" contains only the following valid abbreviations:

["word", "1ord", "w1rd", "wo1d", "wor1", "2rd", "w2d", "wo2", "1o1d", "1or1", 
"w1r1", "1o2", "2r1", "3d", "w3", "4"]

Notice that only the above abbreviations are valid abbreviations of the string 
"word" . Any other string is not a valid abbreviation of "word" .

Note: Assume s contains only lowercase letters and abbr contains only lowercase 
letters and digits.

Example 1:
Given s = "internationalization", abbr = "i12iz4n":
Return true.

Example 2:
Given s = "apple", abbr = "a2e":
Return false.
*/


import java.util.*;

public class ValidWordAbbreviation{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String s1 = sc.next();
        String s2 = sc.next();
        
        int n1 = s1.length();
        int n2 = s2.length();
        int i = 0, j = 0;
        boolean f = true;
        if(n1 == 0 && n2 == 0){
            System.out.println(true);
        }else{
        
        while (i < n1 && j < n2) {
            if (s1.charAt(i) == s2.charAt(j)) {
                i++;
                j++;
            } else {
                if (Character.isDigit(s2.charAt(j))) {
                    StringBuilder str = new StringBuilder();
                    while (j < n2 && Character.isDigit(s2.charAt(j))) {
                        if(str.length() == 0 && s2.charAt(j) == '0'){
                            f = false;
                            break;
                        }
                        str.append(s2.charAt(j));
                        j++;
                    }if(!f)break;
                    int n = Integer.parseInt(str.toString());
                    // j += n;
                    i += n;
                } else {
                    f = false;
                    break;
                }
            }if(!f)break;
        }
        
        if (!f) {
            System.out.println(false);
        } else {
            System.out.println(true);
        }
        }
        sc.close();
    }
}

/*
Valid Word Abbreviation

Given a non-empty string s and an abbreviation abbr , return whether the string 
matches with the given abbreviation.
A string such as "word" contains only the following valid abbreviations:

["word", "1ord", "w1rd", "wo1d", "wor1", "2rd", "w2d", "wo2", "1o1d", "1or1", 
"w1r1", "1o2", "2r1", "3d", "w3", "4"]

Notice that only the above abbreviations are valid abbreviations of the string 
"word" . Any other string is not a valid abbreviation of "word" .

Note: Assume s contains only lowercase letters and abbr contains only lowercase 
letters and digits.

Example 1:
Given s = "internationalization", abbr = "i12iz4n":
Return true.

Example 2:
Given s = "apple", abbr = "a2e":
Return false.
*/


import java.util.*;

public class ValidWordAbbreviation{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String s1 = sc.next();
        String s2 = sc.next();
        
        int n1 = s1.length();
        int n2 = s2.length();
        int i = 0, j = 0;
        boolean f = true;
        if(n1 == 0 && n2 == 0){
            System.out.println(true);
        }else{
        
        while (i < n1 && j < n2) {
            if (s1.charAt(i) == s2.charAt(j)) {
                i++;
                j++;
            } else {
                if (Character.isDigit(s2.charAt(j))) {
                    StringBuilder str = new StringBuilder();
                    while (j < n2 && Character.isDigit(s2.charAt(j))) {
                        if(str.length() == 0 && s2.charAt(j) == '0'){
                            f = false;
                            break;
                        }
                        str.append(s2.charAt(j));
                        j++;
                    }if(!f)break;
                    int n = Integer.parseInt(str.toString());
                    // j += n;
                    i += n;
                } else {
                    f = false;
                    break;
                }
            }if(!f)break;
        }
        
        if (!f) {
            System.out.println(false);
        } else {
            System.out.println(true);
        }
        }
        sc.close();
    }
}

/*
Valid Word Abbreviation

Given a non-empty string s and an abbreviation abbr , return whether the string 
matches with the given abbreviation.
A string such as "word" contains only the following valid abbreviations:

["word", "1ord", "w1rd", "wo1d", "wor1", "2rd", "w2d", "wo2", "1o1d", "1or1", 
"w1r1", "1o2", "2r1", "3d", "w3", "4"]

Notice that only the above abbreviations are valid abbreviations of the string 
"word" . Any other string is not a valid abbreviation of "word" .

Note: Assume s contains only lowercase letters and abbr contains only lowercase 
letters and digits.

Example 1:
Given s = "internationalization", abbr = "i12iz4n":
Return true.

Example 2:
Given s = "apple", abbr = "a2e":
Return false.
*/


import java.util.*;

public class ValidWordAbbreviation{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String s1 = sc.next();
        String s2 = sc.next();
        
        int n1 = s1.length();
        int n2 = s2.length();
        int i = 0, j = 0;
        boolean f = true;
        if(n1 == 0 && n2 == 0){
            System.out.println(true);
        }else{
        
        while (i < n1 && j < n2) {
            if (s1.charAt(i) == s2.charAt(j)) {
                i++;
                j++;
            } else {
                if (Character.isDigit(s2.charAt(j))) {
                    StringBuilder str = new StringBuilder();
                    while (j < n2 && Character.isDigit(s2.charAt(j))) {
                        if(str.length() == 0 && s2.charAt(j) == '0'){
                            f = false;
                            break;
                        }
                        str.append(s2.charAt(j));
                        j++;
                    }if(!f)break;
                    int n = Integer.parseInt(str.toString());
                    // j += n;
                    i += n;
                } else {
                    f = false;
                    break;
                }
            }if(!f)break;
        }
        
        if (!f) {
            System.out.println(false);
        } else {
            System.out.println(true);
        }
        }
        sc.close();
    }
}

/*
Valid Word Abbreviation

Given a non-empty string s and an abbreviation abbr , return whether the string 
matches with the given abbreviation.
A string such as "word" contains only the following valid abbreviations:

["word", "1ord", "w1rd", "wo1d", "wor1", "2rd", "w2d", "wo2", "1o1d", "1or1", 
"w1r1", "1o2", "2r1", "3d", "w3", "4"]

Notice that only the above abbreviations are valid abbreviations of the string 
"word" . Any other string is not a valid abbreviation of "word" .

Note: Assume s contains only lowercase letters and abbr contains only lowercase 
letters and digits.

Example 1:
Given s = "internationalization", abbr = "i12iz4n":
Return true.

Example 2:
Given s = "apple", abbr = "a2e":
Return false.
*/


import java.util.*;

public class ValidWordAbbreviation{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String s1 = sc.next();
        String s2 = sc.next();
        
        int n1 = s1.length();
        int n2 = s2.length();
        int i = 0, j = 0;
        boolean f = true;
        if(n1 == 0 && n2 == 0){
            System.out.println(true);
        }else{
        
        while (i < n1 && j < n2) {
            if (s1.charAt(i) == s2.charAt(j)) {
                i++;
                j++;
            } else {
                if (Character.isDigit(s2.charAt(j))) {
                    StringBuilder str = new StringBuilder();
                    while (j < n2 && Character.isDigit(s2.charAt(j))) {
                        if(str.length() == 0 && s2.charAt(j) == '0'){
                            f = false;
                            break;
                        }
                        str.append(s2.charAt(j));
                        j++;
                    }if(!f)break;
                    int n = Integer.parseInt(str.toString());
                    // j += n;
                    i += n;
                } else {
                    f = false;
                    break;
                }
            }if(!f)break;
        }
        
        if (!f) {
            System.out.println(false);
        } else {
            System.out.println(true);
        }
        }
        sc.close();
    }
}

/*
Valid Word Abbreviation

Given a non-empty string s and an abbreviation abbr , return whether the string 
matches with the given abbreviation.
A string such as "word" contains only the following valid abbreviations:

["word", "1ord", "w1rd", "wo1d", "wor1", "2rd", "w2d", "wo2", "1o1d", "1or1", 
"w1r1", "1o2", "2r1", "3d", "w3", "4"]

Notice that only the above abbreviations are valid abbreviations of the string 
"word" . Any other string is not a valid abbreviation of "word" .

Note: Assume s contains only lowercase letters and abbr contains only lowercase 
letters and digits.

Example 1:
Given s = "internationalization", abbr = "i12iz4n":
Return true.

Example 2:
Given s = "apple", abbr = "a2e":
Return false.
*/


import java.util.*;

public class ValidWordAbbreviation{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String s1 = sc.next();
        String s2 = sc.next();
        
        int n1 = s1.length();
        int n2 = s2.length();
        int i = 0, j = 0;
        boolean f = true;
        if(n1 == 0 && n2 == 0){
            System.out.println(true);
        }else{
        
        while (i < n1 && j < n2) {
            if (s1.charAt(i) == s2.charAt(j)) {
                i++;
                j++;
            } else {
                if (Character.isDigit(s2.charAt(j))) {
                    StringBuilder str = new StringBuilder();
                    while (j < n2 && Character.isDigit(s2.charAt(j))) {
                        if(str.length() == 0 && s2.charAt(j) == '0'){
                            f = false;
                            break;
                        }
                        str.append(s2.charAt(j));
                        j++;
                    }if(!f)break;
                    int n = Integer.parseInt(str.toString());
                    // j += n;
                    i += n;
                } else {
                    f = false;
                    break;
                }
            }if(!f)break;
        }
        
        if (!f) {
            System.out.println(false);
        } else {
            System.out.println(true);
        }
        }
        sc.close();
    }
}

/*
Valid Word Abbreviation

Given a non-empty string s and an abbreviation abbr , return whether the string 
matches with the given abbreviation.
A string such as "word" contains only the following valid abbreviations:

["word", "1ord", "w1rd", "wo1d", "wor1", "2rd", "w2d", "wo2", "1o1d", "1or1", 
"w1r1", "1o2", "2r1", "3d", "w3", "4"]

Notice that only the above abbreviations are valid abbreviations of the string 
"word" . Any other string is not a valid abbreviation of "word" .

Note: Assume s contains only lowercase letters and abbr contains only lowercase 
letters and digits.

Example 1:
Given s = "internationalization", abbr = "i12iz4n":
Return true.

Example 2:
Given s = "apple", abbr = "a2e":
Return false.
*/


import java.util.*;

public class ValidWordAbbreviation{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String s1 = sc.next();
        String s2 = sc.next();
        
        int n1 = s1.length();
        int n2 = s2.length();
        int i = 0, j = 0;
        boolean f = true;
        if(n1 == 0 && n2 == 0){
            System.out.println(true);
        }else{
        
        while (i < n1 && j < n2) {
            if (s1.charAt(i) == s2.charAt(j)) {
                i++;
                j++;
            } else {
                if (Character.isDigit(s2.charAt(j))) {
                    StringBuilder str = new StringBuilder();
                    while (j < n2 && Character.isDigit(s2.charAt(j))) {
                        if(str.length() == 0 && s2.charAt(j) == '0'){
                            f = false;
                            break;
                        }
                        str.append(s2.charAt(j));
                        j++;
                    }if(!f)break;
                    int n = Integer.parseInt(str.toString());
                    // j += n;
                    i += n;
                } else {
                    f = false;
                    break;
                }
            }if(!f)break;
        }
        
        if (!f) {
            System.out.println(false);
        } else {
            System.out.println(true);
        }
        }
        sc.close();
    }
}

/*
Valid Word Abbreviation

Given a non-empty string s and an abbreviation abbr , return whether the string 
matches with the given abbreviation.
A string such as "word" contains only the following valid abbreviations:

["word", "1ord", "w1rd", "wo1d", "wor1", "2rd", "w2d", "wo2", "1o1d", "1or1", 
"w1r1", "1o2", "2r1", "3d", "w3", "4"]

Notice that only the above abbreviations are valid abbreviations of the string 
"word" . Any other string is not a valid abbreviation of "word" .

Note: Assume s contains only lowercase letters and abbr contains only lowercase 
letters and digits.

Example 1:
Given s = "internationalization", abbr = "i12iz4n":
Return true.

Example 2:
Given s = "apple", abbr = "a2e":
Return false.
*/


import java.util.*;

public class ValidWordAbbreviation{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String s1 = sc.next();
        String s2 = sc.next();
        
        int n1 = s1.length();
        int n2 = s2.length();
        int i = 0, j = 0;
        boolean f = true;
        if(n1 == 0 && n2 == 0){
            System.out.println(true);
        }else{
        
        while (i < n1 && j < n2) {
            if (s1.charAt(i) == s2.charAt(j)) {
                i++;
                j++;
            } else {
                if (Character.isDigit(s2.charAt(j))) {
                    StringBuilder str = new StringBuilder();
                    while (j < n2 && Character.isDigit(s2.charAt(j))) {
                        if(str.length() == 0 && s2.charAt(j) == '0'){
                            f = false;
                            break;
                        }
                        str.append(s2.charAt(j));
                        j++;
                    }if(!f)break;
                    int n = Integer.parseInt(str.toString());
                    // j += n;
                    i += n;
                } else {
                    f = false;
                    break;
                }
            }if(!f)break;
        }
        
        if (!f) {
            System.out.println(false);
        } else {
            System.out.println(true);
        }
        }
        sc.close();
    }
}

/*
Valid Word Abbreviation

Given a non-empty string s and an abbreviation abbr , return whether the string 
matches with the given abbreviation.
A string such as "word" contains only the following valid abbreviations:

["word", "1ord", "w1rd", "wo1d", "wor1", "2rd", "w2d", "wo2", "1o1d", "1or1", 
"w1r1", "1o2", "2r1", "3d", "w3", "4"]

Notice that only the above abbreviations are valid abbreviations of the string 
"word" . Any other string is not a valid abbreviation of "word" .

Note: Assume s contains only lowercase letters and abbr contains only lowercase 
letters and digits.

Example 1:
Given s = "internationalization", abbr = "i12iz4n":
Return true.

Example 2:
Given s = "apple", abbr = "a2e":
Return false.
*/


import java.util.*;

public class ValidWordAbbreviation{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String s1 = sc.next();
        String s2 = sc.next();
        
        int n1 = s1.length();
        int n2 = s2.length();
        int i = 0, j = 0;
        boolean f = true;
        if(n1 == 0 && n2 == 0){
            System.out.println(true);
        }else{
        
        while (i < n1 && j < n2) {
            if (s1.charAt(i) == s2.charAt(j)) {
                i++;
                j++;
            } else {
                if (Character.isDigit(s2.charAt(j))) {
                    StringBuilder str = new StringBuilder();
                    while (j < n2 && Character.isDigit(s2.charAt(j))) {
                        if(str.length() == 0 && s2.charAt(j) == '0'){
                            f = false;
                            break;
                        }
                        str.append(s2.charAt(j));
                        j++;
                    }if(!f)break;
                    int n = Integer.parseInt(str.toString());
                    // j += n;
                    i += n;
                } else {
                    f = false;
                    break;
                }
            }if(!f)break;
        }
        
        if (!f) {
            System.out.println(false);
        } else {
            System.out.println(true);
        }
        }
        sc.close();
    }
}

/*
Valid Word Abbreviation

Given a non-empty string s and an abbreviation abbr , return whether the string 
matches with the given abbreviation.
A string such as "word" contains only the following valid abbreviations:

["word", "1ord", "w1rd", "wo1d", "wor1", "2rd", "w2d", "wo2", "1o1d", "1or1", 
"w1r1", "1o2", "2r1", "3d", "w3", "4"]

Notice that only the above abbreviations are valid abbreviations of the string 
"word" . Any other string is not a valid abbreviation of "word" .

Note: Assume s contains only lowercase letters and abbr contains only lowercase 
letters and digits.

Example 1:
Given s = "internationalization", abbr = "i12iz4n":
Return true.

Example 2:
Given s = "apple", abbr = "a2e":
Return false.
*/


import java.util.*;

public class ValidWordAbbreviation{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String s1 = sc.next();
        String s2 = sc.next();
        
        int n1 = s1.length();
        int n2 = s2.length();
        int i = 0, j = 0;
        boolean f = true;
        if(n1 == 0 && n2 == 0){
            System.out.println(true);
        }else{
        
        while (i < n1 && j < n2) {
            if (s1.charAt(i) == s2.charAt(j)) {
                i++;
                j++;
            } else {
                if (Character.isDigit(s2.charAt(j))) {
                    StringBuilder str = new StringBuilder();
                    while (j < n2 && Character.isDigit(s2.charAt(j))) {
                        if(str.length() == 0 && s2.charAt(j) == '0'){
                            f = false;
                            break;
                        }
                        str.append(s2.charAt(j));
                        j++;
                    }if(!f)break;
                    int n = Integer.parseInt(str.toString());
                    // j += n;
                    i += n;
                } else {
                    f = false;
                    break;
                }
            }if(!f)break;
        }
        
        if (!f) {
            System.out.println(false);
        } else {
            System.out.println(true);
        }
        }
        sc.close();
    }
}

/*
Valid Word Abbreviation

Given a non-empty string s and an abbreviation abbr , return whether the string 
matches with the given abbreviation.
A string such as "word" contains only the following valid abbreviations:

["word", "1ord", "w1rd", "wo1d", "wor1", "2rd", "w2d", "wo2", "1o1d", "1or1", 
"w1r1", "1o2", "2r1", "3d", "w3", "4"]

Notice that only the above abbreviations are valid abbreviations of the string 
"word" . Any other string is not a valid abbreviation of "word" .

Note: Assume s contains only lowercase letters and abbr contains only lowercase 
letters and digits.

Example 1:
Given s = "internationalization", abbr = "i12iz4n":
Return true.

Example 2:
Given s = "apple", abbr = "a2e":
Return false.
*/


import java.util.*;

public class ValidWordAbbreviation{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String s1 = sc.next();
        String s2 = sc.next();
        
        int n1 = s1.length();
        int n2 = s2.length();
        int i = 0, j = 0;
        boolean f = true;
        if(n1 == 0 && n2 == 0){
            System.out.println(true);
        }else{
        
        while (i < n1 && j < n2) {
            if (s1.charAt(i) == s2.charAt(j)) {
                i++;
                j++;
            } else {
                if (Character.isDigit(s2.charAt(j))) {
                    StringBuilder str = new StringBuilder();
                    while (j < n2 && Character.isDigit(s2.charAt(j))) {
                        if(str.length() == 0 && s2.charAt(j) == '0'){
                            f = false;
                            break;
                        }
                        str.append(s2.charAt(j));
                        j++;
                    }if(!f)break;
                    int n = Integer.parseInt(str.toString());
                    // j += n;
                    i += n;
                } else {
                    f = false;
                    break;
                }
            }if(!f)break;
        }
        
        if (!f) {
            System.out.println(false);
        } else {
            System.out.println(true);
        }
        }
        sc.close();
    }
}

/*
Valid Word Abbreviation

Given a non-empty string s and an abbreviation abbr , return whether the string 
matches with the given abbreviation.
A string such as "word" contains only the following valid abbreviations:

["word", "1ord", "w1rd", "wo1d", "wor1", "2rd", "w2d", "wo2", "1o1d", "1or1", 
"w1r1", "1o2", "2r1", "3d", "w3", "4"]

Notice that only the above abbreviations are valid abbreviations of the string 
"word" . Any other string is not a valid abbreviation of "word" .

Note: Assume s contains only lowercase letters and abbr contains only lowercase 
letters and digits.

Example 1:
Given s = "internationalization", abbr = "i12iz4n":
Return true.

Example 2:
Given s = "apple", abbr = "a2e":
Return false.
*/


import java.util.*;

public class ValidWordAbbreviation{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String s1 = sc.next();
        String s2 = sc.next();
        
        int n1 = s1.length();
        int n2 = s2.length();
        int i = 0, j = 0;
        boolean f = true;
        if(n1 == 0 && n2 == 0){
            System.out.println(true);
        }else{
        
        while (i < n1 && j < n2) {
            if (s1.charAt(i) == s2.charAt(j)) {
                i++;
                j++;
            } else {
                if (Character.isDigit(s2.charAt(j))) {
                    StringBuilder str = new StringBuilder();
                    while (j < n2 && Character.isDigit(s2.charAt(j))) {
                        if(str.length() == 0 && s2.charAt(j) == '0'){
                            f = false;
                            break;
                        }
                        str.append(s2.charAt(j));
                        j++;
                    }if(!f)break;
                    int n = Integer.parseInt(str.toString());
                    // j += n;
                    i += n;
                } else {
                    f = false;
                    break;
                }
            }if(!f)break;
        }
        
        if (!f) {
            System.out.println(false);
        } else {
            System.out.println(true);
        }
        }
        sc.close();
    }
}

/*
Valid Word Abbreviation

Given a non-empty string s and an abbreviation abbr , return whether the string 
matches with the given abbreviation.
A string such as "word" contains only the following valid abbreviations:

["word", "1ord", "w1rd", "wo1d", "wor1", "2rd", "w2d", "wo2", "1o1d", "1or1", 
"w1r1", "1o2", "2r1", "3d", "w3", "4"]

Notice that only the above abbreviations are valid abbreviations of the string 
"word" . Any other string is not a valid abbreviation of "word" .

Note: Assume s contains only lowercase letters and abbr contains only lowercase 
letters and digits.

Example 1:
Given s = "internationalization", abbr = "i12iz4n":
Return true.

Example 2:
Given s = "apple", abbr = "a2e":
Return false.
*/


import java.util.*;

public class ValidWordAbbreviation{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String s1 = sc.next();
        String s2 = sc.next();
        
        int n1 = s1.length();
        int n2 = s2.length();
        int i = 0, j = 0;
        boolean f = true;
        if(n1 == 0 && n2 == 0){
            System.out.println(true);
        }else{
        
        while (i < n1 && j < n2) {
            if (s1.charAt(i) == s2.charAt(j)) {
                i++;
                j++;
            } else {
                if (Character.isDigit(s2.charAt(j))) {
                    StringBuilder str = new StringBuilder();
                    while (j < n2 && Character.isDigit(s2.charAt(j))) {
                        if(str.length() == 0 && s2.charAt(j) == '0'){
                            f = false;
                            break;
                        }
                        str.append(s2.charAt(j));
                        j++;
                    }if(!f)break;
                    int n = Integer.parseInt(str.toString());
                    // j += n;
                    i += n;
                } else {
                    f = false;
                    break;
                }
            }if(!f)break;
        }
        
        if (!f) {
            System.out.println(false);
        } else {
            System.out.println(true);
        }
        }
        sc.close();
    }
}

/*
Valid Word Abbreviation

Given a non-empty string s and an abbreviation abbr , return whether the string 
matches with the given abbreviation.
A string such as "word" contains only the following valid abbreviations:

["word", "1ord", "w1rd", "wo1d", "wor1", "2rd", "w2d", "wo2", "1o1d", "1or1", 
"w1r1", "1o2", "2r1", "3d", "w3", "4"]

Notice that only the above abbreviations are valid abbreviations of the string 
"word" . Any other string is not a valid abbreviation of "word" .

Note: Assume s contains only lowercase letters and abbr contains only lowercase 
letters and digits.

Example 1:
Given s = "internationalization", abbr = "i12iz4n":
Return true.

Example 2:
Given s = "apple", abbr = "a2e":
Return false.
*/


import java.util.*;

public class ValidWordAbbreviation{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String s1 = sc.next();
        String s2 = sc.next();
        
        int n1 = s1.length();
        int n2 = s2.length();
        int i = 0, j = 0;
        boolean f = true;
        if(n1 == 0 && n2 == 0){
            System.out.println(true);
        }else{
        
        while (i < n1 && j < n2) {
            if (s1.charAt(i) == s2.charAt(j)) {
                i++;
                j++;
            } else {
                if (Character.isDigit(s2.charAt(j))) {
                    StringBuilder str = new StringBuilder();
                    while (j < n2 && Character.isDigit(s2.charAt(j))) {
                        if(str.length() == 0 && s2.charAt(j) == '0'){
                            f = false;
                            break;
                        }
                        str.append(s2.charAt(j));
                        j++;
                    }if(!f)break;
                    int n = Integer.parseInt(str.toString());
                    // j += n;
                    i += n;
                } else {
                    f = false;
                    break;
                }
            }if(!f)break;
        }
        
        if (!f) {
            System.out.println(false);
        } else {
            System.out.println(true);
        }
        }
        sc.close();
    }
}

/*
Valid Word Abbreviation

Given a non-empty string s and an abbreviation abbr , return whether the string 
matches with the given abbreviation.
A string such as "word" contains only the following valid abbreviations:

["word", "1ord", "w1rd", "wo1d", "wor1", "2rd", "w2d", "wo2", "1o1d", "1or1", 
"w1r1", "1o2", "2r1", "3d", "w3", "4"]

Notice that only the above abbreviations are valid abbreviations of the string 
"word" . Any other string is not a valid abbreviation of "word" .

Note: Assume s contains only lowercase letters and abbr contains only lowercase 
letters and digits.

Example 1:
Given s = "internationalization", abbr = "i12iz4n":
Return true.

Example 2:
Given s = "apple", abbr = "a2e":
Return false.
*/


import java.util.*;

public class ValidWordAbbreviation{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String s1 = sc.next();
        String s2 = sc.next();
        
        int n1 = s1.length();
        int n2 = s2.length();
        int i = 0, j = 0;
        boolean f = true;
        if(n1 == 0 && n2 == 0){
            System.out.println(true);
        }else{
        
        while (i < n1 && j < n2) {
            if (s1.charAt(i) == s2.charAt(j)) {
                i++;
                j++;
            } else {
                if (Character.isDigit(s2.charAt(j))) {
                    StringBuilder str = new StringBuilder();
                    while (j < n2 && Character.isDigit(s2.charAt(j))) {
                        if(str.length() == 0 && s2.charAt(j) == '0'){
                            f = false;
                            break;
                        }
                        str.append(s2.charAt(j));
                        j++;
                    }if(!f)break;
                    int n = Integer.parseInt(str.toString());
                    // j += n;
                    i += n;
                } else {
                    f = false;
                    break;
                }
            }if(!f)break;
        }
        
        if (!f) {
            System.out.println(false);
        } else {
            System.out.println(true);
        }
        }
        sc.close();
    }
}

/*
Valid Word Abbreviation

Given a non-empty string s and an abbreviation abbr , return whether the string 
matches with the given abbreviation.
A string such as "word" contains only the following valid abbreviations:

["word", "1ord", "w1rd", "wo1d", "wor1", "2rd", "w2d", "wo2", "1o1d", "1or1", 
"w1r1", "1o2", "2r1", "3d", "w3", "4"]

Notice that only the above abbreviations are valid abbreviations of the string 
"word" . Any other string is not a valid abbreviation of "word" .

Note: Assume s contains only lowercase letters and abbr contains only lowercase 
letters and digits.

Example 1:
Given s = "internationalization", abbr = "i12iz4n":
Return true.

Example 2:
Given s = "apple", abbr = "a2e":
Return false.
*/


import java.util.*;

public class ValidWordAbbreviation{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String s1 = sc.next();
        String s2 = sc.next();
        
        int n1 = s1.length();
        int n2 = s2.length();
        int i = 0, j = 0;
        boolean f = true;
        if(n1 == 0 && n2 == 0){
            System.out.println(true);
        }else{
        
        while (i < n1 && j < n2) {
            if (s1.charAt(i) == s2.charAt(j)) {
                i++;
                j++;
            } else {
                if (Character.isDigit(s2.charAt(j))) {
                    StringBuilder str = new StringBuilder();
                    while (j < n2 && Character.isDigit(s2.charAt(j))) {
                        if(str.length() == 0 && s2.charAt(j) == '0'){
                            f = false;
                            break;
                        }
                        str.append(s2.charAt(j));
                        j++;
                    }if(!f)break;
                    int n = Integer.parseInt(str.toString());
                    // j += n;
                    i += n;
                } else {
                    f = false;
                    break;
                }
            }if(!f)break;
        }
        
        if (!f) {
            System.out.println(false);
        } else {
            System.out.println(true);
        }
        }
        sc.close();
    }
}

/*
Valid Word Abbreviation

Given a non-empty string s and an abbreviation abbr , return whether the string 
matches with the given abbreviation.
A string such as "word" contains only the following valid abbreviations:

["word", "1ord", "w1rd", "wo1d", "wor1", "2rd", "w2d", "wo2", "1o1d", "1or1", 
"w1r1", "1o2", "2r1", "3d", "w3", "4"]

Notice that only the above abbreviations are valid abbreviations of the string 
"word" . Any other string is not a valid abbreviation of "word" .

Note: Assume s contains only lowercase letters and abbr contains only lowercase 
letters and digits.

Example 1:
Given s = "internationalization", abbr = "i12iz4n":
Return true.

Example 2:
Given s = "apple", abbr = "a2e":
Return false.
*/


import java.util.*;

public class ValidWordAbbreviation{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String s1 = sc.next();
        String s2 = sc.next();
        
        int n1 = s1.length();
        int n2 = s2.length();
        int i = 0, j = 0;
        boolean f = true;
        if(n1 == 0 && n2 == 0){
            System.out.println(true);
        }else{
        
        while (i < n1 && j < n2) {
            if (s1.charAt(i) == s2.charAt(j)) {
                i++;
                j++;
            } else {
                if (Character.isDigit(s2.charAt(j))) {
                    StringBuilder str = new StringBuilder();
                    while (j < n2 && Character.isDigit(s2.charAt(j))) {
                        if(str.length() == 0 && s2.charAt(j) == '0'){
                            f = false;
                            break;
                        }
                        str.append(s2.charAt(j));
                        j++;
                    }if(!f)break;
                    int n = Integer.parseInt(str.toString());
                    // j += n;
                    i += n;
                } else {
                    f = false;
                    break;
                }
            }if(!f)break;
        }
        
        if (!f) {
            System.out.println(false);
        } else {
            System.out.println(true);
        }
        }
        sc.close();
    }
}

/*
Valid Word Abbreviation

Given a non-empty string s and an abbreviation abbr , return whether the string 
matches with the given abbreviation.
A string such as "word" contains only the following valid abbreviations:

["word", "1ord", "w1rd", "wo1d", "wor1", "2rd", "w2d", "wo2", "1o1d", "1or1", 
"w1r1", "1o2", "2r1", "3d", "w3", "4"]

Notice that only the above abbreviations are valid abbreviations of the string 
"word" . Any other string is not a valid abbreviation of "word" .

Note: Assume s contains only lowercase letters and abbr contains only lowercase 
letters and digits.

Example 1:
Given s = "internationalization", abbr = "i12iz4n":
Return true.

Example 2:
Given s = "apple", abbr = "a2e":
Return false.
*/


import java.util.*;

public class ValidWordAbbreviation{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String s1 = sc.next();
        String s2 = sc.next();
        
        int n1 = s1.length();
        int n2 = s2.length();
        int i = 0, j = 0;
        boolean f = true;
        if(n1 == 0 && n2 == 0){
            System.out.println(true);
        }else{
        
        while (i < n1 && j < n2) {
            if (s1.charAt(i) == s2.charAt(j)) {
                i++;
                j++;
            } else {
                if (Character.isDigit(s2.charAt(j))) {
                    StringBuilder str = new StringBuilder();
                    while (j < n2 && Character.isDigit(s2.charAt(j))) {
                        if(str.length() == 0 && s2.charAt(j) == '0'){
                            f = false;
                            break;
                        }
                        str.append(s2.charAt(j));
                        j++;
                    }if(!f)break;
                    int n = Integer.parseInt(str.toString());
                    // j += n;
                    i += n;
                } else {
                    f = false;
                    break;
                }
            }if(!f)break;
        }
        
        if (!f) {
            System.out.println(false);
        } else {
            System.out.println(true);
        }
        }
        sc.close();
    }
}

/*
Valid Word Abbreviation

Given a non-empty string s and an abbreviation abbr , return whether the string 
matches with the given abbreviation.
A string such as "word" contains only the following valid abbreviations:

["word", "1ord", "w1rd", "wo1d", "wor1", "2rd", "w2d", "wo2", "1o1d", "1or1", 
"w1r1", "1o2", "2r1", "3d", "w3", "4"]

Notice that only the above abbreviations are valid abbreviations of the string 
"word" . Any other string is not a valid abbreviation of "word" .

Note: Assume s contains only lowercase letters and abbr contains only lowercase 
letters and digits.

Example 1:
Given s = "internationalization", abbr = "i12iz4n":
Return true.

Example 2:
Given s = "apple", abbr = "a2e":
Return false.
*/


import java.util.*;

public class ValidWordAbbreviation{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String s1 = sc.next();
        String s2 = sc.next();
        
        int n1 = s1.length();
        int n2 = s2.length();
        int i = 0, j = 0;
        boolean f = true;
        if(n1 == 0 && n2 == 0){
            System.out.println(true);
        }else{
        
        while (i < n1 && j < n2) {
            if (s1.charAt(i) == s2.charAt(j)) {
                i++;
                j++;
            } else {
                if (Character.isDigit(s2.charAt(j))) {
                    StringBuilder str = new StringBuilder();
                    while (j < n2 && Character.isDigit(s2.charAt(j))) {
                        if(str.length() == 0 && s2.charAt(j) == '0'){
                            f = false;
                            break;
                        }
                        str.append(s2.charAt(j));
                        j++;
                    }if(!f)break;
                    int n = Integer.parseInt(str.toString());
                    // j += n;
                    i += n;
                } else {
                    f = false;
                    break;
                }
            }if(!f)break;
        }
        
        if (!f) {
            System.out.println(false);
        } else {
            System.out.println(true);
        }
        }
        sc.close();
    }
}

/*
Valid Word Abbreviation

Given a non-empty string s and an abbreviation abbr , return whether the string 
matches with the given abbreviation.
A string such as "word" contains only the following valid abbreviations:

["word", "1ord", "w1rd", "wo1d", "wor1", "2rd", "w2d", "wo2", "1o1d", "1or1", 
"w1r1", "1o2", "2r1", "3d", "w3", "4"]

Notice that only the above abbreviations are valid abbreviations of the string 
"word" . Any other string is not a valid abbreviation of "word" .

Note: Assume s contains only lowercase letters and abbr contains only lowercase 
letters and digits.

Example 1:
Given s = "internationalization", abbr = "i12iz4n":
Return true.

Example 2:
Given s = "apple", abbr = "a2e":
Return false.
*/


import java.util.*;

public class ValidWordAbbreviation{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String s1 = sc.next();
        String s2 = sc.next();
        
        int n1 = s1.length();
        int n2 = s2.length();
        int i = 0, j = 0;
        boolean f = true;
        if(n1 == 0 && n2 == 0){
            System.out.println(true);
        }else{
        
        while (i < n1 && j < n2) {
            if (s1.charAt(i) == s2.charAt(j)) {
                i++;
                j++;
            } else {
                if (Character.isDigit(s2.charAt(j))) {
                    StringBuilder str = new StringBuilder();
                    while (j < n2 && Character.isDigit(s2.charAt(j))) {
                        if(str.length() == 0 && s2.charAt(j) == '0'){
                            f = false;
                            break;
                        }
                        str.append(s2.charAt(j));
                        j++;
                    }if(!f)break;
                    int n = Integer.parseInt(str.toString());
                    // j += n;
                    i += n;
                } else {
                    f = false;
                    break;
                }
            }if(!f)break;
        }
        
        if (!f) {
            System.out.println(false);
        } else {
            System.out.println(true);
        }
        }
        sc.close();
    }
}

/*
Valid Word Abbreviation

Given a non-empty string s and an abbreviation abbr , return whether the string 
matches with the given abbreviation.
A string such as "word" contains only the following valid abbreviations:

["word", "1ord", "w1rd", "wo1d", "wor1", "2rd", "w2d", "wo2", "1o1d", "1or1", 
"w1r1", "1o2", "2r1", "3d", "w3", "4"]

Notice that only the above abbreviations are valid abbreviations of the string 
"word" . Any other string is not a valid abbreviation of "word" .

Note: Assume s contains only lowercase letters and abbr contains only lowercase 
letters and digits.

Example 1:
Given s = "internationalization", abbr = "i12iz4n":
Return true.

Example 2:
Given s = "apple", abbr = "a2e":
Return false.
*/


import java.util.*;

public class ValidWordAbbreviation{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String s1 = sc.next();
        String s2 = sc.next();
        
        int n1 = s1.length();
        int n2 = s2.length();
        int i = 0, j = 0;
        boolean f = true;
        if(n1 == 0 && n2 == 0){
            System.out.println(true);
        }else{
        
        while (i < n1 && j < n2) {
            if (s1.charAt(i) == s2.charAt(j)) {
                i++;
                j++;
            } else {
                if (Character.isDigit(s2.charAt(j))) {
                    StringBuilder str = new StringBuilder();
                    while (j < n2 && Character.isDigit(s2.charAt(j))) {
                        if(str.length() == 0 && s2.charAt(j) == '0'){
                            f = false;
                            break;
                        }
                        str.append(s2.charAt(j));
                        j++;
                    }if(!f)break;
                    int n = Integer.parseInt(str.toString());
                    // j += n;
                    i += n;
                } else {
                    f = false;
                    break;
                }
            }if(!f)break;
        }
        
        if (!f) {
            System.out.println(false);
        } else {
            System.out.println(true);
        }
        }
        sc.close();
    }
}

/*
Valid Word Abbreviation

Given a non-empty string s and an abbreviation abbr , return whether the string 
matches with the given abbreviation.
A string such as "word" contains only the following valid abbreviations:

["word", "1ord", "w1rd", "wo1d", "wor1", "2rd", "w2d", "wo2", "1o1d", "1or1", 
"w1r1", "1o2", "2r1", "3d", "w3", "4"]

Notice that only the above abbreviations are valid abbreviations of the string 
"word" . Any other string is not a valid abbreviation of "word" .

Note: Assume s contains only lowercase letters and abbr contains only lowercase 
letters and digits.

Example 1:
Given s = "internationalization", abbr = "i12iz4n":
Return true.

Example 2:
Given s = "apple", abbr = "a2e":
Return false.
*/


import java.util.*;

public class ValidWordAbbreviation{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String s1 = sc.next();
        String s2 = sc.next();
        
        int n1 = s1.length();
        int n2 = s2.length();
        int i = 0, j = 0;
        boolean f = true;
        if(n1 == 0 && n2 == 0){
            System.out.println(true);
        }else{
        
        while (i < n1 && j < n2) {
            if (s1.charAt(i) == s2.charAt(j)) {
                i++;
                j++;
            } else {
                if (Character.isDigit(s2.charAt(j))) {
                    StringBuilder str = new StringBuilder();
                    while (j < n2 && Character.isDigit(s2.charAt(j))) {
                        if(str.length() == 0 && s2.charAt(j) == '0'){
                            f = false;
                            break;
                        }
                        str.append(s2.charAt(j));
                        j++;
                    }if(!f)break;
                    int n = Integer.parseInt(str.toString());
                    // j += n;
                    i += n;
                } else {
                    f = false;
                    break;
                }
            }if(!f)break;
        }
        
        if (!f) {
            System.out.println(false);
        } else {
            System.out.println(true);
        }
        }
        sc.close();
    }
}

/*
Valid Word Abbreviation

Given a non-empty string s and an abbreviation abbr , return whether the string 
matches with the given abbreviation.
A string such as "word" contains only the following valid abbreviations:

["word", "1ord", "w1rd", "wo1d", "wor1", "2rd", "w2d", "wo2", "1o1d", "1or1", 
"w1r1", "1o2", "2r1", "3d", "w3", "4"]

Notice that only the above abbreviations are valid abbreviations of the string 
"word" . Any other string is not a valid abbreviation of "word" .

Note: Assume s contains only lowercase letters and abbr contains only lowercase 
letters and digits.

Example 1:
Given s = "internationalization", abbr = "i12iz4n":
Return true.

Example 2:
Given s = "apple", abbr = "a2e":
Return false.
*/


import java.util.*;

public class ValidWordAbbreviation{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String s1 = sc.next();
        String s2 = sc.next();
        
        int n1 = s1.length();
        int n2 = s2.length();
        int i = 0, j = 0;
        boolean f = true;
        if(n1 == 0 && n2 == 0){
            System.out.println(true);
        }else{
        
        while (i < n1 && j < n2) {
            if (s1.charAt(i) == s2.charAt(j)) {
                i++;
                j++;
            } else {
                if (Character.isDigit(s2.charAt(j))) {
                    StringBuilder str = new StringBuilder();
                    while (j < n2 && Character.isDigit(s2.charAt(j))) {
                        if(str.length() == 0 && s2.charAt(j) == '0'){
                            f = false;
                            break;
                        }
                        str.append(s2.charAt(j));
                        j++;
                    }if(!f)break;
                    int n = Integer.parseInt(str.toString());
                    // j += n;
                    i += n;
                } else {
                    f = false;
                    break;
                }
            }if(!f)break;
        }
        
        if (!f) {
            System.out.println(false);
        } else {
            System.out.println(true);
        }
        }
        sc.close();
    }
}

/*
Valid Word Abbreviation

Given a non-empty string s and an abbreviation abbr , return whether the string 
matches with the given abbreviation.
A string such as "word" contains only the following valid abbreviations:

["word", "1ord", "w1rd", "wo1d", "wor1", "2rd", "w2d", "wo2", "1o1d", "1or1", 
"w1r1", "1o2", "2r1", "3d", "w3", "4"]

Notice that only the above abbreviations are valid abbreviations of the string 
"word" . Any other string is not a valid abbreviation of "word" .

Note: Assume s contains only lowercase letters and abbr contains only lowercase 
letters and digits.

Example 1:
Given s = "internationalization", abbr = "i12iz4n":
Return true.

Example 2:
Given s = "apple", abbr = "a2e":
Return false.
*/


import java.util.*;

public class ValidWordAbbreviation{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String s1 = sc.next();
        String s2 = sc.next();
        
        int n1 = s1.length();
        int n2 = s2.length();
        int i = 0, j = 0;
        boolean f = true;
        if(n1 == 0 && n2 == 0){
            System.out.println(true);
        }else{
        
        while (i < n1 && j < n2) {
            if (s1.charAt(i) == s2.charAt(j)) {
                i++;
                j++;
            } else {
                if (Character.isDigit(s2.charAt(j))) {
                    StringBuilder str = new StringBuilder();
                    while (j < n2 && Character.isDigit(s2.charAt(j))) {
                        if(str.length() == 0 && s2.charAt(j) == '0'){
                            f = false;
                            break;
                        }
                        str.append(s2.charAt(j));
                        j++;
                    }if(!f)break;
                    int n = Integer.parseInt(str.toString());
                    // j += n;
                    i += n;
                } else {
                    f = false;
                    break;
                }
            }if(!f)break;
        }
        
        if (!f) {
            System.out.println(false);
        } else {
            System.out.println(true);
        }
        }
        sc.close();
    }
}

/*
Valid Word Abbreviation

Given a non-empty string s and an abbreviation abbr , return whether the string 
matches with the given abbreviation.
A string such as "word" contains only the following valid abbreviations:

["word", "1ord", "w1rd", "wo1d", "wor1", "2rd", "w2d", "wo2", "1o1d", "1or1", 
"w1r1", "1o2", "2r1", "3d", "w3", "4"]

Notice that only the above abbreviations are valid abbreviations of the string 
"word" . Any other string is not a valid abbreviation of "word" .

Note: Assume s contains only lowercase letters and abbr contains only lowercase 
letters and digits.

Example 1:
Given s = "internationalization", abbr = "i12iz4n":
Return true.

Example 2:
Given s = "apple", abbr = "a2e":
Return false.
*/


import java.util.*;

public class ValidWordAbbreviation{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String s1 = sc.next();
        String s2 = sc.next();
        
        int n1 = s1.length();
        int n2 = s2.length();
        int i = 0, j = 0;
        boolean f = true;
        if(n1 == 0 && n2 == 0){
            System.out.println(true);
        }else{
        
        while (i < n1 && j < n2) {
            if (s1.charAt(i) == s2.charAt(j)) {
                i++;
                j++;
            } else {
                if (Character.isDigit(s2.charAt(j))) {
                    StringBuilder str = new StringBuilder();
                    while (j < n2 && Character.isDigit(s2.charAt(j))) {
                        if(str.length() == 0 && s2.charAt(j) == '0'){
                            f = false;
                            break;
                        }
                        str.append(s2.charAt(j));
                        j++;
                    }if(!f)break;
                    int n = Integer.parseInt(str.toString());
                    // j += n;
                    i += n;
                } else {
                    f = false;
                    break;
                }
            }if(!f)break;
        }
        
        if (!f) {
            System.out.println(false);
        } else {
            System.out.println(true);
        }
        }
        sc.close();
    }
}

/*
Valid Word Abbreviation

Given a non-empty string s and an abbreviation abbr , return whether the string 
matches with the given abbreviation.
A string such as "word" contains only the following valid abbreviations:

["word", "1ord", "w1rd", "wo1d", "wor1", "2rd", "w2d", "wo2", "1o1d", "1or1", 
"w1r1", "1o2", "2r1", "3d", "w3", "4"]

Notice that only the above abbreviations are valid abbreviations of the string 
"word" . Any other string is not a valid abbreviation of "word" .

Note: Assume s contains only lowercase letters and abbr contains only lowercase 
letters and digits.

Example 1:
Given s = "internationalization", abbr = "i12iz4n":
Return true.

Example 2:
Given s = "apple", abbr = "a2e":
Return false.
*/


import java.util.*;

public class ValidWordAbbreviation{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String s1 = sc.next();
        String s2 = sc.next();
        
        int n1 = s1.length();
        int n2 = s2.length();
        int i = 0, j = 0;
        boolean f = true;
        if(n1 == 0 && n2 == 0){
            System.out.println(true);
        }else{
        
        while (i < n1 && j < n2) {
            if (s1.charAt(i) == s2.charAt(j)) {
                i++;
                j++;
            } else {
                if (Character.isDigit(s2.charAt(j))) {
                    StringBuilder str = new StringBuilder();
                    while (j < n2 && Character.isDigit(s2.charAt(j))) {
                        if(str.length() == 0 && s2.charAt(j) == '0'){
                            f = false;
                            break;
                        }
                        str.append(s2.charAt(j));
                        j++;
                    }if(!f)break;
                    int n = Integer.parseInt(str.toString());
                    // j += n;
                    i += n;
                } else {
                    f = false;
                    break;
                }
            }if(!f)break;
        }
        
        if (!f) {
            System.out.println(false);
        } else {
            System.out.println(true);
        }
        }
        sc.close();
    }
}

/*
Valid Word Abbreviation

Given a non-empty string s and an abbreviation abbr , return whether the string 
matches with the given abbreviation.
A string such as "word" contains only the following valid abbreviations:

["word", "1ord", "w1rd", "wo1d", "wor1", "2rd", "w2d", "wo2", "1o1d", "1or1", 
"w1r1", "1o2", "2r1", "3d", "w3", "4"]

Notice that only the above abbreviations are valid abbreviations of the string 
"word" . Any other string is not a valid abbreviation of "word" .

Note: Assume s contains only lowercase letters and abbr contains only lowercase 
letters and digits.

Example 1:
Given s = "internationalization", abbr = "i12iz4n":
Return true.

Example 2:
Given s = "apple", abbr = "a2e":
Return false.
*/


import java.util.*;

public class ValidWordAbbreviation{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String s1 = sc.next();
        String s2 = sc.next();
        
        int n1 = s1.length();
        int n2 = s2.length();
        int i = 0, j = 0;
        boolean f = true;
        if(n1 == 0 && n2 == 0){
            System.out.println(true);
        }else{
        
        while (i < n1 && j < n2) {
            if (s1.charAt(i) == s2.charAt(j)) {
                i++;
                j++;
            } else {
                if (Character.isDigit(s2.charAt(j))) {
                    StringBuilder str = new StringBuilder();
                    while (j < n2 && Character.isDigit(s2.charAt(j))) {
                        if(str.length() == 0 && s2.charAt(j) == '0'){
                            f = false;
                            break;
                        }
                        str.append(s2.charAt(j));
                        j++;
                    }if(!f)break;
                    int n = Integer.parseInt(str.toString());
                    // j += n;
                    i += n;
                } else {
                    f = false;
                    break;
                }
            }if(!f)break;
        }
        
        if (!f) {
            System.out.println(false);
        } else {
            System.out.println(true);
        }
        }
        sc.close();
    }
}

/*
Valid Word Abbreviation

Given a non-empty string s and an abbreviation abbr , return whether the string 
matches with the given abbreviation.
A string such as "word" contains only the following valid abbreviations:

["word", "1ord", "w1rd", "wo1d", "wor1", "2rd", "w2d", "wo2", "1o1d", "1or1", 
"w1r1", "1o2", "2r1", "3d", "w3", "4"]

Notice that only the above abbreviations are valid abbreviations of the string 
"word" . Any other string is not a valid abbreviation of "word" .

Note: Assume s contains only lowercase letters and abbr contains only lowercase 
letters and digits.

Example 1:
Given s = "internationalization", abbr = "i12iz4n":
Return true.

Example 2:
Given s = "apple", abbr = "a2e":
Return false.
*/


import java.util.*;

public class ValidWordAbbreviation{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String s1 = sc.next();
        String s2 = sc.next();
        
        int n1 = s1.length();
        int n2 = s2.length();
        int i = 0, j = 0;
        boolean f = true;
        if(n1 == 0 && n2 == 0){
            System.out.println(true);
        }else{
        
        while (i < n1 && j < n2) {
            if (s1.charAt(i) == s2.charAt(j)) {
                i++;
                j++;
            } else {
                if (Character.isDigit(s2.charAt(j))) {
                    StringBuilder str = new StringBuilder();
                    while (j < n2 && Character.isDigit(s2.charAt(j))) {
                        if(str.length() == 0 && s2.charAt(j) == '0'){
                            f = false;
                            break;
                        }
                        str.append(s2.charAt(j));
                        j++;
                    }if(!f)break;
                    int n = Integer.parseInt(str.toString());
                    // j += n;
                    i += n;
                } else {
                    f = false;
                    break;
                }
            }if(!f)break;
        }
        
        if (!f) {
            System.out.println(false);
        } else {
            System.out.println(true);
        }
        }
        sc.close();
    }
}

/*
Valid Word Abbreviation

Given a non-empty string s and an abbreviation abbr , return whether the string 
matches with the given abbreviation.
A string such as "word" contains only the following valid abbreviations:

["word", "1ord", "w1rd", "wo1d", "wor1", "2rd", "w2d", "wo2", "1o1d", "1or1", 
"w1r1", "1o2", "2r1", "3d", "w3", "4"]

Notice that only the above abbreviations are valid abbreviations of the string 
"word" . Any other string is not a valid abbreviation of "word" .

Note: Assume s contains only lowercase letters and abbr contains only lowercase 
letters and digits.

Example 1:
Given s = "internationalization", abbr = "i12iz4n":
Return true.

Example 2:
Given s = "apple", abbr = "a2e":
Return false.
*/


import java.util.*;

public class ValidWordAbbreviation{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String s1 = sc.next();
        String s2 = sc.next();
        
        int n1 = s1.length();
        int n2 = s2.length();
        int i = 0, j = 0;
        boolean f = true;
        if(n1 == 0 && n2 == 0){
            System.out.println(true);
        }else{
        
        while (i < n1 && j < n2) {
            if (s1.charAt(i) == s2.charAt(j)) {
                i++;
                j++;
            } else {
                if (Character.isDigit(s2.charAt(j))) {
                    StringBuilder str = new StringBuilder();
                    while (j < n2 && Character.isDigit(s2.charAt(j))) {
                        if(str.length() == 0 && s2.charAt(j) == '0'){
                            f = false;
                            break;
                        }
                        str.append(s2.charAt(j));
                        j++;
                    }if(!f)break;
                    int n = Integer.parseInt(str.toString());
                    // j += n;
                    i += n;
                } else {
                    f = false;
                    break;
                }
            }if(!f)break;
        }
        
        if (!f) {
            System.out.println(false);
        } else {
            System.out.println(true);
        }
        }
        sc.close();
    }
}

/*
Valid Word Abbreviation

Given a non-empty string s and an abbreviation abbr , return whether the string 
matches with the given abbreviation.
A string such as "word" contains only the following valid abbreviations:

["word", "1ord", "w1rd", "wo1d", "wor1", "2rd", "w2d", "wo2", "1o1d", "1or1", 
"w1r1", "1o2", "2r1", "3d", "w3", "4"]

Notice that only the above abbreviations are valid abbreviations of the string 
"word" . Any other string is not a valid abbreviation of "word" .

Note: Assume s contains only lowercase letters and abbr contains only lowercase 
letters and digits.

Example 1:
Given s = "internationalization", abbr = "i12iz4n":
Return true.

Example 2:
Given s = "apple", abbr = "a2e":
Return false.
*/


import java.util.*;

public class ValidWordAbbreviation{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String s1 = sc.next();
        String s2 = sc.next();
        
        int n1 = s1.length();
        int n2 = s2.length();
        int i = 0, j = 0;
        boolean f = true;
        if(n1 == 0 && n2 == 0){
            System.out.println(true);
        }else{
        
        while (i < n1 && j < n2) {
            if (s1.charAt(i) == s2.charAt(j)) {
                i++;
                j++;
            } else {
                if (Character.isDigit(s2.charAt(j))) {
                    StringBuilder str = new StringBuilder();
                    while (j < n2 && Character.isDigit(s2.charAt(j))) {
                        if(str.length() == 0 && s2.charAt(j) == '0'){
                            f = false;
                            break;
                        }
                        str.append(s2.charAt(j));
                        j++;
                    }if(!f)break;
                    int n = Integer.parseInt(str.toString());
                    // j += n;
                    i += n;
                } else {
                    f = false;
                    break;
                }
            }if(!f)break;
        }
        
        if (!f) {
            System.out.println(false);
        } else {
            System.out.println(true);
        }
        }
        sc.close();
    }
}

/*
Valid Word Abbreviation

Given a non-empty string s and an abbreviation abbr , return whether the string 
matches with the given abbreviation.
A string such as "word" contains only the following valid abbreviations:

["word", "1ord", "w1rd", "wo1d", "wor1", "2rd", "w2d", "wo2", "1o1d", "1or1", 
"w1r1", "1o2", "2r1", "3d", "w3", "4"]

Notice that only the above abbreviations are valid abbreviations of the string 
"word" . Any other string is not a valid abbreviation of "word" .

Note: Assume s contains only lowercase letters and abbr contains only lowercase 
letters and digits.

Example 1:
Given s = "internationalization", abbr = "i12iz4n":
Return true.

Example 2:
Given s = "apple", abbr = "a2e":
Return false.
*/


import java.util.*;

public class ValidWordAbbreviation{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String s1 = sc.next();
        String s2 = sc.next();
        
        int n1 = s1.length();
        int n2 = s2.length();
        int i = 0, j = 0;
        boolean f = true;
        if(n1 == 0 && n2 == 0){
            System.out.println(true);
        }else{
        
        while (i < n1 && j < n2) {
            if (s1.charAt(i) == s2.charAt(j)) {
                i++;
                j++;
            } else {
                if (Character.isDigit(s2.charAt(j))) {
                    StringBuilder str = new StringBuilder();
                    while (j < n2 && Character.isDigit(s2.charAt(j))) {
                        if(str.length() == 0 && s2.charAt(j) == '0'){
                            f = false;
                            break;
                        }
                        str.append(s2.charAt(j));
                        j++;
                    }if(!f)break;
                    int n = Integer.parseInt(str.toString());
                    // j += n;
                    i += n;
                } else {
                    f = false;
                    break;
                }
            }if(!f)break;
        }
        
        if (!f) {
            System.out.println(false);
        } else {
            System.out.println(true);
        }
        }
        sc.close();
    }
}

/*
Valid Word Abbreviation

Given a non-empty string s and an abbreviation abbr , return whether the string 
matches with the given abbreviation.
A string such as "word" contains only the following valid abbreviations:

["word", "1ord", "w1rd", "wo1d", "wor1", "2rd", "w2d", "wo2", "1o1d", "1or1", 
"w1r1", "1o2", "2r1", "3d", "w3", "4"]

Notice that only the above abbreviations are valid abbreviations of the string 
"word" . Any other string is not a valid abbreviation of "word" .

Note: Assume s contains only lowercase letters and abbr contains only lowercase 
letters and digits.

Example 1:
Given s = "internationalization", abbr = "i12iz4n":
Return true.

Example 2:
Given s = "apple", abbr = "a2e":
Return false.
*/


import java.util.*;

public class ValidWordAbbreviation{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String s1 = sc.next();
        String s2 = sc.next();
        
        int n1 = s1.length();
        int n2 = s2.length();
        int i = 0, j = 0;
        boolean f = true;
        if(n1 == 0 && n2 == 0){
            System.out.println(true);
        }else{
        
        while (i < n1 && j < n2) {
            if (s1.charAt(i) == s2.charAt(j)) {
                i++;
                j++;
            } else {
                if (Character.isDigit(s2.charAt(j))) {
                    StringBuilder str = new StringBuilder();
                    while (j < n2 && Character.isDigit(s2.charAt(j))) {
                        if(str.length() == 0 && s2.charAt(j) == '0'){
                            f = false;
                            break;
                        }
                        str.append(s2.charAt(j));
                        j++;
                    }if(!f)break;
                    int n = Integer.parseInt(str.toString());
                    // j += n;
                    i += n;
                } else {
                    f = false;
                    break;
                }
            }if(!f)break;
        }
        
        if (!f) {
            System.out.println(false);
        } else {
            System.out.println(true);
        }
        }
        sc.close();
    }
}

/*
Valid Word Abbreviation

Given a non-empty string s and an abbreviation abbr , return whether the string 
matches with the given abbreviation.
A string such as "word" contains only the following valid abbreviations:

["word", "1ord", "w1rd", "wo1d", "wor1", "2rd", "w2d", "wo2", "1o1d", "1or1", 
"w1r1", "1o2", "2r1", "3d", "w3", "4"]

Notice that only the above abbreviations are valid abbreviations of the string 
"word" . Any other string is not a valid abbreviation of "word" .

Note: Assume s contains only lowercase letters and abbr contains only lowercase 
letters and digits.

Example 1:
Given s = "internationalization", abbr = "i12iz4n":
Return true.

Example 2:
Given s = "apple", abbr = "a2e":
Return false.
*/


import java.util.*;

public class ValidWordAbbreviation{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String s1 = sc.next();
        String s2 = sc.next();
        
        int n1 = s1.length();
        int n2 = s2.length();
        int i = 0, j = 0;
        boolean f = true;
        if(n1 == 0 && n2 == 0){
            System.out.println(true);
        }else{
        
        while (i < n1 && j < n2) {
            if (s1.charAt(i) == s2.charAt(j)) {
                i++;
                j++;
            } else {
                if (Character.isDigit(s2.charAt(j))) {
                    StringBuilder str = new StringBuilder();
                    while (j < n2 && Character.isDigit(s2.charAt(j))) {
                        if(str.length() == 0 && s2.charAt(j) == '0'){
                            f = false;
                            break;
                        }
                        str.append(s2.charAt(j));
                        j++;
                    }if(!f)break;
                    int n = Integer.parseInt(str.toString());
                    // j += n;
                    i += n;
                } else {
                    f = false;
                    break;
                }
            }if(!f)break;
        }
        
        if (!f) {
            System.out.println(false);
        } else {
            System.out.println(true);
        }
        }
        sc.close();
    }
}

/*
Valid Word Abbreviation

Given a non-empty string s and an abbreviation abbr , return whether the string 
matches with the given abbreviation.
A string such as "word" contains only the following valid abbreviations:

["word", "1ord", "w1rd", "wo1d", "wor1", "2rd", "w2d", "wo2", "1o1d", "1or1", 
"w1r1", "1o2", "2r1", "3d", "w3", "4"]

Notice that only the above abbreviations are valid abbreviations of the string 
"word" . Any other string is not a valid abbreviation of "word" .

Note: Assume s contains only lowercase letters and abbr contains only lowercase 
letters and digits.

Example 1:
Given s = "internationalization", abbr = "i12iz4n":
Return true.

Example 2:
Given s = "apple", abbr = "a2e":
Return false.
*/


import java.util.*;

public class ValidWordAbbreviation{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String s1 = sc.next();
        String s2 = sc.next();
        
        int n1 = s1.length();
        int n2 = s2.length();
        int i = 0, j = 0;
        boolean f = true;
        if(n1 == 0 && n2 == 0){
            System.out.println(true);
        }else{
        
        while (i < n1 && j < n2) {
            if (s1.charAt(i) == s2.charAt(j)) {
                i++;
                j++;
            } else {
                if (Character.isDigit(s2.charAt(j))) {
                    StringBuilder str = new StringBuilder();
                    while (j < n2 && Character.isDigit(s2.charAt(j))) {
                        if(str.length() == 0 && s2.charAt(j) == '0'){
                            f = false;
                            break;
                        }
                        str.append(s2.charAt(j));
                        j++;
                    }if(!f)break;
                    int n = Integer.parseInt(str.toString());
                    // j += n;
                    i += n;
                } else {
                    f = false;
                    break;
                }
            }if(!f)break;
        }
        
        if (!f) {
            System.out.println(false);
        } else {
            System.out.println(true);
        }
        }
        sc.close();
    }
}

/*
Valid Word Abbreviation

Given a non-empty string s and an abbreviation abbr , return whether the string 
matches with the given abbreviation.
A string such as "word" contains only the following valid abbreviations:

["word", "1ord", "w1rd", "wo1d", "wor1", "2rd", "w2d", "wo2", "1o1d", "1or1", 
"w1r1", "1o2", "2r1", "3d", "w3", "4"]

Notice that only the above abbreviations are valid abbreviations of the string 
"word" . Any other string is not a valid abbreviation of "word" .

Note: Assume s contains only lowercase letters and abbr contains only lowercase 
letters and digits.

Example 1:
Given s = "internationalization", abbr = "i12iz4n":
Return true.

Example 2:
Given s = "apple", abbr = "a2e":
Return false.
*/


import java.util.*;

public class ValidWordAbbreviation{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String s1 = sc.next();
        String s2 = sc.next();
        
        int n1 = s1.length();
        int n2 = s2.length();
        int i = 0, j = 0;
        boolean f = true;
        if(n1 == 0 && n2 == 0){
            System.out.println(true);
        }else{
        
        while (i < n1 && j < n2) {
            if (s1.charAt(i) == s2.charAt(j)) {
                i++;
                j++;
            } else {
                if (Character.isDigit(s2.charAt(j))) {
                    StringBuilder str = new StringBuilder();
                    while (j < n2 && Character.isDigit(s2.charAt(j))) {
                        if(str.length() == 0 && s2.charAt(j) == '0'){
                            f = false;
                            break;
                        }
                        str.append(s2.charAt(j));
                        j++;
                    }if(!f)break;
                    int n = Integer.parseInt(str.toString());
                    // j += n;
                    i += n;
                } else {
                    f = false;
                    break;
                }
            }if(!f)break;
        }
        
        if (!f) {
            System.out.println(false);
        } else {
            System.out.println(true);
        }
        }
        sc.close();
    }
}

/*
Valid Word Abbreviation

Given a non-empty string s and an abbreviation abbr , return whether the string 
matches with the given abbreviation.
A string such as "word" contains only the following valid abbreviations:

["word", "1ord", "w1rd", "wo1d", "wor1", "2rd", "w2d", "wo2", "1o1d", "1or1", 
"w1r1", "1o2", "2r1", "3d", "w3", "4"]

Notice that only the above abbreviations are valid abbreviations of the string 
"word" . Any other string is not a valid abbreviation of "word" .

Note: Assume s contains only lowercase letters and abbr contains only lowercase 
letters and digits.

Example 1:
Given s = "internationalization", abbr = "i12iz4n":
Return true.

Example 2:
Given s = "apple", abbr = "a2e":
Return false.
*/


import java.util.*;

public class ValidWordAbbreviation{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String s1 = sc.next();
        String s2 = sc.next();
        
        int n1 = s1.length();
        int n2 = s2.length();
        int i = 0, j = 0;
        boolean f = true;
        if(n1 == 0 && n2 == 0){
            System.out.println(true);
        }else{
        
        while (i < n1 && j < n2) {
            if (s1.charAt(i) == s2.charAt(j)) {
                i++;
                j++;
            } else {
                if (Character.isDigit(s2.charAt(j))) {
                    StringBuilder str = new StringBuilder();
                    while (j < n2 && Character.isDigit(s2.charAt(j))) {
                        if(str.length() == 0 && s2.charAt(j) == '0'){
                            f = false;
                            break;
                        }
                        str.append(s2.charAt(j));
                        j++;
                    }if(!f)break;
                    int n = Integer.parseInt(str.toString());
                    // j += n;
                    i += n;
                } else {
                    f = false;
                    break;
                }
            }if(!f)break;
        }
        
        if (!f) {
            System.out.println(false);
        } else {
            System.out.println(true);
        }
        }
        sc.close();
    }
}

/*
Valid Word Abbreviation

Given a non-empty string s and an abbreviation abbr , return whether the string 
matches with the given abbreviation.
A string such as "word" contains only the following valid abbreviations:

["word", "1ord", "w1rd", "wo1d", "wor1", "2rd", "w2d", "wo2", "1o1d", "1or1", 
"w1r1", "1o2", "2r1", "3d", "w3", "4"]

Notice that only the above abbreviations are valid abbreviations of the string 
"word" . Any other string is not a valid abbreviation of "word" .

Note: Assume s contains only lowercase letters and abbr contains only lowercase 
letters and digits.

Example 1:
Given s = "internationalization", abbr = "i12iz4n":
Return true.

Example 2:
Given s = "apple", abbr = "a2e":
Return false.
*/


import java.util.*;

public class ValidWordAbbreviation{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String s1 = sc.next();
        String s2 = sc.next();
        
        int n1 = s1.length();
        int n2 = s2.length();
        int i = 0, j = 0;
        boolean f = true;
        if(n1 == 0 && n2 == 0){
            System.out.println(true);
        }else{
        
        while (i < n1 && j < n2) {
            if (s1.charAt(i) == s2.charAt(j)) {
                i++;
                j++;
            } else {
                if (Character.isDigit(s2.charAt(j))) {
                    StringBuilder str = new StringBuilder();
                    while (j < n2 && Character.isDigit(s2.charAt(j))) {
                        if(str.length() == 0 && s2.charAt(j) == '0'){
                            f = false;
                            break;
                        }
                        str.append(s2.charAt(j));
                        j++;
                    }if(!f)break;
                    int n = Integer.parseInt(str.toString());
                    // j += n;
                    i += n;
                } else {
                    f = false;
                    break;
                }
            }if(!f)break;
        }
        
        if (!f) {
            System.out.println(false);
        } else {
            System.out.println(true);
        }
        }
        sc.close();
    }
}

/*
Valid Word Abbreviation

Given a non-empty string s and an abbreviation abbr , return whether the string 
matches with the given abbreviation.
A string such as "word" contains only the following valid abbreviations:

["word", "1ord", "w1rd", "wo1d", "wor1", "2rd", "w2d", "wo2", "1o1d", "1or1", 
"w1r1", "1o2", "2r1", "3d", "w3", "4"]

Notice that only the above abbreviations are valid abbreviations of the string 
"word" . Any other string is not a valid abbreviation of "word" .

Note: Assume s contains only lowercase letters and abbr contains only lowercase 
letters and digits.

Example 1:
Given s = "internationalization", abbr = "i12iz4n":
Return true.

Example 2:
Given s = "apple", abbr = "a2e":
Return false.
*/


import java.util.*;

public class ValidWordAbbreviation{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String s1 = sc.next();
        String s2 = sc.next();
        
        int n1 = s1.length();
        int n2 = s2.length();
        int i = 0, j = 0;
        boolean f = true;
        if(n1 == 0 && n2 == 0){
            System.out.println(true);
        }else{
        
        while (i < n1 && j < n2) {
            if (s1.charAt(i) == s2.charAt(j)) {
                i++;
                j++;
            } else {
                if (Character.isDigit(s2.charAt(j))) {
                    StringBuilder str = new StringBuilder();
                    while (j < n2 && Character.isDigit(s2.charAt(j))) {
                        if(str.length() == 0 && s2.charAt(j) == '0'){
                            f = false;
                            break;
                        }
                        str.append(s2.charAt(j));
                        j++;
                    }if(!f)break;
                    int n = Integer.parseInt(str.toString());
                    // j += n;
                    i += n;
                } else {
                    f = false;
                    break;
                }
            }if(!f)break;
        }
        
        if (!f) {
            System.out.println(false);
        } else {
            System.out.println(true);
        }
        }
        sc.close();
    }
}

/*
Valid Word Abbreviation

Given a non-empty string s and an abbreviation abbr , return whether the string 
matches with the given abbreviation.
A string such as "word" contains only the following valid abbreviations:

["word", "1ord", "w1rd", "wo1d", "wor1", "2rd", "w2d", "wo2", "1o1d", "1or1", 
"w1r1", "1o2", "2r1", "3d", "w3", "4"]

Notice that only the above abbreviations are valid abbreviations of the string 
"word" . Any other string is not a valid abbreviation of "word" .

Note: Assume s contains only lowercase letters and abbr contains only lowercase 
letters and digits.

Example 1:
Given s = "internationalization", abbr = "i12iz4n":
Return true.

Example 2:
Given s = "apple", abbr = "a2e":
Return false.
*/


import java.util.*;

public class ValidWordAbbreviation{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String s1 = sc.next();
        String s2 = sc.next();
        
        int n1 = s1.length();
        int n2 = s2.length();
        int i = 0, j = 0;
        boolean f = true;
        if(n1 == 0 && n2 == 0){
            System.out.println(true);
        }else{
        
        while (i < n1 && j < n2) {
            if (s1.charAt(i) == s2.charAt(j)) {
                i++;
                j++;
            } else {
                if (Character.isDigit(s2.charAt(j))) {
                    StringBuilder str = new StringBuilder();
                    while (j < n2 && Character.isDigit(s2.charAt(j))) {
                        if(str.length() == 0 && s2.charAt(j) == '0'){
                            f = false;
                            break;
                        }
                        str.append(s2.charAt(j));
                        j++;
                    }if(!f)break;
                    int n = Integer.parseInt(str.toString());
                    // j += n;
                    i += n;
                } else {
                    f = false;
                    break;
                }
            }if(!f)break;
        }
        
        if (!f) {
            System.out.println(false);
        } else {
            System.out.println(true);
        }
        }
        sc.close();
    }
}

/*
Valid Word Abbreviation

Given a non-empty string s and an abbreviation abbr , return whether the string 
matches with the given abbreviation.
A string such as "word" contains only the following valid abbreviations:

["word", "1ord", "w1rd", "wo1d", "wor1", "2rd", "w2d", "wo2", "1o1d", "1or1", 
"w1r1", "1o2", "2r1", "3d", "w3", "4"]

Notice that only the above abbreviations are valid abbreviations of the string 
"word" . Any other string is not a valid abbreviation of "word" .

Note: Assume s contains only lowercase letters and abbr contains only lowercase 
letters and digits.

Example 1:
Given s = "internationalization", abbr = "i12iz4n":
Return true.

Example 2:
Given s = "apple", abbr = "a2e":
Return false.
*/


import java.util.*;

public class ValidWordAbbreviation{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String s1 = sc.next();
        String s2 = sc.next();
        
        int n1 = s1.length();
        int n2 = s2.length();
        int i = 0, j = 0;
        boolean f = true;
        if(n1 == 0 && n2 == 0){
            System.out.println(true);
        }else{
        
        while (i < n1 && j < n2) {
            if (s1.charAt(i) == s2.charAt(j)) {
                i++;
                j++;
            } else {
                if (Character.isDigit(s2.charAt(j))) {
                    StringBuilder str = new StringBuilder();
                    while (j < n2 && Character.isDigit(s2.charAt(j))) {
                        if(str.length() == 0 && s2.charAt(j) == '0'){
                            f = false;
                            break;
                        }
                        str.append(s2.charAt(j));
                        j++;
                    }if(!f)break;
                    int n = Integer.parseInt(str.toString());
                    // j += n;
                    i += n;
                } else {
                    f = false;
                    break;
                }
            }if(!f)break;
        }
        
        if (!f) {
            System.out.println(false);
        } else {
            System.out.println(true);
        }
        }
        sc.close();
    }
}

/*
Valid Word Abbreviation

Given a non-empty string s and an abbreviation abbr , return whether the string 
matches with the given abbreviation.
A string such as "word" contains only the following valid abbreviations:

["word", "1ord", "w1rd", "wo1d", "wor1", "2rd", "w2d", "wo2", "1o1d", "1or1", 
"w1r1", "1o2", "2r1", "3d", "w3", "4"]

Notice that only the above abbreviations are valid abbreviations of the string 
"word" . Any other string is not a valid abbreviation of "word" .

Note: Assume s contains only lowercase letters and abbr contains only lowercase 
letters and digits.

Example 1:
Given s = "internationalization", abbr = "i12iz4n":
Return true.

Example 2:
Given s = "apple", abbr = "a2e":
Return false.
*/


import java.util.*;

public class ValidWordAbbreviation{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String s1 = sc.next();
        String s2 = sc.next();
        
        int n1 = s1.length();
        int n2 = s2.length();
        int i = 0, j = 0;
        boolean f = true;
        if(n1 == 0 && n2 == 0){
            System.out.println(true);
        }else{
        
        while (i < n1 && j < n2) {
            if (s1.charAt(i) == s2.charAt(j)) {
                i++;
                j++;
            } else {
                if (Character.isDigit(s2.charAt(j))) {
                    StringBuilder str = new StringBuilder();
                    while (j < n2 && Character.isDigit(s2.charAt(j))) {
                        if(str.length() == 0 && s2.charAt(j) == '0'){
                            f = false;
                            break;
                        }
                        str.append(s2.charAt(j));
                        j++;
                    }if(!f)break;
                    int n = Integer.parseInt(str.toString());
                    // j += n;
                    i += n;
                } else {
                    f = false;
                    break;
                }
            }if(!f)break;
        }
        
        if (!f) {
            System.out.println(false);
        } else {
            System.out.println(true);
        }
        }
        sc.close();
    }
}

/*
Valid Word Abbreviation

Given a non-empty string s and an abbreviation abbr , return whether the string 
matches with the given abbreviation.
A string such as "word" contains only the following valid abbreviations:

["word", "1ord", "w1rd", "wo1d", "wor1", "2rd", "w2d", "wo2", "1o1d", "1or1", 
"w1r1", "1o2", "2r1", "3d", "w3", "4"]

Notice that only the above abbreviations are valid abbreviations of the string 
"word" . Any other string is not a valid abbreviation of "word" .

Note: Assume s contains only lowercase letters and abbr contains only lowercase 
letters and digits.

Example 1:
Given s = "internationalization", abbr = "i12iz4n":
Return true.

Example 2:
Given s = "apple", abbr = "a2e":
Return false.
*/


import java.util.*;

public class ValidWordAbbreviation{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String s1 = sc.next();
        String s2 = sc.next();
        
        int n1 = s1.length();
        int n2 = s2.length();
        int i = 0, j = 0;
        boolean f = true;
        if(n1 == 0 && n2 == 0){
            System.out.println(true);
        }else{
        
        while (i < n1 && j < n2) {
            if (s1.charAt(i) == s2.charAt(j)) {
                i++;
                j++;
            } else {
                if (Character.isDigit(s2.charAt(j))) {
                    StringBuilder str = new StringBuilder();
                    while (j < n2 && Character.isDigit(s2.charAt(j))) {
                        if(str.length() == 0 && s2.charAt(j) == '0'){
                            f = false;
                            break;
                        }
                        str.append(s2.charAt(j));
                        j++;
                    }if(!f)break;
                    int n = Integer.parseInt(str.toString());
                    // j += n;
                    i += n;
                } else {
                    f = false;
                    break;
                }
            }if(!f)break;
        }
        
        if (!f) {
            System.out.println(false);
        } else {
            System.out.println(true);
        }
        }
        sc.close();
    }
}

/*
Valid Word Abbreviation

Given a non-empty string s and an abbreviation abbr , return whether the string 
matches with the given abbreviation.
A string such as "word" contains only the following valid abbreviations:

["word", "1ord", "w1rd", "wo1d", "wor1", "2rd", "w2d", "wo2", "1o1d", "1or1", 
"w1r1", "1o2", "2r1", "3d", "w3", "4"]

Notice that only the above abbreviations are valid abbreviations of the string 
"word" . Any other string is not a valid abbreviation of "word" .

Note: Assume s contains only lowercase letters and abbr contains only lowercase 
letters and digits.

Example 1:
Given s = "internationalization", abbr = "i12iz4n":
Return true.

Example 2:
Given s = "apple", abbr = "a2e":
Return false.
*/


import java.util.*;

public class ValidWordAbbreviation{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String s1 = sc.next();
        String s2 = sc.next();
        
        int n1 = s1.length();
        int n2 = s2.length();
        int i = 0, j = 0;
        boolean f = true;
        if(n1 == 0 && n2 == 0){
            System.out.println(true);
        }else{
        
        while (i < n1 && j < n2) {
            if (s1.charAt(i) == s2.charAt(j)) {
                i++;
                j++;
            } else {
                if (Character.isDigit(s2.charAt(j))) {
                    StringBuilder str = new StringBuilder();
                    while (j < n2 && Character.isDigit(s2.charAt(j))) {
                        if(str.length() == 0 && s2.charAt(j) == '0'){
                            f = false;
                            break;
                        }
                        str.append(s2.charAt(j));
                        j++;
                    }if(!f)break;
                    int n = Integer.parseInt(str.toString());
                    // j += n;
                    i += n;
                } else {
                    f = false;
                    break;
                }
            }if(!f)break;
        }
        
        if (!f) {
            System.out.println(false);
        } else {
            System.out.println(true);
        }
        }
        sc.close();
    }
}

/*
Valid Word Abbreviation

Given a non-empty string s and an abbreviation abbr , return whether the string 
matches with the given abbreviation.
A string such as "word" contains only the following valid abbreviations:

["word", "1ord", "w1rd", "wo1d", "wor1", "2rd", "w2d", "wo2", "1o1d", "1or1", 
"w1r1", "1o2", "2r1", "3d", "w3", "4"]

Notice that only the above abbreviations are valid abbreviations of the string 
"word" . Any other string is not a valid abbreviation of "word" .

Note: Assume s contains only lowercase letters and abbr contains only lowercase 
letters and digits.

Example 1:
Given s = "internationalization", abbr = "i12iz4n":
Return true.

Example 2:
Given s = "apple", abbr = "a2e":
Return false.
*/


import java.util.*;

public class ValidWordAbbreviation{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String s1 = sc.next();
        String s2 = sc.next();
        
        int n1 = s1.length();
        int n2 = s2.length();
        int i = 0, j = 0;
        boolean f = true;
        if(n1 == 0 && n2 == 0){
            System.out.println(true);
        }else{
        
        while (i < n1 && j < n2) {
            if (s1.charAt(i) == s2.charAt(j)) {
                i++;
                j++;
            } else {
                if (Character.isDigit(s2.charAt(j))) {
                    StringBuilder str = new StringBuilder();
                    while (j < n2 && Character.isDigit(s2.charAt(j))) {
                        if(str.length() == 0 && s2.charAt(j) == '0'){
                            f = false;
                            break;
                        }
                        str.append(s2.charAt(j));
                        j++;
                    }if(!f)break;
                    int n = Integer.parseInt(str.toString());
                    // j += n;
                    i += n;
                } else {
                    f = false;
                    break;
                }
            }if(!f)break;
        }
        
        if (!f) {
            System.out.println(false);
        } else {
            System.out.println(true);
        }
        }
        sc.close();
    }
}

/*
Valid Word Abbreviation

Given a non-empty string s and an abbreviation abbr , return whether the string 
matches with the given abbreviation.
A string such as "word" contains only the following valid abbreviations:

["word", "1ord", "w1rd", "wo1d", "wor1", "2rd", "w2d", "wo2", "1o1d", "1or1", 
"w1r1", "1o2", "2r1", "3d", "w3", "4"]

Notice that only the above abbreviations are valid abbreviations of the string 
"word" . Any other string is not a valid abbreviation of "word" .

Note: Assume s contains only lowercase letters and abbr contains only lowercase 
letters and digits.

Example 1:
Given s = "internationalization", abbr = "i12iz4n":
Return true.

Example 2:
Given s = "apple", abbr = "a2e":
Return false.
*/


import java.util.*;

public class ValidWordAbbreviation{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String s1 = sc.next();
        String s2 = sc.next();
        
        int n1 = s1.length();
        int n2 = s2.length();
        int i = 0, j = 0;
        boolean f = true;
        if(n1 == 0 && n2 == 0){
            System.out.println(true);
        }else{
        
        while (i < n1 && j < n2) {
            if (s1.charAt(i) == s2.charAt(j)) {
                i++;
                j++;
            } else {
                if (Character.isDigit(s2.charAt(j))) {
                    StringBuilder str = new StringBuilder();
                    while (j < n2 && Character.isDigit(s2.charAt(j))) {
                        if(str.length() == 0 && s2.charAt(j) == '0'){
                            f = false;
                            break;
                        }
                        str.append(s2.charAt(j));
                        j++;
                    }if(!f)break;
                    int n = Integer.parseInt(str.toString());
                    // j += n;
                    i += n;
                } else {
                    f = false;
                    break;
                }
            }if(!f)break;
        }
        
        if (!f) {
            System.out.println(false);
        } else {
            System.out.println(true);
        }
        }
        sc.close();
    }
}

/*
Valid Word Abbreviation

Given a non-empty string s and an abbreviation abbr , return whether the string 
matches with the given abbreviation.
A string such as "word" contains only the following valid abbreviations:

["word", "1ord", "w1rd", "wo1d", "wor1", "2rd", "w2d", "wo2", "1o1d", "1or1", 
"w1r1", "1o2", "2r1", "3d", "w3", "4"]

Notice that only the above abbreviations are valid abbreviations of the string 
"word" . Any other string is not a valid abbreviation of "word" .

Note: Assume s contains only lowercase letters and abbr contains only lowercase 
letters and digits.

Example 1:
Given s = "internationalization", abbr = "i12iz4n":
Return true.

Example 2:
Given s = "apple", abbr = "a2e":
Return false.
*/


import java.util.*;

public class ValidWordAbbreviation{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String s1 = sc.next();
        String s2 = sc.next();
        
        int n1 = s1.length();
        int n2 = s2.length();
        int i = 0, j = 0;
        boolean f = true;
        if(n1 == 0 && n2 == 0){
            System.out.println(true);
        }else{
        
        while (i < n1 && j < n2) {
            if (s1.charAt(i) == s2.charAt(j)) {
                i++;
                j++;
            } else {
                if (Character.isDigit(s2.charAt(j))) {
                    StringBuilder str = new StringBuilder();
                    while (j < n2 && Character.isDigit(s2.charAt(j))) {
                        if(str.length() == 0 && s2.charAt(j) == '0'){
                            f = false;
                            break;
                        }
                        str.append(s2.charAt(j));
                        j++;
                    }if(!f)break;
                    int n = Integer.parseInt(str.toString());
                    // j += n;
                    i += n;
                } else {
                    f = false;
                    break;
                }
            }if(!f)break;
        }
        
        if (!f) {
            System.out.println(false);
        } else {
            System.out.println(true);
        }
        }
        sc.close();
    }
}

/*
Valid Word Abbreviation

Given a non-empty string s and an abbreviation abbr , return whether the string 
matches with the given abbreviation.
A string such as "word" contains only the following valid abbreviations:

["word", "1ord", "w1rd", "wo1d", "wor1", "2rd", "w2d", "wo2", "1o1d", "1or1", 
"w1r1", "1o2", "2r1", "3d", "w3", "4"]

Notice that only the above abbreviations are valid abbreviations of the string 
"word" . Any other string is not a valid abbreviation of "word" .

Note: Assume s contains only lowercase letters and abbr contains only lowercase 
letters and digits.

Example 1:
Given s = "internationalization", abbr = "i12iz4n":
Return true.

Example 2:
Given s = "apple", abbr = "a2e":
Return false.
*/


import java.util.*;

public class ValidWordAbbreviation{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String s1 = sc.next();
        String s2 = sc.next();
        
        int n1 = s1.length();
        int n2 = s2.length();
        int i = 0, j = 0;
        boolean f = true;
        if(n1 == 0 && n2 == 0){
            System.out.println(true);
        }else{
        
        while (i < n1 && j < n2) {
            if (s1.charAt(i) == s2.charAt(j)) {
                i++;
                j++;
            } else {
                if (Character.isDigit(s2.charAt(j))) {
                    StringBuilder str = new StringBuilder();
                    while (j < n2 && Character.isDigit(s2.charAt(j))) {
                        if(str.length() == 0 && s2.charAt(j) == '0'){
                            f = false;
                            break;
                        }
                        str.append(s2.charAt(j));
                        j++;
                    }if(!f)break;
                    int n = Integer.parseInt(str.toString());
                    // j += n;
                    i += n;
                } else {
                    f = false;
                    break;
                }
            }if(!f)break;
        }
        
        if (!f) {
            System.out.println(false);
        } else {
            System.out.println(true);
        }
        }
        sc.close();
    }
}

/*
Valid Word Abbreviation

Given a non-empty string s and an abbreviation abbr , return whether the string 
matches with the given abbreviation.
A string such as "word" contains only the following valid abbreviations:

["word", "1ord", "w1rd", "wo1d", "wor1", "2rd", "w2d", "wo2", "1o1d", "1or1", 
"w1r1", "1o2", "2r1", "3d", "w3", "4"]

Notice that only the above abbreviations are valid abbreviations of the string 
"word" . Any other string is not a valid abbreviation of "word" .

Note: Assume s contains only lowercase letters and abbr contains only lowercase 
letters and digits.

Example 1:
Given s = "internationalization", abbr = "i12iz4n":
Return true.

Example 2:
Given s = "apple", abbr = "a2e":
Return false.
*/


import java.util.*;

public class ValidWordAbbreviation{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String s1 = sc.next();
        String s2 = sc.next();
        
        int n1 = s1.length();
        int n2 = s2.length();
        int i = 0, j = 0;
        boolean f = true;
        if(n1 == 0 && n2 == 0){
            System.out.println(true);
        }else{
        
        while (i < n1 && j < n2) {
            if (s1.charAt(i) == s2.charAt(j)) {
                i++;
                j++;
            } else {
                if (Character.isDigit(s2.charAt(j))) {
                    StringBuilder str = new StringBuilder();
                    while (j < n2 && Character.isDigit(s2.charAt(j))) {
                        if(str.length() == 0 && s2.charAt(j) == '0'){
                            f = false;
                            break;
                        }
                        str.append(s2.charAt(j));
                        j++;
                    }if(!f)break;
                    int n = Integer.parseInt(str.toString());
                    // j += n;
                    i += n;
                } else {
                    f = false;
                    break;
                }
            }if(!f)break;
        }
        
        if (!f) {
            System.out.println(false);
        } else {
            System.out.println(true);
        }
        }
        sc.close();
    }
}

/*
Valid Word Abbreviation

Given a non-empty string s and an abbreviation abbr , return whether the string 
matches with the given abbreviation.
A string such as "word" contains only the following valid abbreviations:

["word", "1ord", "w1rd", "wo1d", "wor1", "2rd", "w2d", "wo2", "1o1d", "1or1", 
"w1r1", "1o2", "2r1", "3d", "w3", "4"]

Notice that only the above abbreviations are valid abbreviations of the string 
"word" . Any other string is not a valid abbreviation of "word" .

Note: Assume s contains only lowercase letters and abbr contains only lowercase 
letters and digits.

Example 1:
Given s = "internationalization", abbr = "i12iz4n":
Return true.

Example 2:
Given s = "apple", abbr = "a2e":
Return false.
*/


import java.util.*;

public class ValidWordAbbreviation{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String s1 = sc.next();
        String s2 = sc.next();
        
        int n1 = s1.length();
        int n2 = s2.length();
        int i = 0, j = 0;
        boolean f = true;
        if(n1 == 0 && n2 == 0){
            System.out.println(true);
        }else{
        
        while (i < n1 && j < n2) {
            if (s1.charAt(i) == s2.charAt(j)) {
                i++;
                j++;
            } else {
                if (Character.isDigit(s2.charAt(j))) {
                    StringBuilder str = new StringBuilder();
                    while (j < n2 && Character.isDigit(s2.charAt(j))) {
                        if(str.length() == 0 && s2.charAt(j) == '0'){
                            f = false;
                            break;
                        }
                        str.append(s2.charAt(j));
                        j++;
                    }if(!f)break;
                    int n = Integer.parseInt(str.toString());
                    // j += n;
                    i += n;
                } else {
                    f = false;
                    break;
                }
            }if(!f)break;
        }
        
        if (!f) {
            System.out.println(false);
        } else {
            System.out.println(true);
        }
        }
        sc.close();
    }
}

/*
Valid Word Abbreviation

Given a non-empty string s and an abbreviation abbr , return whether the string 
matches with the given abbreviation.
A string such as "word" contains only the following valid abbreviations:

["word", "1ord", "w1rd", "wo1d", "wor1", "2rd", "w2d", "wo2", "1o1d", "1or1", 
"w1r1", "1o2", "2r1", "3d", "w3", "4"]

Notice that only the above abbreviations are valid abbreviations of the string 
"word" . Any other string is not a valid abbreviation of "word" .

Note: Assume s contains only lowercase letters and abbr contains only lowercase 
letters and digits.

Example 1:
Given s = "internationalization", abbr = "i12iz4n":
Return true.

Example 2:
Given s = "apple", abbr = "a2e":
Return false.
*/


import java.util.*;

public class ValidWordAbbreviation{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String s1 = sc.next();
        String s2 = sc.next();
        
        int n1 = s1.length();
        int n2 = s2.length();
        int i = 0, j = 0;
        boolean f = true;
        if(n1 == 0 && n2 == 0){
            System.out.println(true);
        }else{
        
        while (i < n1 && j < n2) {
            if (s1.charAt(i) == s2.charAt(j)) {
                i++;
                j++;
            } else {
                if (Character.isDigit(s2.charAt(j))) {
                    StringBuilder str = new StringBuilder();
                    while (j < n2 && Character.isDigit(s2.charAt(j))) {
                        if(str.length() == 0 && s2.charAt(j) == '0'){
                            f = false;
                            break;
                        }
                        str.append(s2.charAt(j));
                        j++;
                    }if(!f)break;
                    int n = Integer.parseInt(str.toString());
                    // j += n;
                    i += n;
                } else {
                    f = false;
                    break;
                }
            }if(!f)break;
        }
        
        if (!f) {
            System.out.println(false);
        } else {
            System.out.println(true);
        }
        }
        sc.close();
    }
}

/*
Valid Word Abbreviation

Given a non-empty string s and an abbreviation abbr , return whether the string 
matches with the given abbreviation.
A string such as "word" contains only the following valid abbreviations:

["word", "1ord", "w1rd", "wo1d", "wor1", "2rd", "w2d", "wo2", "1o1d", "1or1", 
"w1r1", "1o2", "2r1", "3d", "w3", "4"]

Notice that only the above abbreviations are valid abbreviations of the string 
"word" . Any other string is not a valid abbreviation of "word" .

Note: Assume s contains only lowercase letters and abbr contains only lowercase 
letters and digits.

Example 1:
Given s = "internationalization", abbr = "i12iz4n":
Return true.

Example 2:
Given s = "apple", abbr = "a2e":
Return false.
*/


import java.util.*;

public class ValidWordAbbreviation{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String s1 = sc.next();
        String s2 = sc.next();
        
        int n1 = s1.length();
        int n2 = s2.length();
        int i = 0, j = 0;
        boolean f = true;
        if(n1 == 0 && n2 == 0){
            System.out.println(true);
        }else{
        
        while (i < n1 && j < n2) {
            if (s1.charAt(i) == s2.charAt(j)) {
                i++;
                j++;
            } else {
                if (Character.isDigit(s2.charAt(j))) {
                    StringBuilder str = new StringBuilder();
                    while (j < n2 && Character.isDigit(s2.charAt(j))) {
                        if(str.length() == 0 && s2.charAt(j) == '0'){
                            f = false;
                            break;
                        }
                        str.append(s2.charAt(j));
                        j++;
                    }if(!f)break;
                    int n = Integer.parseInt(str.toString());
                    // j += n;
                    i += n;
                } else {
                    f = false;
                    break;
                }
            }if(!f)break;
        }
        
        if (!f) {
            System.out.println(false);
        } else {
            System.out.println(true);
        }
        }
        sc.close();
    }
}

/*
Valid Word Abbreviation

Given a non-empty string s and an abbreviation abbr , return whether the string 
matches with the given abbreviation.
A string such as "word" contains only the following valid abbreviations:

["word", "1ord", "w1rd", "wo1d", "wor1", "2rd", "w2d", "wo2", "1o1d", "1or1", 
"w1r1", "1o2", "2r1", "3d", "w3", "4"]

Notice that only the above abbreviations are valid abbreviations of the string 
"word" . Any other string is not a valid abbreviation of "word" .

Note: Assume s contains only lowercase letters and abbr contains only lowercase 
letters and digits.

Example 1:
Given s = "internationalization", abbr = "i12iz4n":
Return true.

Example 2:
Given s = "apple", abbr = "a2e":
Return false.
*/


import java.util.*;

public class ValidWordAbbreviation{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String s1 = sc.next();
        String s2 = sc.next();
        
        int n1 = s1.length();
        int n2 = s2.length();
        int i = 0, j = 0;
        boolean f = true;
        if(n1 == 0 && n2 == 0){
            System.out.println(true);
        }else{
        
        while (i < n1 && j < n2) {
            if (s1.charAt(i) == s2.charAt(j)) {
                i++;
                j++;
            } else {
                if (Character.isDigit(s2.charAt(j))) {
                    StringBuilder str = new StringBuilder();
                    while (j < n2 && Character.isDigit(s2.charAt(j))) {
                        if(str.length() == 0 && s2.charAt(j) == '0'){
                            f = false;
                            break;
                        }
                        str.append(s2.charAt(j));
                        j++;
                    }if(!f)break;
                    int n = Integer.parseInt(str.toString());
                    // j += n;
                    i += n;
                } else {
                    f = false;
                    break;
                }
            }if(!f)break;
        }
        
        if (!f) {
            System.out.println(false);
        } else {
            System.out.println(true);
        }
        }
        sc.close();
    }
}

/*
Valid Word Abbreviation

Given a non-empty string s and an abbreviation abbr , return whether the string 
matches with the given abbreviation.
A string such as "word" contains only the following valid abbreviations:

["word", "1ord", "w1rd", "wo1d", "wor1", "2rd", "w2d", "wo2", "1o1d", "1or1", 
"w1r1", "1o2", "2r1", "3d", "w3", "4"]

Notice that only the above abbreviations are valid abbreviations of the string 
"word" . Any other string is not a valid abbreviation of "word" .

Note: Assume s contains only lowercase letters and abbr contains only lowercase 
letters and digits.

Example 1:
Given s = "internationalization", abbr = "i12iz4n":
Return true.

Example 2:
Given s = "apple", abbr = "a2e":
Return false.
*/


import java.util.*;

public class ValidWordAbbreviation{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String s1 = sc.next();
        String s2 = sc.next();
        
        int n1 = s1.length();
        int n2 = s2.length();
        int i = 0, j = 0;
        boolean f = true;
        if(n1 == 0 && n2 == 0){
            System.out.println(true);
        }else{
        
        while (i < n1 && j < n2) {
            if (s1.charAt(i) == s2.charAt(j)) {
                i++;
                j++;
            } else {
                if (Character.isDigit(s2.charAt(j))) {
                    StringBuilder str = new StringBuilder();
                    while (j < n2 && Character.isDigit(s2.charAt(j))) {
                        if(str.length() == 0 && s2.charAt(j) == '0'){
                            f = false;
                            break;
                        }
                        str.append(s2.charAt(j));
                        j++;
                    }if(!f)break;
                    int n = Integer.parseInt(str.toString());
                    // j += n;
                    i += n;
                } else {
                    f = false;
                    break;
                }
            }if(!f)break;
        }
        
        if (!f) {
            System.out.println(false);
        } else {
            System.out.println(true);
        }
        }
        sc.close();
    }
}

/*
Valid Word Abbreviation

Given a non-empty string s and an abbreviation abbr , return whether the string 
matches with the given abbreviation.
A string such as "word" contains only the following valid abbreviations:

["word", "1ord", "w1rd", "wo1d", "wor1", "2rd", "w2d", "wo2", "1o1d", "1or1", 
"w1r1", "1o2", "2r1", "3d", "w3", "4"]

Notice that only the above abbreviations are valid abbreviations of the string 
"word" . Any other string is not a valid abbreviation of "word" .

Note: Assume s contains only lowercase letters and abbr contains only lowercase 
letters and digits.

Example 1:
Given s = "internationalization", abbr = "i12iz4n":
Return true.

Example 2:
Given s = "apple", abbr = "a2e":
Return false.
*/


import java.util.*;

public class ValidWordAbbreviation{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String s1 = sc.next();
        String s2 = sc.next();
        
        int n1 = s1.length();
        int n2 = s2.length();
        int i = 0, j = 0;
        boolean f = true;
        if(n1 == 0 && n2 == 0){
            System.out.println(true);
        }else{
        
        while (i < n1 && j < n2) {
            if (s1.charAt(i) == s2.charAt(j)) {
                i++;
                j++;
            } else {
                if (Character.isDigit(s2.charAt(j))) {
                    StringBuilder str = new StringBuilder();
                    while (j < n2 && Character.isDigit(s2.charAt(j))) {
                        if(str.length() == 0 && s2.charAt(j) == '0'){
                            f = false;
                            break;
                        }
                        str.append(s2.charAt(j));
                        j++;
                    }if(!f)break;
                    int n = Integer.parseInt(str.toString());
                    // j += n;
                    i += n;
                } else {
                    f = false;
                    break;
                }
            }if(!f)break;
        }
        
        if (!f) {
            System.out.println(false);
        } else {
            System.out.println(true);
        }
        }
        sc.close();
    }
}

/*
Valid Word Abbreviation

Given a non-empty string s and an abbreviation abbr , return whether the string 
matches with the given abbreviation.
A string such as "word" contains only the following valid abbreviations:

["word", "1ord", "w1rd", "wo1d", "wor1", "2rd", "w2d", "wo2", "1o1d", "1or1", 
"w1r1", "1o2", "2r1", "3d", "w3", "4"]

Notice that only the above abbreviations are valid abbreviations of the string 
"word" . Any other string is not a valid abbreviation of "word" .

Note: Assume s contains only lowercase letters and abbr contains only lowercase 
letters and digits.

Example 1:
Given s = "internationalization", abbr = "i12iz4n":
Return true.

Example 2:
Given s = "apple", abbr = "a2e":
Return false.
*/


import java.util.*;

public class ValidWordAbbreviation{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String s1 = sc.next();
        String s2 = sc.next();
        
        int n1 = s1.length();
        int n2 = s2.length();
        int i = 0, j = 0;
        boolean f = true;
        if(n1 == 0 && n2 == 0){
            System.out.println(true);
        }else{
        
        while (i < n1 && j < n2) {
            if (s1.charAt(i) == s2.charAt(j)) {
                i++;
                j++;
            } else {
                if (Character.isDigit(s2.charAt(j))) {
                    StringBuilder str = new StringBuilder();
                    while (j < n2 && Character.isDigit(s2.charAt(j))) {
                        if(str.length() == 0 && s2.charAt(j) == '0'){
                            f = false;
                            break;
                        }
                        str.append(s2.charAt(j));
                        j++;
                    }if(!f)break;
                    int n = Integer.parseInt(str.toString());
                    // j += n;
                    i += n;
                } else {
                    f = false;
                    break;
                }
            }if(!f)break;
        }
        
        if (!f) {
            System.out.println(false);
        } else {
            System.out.println(true);
        }
        }
        sc.close();
    }
}

/*
Valid Word Abbreviation

Given a non-empty string s and an abbreviation abbr , return whether the string 
matches with the given abbreviation.
A string such as "word" contains only the following valid abbreviations:

["word", "1ord", "w1rd", "wo1d", "wor1", "2rd", "w2d", "wo2", "1o1d", "1or1", 
"w1r1", "1o2", "2r1", "3d", "w3", "4"]

Notice that only the above abbreviations are valid abbreviations of the string 
"word" . Any other string is not a valid abbreviation of "word" .

Note: Assume s contains only lowercase letters and abbr contains only lowercase 
letters and digits.

Example 1:
Given s = "internationalization", abbr = "i12iz4n":
Return true.

Example 2:
Given s = "apple", abbr = "a2e":
Return false.
*/


import java.util.*;

public class ValidWordAbbreviation{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String s1 = sc.next();
        String s2 = sc.next();
        
        int n1 = s1.length();
        int n2 = s2.length();
        int i = 0, j = 0;
        boolean f = true;
        if(n1 == 0 && n2 == 0){
            System.out.println(true);
        }else{
        
        while (i < n1 && j < n2) {
            if (s1.charAt(i) == s2.charAt(j)) {
                i++;
                j++;
            } else {
                if (Character.isDigit(s2.charAt(j))) {
                    StringBuilder str = new StringBuilder();
                    while (j < n2 && Character.isDigit(s2.charAt(j))) {
                        if(str.length() == 0 && s2.charAt(j) == '0'){
                            f = false;
                            break;
                        }
                        str.append(s2.charAt(j));
                        j++;
                    }if(!f)break;
                    int n = Integer.parseInt(str.toString());
                    // j += n;
                    i += n;
                } else {
                    f = false;
                    break;
                }
            }if(!f)break;
        }
        
        if (!f) {
            System.out.println(false);
        } else {
            System.out.println(true);
        }
        }
        sc.close();
    }
}

/*
Valid Word Abbreviation

Given a non-empty string s and an abbreviation abbr , return whether the string 
matches with the given abbreviation.
A string such as "word" contains only the following valid abbreviations:

["word", "1ord", "w1rd", "wo1d", "wor1", "2rd", "w2d", "wo2", "1o1d", "1or1", 
"w1r1", "1o2", "2r1", "3d", "w3", "4"]

Notice that only the above abbreviations are valid abbreviations of the string 
"word" . Any other string is not a valid abbreviation of "word" .

Note: Assume s contains only lowercase letters and abbr contains only lowercase 
letters and digits.

Example 1:
Given s = "internationalization", abbr = "i12iz4n":
Return true.

Example 2:
Given s = "apple", abbr = "a2e":
Return false.
*/


import java.util.*;

public class ValidWordAbbreviation{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String s1 = sc.next();
        String s2 = sc.next();
        
        int n1 = s1.length();
        int n2 = s2.length();
        int i = 0, j = 0;
        boolean f = true;
        if(n1 == 0 && n2 == 0){
            System.out.println(true);
        }else{
        
        while (i < n1 && j < n2) {
            if (s1.charAt(i) == s2.charAt(j)) {
                i++;
                j++;
            } else {
                if (Character.isDigit(s2.charAt(j))) {
                    StringBuilder str = new StringBuilder();
                    while (j < n2 && Character.isDigit(s2.charAt(j))) {
                        if(str.length() == 0 && s2.charAt(j) == '0'){
                            f = false;
                            break;
                        }
                        str.append(s2.charAt(j));
                        j++;
                    }if(!f)break;
                    int n = Integer.parseInt(str.toString());
                    // j += n;
                    i += n;
                } else {
                    f = false;
                    break;
                }
            }if(!f)break;
        }
        
        if (!f) {
            System.out.println(false);
        } else {
            System.out.println(true);
        }
        }
        sc.close();
    }
}

/*
Valid Word Abbreviation

Given a non-empty string s and an abbreviation abbr , return whether the string 
matches with the given abbreviation.
A string such as "word" contains only the following valid abbreviations:

["word", "1ord", "w1rd", "wo1d", "wor1", "2rd", "w2d", "wo2", "1o1d", "1or1", 
"w1r1", "1o2", "2r1", "3d", "w3", "4"]

Notice that only the above abbreviations are valid abbreviations of the string 
"word" . Any other string is not a valid abbreviation of "word" .

Note: Assume s contains only lowercase letters and abbr contains only lowercase 
letters and digits.

Example 1:
Given s = "internationalization", abbr = "i12iz4n":
Return true.

Example 2:
Given s = "apple", abbr = "a2e":
Return false.
*/


import java.util.*;

public class ValidWordAbbreviation{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String s1 = sc.next();
        String s2 = sc.next();
        
        int n1 = s1.length();
        int n2 = s2.length();
        int i = 0, j = 0;
        boolean f = true;
        if(n1 == 0 && n2 == 0){
            System.out.println(true);
        }else{
        
        while (i < n1 && j < n2) {
            if (s1.charAt(i) == s2.charAt(j)) {
                i++;
                j++;
            } else {
                if (Character.isDigit(s2.charAt(j))) {
                    StringBuilder str = new StringBuilder();
                    while (j < n2 && Character.isDigit(s2.charAt(j))) {
                        if(str.length() == 0 && s2.charAt(j) == '0'){
                            f = false;
                            break;
                        }
                        str.append(s2.charAt(j));
                        j++;
                    }if(!f)break;
                    int n = Integer.parseInt(str.toString());
                    // j += n;
                    i += n;
                } else {
                    f = false;
                    break;
                }
            }if(!f)break;
        }
        
        if (!f) {
            System.out.println(false);
        } else {
            System.out.println(true);
        }
        }
        sc.close();
    }
}

/*
Valid Word Abbreviation

Given a non-empty string s and an abbreviation abbr , return whether the string 
matches with the given abbreviation.
A string such as "word" contains only the following valid abbreviations:

["word", "1ord", "w1rd", "wo1d", "wor1", "2rd", "w2d", "wo2", "1o1d", "1or1", 
"w1r1", "1o2", "2r1", "3d", "w3", "4"]

Notice that only the above abbreviations are valid abbreviations of the string 
"word" . Any other string is not a valid abbreviation of "word" .

Note: Assume s contains only lowercase letters and abbr contains only lowercase 
letters and digits.

Example 1:
Given s = "internationalization", abbr = "i12iz4n":
Return true.

Example 2:
Given s = "apple", abbr = "a2e":
Return false.
*/


import java.util.*;

public class ValidWordAbbreviation{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String s1 = sc.next();
        String s2 = sc.next();
        
        int n1 = s1.length();
        int n2 = s2.length();
        int i = 0, j = 0;
        boolean f = true;
        if(n1 == 0 && n2 == 0){
            System.out.println(true);
        }else{
        
        while (i < n1 && j < n2) {
            if (s1.charAt(i) == s2.charAt(j)) {
                i++;
                j++;
            } else {
                if (Character.isDigit(s2.charAt(j))) {
                    StringBuilder str = new StringBuilder();
                    while (j < n2 && Character.isDigit(s2.charAt(j))) {
                        if(str.length() == 0 && s2.charAt(j) == '0'){
                            f = false;
                            break;
                        }
                        str.append(s2.charAt(j));
                        j++;
                    }if(!f)break;
                    int n = Integer.parseInt(str.toString());
                    // j += n;
                    i += n;
                } else {
                    f = false;
                    break;
                }
            }if(!f)break;
        }
        
        if (!f) {
            System.out.println(false);
        } else {
            System.out.println(true);
        }
        }
        sc.close();
    }
}

/*
Valid Word Abbreviation

Given a non-empty string s and an abbreviation abbr , return whether the string 
matches with the given abbreviation.
A string such as "word" contains only the following valid abbreviations:

["word", "1ord", "w1rd", "wo1d", "wor1", "2rd", "w2d", "wo2", "1o1d", "1or1", 
"w1r1", "1o2", "2r1", "3d", "w3", "4"]

Notice that only the above abbreviations are valid abbreviations of the string 
"word" . Any other string is not a valid abbreviation of "word" .

Note: Assume s contains only lowercase letters and abbr contains only lowercase 
letters and digits.

Example 1:
Given s = "internationalization", abbr = "i12iz4n":
Return true.

Example 2:
Given s = "apple", abbr = "a2e":
Return false.
*/


import java.util.*;

public class ValidWordAbbreviation{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String s1 = sc.next();
        String s2 = sc.next();
        
        int n1 = s1.length();
        int n2 = s2.length();
        int i = 0, j = 0;
        boolean f = true;
        if(n1 == 0 && n2 == 0){
            System.out.println(true);
        }else{
        
        while (i < n1 && j < n2) {
            if (s1.charAt(i) == s2.charAt(j)) {
                i++;
                j++;
            } else {
                if (Character.isDigit(s2.charAt(j))) {
                    StringBuilder str = new StringBuilder();
                    while (j < n2 && Character.isDigit(s2.charAt(j))) {
                        if(str.length() == 0 && s2.charAt(j) == '0'){
                            f = false;
                            break;
                        }
                        str.append(s2.charAt(j));
                        j++;
                    }if(!f)break;
                    int n = Integer.parseInt(str.toString());
                    // j += n;
                    i += n;
                } else {
                    f = false;
                    break;
                }
            }if(!f)break;
        }
        
        if (!f) {
            System.out.println(false);
        } else {
            System.out.println(true);
        }
        }
        sc.close();
    }
}

/*
Valid Word Abbreviation

Given a non-empty string s and an abbreviation abbr , return whether the string 
matches with the given abbreviation.
A string such as "word" contains only the following valid abbreviations:

["word", "1ord", "w1rd", "wo1d", "wor1", "2rd", "w2d", "wo2", "1o1d", "1or1", 
"w1r1", "1o2", "2r1", "3d", "w3", "4"]

Notice that only the above abbreviations are valid abbreviations of the string 
"word" . Any other string is not a valid abbreviation of "word" .

Note: Assume s contains only lowercase letters and abbr contains only lowercase 
letters and digits.

Example 1:
Given s = "internationalization", abbr = "i12iz4n":
Return true.

Example 2:
Given s = "apple", abbr = "a2e":
Return false.
*/


import java.util.*;

public class ValidWordAbbreviation{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String s1 = sc.next();
        String s2 = sc.next();
        
        int n1 = s1.length();
        int n2 = s2.length();
        int i = 0, j = 0;
        boolean f = true;
        if(n1 == 0 && n2 == 0){
            System.out.println(true);
        }else{
        
        while (i < n1 && j < n2) {
            if (s1.charAt(i) == s2.charAt(j)) {
                i++;
                j++;
            } else {
                if (Character.isDigit(s2.charAt(j))) {
                    StringBuilder str = new StringBuilder();
                    while (j < n2 && Character.isDigit(s2.charAt(j))) {
                        if(str.length() == 0 && s2.charAt(j) == '0'){
                            f = false;
                            break;
                        }
                        str.append(s2.charAt(j));
                        j++;
                    }if(!f)break;
                    int n = Integer.parseInt(str.toString());
                    // j += n;
                    i += n;
                } else {
                    f = false;
                    break;
                }
            }if(!f)break;
        }
        
        if (!f) {
            System.out.println(false);
        } else {
            System.out.println(true);
        }
        }
        sc.close();
    }
}

/*
Valid Word Abbreviation

Given a non-empty string s and an abbreviation abbr , return whether the string 
matches with the given abbreviation.
A string such as "word" contains only the following valid abbreviations:

["word", "1ord", "w1rd", "wo1d", "wor1", "2rd", "w2d", "wo2", "1o1d", "1or1", 
"w1r1", "1o2", "2r1", "3d", "w3", "4"]

Notice that only the above abbreviations are valid abbreviations of the string 
"word" . Any other string is not a valid abbreviation of "word" .

Note: Assume s contains only lowercase letters and abbr contains only lowercase 
letters and digits.

Example 1:
Given s = "internationalization", abbr = "i12iz4n":
Return true.

Example 2:
Given s = "apple", abbr = "a2e":
Return false.
*/


import java.util.*;

public class ValidWordAbbreviation{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String s1 = sc.next();
        String s2 = sc.next();
        
        int n1 = s1.length();
        int n2 = s2.length();
        int i = 0, j = 0;
        boolean f = true;
        if(n1 == 0 && n2 == 0){
            System.out.println(true);
        }else{
        
        while (i < n1 && j < n2) {
            if (s1.charAt(i) == s2.charAt(j)) {
                i++;
                j++;
            } else {
                if (Character.isDigit(s2.charAt(j))) {
                    StringBuilder str = new StringBuilder();
                    while (j < n2 && Character.isDigit(s2.charAt(j))) {
                        if(str.length() == 0 && s2.charAt(j) == '0'){
                            f = false;
                            break;
                        }
                        str.append(s2.charAt(j));
                        j++;
                    }if(!f)break;
                    int n = Integer.parseInt(str.toString());
                    // j += n;
                    i += n;
                } else {
                    f = false;
                    break;
                }
            }if(!f)break;
        }
        
        if (!f) {
            System.out.println(false);
        } else {
            System.out.println(true);
        }
        }
        sc.close();
    }
}

/*
Valid Word Abbreviation

Given a non-empty string s and an abbreviation abbr , return whether the string 
matches with the given abbreviation.
A string such as "word" contains only the following valid abbreviations:

["word", "1ord", "w1rd", "wo1d", "wor1", "2rd", "w2d", "wo2", "1o1d", "1or1", 
"w1r1", "1o2", "2r1", "3d", "w3", "4"]

Notice that only the above abbreviations are valid abbreviations of the string 
"word" . Any other string is not a valid abbreviation of "word" .

Note: Assume s contains only lowercase letters and abbr contains only lowercase 
letters and digits.

Example 1:
Given s = "internationalization", abbr = "i12iz4n":
Return true.

Example 2:
Given s = "apple", abbr = "a2e":
Return false.
*/


import java.util.*;

public class ValidWordAbbreviation{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String s1 = sc.next();
        String s2 = sc.next();
        
        int n1 = s1.length();
        int n2 = s2.length();
        int i = 0, j = 0;
        boolean f = true;
        if(n1 == 0 && n2 == 0){
            System.out.println(true);
        }else{
        
        while (i < n1 && j < n2) {
            if (s1.charAt(i) == s2.charAt(j)) {
                i++;
                j++;
            } else {
                if (Character.isDigit(s2.charAt(j))) {
                    StringBuilder str = new StringBuilder();
                    while (j < n2 && Character.isDigit(s2.charAt(j))) {
                        if(str.length() == 0 && s2.charAt(j) == '0'){
                            f = false;
                            break;
                        }
                        str.append(s2.charAt(j));
                        j++;
                    }if(!f)break;
                    int n = Integer.parseInt(str.toString());
                    // j += n;
                    i += n;
                } else {
                    f = false;
                    break;
                }
            }if(!f)break;
        }
        
        if (!f) {
            System.out.println(false);
        } else {
            System.out.println(true);
        }
        }
        sc.close();
    }
}

/*
Valid Word Abbreviation

Given a non-empty string s and an abbreviation abbr , return whether the string 
matches with the given abbreviation.
A string such as "word" contains only the following valid abbreviations:

["word", "1ord", "w1rd", "wo1d", "wor1", "2rd", "w2d", "wo2", "1o1d", "1or1", 
"w1r1", "1o2", "2r1", "3d", "w3", "4"]

Notice that only the above abbreviations are valid abbreviations of the string 
"word" . Any other string is not a valid abbreviation of "word" .

Note: Assume s contains only lowercase letters and abbr contains only lowercase 
letters and digits.

Example 1:
Given s = "internationalization", abbr = "i12iz4n":
Return true.

Example 2:
Given s = "apple", abbr = "a2e":
Return false.
*/


import java.util.*;

public class ValidWordAbbreviation{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String s1 = sc.next();
        String s2 = sc.next();
        
        int n1 = s1.length();
        int n2 = s2.length();
        int i = 0, j = 0;
        boolean f = true;
        if(n1 == 0 && n2 == 0){
            System.out.println(true);
        }else{
        
        while (i < n1 && j < n2) {
            if (s1.charAt(i) == s2.charAt(j)) {
                i++;
                j++;
            } else {
                if (Character.isDigit(s2.charAt(j))) {
                    StringBuilder str = new StringBuilder();
                    while (j < n2 && Character.isDigit(s2.charAt(j))) {
                        if(str.length() == 0 && s2.charAt(j) == '0'){
                            f = false;
                            break;
                        }
                        str.append(s2.charAt(j));
                        j++;
                    }if(!f)break;
                    int n = Integer.parseInt(str.toString());
                    // j += n;
                    i += n;
                } else {
                    f = false;
                    break;
                }
            }if(!f)break;
        }
        
        if (!f) {
            System.out.println(false);
        } else {
            System.out.println(true);
        }
        }
        sc.close();
    }
}

/*
Valid Word Abbreviation

Given a non-empty string s and an abbreviation abbr , return whether the string 
matches with the given abbreviation.
A string such as "word" contains only the following valid abbreviations:

["word", "1ord", "w1rd", "wo1d", "wor1", "2rd", "w2d", "wo2", "1o1d", "1or1", 
"w1r1", "1o2", "2r1", "3d", "w3", "4"]

Notice that only the above abbreviations are valid abbreviations of the string 
"word" . Any other string is not a valid abbreviation of "word" .

Note: Assume s contains only lowercase letters and abbr contains only lowercase 
letters and digits.

Example 1:
Given s = "internationalization", abbr = "i12iz4n":
Return true.

Example 2:
Given s = "apple", abbr = "a2e":
Return false.
*/


import java.util.*;

public class ValidWordAbbreviation{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String s1 = sc.next();
        String s2 = sc.next();
        
        int n1 = s1.length();
        int n2 = s2.length();
        int i = 0, j = 0;
        boolean f = true;
        if(n1 == 0 && n2 == 0){
            System.out.println(true);
        }else{
        
        while (i < n1 && j < n2) {
            if (s1.charAt(i) == s2.charAt(j)) {
                i++;
                j++;
            } else {
                if (Character.isDigit(s2.charAt(j))) {
                    StringBuilder str = new StringBuilder();
                    while (j < n2 && Character.isDigit(s2.charAt(j))) {
                        if(str.length() == 0 && s2.charAt(j) == '0'){
                            f = false;
                            break;
                        }
                        str.append(s2.charAt(j));
                        j++;
                    }if(!f)break;
                    int n = Integer.parseInt(str.toString());
                    // j += n;
                    i += n;
                } else {
                    f = false;
                    break;
                }
            }if(!f)break;
        }
        
        if (!f) {
            System.out.println(false);
        } else {
            System.out.println(true);
        }
        }
        sc.close();
    }
}

/*
Valid Word Abbreviation

Given a non-empty string s and an abbreviation abbr , return whether the string 
matches with the given abbreviation.
A string such as "word" contains only the following valid abbreviations:

["word", "1ord", "w1rd", "wo1d", "wor1", "2rd", "w2d", "wo2", "1o1d", "1or1", 
"w1r1", "1o2", "2r1", "3d", "w3", "4"]

Notice that only the above abbreviations are valid abbreviations of the string 
"word" . Any other string is not a valid abbreviation of "word" .

Note: Assume s contains only lowercase letters and abbr contains only lowercase 
letters and digits.

Example 1:
Given s = "internationalization", abbr = "i12iz4n":
Return true.

Example 2:
Given s = "apple", abbr = "a2e":
Return false.
*/


import java.util.*;

public class ValidWordAbbreviation{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String s1 = sc.next();
        String s2 = sc.next();
        
        int n1 = s1.length();
        int n2 = s2.length();
        int i = 0, j = 0;
        boolean f = true;
        if(n1 == 0 && n2 == 0){
            System.out.println(true);
        }else{
        
        while (i < n1 && j < n2) {
            if (s1.charAt(i) == s2.charAt(j)) {
                i++;
                j++;
            } else {
                if (Character.isDigit(s2.charAt(j))) {
                    StringBuilder str = new StringBuilder();
                    while (j < n2 && Character.isDigit(s2.charAt(j))) {
                        if(str.length() == 0 && s2.charAt(j) == '0'){
                            f = false;
                            break;
                        }
                        str.append(s2.charAt(j));
                        j++;
                    }if(!f)break;
                    int n = Integer.parseInt(str.toString());
                    // j += n;
                    i += n;
                } else {
                    f = false;
                    break;
                }
            }if(!f)break;
        }
        
        if (!f) {
            System.out.println(false);
        } else {
            System.out.println(true);
        }
        }
        sc.close();
    }
}

/*
Valid Word Abbreviation

Given a non-empty string s and an abbreviation abbr , return whether the string 
matches with the given abbreviation.
A string such as "word" contains only the following valid abbreviations:

["word", "1ord", "w1rd", "wo1d", "wor1", "2rd", "w2d", "wo2", "1o1d", "1or1", 
"w1r1", "1o2", "2r1", "3d", "w3", "4"]

Notice that only the above abbreviations are valid abbreviations of the string 
"word" . Any other string is not a valid abbreviation of "word" .

Note: Assume s contains only lowercase letters and abbr contains only lowercase 
letters and digits.

Example 1:
Given s = "internationalization", abbr = "i12iz4n":
Return true.

Example 2:
Given s = "apple", abbr = "a2e":
Return false.
*/


import java.util.*;

public class ValidWordAbbreviation{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String s1 = sc.next();
        String s2 = sc.next();
        
        int n1 = s1.length();
        int n2 = s2.length();
        int i = 0, j = 0;
        boolean f = true;
        if(n1 == 0 && n2 == 0){
            System.out.println(true);
        }else{
        
        while (i < n1 && j < n2) {
            if (s1.charAt(i) == s2.charAt(j)) {
                i++;
                j++;
            } else {
                if (Character.isDigit(s2.charAt(j))) {
                    StringBuilder str = new StringBuilder();
                    while (j < n2 && Character.isDigit(s2.charAt(j))) {
                        if(str.length() == 0 && s2.charAt(j) == '0'){
                            f = false;
                            break;
                        }
                        str.append(s2.charAt(j));
                        j++;
                    }if(!f)break;
                    int n = Integer.parseInt(str.toString());
                    // j += n;
                    i += n;
                } else {
                    f = false;
                    break;
                }
            }if(!f)break;
        }
        
        if (!f) {
            System.out.println(false);
        } else {
            System.out.println(true);
        }
        }
        sc.close();
    }
}

/*
Valid Word Abbreviation

Given a non-empty string s and an abbreviation abbr , return whether the string 
matches with the given abbreviation.
A string such as "word" contains only the following valid abbreviations:

["word", "1ord", "w1rd", "wo1d", "wor1", "2rd", "w2d", "wo2", "1o1d", "1or1", 
"w1r1", "1o2", "2r1", "3d", "w3", "4"]

Notice that only the above abbreviations are valid abbreviations of the string 
"word" . Any other string is not a valid abbreviation of "word" .

Note: Assume s contains only lowercase letters and abbr contains only lowercase 
letters and digits.

Example 1:
Given s = "internationalization", abbr = "i12iz4n":
Return true.

Example 2:
Given s = "apple", abbr = "a2e":
Return false.
*/


import java.util.*;

public class ValidWordAbbreviation{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String s1 = sc.next();
        String s2 = sc.next();
        
        int n1 = s1.length();
        int n2 = s2.length();
        int i = 0, j = 0;
        boolean f = true;
        if(n1 == 0 && n2 == 0){
            System.out.println(true);
        }else{
        
        while (i < n1 && j < n2) {
            if (s1.charAt(i) == s2.charAt(j)) {
                i++;
                j++;
            } else {
                if (Character.isDigit(s2.charAt(j))) {
                    StringBuilder str = new StringBuilder();
                    while (j < n2 && Character.isDigit(s2.charAt(j))) {
                        if(str.length() == 0 && s2.charAt(j) == '0'){
                            f = false;
                            break;
                        }
                        str.append(s2.charAt(j));
                        j++;
                    }if(!f)break;
                    int n = Integer.parseInt(str.toString());
                    // j += n;
                    i += n;
                } else {
                    f = false;
                    break;
                }
            }if(!f)break;
        }
        
        if (!f) {
            System.out.println(false);
        } else {
            System.out.println(true);
        }
        }
        sc.close();
    }
}

/*
Valid Word Abbreviation

Given a non-empty string s and an abbreviation abbr , return whether the string 
matches with the given abbreviation.
A string such as "word" contains only the following valid abbreviations:

["word", "1ord", "w1rd", "wo1d", "wor1", "2rd", "w2d", "wo2", "1o1d", "1or1", 
"w1r1", "1o2", "2r1", "3d", "w3", "4"]

Notice that only the above abbreviations are valid abbreviations of the string 
"word" . Any other string is not a valid abbreviation of "word" .

Note: Assume s contains only lowercase letters and abbr contains only lowercase 
letters and digits.

Example 1:
Given s = "internationalization", abbr = "i12iz4n":
Return true.

Example 2:
Given s = "apple", abbr = "a2e":
Return false.
*/


import java.util.*;

public class ValidWordAbbreviation{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String s1 = sc.next();
        String s2 = sc.next();
        
        int n1 = s1.length();
        int n2 = s2.length();
        int i = 0, j = 0;
        boolean f = true;
        if(n1 == 0 && n2 == 0){
            System.out.println(true);
        }else{
        
        while (i < n1 && j < n2) {
            if (s1.charAt(i) == s2.charAt(j)) {
                i++;
                j++;
            } else {
                if (Character.isDigit(s2.charAt(j))) {
                    StringBuilder str = new StringBuilder();
                    while (j < n2 && Character.isDigit(s2.charAt(j))) {
                        if(str.length() == 0 && s2.charAt(j) == '0'){
                            f = false;
                            break;
                        }
                        str.append(s2.charAt(j));
                        j++;
                    }if(!f)break;
                    int n = Integer.parseInt(str.toString());
                    // j += n;
                    i += n;
                } else {
                    f = false;
                    break;
                }
            }if(!f)break;
        }
        
        if (!f) {
            System.out.println(false);
        } else {
            System.out.println(true);
        }
        }
        sc.close();
    }
}

/*
Valid Word Abbreviation

Given a non-empty string s and an abbreviation abbr , return whether the string 
matches with the given abbreviation.
A string such as "word" contains only the following valid abbreviations:

["word", "1ord", "w1rd", "wo1d", "wor1", "2rd", "w2d", "wo2", "1o1d", "1or1", 
"w1r1", "1o2", "2r1", "3d", "w3", "4"]

Notice that only the above abbreviations are valid abbreviations of the string 
"word" . Any other string is not a valid abbreviation of "word" .

Note: Assume s contains only lowercase letters and abbr contains only lowercase 
letters and digits.

Example 1:
Given s = "internationalization", abbr = "i12iz4n":
Return true.

Example 2:
Given s = "apple", abbr = "a2e":
Return false.
*/


import java.util.*;

public class ValidWordAbbreviation{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String s1 = sc.next();
        String s2 = sc.next();
        
        int n1 = s1.length();
        int n2 = s2.length();
        int i = 0, j = 0;
        boolean f = true;
        if(n1 == 0 && n2 == 0){
            System.out.println(true);
        }else{
        
        while (i < n1 && j < n2) {
            if (s1.charAt(i) == s2.charAt(j)) {
                i++;
                j++;
            } else {
                if (Character.isDigit(s2.charAt(j))) {
                    StringBuilder str = new StringBuilder();
                    while (j < n2 && Character.isDigit(s2.charAt(j))) {
                        if(str.length() == 0 && s2.charAt(j) == '0'){
                            f = false;
                            break;
                        }
                        str.append(s2.charAt(j));
                        j++;
                    }if(!f)break;
                    int n = Integer.parseInt(str.toString());
                    // j += n;
                    i += n;
                } else {
                    f = false;
                    break;
                }
            }if(!f)break;
        }
        
        if (!f) {
            System.out.println(false);
        } else {
            System.out.println(true);
        }
        }
        sc.close();
    }
}

/*
Valid Word Abbreviation

Given a non-empty string s and an abbreviation abbr , return whether the string 
matches with the given abbreviation.
A string such as "word" contains only the following valid abbreviations:

["word", "1ord", "w1rd", "wo1d", "wor1", "2rd", "w2d", "wo2", "1o1d", "1or1", 
"w1r1", "1o2", "2r1", "3d", "w3", "4"]

Notice that only the above abbreviations are valid abbreviations of the string 
"word" . Any other string is not a valid abbreviation of "word" .

Note: Assume s contains only lowercase letters and abbr contains only lowercase 
letters and digits.

Example 1:
Given s = "internationalization", abbr = "i12iz4n":
Return true.

Example 2:
Given s = "apple", abbr = "a2e":
Return false.
*/


import java.util.*;

public class ValidWordAbbreviation{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String s1 = sc.next();
        String s2 = sc.next();
        
        int n1 = s1.length();
        int n2 = s2.length();
        int i = 0, j = 0;
        boolean f = true;
        if(n1 == 0 && n2 == 0){
            System.out.println(true);
        }else{
        
        while (i < n1 && j < n2) {
            if (s1.charAt(i) == s2.charAt(j)) {
                i++;
                j++;
            } else {
                if (Character.isDigit(s2.charAt(j))) {
                    StringBuilder str = new StringBuilder();
                    while (j < n2 && Character.isDigit(s2.charAt(j))) {
                        if(str.length() == 0 && s2.charAt(j) == '0'){
                            f = false;
                            break;
                        }
                        str.append(s2.charAt(j));
                        j++;
                    }if(!f)break;
                    int n = Integer.parseInt(str.toString());
                    // j += n;
                    i += n;
                } else {
                    f = false;
                    break;
                }
            }if(!f)break;
        }
        
        if (!f) {
            System.out.println(false);
        } else {
            System.out.println(true);
        }
        }
        sc.close();
    }
}

/*
Valid Word Abbreviation

Given a non-empty string s and an abbreviation abbr , return whether the string 
matches with the given abbreviation.
A string such as "word" contains only the following valid abbreviations:

["word", "1ord", "w1rd", "wo1d", "wor1", "2rd", "w2d", "wo2", "1o1d", "1or1", 
"w1r1", "1o2", "2r1", "3d", "w3", "4"]

Notice that only the above abbreviations are valid abbreviations of the string 
"word" . Any other string is not a valid abbreviation of "word" .

Note: Assume s contains only lowercase letters and abbr contains only lowercase 
letters and digits.

Example 1:
Given s = "internationalization", abbr = "i12iz4n":
Return true.

Example 2:
Given s = "apple", abbr = "a2e":
Return false.
*/


import java.util.*;

public class ValidWordAbbreviation{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String s1 = sc.next();
        String s2 = sc.next();
        
        int n1 = s1.length();
        int n2 = s2.length();
        int i = 0, j = 0;
        boolean f = true;
        if(n1 == 0 && n2 == 0){
            System.out.println(true);
        }else{
        
        while (i < n1 && j < n2) {
            if (s1.charAt(i) == s2.charAt(j)) {
                i++;
                j++;
            } else {
                if (Character.isDigit(s2.charAt(j))) {
                    StringBuilder str = new StringBuilder();
                    while (j < n2 && Character.isDigit(s2.charAt(j))) {
                        if(str.length() == 0 && s2.charAt(j) == '0'){
                            f = false;
                            break;
                        }
                        str.append(s2.charAt(j));
                        j++;
                    }if(!f)break;
                    int n = Integer.parseInt(str.toString());
                    // j += n;
                    i += n;
                } else {
                    f = false;
                    break;
                }
            }if(!f)break;
        }
        
        if (!f) {
            System.out.println(false);
        } else {
            System.out.println(true);
        }
        }
        sc.close();
    }
}

/*
Valid Word Abbreviation

Given a non-empty string s and an abbreviation abbr , return whether the string 
matches with the given abbreviation.
A string such as "word" contains only the following valid abbreviations:

["word", "1ord", "w1rd", "wo1d", "wor1", "2rd", "w2d", "wo2", "1o1d", "1or1", 
"w1r1", "1o2", "2r1", "3d", "w3", "4"]

Notice that only the above abbreviations are valid abbreviations of the string 
"word" . Any other string is not a valid abbreviation of "word" .

Note: Assume s contains only lowercase letters and abbr contains only lowercase 
letters and digits.

Example 1:
Given s = "internationalization", abbr = "i12iz4n":
Return true.

Example 2:
Given s = "apple", abbr = "a2e":
Return false.
*/


import java.util.*;

public class ValidWordAbbreviation{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String s1 = sc.next();
        String s2 = sc.next();
        
        int n1 = s1.length();
        int n2 = s2.length();
        int i = 0, j = 0;
        boolean f = true;
        if(n1 == 0 && n2 == 0){
            System.out.println(true);
        }else{
        
        while (i < n1 && j < n2) {
            if (s1.charAt(i) == s2.charAt(j)) {
                i++;
                j++;
            } else {
                if (Character.isDigit(s2.charAt(j))) {
                    StringBuilder str = new StringBuilder();
                    while (j < n2 && Character.isDigit(s2.charAt(j))) {
                        if(str.length() == 0 && s2.charAt(j) == '0'){
                            f = false;
                            break;
                        }
                        str.append(s2.charAt(j));
                        j++;
                    }if(!f)break;
                    int n = Integer.parseInt(str.toString());
                    // j += n;
                    i += n;
                } else {
                    f = false;
                    break;
                }
            }if(!f)break;
        }
        
        if (!f) {
            System.out.println(false);
        } else {
            System.out.println(true);
        }
        }
        sc.close();
    }
}

/*
Valid Word Abbreviation

Given a non-empty string s and an abbreviation abbr , return whether the string 
matches with the given abbreviation.
A string such as "word" contains only the following valid abbreviations:

["word", "1ord", "w1rd", "wo1d", "wor1", "2rd", "w2d", "wo2", "1o1d", "1or1", 
"w1r1", "1o2", "2r1", "3d", "w3", "4"]

Notice that only the above abbreviations are valid abbreviations of the string 
"word" . Any other string is not a valid abbreviation of "word" .

Note: Assume s contains only lowercase letters and abbr contains only lowercase 
letters and digits.

Example 1:
Given s = "internationalization", abbr = "i12iz4n":
Return true.

Example 2:
Given s = "apple", abbr = "a2e":
Return false.
*/


import java.util.*;

public class ValidWordAbbreviation{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String s1 = sc.next();
        String s2 = sc.next();
        
        int n1 = s1.length();
        int n2 = s2.length();
        int i = 0, j = 0;
        boolean f = true;
        if(n1 == 0 && n2 == 0){
            System.out.println(true);
        }else{
        
        while (i < n1 && j < n2) {
            if (s1.charAt(i) == s2.charAt(j)) {
                i++;
                j++;
            } else {
                if (Character.isDigit(s2.charAt(j))) {
                    StringBuilder str = new StringBuilder();
                    while (j < n2 && Character.isDigit(s2.charAt(j))) {
                        if(str.length() == 0 && s2.charAt(j) == '0'){
                            f = false;
                            break;
                        }
                        str.append(s2.charAt(j));
                        j++;
                    }if(!f)break;
                    int n = Integer.parseInt(str.toString());
                    // j += n;
                    i += n;
                } else {
                    f = false;
                    break;
                }
            }if(!f)break;
        }
        
        if (!f) {
            System.out.println(false);
        } else {
            System.out.println(true);
        }
        }
        sc.close();
    }
}

/*
Valid Word Abbreviation

Given a non-empty string s and an abbreviation abbr , return whether the string 
matches with the given abbreviation.
A string such as "word" contains only the following valid abbreviations:

["word", "1ord", "w1rd", "wo1d", "wor1", "2rd", "w2d", "wo2", "1o1d", "1or1", 
"w1r1", "1o2", "2r1", "3d", "w3", "4"]

Notice that only the above abbreviations are valid abbreviations of the string 
"word" . Any other string is not a valid abbreviation of "word" .

Note: Assume s contains only lowercase letters and abbr contains only lowercase 
letters and digits.

Example 1:
Given s = "internationalization", abbr = "i12iz4n":
Return true.

Example 2:
Given s = "apple", abbr = "a2e":
Return false.
*/


import java.util.*;

public class ValidWordAbbreviation{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String s1 = sc.next();
        String s2 = sc.next();
        
        int n1 = s1.length();
        int n2 = s2.length();
        int i = 0, j = 0;
        boolean f = true;
        if(n1 == 0 && n2 == 0){
            System.out.println(true);
        }else{
        
        while (i < n1 && j < n2) {
            if (s1.charAt(i) == s2.charAt(j)) {
                i++;
                j++;
            } else {
                if (Character.isDigit(s2.charAt(j))) {
                    StringBuilder str = new StringBuilder();
                    while (j < n2 && Character.isDigit(s2.charAt(j))) {
                        if(str.length() == 0 && s2.charAt(j) == '0'){
                            f = false;
                            break;
                        }
                        str.append(s2.charAt(j));
                        j++;
                    }if(!f)break;
                    int n = Integer.parseInt(str.toString());
                    // j += n;
                    i += n;
                } else {
                    f = false;
                    break;
                }
            }if(!f)break;
        }
        
        if (!f) {
            System.out.println(false);
        } else {
            System.out.println(true);
        }
        }
        sc.close();
    }
}

/*
Valid Word Abbreviation

Given a non-empty string s and an abbreviation abbr , return whether the string 
matches with the given abbreviation.
A string such as "word" contains only the following valid abbreviations:

["word", "1ord", "w1rd", "wo1d", "wor1", "2rd", "w2d", "wo2", "1o1d", "1or1", 
"w1r1", "1o2", "2r1", "3d", "w3", "4"]

Notice that only the above abbreviations are valid abbreviations of the string 
"word" . Any other string is not a valid abbreviation of "word" .

Note: Assume s contains only lowercase letters and abbr contains only lowercase 
letters and digits.

Example 1:
Given s = "internationalization", abbr = "i12iz4n":
Return true.

Example 2:
Given s = "apple", abbr = "a2e":
Return false.
*/


import java.util.*;

public class ValidWordAbbreviation{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String s1 = sc.next();
        String s2 = sc.next();
        
        int n1 = s1.length();
        int n2 = s2.length();
        int i = 0, j = 0;
        boolean f = true;
        if(n1 == 0 && n2 == 0){
            System.out.println(true);
        }else{
        
        while (i < n1 && j < n2) {
            if (s1.charAt(i) == s2.charAt(j)) {
                i++;
                j++;
            } else {
                if (Character.isDigit(s2.charAt(j))) {
                    StringBuilder str = new StringBuilder();
                    while (j < n2 && Character.isDigit(s2.charAt(j))) {
                        if(str.length() == 0 && s2.charAt(j) == '0'){
                            f = false;
                            break;
                        }
                        str.append(s2.charAt(j));
                        j++;
                    }if(!f)break;
                    int n = Integer.parseInt(str.toString());
                    // j += n;
                    i += n;
                } else {
                    f = false;
                    break;
                }
            }if(!f)break;
        }
        
        if (!f) {
            System.out.println(false);
        } else {
            System.out.println(true);
        }
        }
        sc.close();
    }
}

/*
Valid Word Abbreviation

Given a non-empty string s and an abbreviation abbr , return whether the string 
matches with the given abbreviation.
A string such as "word" contains only the following valid abbreviations:

["word", "1ord", "w1rd", "wo1d", "wor1", "2rd", "w2d", "wo2", "1o1d", "1or1", 
"w1r1", "1o2", "2r1", "3d", "w3", "4"]

Notice that only the above abbreviations are valid abbreviations of the string 
"word" . Any other string is not a valid abbreviation of "word" .

Note: Assume s contains only lowercase letters and abbr contains only lowercase 
letters and digits.

Example 1:
Given s = "internationalization", abbr = "i12iz4n":
Return true.

Example 2:
Given s = "apple", abbr = "a2e":
Return false.
*/


import java.util.*;

public class ValidWordAbbreviation{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String s1 = sc.next();
        String s2 = sc.next();
        
        int n1 = s1.length();
        int n2 = s2.length();
        int i = 0, j = 0;
        boolean f = true;
        if(n1 == 0 && n2 == 0){
            System.out.println(true);
        }else{
        
        while (i < n1 && j < n2) {
            if (s1.charAt(i) == s2.charAt(j)) {
                i++;
                j++;
            } else {
                if (Character.isDigit(s2.charAt(j))) {
                    StringBuilder str = new StringBuilder();
                    while (j < n2 && Character.isDigit(s2.charAt(j))) {
                        if(str.length() == 0 && s2.charAt(j) == '0'){
                            f = false;
                            break;
                        }
                        str.append(s2.charAt(j));
                        j++;
                    }if(!f)break;
                    int n = Integer.parseInt(str.toString());
                    // j += n;
                    i += n;
                } else {
                    f = false;
                    break;
                }
            }if(!f)break;
        }
        
        if (!f) {
            System.out.println(false);
        } else {
            System.out.println(true);
        }
        }
        sc.close();
    }
}

/*
Valid Word Abbreviation

Given a non-empty string s and an abbreviation abbr , return whether the string 
matches with the given abbreviation.
A string such as "word" contains only the following valid abbreviations:

["word", "1ord", "w1rd", "wo1d", "wor1", "2rd", "w2d", "wo2", "1o1d", "1or1", 
"w1r1", "1o2", "2r1", "3d", "w3", "4"]

Notice that only the above abbreviations are valid abbreviations of the string 
"word" . Any other string is not a valid abbreviation of "word" .

Note: Assume s contains only lowercase letters and abbr contains only lowercase 
letters and digits.

Example 1:
Given s = "internationalization", abbr = "i12iz4n":
Return true.

Example 2:
Given s = "apple", abbr = "a2e":
Return false.
*/


import java.util.*;

public class ValidWordAbbreviation{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String s1 = sc.next();
        String s2 = sc.next();
        
        int n1 = s1.length();
        int n2 = s2.length();
        int i = 0, j = 0;
        boolean f = true;
        if(n1 == 0 && n2 == 0){
            System.out.println(true);
        }else{
        
        while (i < n1 && j < n2) {
            if (s1.charAt(i) == s2.charAt(j)) {
                i++;
                j++;
            } else {
                if (Character.isDigit(s2.charAt(j))) {
                    StringBuilder str = new StringBuilder();
                    while (j < n2 && Character.isDigit(s2.charAt(j))) {
                        if(str.length() == 0 && s2.charAt(j) == '0'){
                            f = false;
                            break;
                        }
                        str.append(s2.charAt(j));
                        j++;
                    }if(!f)break;
                    int n = Integer.parseInt(str.toString());
                    // j += n;
                    i += n;
                } else {
                    f = false;
                    break;
                }
            }if(!f)break;
        }
        
        if (!f) {
            System.out.println(false);
        } else {
            System.out.println(true);
        }
        }
        sc.close();
    }
}

/*
Valid Word Abbreviation

Given a non-empty string s and an abbreviation abbr , return whether the string 
matches with the given abbreviation.
A string such as "word" contains only the following valid abbreviations:

["word", "1ord", "w1rd", "wo1d", "wor1", "2rd", "w2d", "wo2", "1o1d", "1or1", 
"w1r1", "1o2", "2r1", "3d", "w3", "4"]

Notice that only the above abbreviations are valid abbreviations of the string 
"word" . Any other string is not a valid abbreviation of "word" .

Note: Assume s contains only lowercase letters and abbr contains only lowercase 
letters and digits.

Example 1:
Given s = "internationalization", abbr = "i12iz4n":
Return true.

Example 2:
Given s = "apple", abbr = "a2e":
Return false.
*/


import java.util.*;

public class ValidWordAbbreviation{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String s1 = sc.next();
        String s2 = sc.next();
        
        int n1 = s1.length();
        int n2 = s2.length();
        int i = 0, j = 0;
        boolean f = true;
        if(n1 == 0 && n2 == 0){
            System.out.println(true);
        }else{
        
        while (i < n1 && j < n2) {
            if (s1.charAt(i) == s2.charAt(j)) {
                i++;
                j++;
            } else {
                if (Character.isDigit(s2.charAt(j))) {
                    StringBuilder str = new StringBuilder();
                    while (j < n2 && Character.isDigit(s2.charAt(j))) {
                        if(str.length() == 0 && s2.charAt(j) == '0'){
                            f = false;
                            break;
                        }
                        str.append(s2.charAt(j));
                        j++;
                    }if(!f)break;
                    int n = Integer.parseInt(str.toString());
                    // j += n;
                    i += n;
                } else {
                    f = false;
                    break;
                }
            }if(!f)break;
        }
        
        if (!f) {
            System.out.println(false);
        } else {
            System.out.println(true);
        }
        }
        sc.close();
    }
}

/*
Valid Word Abbreviation

Given a non-empty string s and an abbreviation abbr , return whether the string 
matches with the given abbreviation.
A string such as "word" contains only the following valid abbreviations:

["word", "1ord", "w1rd", "wo1d", "wor1", "2rd", "w2d", "wo2", "1o1d", "1or1", 
"w1r1", "1o2", "2r1", "3d", "w3", "4"]

Notice that only the above abbreviations are valid abbreviations of the string 
"word" . Any other string is not a valid abbreviation of "word" .

Note: Assume s contains only lowercase letters and abbr contains only lowercase 
letters and digits.

Example 1:
Given s = "internationalization", abbr = "i12iz4n":
Return true.

Example 2:
Given s = "apple", abbr = "a2e":
Return false.
*/


import java.util.*;

public class ValidWordAbbreviation{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String s1 = sc.next();
        String s2 = sc.next();
        
        int n1 = s1.length();
        int n2 = s2.length();
        int i = 0, j = 0;
        boolean f = true;
        if(n1 == 0 && n2 == 0){
            System.out.println(true);
        }else{
        
        while (i < n1 && j < n2) {
            if (s1.charAt(i) == s2.charAt(j)) {
                i++;
                j++;
            } else {
                if (Character.isDigit(s2.charAt(j))) {
                    StringBuilder str = new StringBuilder();
                    while (j < n2 && Character.isDigit(s2.charAt(j))) {
                        if(str.length() == 0 && s2.charAt(j) == '0'){
                            f = false;
                            break;
                        }
                        str.append(s2.charAt(j));
                        j++;
                    }if(!f)break;
                    int n = Integer.parseInt(str.toString());
                    // j += n;
                    i += n;
                } else {
                    f = false;
                    break;
                }
            }if(!f)break;
        }
        
        if (!f) {
            System.out.println(false);
        } else {
            System.out.println(true);
        }
        }
        sc.close();
    }
}

/*
Valid Word Abbreviation

Given a non-empty string s and an abbreviation abbr , return whether the string 
matches with the given abbreviation.
A string such as "word" contains only the following valid abbreviations:

["word", "1ord", "w1rd", "wo1d", "wor1", "2rd", "w2d", "wo2", "1o1d", "1or1", 
"w1r1", "1o2", "2r1", "3d", "w3", "4"]

Notice that only the above abbreviations are valid abbreviations of the string 
"word" . Any other string is not a valid abbreviation of "word" .

Note: Assume s contains only lowercase letters and abbr contains only lowercase 
letters and digits.

Example 1:
Given s = "internationalization", abbr = "i12iz4n":
Return true.

Example 2:
Given s = "apple", abbr = "a2e":
Return false.
*/


import java.util.*;

public class ValidWordAbbreviation{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String s1 = sc.next();
        String s2 = sc.next();
        
        int n1 = s1.length();
        int n2 = s2.length();
        int i = 0, j = 0;
        boolean f = true;
        if(n1 == 0 && n2 == 0){
            System.out.println(true);
        }else{
        
        while (i < n1 && j < n2) {
            if (s1.charAt(i) == s2.charAt(j)) {
                i++;
                j++;
            } else {
                if (Character.isDigit(s2.charAt(j))) {
                    StringBuilder str = new StringBuilder();
                    while (j < n2 && Character.isDigit(s2.charAt(j))) {
                        if(str.length() == 0 && s2.charAt(j) == '0'){
                            f = false;
                            break;
                        }
                        str.append(s2.charAt(j));
                        j++;
                    }if(!f)break;
                    int n = Integer.parseInt(str.toString());
                    // j += n;
                    i += n;
                } else {
                    f = false;
                    break;
                }
            }if(!f)break;
        }
        
        if (!f) {
            System.out.println(false);
        } else {
            System.out.println(true);
        }
        }
        sc.close();
    }
}

/*
Valid Word Abbreviation

Given a non-empty string s and an abbreviation abbr , return whether the string 
matches with the given abbreviation.
A string such as "word" contains only the following valid abbreviations:

["word", "1ord", "w1rd", "wo1d", "wor1", "2rd", "w2d", "wo2", "1o1d", "1or1", 
"w1r1", "1o2", "2r1", "3d", "w3", "4"]

Notice that only the above abbreviations are valid abbreviations of the string 
"word" . Any other string is not a valid abbreviation of "word" .

Note: Assume s contains only lowercase letters and abbr contains only lowercase 
letters and digits.

Example 1:
Given s = "internationalization", abbr = "i12iz4n":
Return true.

Example 2:
Given s = "apple", abbr = "a2e":
Return false.
*/


import java.util.*;

public class ValidWordAbbreviation{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String s1 = sc.next();
        String s2 = sc.next();
        
        int n1 = s1.length();
        int n2 = s2.length();
        int i = 0, j = 0;
        boolean f = true;
        if(n1 == 0 && n2 == 0){
            System.out.println(true);
        }else{
        
        while (i < n1 && j < n2) {
            if (s1.charAt(i) == s2.charAt(j)) {
                i++;
                j++;
            } else {
                if (Character.isDigit(s2.charAt(j))) {
                    StringBuilder str = new StringBuilder();
                    while (j < n2 && Character.isDigit(s2.charAt(j))) {
                        if(str.length() == 0 && s2.charAt(j) == '0'){
                            f = false;
                            break;
                        }
                        str.append(s2.charAt(j));
                        j++;
                    }if(!f)break;
                    int n = Integer.parseInt(str.toString());
                    // j += n;
                    i += n;
                } else {
                    f = false;
                    break;
                }
            }if(!f)break;
        }
        
        if (!f) {
            System.out.println(false);
        } else {
            System.out.println(true);
        }
        }
        sc.close();
    }
}

/*
Valid Word Abbreviation

Given a non-empty string s and an abbreviation abbr , return whether the string 
matches with the given abbreviation.
A string such as "word" contains only the following valid abbreviations:

["word", "1ord", "w1rd", "wo1d", "wor1", "2rd", "w2d", "wo2", "1o1d", "1or1", 
"w1r1", "1o2", "2r1", "3d", "w3", "4"]

Notice that only the above abbreviations are valid abbreviations of the string 
"word" . Any other string is not a valid abbreviation of "word" .

Note: Assume s contains only lowercase letters and abbr contains only lowercase 
letters and digits.

Example 1:
Given s = "internationalization", abbr = "i12iz4n":
Return true.

Example 2:
Given s = "apple", abbr = "a2e":
Return false.
*/


import java.util.*;

public class ValidWordAbbreviation{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String s1 = sc.next();
        String s2 = sc.next();
        
        int n1 = s1.length();
        int n2 = s2.length();
        int i = 0, j = 0;
        boolean f = true;
        if(n1 == 0 && n2 == 0){
            System.out.println(true);
        }else{
        
        while (i < n1 && j < n2) {
            if (s1.charAt(i) == s2.charAt(j)) {
                i++;
                j++;
            } else {
                if (Character.isDigit(s2.charAt(j))) {
                    StringBuilder str = new StringBuilder();
                    while (j < n2 && Character.isDigit(s2.charAt(j))) {
                        if(str.length() == 0 && s2.charAt(j) == '0'){
                            f = false;
                            break;
                        }
                        str.append(s2.charAt(j));
                        j++;
                    }if(!f)break;
                    int n = Integer.parseInt(str.toString());
                    // j += n;
                    i += n;
                } else {
                    f = false;
                    break;
                }
            }if(!f)break;
        }
        
        if (!f) {
            System.out.println(false);
        } else {
            System.out.println(true);
        }
        }
        sc.close();
    }
}

