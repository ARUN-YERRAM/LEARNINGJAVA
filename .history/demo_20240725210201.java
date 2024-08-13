// import java.io.*;

// public class demo {

//     public static void main(String[] args){
//         try (FileReader fr = new FileReader("e.txt");
//              BufferedReader br = new BufferedReader(fr)) {
             
//             String line;
//             while ((line = br.readLine()) != null) {
//                 System.out.println(line);
//             }
//             System.out.println("Hello");
            
//         } catch (IOException e) {
//             System.out.println("Bye");
//             System.out.println(e);
//         }
//     }
// }




class demo4
{
public static void main(String[] args)
  {
	int a=10,b=0,c;
	try
	{
		c=a/b;
		System.out.println("result= "+c);
	}
	catch(ArithmeticException ae)
	{
		System.out.println(ae);
	}
	finally
	{
		System.out.println("This will execute");
	}
	System.out.println("END");   
}
}
class demo4
{
public static void main(String[] args)
  {
	int a=10,b=0,c;
	try
	{
		c=a/b;
		System.out.println("result= "+c);
	}
	catch(ArithmeticException ae)
	{
		System.out.println(ae);
	}
	finally
	{
		System.out.println("This will execute");
	}
	System.out.println("END");   
}
}
