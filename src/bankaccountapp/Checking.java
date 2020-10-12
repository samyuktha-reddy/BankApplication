package bankaccountapp;

public class Checking extends Account {
	//list properties specific to checking account
	int debitCardNumber;
	int debitCardPin;
	
	//constructor to initialize checking account properties
	public Checking(String name, String sSN,double initDeposit)
	{
		super(name,sSN,initDeposit);
		accountNumber="2"+accountNumber;
		setDebitCard();
		//System.out.println(" Account number: "+this.accountNumber);
		//System.out.println("Name: "+name);
		//System.out.println("New Checking Account");
	
	}
	@Override
	public void setRate()
	{
		rate=getBaseRate()*0.15;
		
		
	}
	//setting debit card number and pin code
	private void setDebitCard()
	{
		debitCardNumber = (int)(Math.random()*Math.pow(10, 12));
		debitCardPin = (int)(Math.random()*Math.pow(10, 4));
		//System.out.println("The card number is: "+debitCardNumber);
		//System.out.println("The card pin is: "+debitCardPin);
	}
	
	
	
	
	
	public void showInfo()
	{
		System.out.println("Account Type: Checking");
		super.showInfo();
		System.out.println("Your Checking Account Details: "
		+"\n Debit Card Number: "+debitCardNumber+
		"\n Debit Card Pin is: "+debitCardPin);
		
		
		
	}
}
