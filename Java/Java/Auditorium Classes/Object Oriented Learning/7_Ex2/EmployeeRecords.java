public class EmployeeRecords{
    public static void main(String[] args){
        PermanentEmployee e1 = new PermanentEmployee();
        e1.setName("Anil");
        e1.setEmpId(101);
        e1.setBasicPay(10_000);
        e1.setHra(1500);
        e1.setExperience(3);

        e1.calculateSalary();

        System.out.println(e1.getSalary());
    }
}