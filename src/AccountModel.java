
public abstract class AccountModel implements AccountInterface{
	private static final int defaultAgency = 1;
	private final int sequential = 1;
	
	protected int agency;
	protected int number;
	protected double balance;
	protected Client client;
	
	public AccountModel(Client client) {
		super();
		this.agency = defaultAgency;
		this.number = sequential;
		this.client = client;
	}
	@Override
	public void withdraw(double value) {
		this.balance -= value;
		
	}
	@Override
	public void deposit(double value) {
		this.balance += value;
	}
	@Override
	public void transfer(double value, AccountInterface destiny) {
		this.withdraw(value);
		destiny.deposit(value);
	}
	
	public int getAgency() {
		return agency;
	}
	public int getNumber() {
		return number;
	}
	public double getBalance() {
		return balance;
	}
	
	protected void showInfos() {
		System.out.println(String.format("Bearer: %s", this.client.getName()));
		System.out.println(String.format("Agency: %d", this.agency));
		System.out.println(String.format("Number: %d", this.number));
		System.out.println(String.format("Balance: %.2f", this.balance));
	}
	
	
}
