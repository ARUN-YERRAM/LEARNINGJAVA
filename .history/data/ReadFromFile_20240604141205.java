import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadFromFile {
    public static void main(String[] args) {
        String filePath = "data.csv"; // Replace with the actual file path

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                // Do something with the line
                try {
                    String[] values = line.split(",");
                    employee employee = new employee(values[0], Integer.parseInt(values[1]),values[2], Integer.parseInt(values[3]));
                    System.out.println("For Employee "+ employee.name);
                    if (employee.age > 65) {
                        throw new ageException();
                    }
                    if (employee.salary < 10000) {
                        throw new salaryException();
                    }
                    if (!employee.dept.contains("Water") && !employee.dept.contains("Account")) {
                        throw new departmentException();
                    }
                    System.out.println("No exception \n");
                    } catch (ageException e) {
                        System.out.println(e.getMessage());
                    } catch (salaryException e) {
                        System.out.println(e.getMessage());
                    } catch (departmentException e) {
                        System.out.println(e.getMessage());
                    }
            }}catch (IOException e) {
                e.printStackTrace();
            }
    }
}

class ageException extends RuntimeException {

    @Override
    public String getMessage() {

        return "Given age is greater than 65\n";
    }
}


class salaryException extends RuntimeException {

    @Override
    public String getMessage() {
        return "Given salary is less than 10k\n";
    }
}

class departmentException extends RuntimeException {
    @Override
    public String getMessage() {
        
        return "invalid department\n";
    }
}