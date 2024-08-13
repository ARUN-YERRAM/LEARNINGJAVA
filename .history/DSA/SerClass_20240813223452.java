package DSA;

public class SerClass {
    public static void main(String[] args) {
        Emp obj1 = new Emp();
        emp.name = "Arun";
        emp.address = "hyderabad";

        try {

            FileOutputStream fos = new FileOutputStream("emp.txt");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(obj1);
            oos.close();
            fos.close();

            FileInputStream fis = new FileInputStream("emp.txt");
            ObjectInputStream ois = new ObjectInputStream(fis);
            Emp obj2 = (Emp) ois.readObject();
            ois.close();
            fis.close();

            System.out.println("Name: " + obj2.name);
            

    }
}
