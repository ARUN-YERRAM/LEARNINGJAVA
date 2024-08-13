package JAVALAB;

import java.util.*;

class EmpSorting8a {
    public static void main(String[] args) {
        ArrayList<Employee> ar = new ArrayList<>();
        ar.add(new Employee("john",55));
        ar.add(new Employee("Nic", 3));
        ar.add(new Employee("Roma", 9));

        System.out.println("Unsorted Emp List");
        for (Employee emp : ar) {
            System.out.println(emp);
        }
        Collections.Sort(ar,new Sortbyexp());

        System.out.println("Sorted by Experience");
        for (Employee emp : ar) {
            System.out.println(emp);
        }
    }
}
class Employee {
    String empname;
    int exp;

    Employee(String empname, int exp) {
        this.empname = empname;
        this.exp = exp;
    }

    @Override
    public String toString() {
        return this.empname+" "+exp;
    }
}

class Sortbyexp implements Comparator<Employee> {
    @Override
    public int compare(Employee a, Employee b) {
        return Integer.compare(a.exp, b.exp);
    }
}
