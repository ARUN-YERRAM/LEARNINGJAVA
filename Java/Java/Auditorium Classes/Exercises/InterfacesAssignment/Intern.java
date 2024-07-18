public class Intern implements DataProvider {
    private int maxMarksSecured;
    private int graceMarksSecured;
    Intern(int maxMarksSecured, int graceMarksSecured){
        this.maxMarksSecured = maxMarksSecured;
        this.graceMarksSecured = graceMarksSecured;
    }

    @Override
    public float calculatePercentage() {
        float totalMarks = maxMarksSecured + graceMarksSecured;
        return (totalMarks/maxMarksAvailable)*100;
    }
}
