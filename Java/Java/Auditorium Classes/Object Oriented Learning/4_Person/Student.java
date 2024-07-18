public class Student extends Person{
    byte year;
    String section;
    String department;
    int[] currentSemGrades;
    private float percentage;
    float cgpa;
    Student(String name, byte age, String gender ,byte year, String section, String department, int[] currentSemGrades, float cgpa){
        super(name, age, gender);
        this.year = year;
        this.section = section;
        this.department = department;
        this.currentSemGrades = currentSemGrades;
        this.cgpa = cgpa;
    }

    public void calculatePercentage(){
        float s = 0;
        for(int i=0; i<currentSemGrades.length; i++){
            s+=currentSemGrades[i];
        }
        System.out.println(s/currentSemGrades.length + "%");
        this.percentage = s/currentSemGrades.length;
    }

    public void applyforPG(){
        if(percentage > 80 && this.cgpa > 8.0){
            System.out.println(this.name+"'s Application Accepted");
        } else {
            System.out.println(super.name+"'s Application Rejected");
        }

    }
}