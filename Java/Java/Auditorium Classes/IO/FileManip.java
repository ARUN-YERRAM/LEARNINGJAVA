import java.io.*;
public class FileManip {
	public static void main(String[] args) throws Exception{
		/*File f = new File("VoterList.csv");
		f.createNewFile();
		FileOutputStream fos = new FileOutputStream(f);
		fos.write("Hello, how are you?".getBytes());
		fos.close();
		System.out.println("Written Successfully!");*/
		
		
		File f1 = new File("dog.jpeg");
		File f2 = new File("CopyOfDog.jpeg");
		
		FileOutputStream fos2 = new FileOutputStream(f2);
		FileInputStream fos1 = new FileInputStream(f1);
		
		int k = fos1.read();
		while(k!=-1){
			fos2.write(k);
			k = fos1.read();
		}
		
		fos1.close();
		fos2.close();
		
		
	}
}
