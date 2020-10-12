package bankaccountapp;

public class Savings extends Account {
	
	//list properties specific to savings account
	int safetyDepositBoxID;
	int safetyDepositBoxKey;
	
	//constructor to initialize checking account properties
		 public Savings(String name, String sSn, double initDeposit) {
			super(name,sSn,initDeposit);
			accountNumber="1"+accountNumber;
			setSafetyDepositBox();
			//System.out.println("Name: "+name);
			//System.out.println(" Account number: "+this.accountNumber);
			//System.out.println("New Savings Account")
			
		}
		 //implementing the safety box and unique 4 digit code
		 private void setSafetyDepositBox()
		 {
			 safetyDepositBoxID = (int)(Math.random()*Math.pow(10, 3)); 
			 safetyDepositBoxKey = (int)(Math.random()*Math.pow(10, 4)); 
			 //
		 }
		 @Override
		 public void setRate()
		 {
			 rate=getBaseRate()-0.25;
			 
		 }
		 
		 //list the info
		 public void showInfo()
			{
			 System.out.println("Account Type: Savings");
			 super.showInfo();
			 System.out.println("Savings Account Features: " +"\nSafety Deposit Box ID: "
			 +safetyDepositBoxID
			 +"\nSafety Deposit Key: "+safetyDepositBoxKey);
				
				
			}

}
