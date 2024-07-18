public class Account{
    public String name;
    private int age;
    private String dob;
    protected double balance;
    private int pin;
    public int accNo;

    static int numAccounts;
    public String getAccountType() {
        return "Generic Account";
    }
    /* Account Constructor */
    Account(String name, int age, String dob, double balance, int pin){
        this.name = name;
        this.age = age;
        this.dob = dob;
        this.balance = balance;
        this.pin = pin;
        this.accNo = ++numAccounts;
    }
    boolean verifyPIN(int pin){
        return this.pin==pin;
    }
    /* Getters and Setters */
    public String getName(){
        return this.name;
    }
    public void setName(String name){
        this.name = name;
    }
    public int getAge(){
        return this.age;
    }
    public void setAge(int age){
        this.age = age;
    }
    public String getDOB(){
        return this.dob;
    }
    public void setDOB(String dob){
        this.dob = dob;
    }
    public double getBalance(){
        return this.balance;
    }

    /* Withdraw and deposit */
    public void withDraw(double amt){
        if(!(balance<amt)){
            this.balance-=amt;
        } else {
            System.out.println("Insufficient Balance");
        }
    }
    public void deposit(double amt){
        this.balance+=amt;
        System.out.println("Amount depositted successfully!");
    }
}