import java.*;

class InvalidAge extends RuntimeException{};

class InvalidDepartment extends RuntimeException{};

class EmployeeExploitation extends RuntimeException{};

// class InvalidName extends RuntimeException{};
class Manager{
    public static void main(String[] args){
        File f = new File("employee.txt");
        FileReader fr = new FileReader(f);
        BufferedReader br = new BufferedReader(fr);
        String str = br.readLine();
        while(str != null){
            String []j = s.split(",");
            try{
                if(!j[2].contains("water") || (!j[2].contains("Accounting")))
                    throw new InvalidDepartment();

                    // 
            }catch(){

            }
        }
    }
}



import java.io.*;
import java.util.Scanner;

class InvalidAge extends RuntimeException {
    public InvalidAge(String message) {
        super(message);
    }
}

class InvalidDepartment extends RuntimeException {
    public InvalidDepartment(String message) {
        super(message);
    }
}

class EmployeeExploitation extends RuntimeException {
    public EmployeeExploitation(String message) {
        super(message);
    }
}

class NameValidation {
    private static final String NAME_PATTERN = "^[A-Z][a-z]+\\s+[A-Z][a-z]+$";

    public static void validateName(String name) throws InvalidNameException {
        if (!name.matches(NAME_PATTERN)) {
            throw new InvalidNameException("Invalid name format. Please enter a name with first and last name starting with a capital letter, followed by lowercase letters.");
        }
    }
}

class InvalidNameException extends RuntimeException {
    public InvalidNameException(String message) {
        super(message);
    }
}

class Manager {
    public static void main(String[] args) {
        Scanner scanner = null;
        FileReader fr = null;
        BufferedReader br = null;

        try {
            File f = new File("employee.txt");
            scanner = new Scanner(f); // Consider using Scanner for resource management

            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] employeeData = line.split(",");

                try {
                    // Validate name
                    NameValidation.validateName(employeeData[0]);

                    // Validate age
                    int age = Integer.parseInt(employeeData[1]);
                    if (age < 18 || age > 65) {
                        throw new InvalidAge("Invalid age: " + age + ". Age must be between 18 and 65.");
                    }

                    // Validate department (enhanced with explicit checks)
                    String department = employeeData[2];
                    if (!department.equalsIgnoreCase("water") && !department.equalsIgnoreCase("accounting")) {
                        throw new InvalidDepartment("Invalid department: " + department + ". Departments must be 'water' or 'accounting'.");
                    }

                    // Process valid employee data (add your logic here)
                    System.out.println("Valid employee: " + line);
                } catch (InvalidNameException | InvalidAge | InvalidDepartment e) {
                    System.err.println("Error processing employee: " + e.getMessage());
                } catch (NumberFormatException e) {
                    System.err.println("Error parsing age: " + e.getMessage());
                }
            }
        } catch (FileNotFoundException e) {
            System.err.println("Error: File 'employee.txt' not found.");
        } finally {
            // Close resources (improved with potential Scanner usage)
            if (scanner != null) {
                scanner.close();
            } else if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            } else if (fr != null) {
                try {
                    fr.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
