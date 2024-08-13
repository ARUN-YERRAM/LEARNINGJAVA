public class Student extends Person{
  public String rollno;
  public String section;
  public boolean isMarked;
  Student(String name, byte age, String gender, String rollno, String section){
    super(name, age, gender);
    this.rollno = rollno;
    this.section = section;
    this.isMarked = false;
  }
  
  public void showAttendance(){
    System.out.println("The attendance of the student is marked? :"+this.isMarked);
  }
    
}
