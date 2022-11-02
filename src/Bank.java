import java.util.List;

public class Bank {
	private String name;
	private List<AccountModel> contas;
	public List<AccountModel> getContas() {
		return contas;
	}
	
	public void setContas(List<AccountModel> contas) {
		this.contas = contas;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
}
