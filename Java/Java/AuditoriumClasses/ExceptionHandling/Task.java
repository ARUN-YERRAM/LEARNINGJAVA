import java.io.*;
class InvalidAge extends RuntimeException {}
class InvalidDepartment extends RuntimeException {}
class EmployeeExploitation extends RuntimeException{}
public class Task {
    public static void main(String[] args) throws IOException{
        File f = new File("employee.txt");
        FileReader fr = new FileReader(f);
        BufferedReader br = new BufferedReader(fr);
        String line;
        while ((line = br.readLine()) != null) {
            String[] a = line.split(",");
            try {
                if(Integer.parseInt(a[1]) > 60) {
                    throw new InvalidAge();
                }
                if(!a[2].equals("Water") && !a[2].equals("Accounts")) {
                    throw new InvalidDepartment();
                }                
                if(Integer.parseInt(a[3])<10_000){
                    throw new EmployeeExploitation();
                }
                System.out.println(line);
            } catch (InvalidAge e) {
                System.out.println(e);
            } catch (InvalidDepartment e) {
                System.out.println(e);
            } catch (EmployeeExploitation e){
                System.out.println(e);
            }
        }
    }
}
