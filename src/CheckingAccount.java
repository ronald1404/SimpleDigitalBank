public class CheckingAccount extends AccountModel {
	public CheckingAccount(Client client) {
		super(client);
	}

	@Override
	public void showExtract() {
		System.out.println("current account statement");
		super.showInfos();
	}
}
