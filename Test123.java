import java.io.*;
public class Test123 {
    File f = new File("voter.csv");
    f.createNewFile();
    FileOutputStream fos = new FileOutputStream(f);
    fos.write("hello how are you??".getBytes());
    fos.close();
    System.out.println("Written successfully");
    File f = new File("");
    f.mkdirs();
    File f2 = new File(f,"voter");
    f2.createNewFile();
    Scanner sc = new Scanner(System.in);
    String name = sc.next();
    int age = sc.next
}
