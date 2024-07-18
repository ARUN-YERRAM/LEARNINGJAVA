import java.util.Scanner;

public class Bank {
    static Account[] accounts = new Account[20_000];
    static int numOfAccounts = 0;

    // Method to create an account
    public static Account createAccount(Scanner sc) {
        System.out.println("Enter your name: ");
        String name = sc.nextLine();

        System.out.println("Enter your age: ");
        int age = sc.nextInt();
        sc.nextLine();

        System.out.println("Enter your Date of Birth in DD/MM/YYYY format: ");
        String dob = sc.nextLine();

        System.out.println("Enter your 4 digit pin: ");
        int pin;
        do {
            pin = sc.nextInt();
            if (!(pin >= 1000 && pin <= 9999)) {
                System.out.println("The PIN must be of 4 digits.");
                System.out.println("Enter your 4 digit pin: ");
            }
        } while (!(pin >= 1000 && pin <= 9999));

        System.out.println("Enter the minimum amount of balance: ");
        double balance;
        do {
            balance = sc.nextDouble();
            if (balance < 1_000_000) {
                System.out.println("The balance required for account must be minimum $1,000,000");
                System.out.println("Enter the minimum amount of balance: ");
            }
        } while (balance < 1_000_000);

        sc.nextLine();
        System.out.println("Which account do you want to open?\n1. Savings Account\n2. Current Account");
        int accountType = sc.nextInt();
        sc.nextLine();
        if (accountType == 1) {
            System.out.println("Enter the interest rate for Savings Account: ");
            double interestRate = sc.nextDouble();
            sc.nextLine();
            Account account = new SavingsAccount(name, age, dob, balance, pin, interestRate);
            accounts[numOfAccounts++] = account;
            System.out.println("Your Savings Account has been created successfully! Your account number: " + account.accNo);
            return account;
        } else {
            System.out.println("Enter the name of your business: ");
            String businessName = sc.nextLine();
            Account account = new CurrentAccount(name, age, dob, balance, pin, businessName);
            accounts[numOfAccounts++] = account;
            System.out.println("Your Current Account has been created successfully! Your account number: " + account.accNo);
            return account;
        }
    }

    // Method to handle account withdrawal
    public static void withdraw(Scanner sc) {
        System.out.println("Withdraw: ");
        System.out.println("Enter your account number: ");
        int accNo = sc.nextInt();
        boolean accountFound = false;
        for (int i = 0; i < numOfAccounts; i++) {
            if (accounts[i].accNo == accNo) {
                System.out.println("Enter your PIN: ");
                int pin = sc.nextInt();
                if (accounts[i].verifyPIN(pin)) {
                    System.out.println("Enter the amount you want to withdraw: ");
                    double amount = sc.nextDouble();
                    accounts[i].withDraw(amount);
                }
                accountFound = true;
                break;
            }
        }
        if (!accountFound) {
            System.out.println("Account not found!");
        }
    }

    // Method to handle account deposit
    public static void deposit(Scanner sc) {
        System.out.println("Deposit: ");
        System.out.println("Enter your account number: ");
        int accNo = sc.nextInt();
        boolean accountFound = false;
        for (int i = 0; i < numOfAccounts; i++) {
            if (accounts[i].accNo == accNo) {
                System.out.println("Enter your PIN: ");
                int pin = sc.nextInt();
                if (accounts[i].verifyPIN(pin)) {
                    System.out.println("Enter the amount you want to deposit: ");
                    double amount = sc.nextDouble();
                    accounts[i].deposit(amount);
                }
                accountFound = true;
                break;
            }
        }
        if (!accountFound) {
            System.out.println("Account not found!");
        }
    }

    // Method to check account details
    public static void checkAccountDetails(Scanner sc) {
        System.out.println("Check Account details: ");
        System.out.println("Enter your account number: ");
        int accNo = sc.nextInt();
        boolean accountFound = false;
        for (int i = 0; i < numOfAccounts; i++) {
            if (accounts[i].accNo == accNo) {
                System.out.println("Enter your PIN: ");
                int pin = sc.nextInt();
                if (accounts[i].verifyPIN(pin)) {
                    System.out.println("Name: " + accounts[i].name + "\nBalance: " + accounts[i].balance);
                }
                accountFound = true;
                break;
            }
        }
        if (!accountFound) {
            System.out.println("Account not found!");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int option;
        do {
            System.out.println("Menu:\n1. Open an account\n2. Withdraw\n3. Deposit\n4. Check Account details\n5. Exit");
            option = sc.nextInt();
            sc.nextLine();
            switch (option) {
                case 1:
                    createAccount(sc);
                    break;
                case 2:
                    withdraw(sc);
                    break;
                case 3:
                    deposit(sc);
                    break;
                case 4:
                    checkAccountDetails(sc);
                    break;
                case 5:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid option!");
            }
        } while (option != 5);
    }
}
