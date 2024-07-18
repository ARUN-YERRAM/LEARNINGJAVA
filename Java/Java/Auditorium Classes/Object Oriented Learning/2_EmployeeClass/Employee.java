import java.util.*;
public class Employee {
    private float salary;
    private int id;
    public String name;
    public int workHours;

    public void promote(int extraHours){
        this.salary = this.salary * (workHours + extraHours);
        workHours += extraHours;
    }

    public void viewDetails(){
        System.out.println("Name: "+this.name);
        System.out.println("ID: "+this.id);
        System.out.println("Salary: "+this.salary);
        System.out.println("Work Hours: "+this.workHours);
    }

    private void makeProject(){
        this.workHours+=10;
    }

    Employee(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name: ");
        this.name = sc.nextLine();
        System.out.print("Enter your id: ");
        this.id = sc.nextInt();
        System.out.print("Enter your salary: ");
        this.salary = sc.nextFloat();
        System.out.print("Enter your name: ");
        this.workHours = sc.nextInt();
        sc.close();
    }
}
