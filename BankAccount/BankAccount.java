class BankAccount{
	private int accNo;
	private float balance;
	private static float intrestRate;
	static{
		intrestRate = 7.25f;
		
	}
	public BankAccount(int accNo, float balance){

		this.accNo = accNo;
		this.balance = balance;		
	}
	public void display(){
		System.out.println("Account number: " +accNo);
		System.out.println("Balance: "+ balance);
	}
	public void updateIntrestRate(float newIR){
		intrestRate = newIR;
	}
	public void showNetBalance(){
		balance = balance + (balance*intrestRate/100);
		System.out.println("Balance with intrestRate: "+ (float)balance);
		
	}
	


}