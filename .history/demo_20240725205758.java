import java.io.*;

public class Demo {

    public static void main(String[] args){
        try (FileReader fr = new FileReader("e.txt");
             BufferedReader br = new BufferedReader(fr)) {
             
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
            System.out.println("Hello");
        } catch (IOException e) {
            System.out.println("Bye");
            System.out.println(e);
        }
    }
}
