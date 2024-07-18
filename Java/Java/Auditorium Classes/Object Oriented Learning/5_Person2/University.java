class University {
    public static void main(String[] args) {
        int[] studentGrades = {8, 9, 7};

        /* Student 1 */
        Student student = new Student("Alice", 21, "Female", 55.0, "Indian", 2, 'B', 8.5, studentGrades);
        System.out.println("Student: " + student.getName());
        System.out.println("CGPA: " + student.getCgpa());
        student.canTalk();
        student.canWalk();
        System.out.println(student.getName()+"'s Fees: "+student.getFees());
        student.payFees(200_000);
        student.canVote();
        System.out.println();

        /* Student 2 */
        Student student2 = new Student("Srikar", 18, "Male", 70, "Indian", 2, 'B', 9.84, studentGrades);
        System.out.println("Student: " + student2.getName());
        System.out.println("CGPA: " + student2.getCgpa());
        student2.canTalk();
        student2.canWalk();
        System.out.println(student2.getName()+"'s Fees: "+student2.getFees());
        student2.payFees(200_000);
        student2.canVote();
        System.out.println();

        /* Student 3 */
        Student student3 = new Student("Pratiek", 18, "Male", 70, "Sri Lankan", 4, 'B', 8.6, studentGrades);
        System.out.println("Student: " + student3.getName());
        System.out.println("CGPA: " + student3.getCgpa());
        student3.canTalk();
        student3.canWalk();
        System.out.println(student3.getName()+"'s Fees: "+student3.getFees());
        student2.payFees(20_000);
        student3.canVote();
        System.out.println();
        



    }
}