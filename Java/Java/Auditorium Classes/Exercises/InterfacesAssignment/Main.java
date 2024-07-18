public class Main {
    public static void main(String[] args) {
        Intern i = new Intern(5000, 500);
        System.out.println(i.calculatePercentage());

        Trainee t = new Trainee(6000);
        System.out.println(t.calculatePercentage());
    }
}