package bankaccountapp;

import java.util.List;

public class BankAccountApp {

	public static void main(String[] args) {
		
		String file = "/Users/samyukthanarapareddy/Downloads/NewBankAccounts.csv";
		//Read a CSV File then create a new accounts based on that data
		 List<String[]> newAccountHolders = utilities.CSV.read(file);
		 for(String[] newAccountHolders1: newAccountHolders)
		 {
			 System.out.println(newAccountHolders1[0]);
			 System.out.println(newAccountHolders1[1]);
			 System.out.println(newAccountHolders1[2]);	
			 System.out.println(newAccountHolders1[3]);
			 
			 
			 
			 
			 
			 
			 
		 }
		
		
		
		
		
		
		
		
		
		/*Checking checkacnt1 = new Checking("Samyuktha P","321456879",2000);
		Savings savingAccnt2 = new Savings("Raja Sekhar Theja","456657897",3000);
		checkacnt1.showInfo();
		System.out.println("*******************");
		savingAccnt2.showInfo();
		//savingAccnt2.deposit(2000);
		//savingAccnt2.withdraw(250);
		//savingAccnt2.transfer("Brokerage", 150);
		savingAccnt2.compound();
		
		
		 */
	}

}
