package bank_prob;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;

public class AccountMain {

	public static void main(String[] args) throws IOException {
		
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
	
		AccountIO accountIO = new AccountIO();
		
		AccountFunction accountFunction = new AccountFunction();
		
		List<Account> accountList = accountIO.readAccount();
		
		while(true) {
			System.out.println("-------Bank Menu-----");
			System.out.println("1.View Account Details.");
			System.out.println("2.Deposite Amount");
			System.out.println("3.Withdraw Amount");
			System.out.println("4.Fund transfer");
			System.out.println("5.Exit");
			System.out.println("Enter your choice.");
			
			int choice = Integer.parseInt(bufferedReader.readLine());
			
			switch (choice) {
			case 1:
				accountIO.displayAccounts(accountList);
				break;
			case 2: 
				accountFunction.deposite(accountList);
				break;
			case 3:
				accountFunction.withDraw(accountList);
				break;
			case 4:
				accountFunction.fundTransfer(accountList);
				break;
			case 5: 
				System.out.println("-------Thank you for your participation-------");
				System.exit(0);
				break;

			default:
				System.out.println("Please enter correct choice");
				break;
			}
		}
	
	}
}
