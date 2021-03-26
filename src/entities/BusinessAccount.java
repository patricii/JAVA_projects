package entities;

public class BusinessAccount extends Account {

	private Double loanLimit;

	public BusinessAccount() {
		super();

	}

	public BusinessAccount(String name, int numCode, double plusamount, Double loanLimit) {
		super(name, numCode, plusamount);
		this.loanLimit = loanLimit;
	}

	public Double getLoanLimit() {
		return loanLimit;
	}

	public void setLoanLimit(Double loanLimit) {
		this.loanLimit = loanLimit;
	}

	public void loanAmount(double loanAmount) {
		if (amount <= loanAmount) {
			deposit(loanAmount);
		}
	}

}
