// public class class {
    
// }

class Bank{
    public static void main(String[] args){
        Account a = null;
        System.out.println(Account.banktransaction);
        System.out.println(a.accHoldname);
        System.out.println(a.balance);
        System.out.println(Account.transaction);

        
    }
}


class Account{
    int accNo;
    static String accHoldname = "Arun"; 
    static float balance = 2203;
    static byte transaction = 3;
    {
        int a = 10;
        // static String b = "abc";
    }

    static int banktransaction = 0;

    Account(){
        accHoldname = "name";
        balance = 12345;
        transaction = 123;
    }

    // Account("Arun",12,234);

// static int getbalance(){
    // return balance;
// }
static int gettransaction(){
    return banktransaction;
}

String getname(){
    return accHoldname;
}
};

// Account("Arun",12,234);