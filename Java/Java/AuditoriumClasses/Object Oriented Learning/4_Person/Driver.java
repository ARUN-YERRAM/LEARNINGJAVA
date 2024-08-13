public class Driver {
    public static void main(String[] args) {
        /* Student 1 */
        int[] grades = {98, 97, 99};
        Student s1 = new Student("Srikar Veluvali", (byte)18, "Male", (byte)2, "A", "IT", grades, 9.88f);
        s1.calculatePercentage();
        s1.applyforPG();
        /* Student 2 */
        int[] grades2 = {54, 21, 49};
        Student s2 = new Student("Meher Archana", (byte)17, "Female", (byte)2, "C", "CSE", grades2, 8.58f);
        s2.calculatePercentage();
        s2.applyforPG();
    }
}
