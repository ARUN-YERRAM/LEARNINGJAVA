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
                System.out.println("Out");
            }
        }
    }
}

