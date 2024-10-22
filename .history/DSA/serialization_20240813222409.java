package DSA;

import java.io.Serializable;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.ObjectInputStream;

class Emp implements Serializable {
    int Empno = 101;
    float Salary = 5000.00f;
}

public classserialization {
    public static void main(String[] args) {
        try {
            Emp obj = new Emp();
            FileOutputStream fos = new FileOutputStream("emp.txt");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(obj);  // Corrected method name
            oos.close();
            fos.close();

            FileInputStream fis = new FileInputStream("emp.txt");
            ObjectInputStream ois = new ObjectInputStream(fis);
            Emp obj2 = (Emp) ois.readObject();
            ois.close();
            fis.close();

            System.out.println("Empno: " + obj2.Empno);
            System.out.println("Salary: " + obj2.Salary);

        } catch (Exception e) {
            System.out.println("Exception occurred: " + e);
        }
    }
}