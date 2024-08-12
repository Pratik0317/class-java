package bank_prob;

import java.io.File;
import java.io.FileNotFoundException;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AccountIO {
	
	public List<Account> readAccount(){
		
		List<Account> accountList = new ArrayList<Account>();
		String filePath = "C:/Users/hp/Desktop/accountInfo.txt";
		File file = Paths.get(filePath).toFile();
		Scanner scanner;
		try {
			scanner = new Scanner(file);
			while(scanner.hasNext()) {
				String lineData = scanner.nextLine();
				String[] splitedData = lineData.split(",");
				Account account = new Account();
				account.setAccountNumber(splitedData[0]);
				account.setBalance(Double.parseDouble(splitedData[1]));
				account.setAccountHolderName(splitedData[2]);
				accountList.add(account);
			}
			scanner.close();
			return accountList;
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			return new ArrayList<Account>();
		}
		
	}
	
	public void displayAccounts(List<Account> accountList){
		
		for(Account account: accountList) {
			System.out.println("Name: "+account.getAccountHolderName()+" Account Number: "
					+account.getAccountNumber()+" Balance: "+account.getBalance());
		}
	}
}
