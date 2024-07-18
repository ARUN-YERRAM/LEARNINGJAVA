class Account{
	public String accHolderName;
	private float balance;
	public int accNo;
	private int numberTransactions;
	Account(){
		accNo = 101;
		balance = 1000;
	}
	Account(String accHolderName, float balance, int accNo){
		this.accHolderName = accHolderName;
		this.balance = balance;
		this.accNo = accNo;
		this.numberTransactions = 0;
	}
	void whithdraw(float amt){
		if(amt>balance){
			System.out.println("Insufficient Funds");
			return;
		}
		balance-=amt;
		numberTransactions++;
	}
	void deposit(float amt){
		balance+=amt;
		numberTransactions++;
	}
	float checkBalance(){
		return balance;
	}
	void setBalance(float amt){
		balance = amt;
	}
	int checkTransactions(){
		return numberTransactions;
	}

	void transferMoney(Account a1, float amt){
		this.whithdraw(amt);
		a1.deposit(amt);
		this.numberTransactions++;
		a1.numberTransactions++;
	}
}	