class Employee {
    private String employeeName;
    private int employeeId;
    protected double salary; // Accessible to subclasses

    public Employee(String employeeName, int employeeId) {
        this.employeeName = employeeName;
        this.employeeId = employeeId;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public int getEmployeeId() {
        return employeeId;
    }
}

class PermanentEmployee extends Employee {
    private double basicPay;
    private double HRA;
    private double variableComponent;

    public PermanentEmployee(String employeeName, int employeeId, double basicPay, double HRA, double variableComponent) {
        super(employeeName, employeeId);
        this.basicPay = basicPay;
        this.HRA = HRA;
        this.variableComponent = variableComponent;
    }

    public void calculateSalary() {
        salary = variableComponent + basicPay + HRA;
    }
}

class ContractEmployee extends Employee {
    private int totalHours;
    private double wages;

    public ContractEmployee(String employeeName, int employeeId, int totalHours, double wages) {
        super(employeeName, employeeId);
        this.totalHours = totalHours;
        this.wages = wages;
    }

    public void calculateSalary() {
        salary = totalHours * wages;
    }
}

public class EmployeeRecords {
    public static void main(String[] args) {
        // Creating PermanentEmployee object
        PermanentEmployee permanentEmployee = new PermanentEmployee("John", 101, 50000, 10000, 2000);
        permanentEmployee.calculateSalary();
        System.out.println("Permanent Employee Salary: " + permanentEmployee.getSalary());

        // Creating ContractEmployee object
        ContractEmployee contractEmployee = new ContractEmployee("Alice", 102, 160, 20);
        contractEmployee.calculateSalary();
        System.out.println("Contract Employee Salary: " + contractEmployee.getSalary());

        // Calling setter and getter methods
        Employee employee1 = new PermanentEmployee("John", 101, 50000, 10000, 2000);
        employee1.setSalary(55000);
        System.out.println("Employee 1 Salary: " + employee1.getSalary());

        Employee employee2 = new ContractEmployee("Alice", 102, 160, 20);
        employee2.setSalary(3200);
        System.out.println("Employee 2 Salary: " + employee2.getSalary());
    }
}
