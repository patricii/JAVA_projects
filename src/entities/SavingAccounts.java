package entities;

public class SavingAccounts extends Account {
	private Double InterestRate;
	
	public SavingAccounts() {
		super();
	}

	public SavingAccounts(String name, int numCode, double plusamount, Double interestRate) {
		super(name, numCode, plusamount);
		InterestRate = interestRate;
	}

	public Double getInterestRate() {
		return InterestRate;
	}

	public void setInterestRate(Double interestRate) {
		InterestRate = interestRate;
	}
	public void UpdateBalance() {
		amount += InterestRate;
	}
	@Override
	public final void withdraw(double amount) {
		this.amount -= amount;
	}

}
