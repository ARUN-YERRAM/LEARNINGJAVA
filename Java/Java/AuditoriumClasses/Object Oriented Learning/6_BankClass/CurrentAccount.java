public class CurrentAccount extends Account{
    public String businessName;
    public double overDraftamt;
    CurrentAccount(String name, int age, String dob, double balance,int pin, String businessName){
        super(name,age,dob,balance,pin);
        this.businessName = businessName;
        this.overDraftamt = 0;
    }

    public void withDraw(double amt){
        if(amt > balance){
            this.overDraftamt+=(amt-balance);
            System.out.println("You have an overdraft of "+this.overDraftamt+"$");
        }
        super.balance-=amt;
    }
    public void deposit(double amt){
        if(balance+amt > 10_00_000){
            System.out.println("The amount you're trying to enter exceeds the limit by "+ (10_00_000-balance-amt)+".");
        } else {
            this.balance+=amt;
            System.out.println("Amount depositted successfully!");
        }
    }
    public void payOverdraft(double amt){
        if(amt > overDraftamt){
            System.out.println("Overpaid the overdraft amount by: "+(amt-overDraftamt));
            System.out.println("Credditing the remaining amount towards the balance of the user.");
            super.balance+=(amt-overDraftamt);
            this.overDraftamt = 0;
        } else if (amt==overDraftamt){
            System.out.println("Overdraft amount paid successfully!");
            this.overDraftamt = 0;
        } else {
            System.out.println("Overdraft amount partially paid. Remaining overdraft amount: "+(overDraftamt-amt));
            this.overDraftamt = Math.abs(overDraftamt-amt);
        }        
    }
    public double getOverdraft(){
        return this.overDraftamt;
    }

    @Override
    public String getAccountType() {
        return "Current Account";
    }
    public String getBusinessName() {
        return businessName;
    }

}