// import java.io.*;

// public class demo {

//     public static void main(String[] args){
//         try (FileReader fr = new FileReader("e.txt");
//              BufferedReader br = new BufferedReader(fr)) {
             
//             String line;
//             while(line=br.readline())
//             System.out.println("Hello");
            
//         } catch (IOException e) {
//             System.out.println("Bye");
//             System.out.println(e);
//         }
//     }
// }




class demo
{
public static void main(String[] args)
{
	int a[]={10,20,30,40,50,60};
	try
	{
		int e=a[10]/0;
		int c=a[1]/0; 
		System.out.println("result= "+c);
	}
	catch(ArithmeticException ae)
	{
		System.out.println(ae);
	}
	catch(ArrayIndexOutOfBoundsException ab)
	{
		System.out.println(ab);
	}finally{
        System.out.println("FInally!!!!!!!!!!!");
    }
}
}
