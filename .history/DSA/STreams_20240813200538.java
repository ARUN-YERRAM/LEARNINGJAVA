package DSA;
import java.io.FileReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class STreams {
    public static void main(String[] args) {
        FileInputStream istr = null;
        FileOutputStream oustr = null;
        try {
            istr = new FileInputStream("C:\\Users\\Yerram Abhilash\\OneDrive\\Documents\\ArDocs\\JAVALEARNING\\DSA\\input.txt");
            oustr = new FileOutputStream("C:\\Users\\Yerram Abhilash\\OneDrive\\Documents\\ArDocs\\JAVALEARNING\\DSA\\output.txt");

            int test;
            while ((test = istr.read()) != -1) {
                oustr.write((byte) test);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            // try {
                if (istr != null)
                    istr.close();
                if (oustr != null)
                    oustr.close();
            // } catch (IOException ex) {
                // ex.printStackTrace();
            // }
        }
    }
}
