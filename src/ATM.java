import java.util.*;
public class ATM {
	HashMap<String, Double> accounts = new HashMap<String, Double>();
	
	public void deposit(String bankID, Double amount) {
		if(accounts.containsKey(bankID)) {
			accounts.put(bankID, accounts.get(bankID) + amount);
		}
		else {
			accounts.put(bankID, amount);
		}
	}
}	
