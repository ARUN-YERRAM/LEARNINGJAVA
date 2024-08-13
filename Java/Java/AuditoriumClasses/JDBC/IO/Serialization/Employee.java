import java.io.*;
public class Employee implements Serializable { //Serializable is a marker interface, and it is only used to mark that it is serializable
	int empNo;
	String name;
	transient String dept; // This variable will not be stored or serialized or converted to bytesy
	public Employee(int empNo, String name, String dept){
		this.empNo = empNo;
		this.name = name;
		this.dept = dept;
	}
	
	public static void main(String[] args) throws Exception{
		// SERIALIZATION BEGINS
		Employee e1 = new Employee(101, "Fred", "Water");
		Employee e2 = new Employee(102, "Alice", "Accounts");
		FileOutputStream fos = new FileOutputStream(new File("Emp.bin"));
		ObjectOutputStream os = new ObjectOutputStream(fos);
		os.writeObject(e1);
		os.writeObject(e2);
		os.close();
		
		// DESERIALIZATION BEGINS
		FileInputStream fis = new FileInputStream(new File("Emp.bin"));
		ObjectInputStream ois = new ObjectInputStream(fis);
		Object j = ois.readObject();
		Employee ee = (Employee) j;
		j = ois.readObject();
		Employee ee2 = (Employee) j;
		System.out.println(ee.name + " " + ee.empNo + " " + ee.dept);
		System.out.println(ee2.name + " " + ee2.empNo + " " + ee2.dept);
	}
}
