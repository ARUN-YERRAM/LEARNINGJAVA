class Bank{
	
	public static void main(String[] args){
		System.out.println("Hello, World");
		Account a = new Account("Srikar", 20_000, 1264); // 'a' here is a reference variable, implicit default constructor

		a.deposit(2_000);
		a.whithdraw(60_000); // Invalid Transaction
		a.whithdraw(12_000);
		a.deposit(5_000);

		System.out.println(a.checkBalance());
		System.out.println(a.checkTransactions());


		Account a2 = new Account("Srikar2", 40_000, 12642);
		System.out.println(a2.checkBalance());

		a.transferMoney(a2, 2_000);
		System.out.println(a.checkBalance());
		System.out.println(a2.checkBalance());

		System.out.println(a.checkTransactions());
		System.out.println(a2.checkTransactions());

	}
}