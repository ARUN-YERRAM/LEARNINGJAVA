public class SavingsAccount extends Account {
    private double interestRate;

    SavingsAccount(String name, int age, String dob, double balance, int pin, double interestRate) {
        super(name, age, dob, balance, pin);
        this.interestRate = interestRate;
    }

    public void addInterest() {
        double interest = getBalance() * interestRate / 100;
        deposit(interest);
        System.out.println("Interest added: " + interest);
    }

    @Override
    public String getAccountType() {
        return "Savings Account";
    }
    public double getInterestRate() {
        return interestRate;
    }
}
