package JAVALAB;


import java.util.*; 
import java.io.*;
public class Test6A
{ 
	public static void main(String[] args) throws Exception 
	{ 
		Scanner sc = new Scanner(System.in); 
		FileReader fr = new FileReader("Phonebook.txt"); 
		BufferedReader br=new BufferedReader(fr); 
		Hashtable<String,String> ht=new Hashtable<>(); 
		String line,name, mobile; 
		while((line=br.readLine())!=null) 
		{ 	
			String s[] = line.split("\\s+");
			ht.put(s[0],s[1]); } 
			System.out.println(ht); 
			System.out.print("Enter name: "); 
			name = sc.next(); 
			if (ht.containsKey(name))
			{ 
				System.out.println("Mobile number is " + ht.get(name)); 
			} 
			else 
			{ 	
				System.out.println("Not Found"); 
			}
			System.out.print("Enter mobile number: "); 
			mobile = sc.next(); 
			if (ht.containsValue(mobile)) 
			{
				Set<Map.Entry<String,String>> s1=ht.entrySet();
				for (Map.Entry<String,String> e : s1) 
				{ 
					if (mobile.equals(e.getValue()))
					{ 
						System.out.println("Name is " + e.getKey()); 
					} 
				} 
			}
			else 
			{ 
				System.out.println("Not Found"); 
			} 
			br.close(); 
		} 
}

