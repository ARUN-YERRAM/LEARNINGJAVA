package DSA;
import java.io.Serializable;
import java.util.*;

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
            Emp emp = (Emp) ois.readObject();
        }
        // Emp obj = new    
    }
}
