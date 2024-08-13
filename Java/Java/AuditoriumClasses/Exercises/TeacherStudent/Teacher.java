public class Teacher extends Person{
  public String teacherno;
  public String department;
  Teacher(String name, byte age, String gender, String teacherno, String department){
    super(name, age, gender);
    this.teacherno = teacherno;
    this.department = department;
  }
  
  public void markAttendance(Student s){
    s.isMarked = true;
    System.out.println("The attendance for the student "+s.name+" has been marked");
  }
  
}
