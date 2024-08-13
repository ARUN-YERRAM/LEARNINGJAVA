public class ClassRoom {
  public static void main(String[] args){
    Student s1 = new Student("Srikar", (byte) 18, "Male", "22BD1A1264", "IT-A");
    Teacher t1 = new Teacher("Koro", (byte) 42 , "Male", "001", "IT");
    t1.markAttendance(s1);
    s1.showAttendance();
  }
}
