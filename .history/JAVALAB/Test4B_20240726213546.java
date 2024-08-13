package JAVALAB;

import java.io.*;
import java.util.*;
class Test4B
{
	public static String mergeAlternately(String word1, String word2) 
	{
        	StringBuilder sb = new StringBuilder();
        	int index1 = 0, index2 = 0;
        	while (index1 < word1.length() && index2 < word2.length()) 
		{
            		sb.append(word1.charAt(index1));
            		sb.append(word2.charAt(index2));
            		index1++;
            		index2++;
		}
        		while (index1 < word1.length()) 
		{
            		sb.append(word1.charAt(index1));
            		index1++; 
		}
       		while (index2 < word2.length()) 
		{
            		sb.append(word2.charAt(index2));
            		index2++;
		}
        	return sb.toString();
	}
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println(mergeAlternately(sc.next(),sc.next()));
	}
}
