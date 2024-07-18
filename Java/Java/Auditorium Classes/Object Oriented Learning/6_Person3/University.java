class University {
    public static void main(String[] args) {
        int[] studentGrades = {8, 9, 7};

        ScholarshipStudent s1 = new ScholarshipStudent("Pragnya", 20, "Female", 50.4, "Indian", 3, 'B', 8.9, studentGrades);
        ScholarshipStudent s2 = new ScholarshipStudent("Sameul", 19, "Male", 58.4, "African", 2, 'A', 7.2, studentGrades);
        ScholarshipStudent s3 = new ScholarshipStudent("Tikku", 21, "Male", 52.4, "Indian", 4, 'B', 9.2, studentGrades);


        Student s11 = new Student("Pankaj", 21, "Male", 58.2, "Indonasian", 4, 'B', 8.8, studentGrades);
        Student s12 = new Student("Jim", 20, "Male", 58.2, "Canadian", 3, 'B', 8.9, studentGrades);
        Student s13 = new Student("Seema", 21, "Male", 58.2, "Indian", 4, 'B', 9.9, studentGrades);

        System.out.println(s1.applyForPostGraduate());
        System.out.println(s2.applyForPostGraduate());
        System.out.println(s3.applyForPostGraduate());
        s1.setEligible(true);
        s3.setEligible(true);
        s2.setEligible(true);
        System.out.println(s1.isEligible());
        System.out.println(s2.isEligible());
        System.out.println(s3.isEligible());
    }
}