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
            FileOutputStream fos = new FileOutputStream("emp.ser");
            
        }
        // Emp obj = new    
    }
}
