import java.util.*;
public class ATM {
	HashMap<String, Double> accounts;
	
	public ATM() {
		accounts = new HashMap<String,Double>();
	}
	
	public void deposit(String bankID, Double amount) {
		if(accounts.containsKey(bankID)) {
			accounts.put(bankID, accounts.get(bankID) + amount);
		}
		else {
			accounts.put(bankID, amount);
		}
	}
	
	public void withdraw (String bankID, Double amount) {
		if(accounts.containsKey(bankID)) {
			if (accounts.get(bankID) < amount) {
				System.out.println ("You cannot withdraw $" + amount + " from your $" + accounts.get(bankID) + " balance.");
				return;
			}
			else
				accounts.put(bankID, accounts.get(bankID) - amount);
		}
	}
	public String checkBalance (String bankID) {
		if (!accounts.containsKey(bankID)) {
			return "bruh.";
		}
		else
			return "Bruh this account " + bankID + " has " + accounts.get(bankID) + " in it.";
	}
}	