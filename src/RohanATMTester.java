public class RohanATMTester {

	public static void main(String[] args) {
		
		ATM account = new ATM ();
		account.deposit("Winfrey", 25159684372.43);
		account.deposit("Bezos", 193495330293.43);
		account.deposit("Bezos", 20394353.35);
		account.withdraw("Bezos", 3593293.66);
		account.deposit("MrTheiss",64033.55);
		account.withdraw("MrTheiss", 443964.46);
		account.checkBalance("Bezos");
		account.checkBalance("Winfrey");
		account.checkBalance("YoMama");
		account.checkBalance("MrTheiss");
		
	}

}
