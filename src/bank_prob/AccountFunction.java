package bank_prob;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;

public class AccountFunction {

	BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
	
	public void withDraw(List<Account> accountList) throws IOException {
		System.out.println("Enter your account number: ");
		String accountNumber = bufferedReader.readLine();
		
		 for(Account account: accountList) {
			 
			 if(account.getAccountNumber().equals(accountNumber)) {
				 System.out.println("Enter the amount to withdraw");
				 double amount = Double.parseDouble(bufferedReader.readLine());
				 
				 if(account.getBalance()>=amount) {
					 account.setBalance(account.getBalance()-amount);
					 System.out.println("Withdraw successfull");
				 }else {
					 System.out.println("Insufficient amount!!!");
				 }
				 
			 }else {
				 System.out.println("Please enter correct account number");
			 }
		 }
	}
	
	public void deposite(List<Account> accountList) throws IOException {
		System.out.println("Enter your account number: ");
		String accountNumber = bufferedReader.readLine();
		
		for(Account account:accountList) {
			
			if(account.getAccountNumber().equals(accountNumber)) {
				
				System.out.println("Enter amount to deposite: ");
				double amount = Double.parseDouble(bufferedReader.readLine());
				
			    account.setBalance(account.getBalance()+amount);
			    System.out.println(amount+" Deposited successfully!!");
			    
			}else {
				System.out.println("Please enter correct account number!!");
			}
		}
	}
	
	public void fundTransfer(List<Account> accountList) throws IOException {
		System.out.println("Enter your account number: ");
		String accountNumber = bufferedReader.readLine();
		
		for(Account account: accountList) {
			
			if(account.getAccountNumber().equals(accountNumber)) {
				
				System.out.println("Enter amount to transfer: ");
				double amount = Double.parseDouble(bufferedReader.readLine());
				
				if(account.getBalance()>=amount) {
					
					System.out.println("Enter the reciver account number:");
					String reciverAccount = bufferedReader.readLine();
					
					for(Account account2: accountList) {
						
						if(account2.getAccountNumber().equals(reciverAccount)) {
							account.setBalance(account.getBalance()-amount);
						   account2.setBalance(account2.getBalance()+amount);
						   System.out.println("Fund transfer successfull!!!");
						}
					}
					
				}else {
					System.out.println("Insufficient Balance!!!");
				}
				
			}else {
				System.out.println("Enter your correct account number!!");
			}
			
		}
		
	}
}
