package myPackage;

public class OOP {
    public static String name;
    public static void main(String[] args) {
        // var t = new TextBox();
        // t.setText("Hello World");
        // t.printText();
        // name = "Srikar";

        /* long x = 10_000_000L;
        System.out.println(x); */


        var employee = new Employee();
        employee.baseSalary = 50_000;
        employee.hourlyRate =  2;
        employee.extraHours = 4;
        System.out.println(employee.calculateWage());
    }
}
