public class EmployeeRecords {

    public static void main(String args[]){
        PermanentEmployee p1 = new PermanentEmployee("Anil",101,10000,1500,3);
        p1.calculateSalary();
        System.out.println("Permanent employee:"+" Your salary is: "+p1.getSalary());
    }
}
