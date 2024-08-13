import java.util.*;
class Employee implements Comparable{
	String name;
	int eno;
	Employee(String name, int eno){
		this.name = name;
		this.eno = eno;
	}
	@Override
	public String toString(){
		return "Name: "+this.name+" Empno: "+this.eno;
	}
	
	@Override
	public int compareTo(Object o){
		Employee e = (Employee)o;
		
		return -this.eno + e.eno;
	}
}

class EmployeeNameFilter implements Comparator {
	@Override
	public int compare(Object o1, Object o2) {
		Employee e1 = (Employee)o1;
		Employee e2 = (Employee)o2;
		return e1.name.compareTo(e2.name);
	}
}
public class Demo {
	public static void main(String[] args){
		List<Employee> l = new ArrayList<Employee>();
		l.add(new Employee("Srikar", 3));
		l.add(new Employee("Srikar V", 2));
		l.add(new Employee("Meher", 1));
		System.out.println(l);
		// l.add("Hello");
		// l.add(new Employee());
		Collections.sort(l);
		System.out.println(l);
		l.sort(new EmployeeNameFilter());
		System.out.println(l);
		
	}
}
