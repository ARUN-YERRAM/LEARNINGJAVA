public class Student extends Person {
    private int year;
    private char section;
    private double cgpa;
    private int[] noOfGrades;
    private double fees;
    private boolean isPaid;

    // Instance initializer
    {
        // Initializing noOfGrades array with default values
        noOfGrades = new int[0];
    }

    // Constructor
    public Student(String name, int age, String gender, double weight, String nationality, int year, char section, double cgpa, int[] noOfGrades) {
        super(name, age, gender, weight, nationality);
        this.year = year;
        this.section = section;
        this.cgpa = cgpa;
        this.noOfGrades = noOfGrades;
        this.fees = calculateFees(year);
    }

    // Method to calculate fees based on the year
    private double calculateFees(int year) {
        switch (year) {
            case 1:
                return 20000;
            case 2:
                return 30000;
            case 3:
                return 40000;
            case 4:
                return 35000;
            default:
                return 0; // No fees for other years
        }
    }

    // Method to calculate percentage and update CGPA
    public void calculatePercentage() {
        int totalGrades = 0;
        int totalPoints = 0;

        // Calculate total number of grades and total points
        for (int grade : noOfGrades) {
            totalGrades += grade;
            totalPoints += grade * 10; // Assuming each grade contributes 10 points to the CGPA
        }

        // Calculate updated CGPA
        double updatedCgpa = (double) totalPoints / (totalGrades * 10); // Normalize to 10 scale

        // Update cgpa instance variable
        this.cgpa = updatedCgpa;
    }

    // Method to check eligibility for applying to postgraduate program
    public boolean applyForPostGraduate() {
        if (year == 4 && cgpa > 8.0) {
            return true;
        }
        return false;
    }

    // Getter method for fees
    public double getFees() {
        return fees;
    }

    // Getter method for cgpa
    public double getCgpa(){
        return cgpa;
    } 

    // Setter method for fees
    public void setFees(double fees) {
        this.fees = fees;
    }

    public void payFees(float amt){
        if(amt >= fees){
            isPaid = true;
            System.out.println("Fees paid successfully! Thanks for the extra amount (if paid)");
        } else {
            System.out.println(fees-amt + " is less. Can't pay the full fees.");
            isPaid = false;
        }
    }

    public void canVote(){
        if(isPaid==true){
            System.out.println("Fees Not paid.");
        }
        if(isPaid == true && super.getAge() >=18 && super.getNationality().equalsIgnoreCase("Indian")){
            System.out.println(super.getName() + " can vote.");
        } else {
            System.out.println(super.getName() + " cannot vote.");
        }
    }
}