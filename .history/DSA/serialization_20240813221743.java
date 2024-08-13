package DSA;
import java.io.Serializable;
import java.util.*;
import java.io.FileReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.IOException;
import java.io.ObjectOutputStream;
import java.io.ObjectInputStream;
class Emp implements Serializable{
    int Empno = 101;
    float Salary = 5000.00f;
}

public class serialization {
    public static void main(String[] args){
        try{
            Emp obj = new Emp();
            FileOutputStream fos = new FileOutputStream("emp.txt");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.WriteObject(obj);
            oos.close();
            fos.close();

            FileInputStream fis = new FileInputStream("emp.txt");
            ObjectInputStream ois = new ObjectInputStream(fis);
            Emp obj2 = (Emp) ois.readObject();
            ois.close();
            fis.close();
            System.out.println(obj2.Empno);
            System.out.println(obj2.Salary);

        }catch(Exception e){
            System.out.println(e);
        }
    }
}
