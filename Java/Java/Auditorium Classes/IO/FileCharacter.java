import java.io.*;
import java.util.Scanner;
public class FileCharacter {
	public static void main(String args[]) throws Exception{
		File f = new File("Hyderabad/KMIT");
		f.mkdirs();
		File f2 = new File(f, "VoterList.txt");
		f2.createNewFile();
		Scanner sc = new Scanner(System.in);
		int n = 5;
		FileWriter fw = new FileWriter(f2);
		while(n>0){
			String name = sc.next();
			int age = sc.nextInt();
			fw.write(name + "," + age + "\n");
			n--;	
		}
		fw.close();
		
		
		FileReader fr = new FileReader(f2);
		
		BufferedReader br = new BufferedReader(fr);
		String data = br.readLine();
		while(data!=null){
			String[] l = data.split(",");
		
			if(Integer.parseInt(l[1])>60)
				System.out.println(l[0]);
			
			data = br.readLine();
		}
		
		/*int i = fr.read();
		while(i!=-1){
			System.out.print((char) i);
			i = fr.read();
		}*/
		fr.close();
	}
}
