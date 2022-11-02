
public class SavingsAccount extends AccountModel{
	
	public SavingsAccount (Client client) {
		super(client);
	}
	@Override
	public void showExtract() {
		System.out.println("savings account statement");
		super.showInfos();
	}
}
