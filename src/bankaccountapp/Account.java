package bankaccountapp;

public abstract class Account implements IBaseRate {
	
	
	//list the common properties of checkings and savings accounts
	String name;
	String sSn;
	double balance;
	String accountNumber;
	double rate;
	static int index =10000;
	
	
	
	//constructor to set base properties and initialize the account
	public Account(String name, String sSn, double initDeposit)
	{
		this.name=name;
		this.sSn=sSn;
		this.balance=initDeposit;
		//System.out.print("Name: "+name+" SSN: "+sSn+" Balance: "+balance);
		//calling the account number setter to set the account number
		index++;
		this.accountNumber=setAccountNumber();
		setRate();
	}
	public abstract void setRate();
	
	private String setAccountNumber()
	{
		String lastTwoSsn=sSn.substring(sSn.length()-2, sSn.length());
		int uniqueID=index;
		int randomNumber = (int)(Math.random()* Math.pow(10, 3));
		return lastTwoSsn + uniqueID +randomNumber;
		
	}
	public void deposit(double amount)
	{
		balance= balance+amount;
		System.out.println("Deposited the amount of $"+amount);
		printBalance();
	}
	public void withdraw(double amount)
	{
		balance = balance - amount;
		System.out.println("Withdrawed the amount of $"+amount);
		printBalance();
	}
	public void transfer(String toWhere,double amount)
	{
		balance = balance - amount;
		System.out.println("Transfered to "+toWhere+" of amount $"+amount);
		printBalance();
	}
	public void printBalance()
	{
		System.out.println(" Your Current Balance is of $"+balance);
	}
	
	public void compound()
	{
		double accruedInterest = balance *(rate/100);
		balance = balance+accruedInterest;
		System.out.println("Compund Interest is: "+accruedInterest);
		printBalance();
	}
	//Show info method
	public void showInfo()
	{
		System.out.println("Name: "+name+"\nAccount Number: "+accountNumber+
				"\nAccount Balance: "+balance+
				"\nRate: "+rate+"%");
	}
}
