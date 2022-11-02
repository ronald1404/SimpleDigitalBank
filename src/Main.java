
public class Main {

	public static void main(String[] args) {
		Client john = new Client("John Constantine");
		
		CheckingAccount CAccount = new CheckingAccount(john);
		SavingsAccount SAccount = new SavingsAccount(john);
		
		CAccount.deposit(100);
		CAccount.transfer(50, SAccount);
		
		CAccount.showExtract();
		SAccount.showExtract();
		
		
		
	}

}
