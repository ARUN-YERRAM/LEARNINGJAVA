package DSA;
import java.io.FileReader;
public class STreams {
    public static void main(String[] args){
        FileInputStream istr = null;
        FileOutputStream oustr = null;
        try{
            istr = new FileInputStream("C:\\Users\\Yerram Abhilash\\OneDrive\\Documents\\ArDocs\\JAVALEARNING\\DSA\\input.txt");
            oustr = new FileOutputStream("C:\\Users\\Yerram Abhilash\\OneDrive\\Documents\\ArDocs\\JAVALEARNING\\DSA\\output.txt");

            int test;
            while((istr = istr.read()) != -1){
                oustr.write(istr);
            }
        }
        finally{
            if(istr != null)
                istr.close();

            if(oustr != null)
                oustr.close();

        }
}
}
