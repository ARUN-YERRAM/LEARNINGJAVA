public class Trainee implements DataProvider {
    private int maxMarksSecured;
    Trainee(int maxMarksSecured){
        this.maxMarksSecured = maxMarksSecured;
    }

    @Override
    public float calculatePercentage() {
        float totalMarks = maxMarksSecured;
        return (totalMarks/maxMarksAvailable)*100;
    }
}