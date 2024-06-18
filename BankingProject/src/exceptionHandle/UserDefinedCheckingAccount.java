package exceptionHandle;
public class UserDefinedCheckingAccount {
	private double balance;
	private int number;

	public UserDefinedCheckingAccount(int number) {
		this.number = number;
	}
	
	public void deposit(double amount) {
		balance += amount;
	}
	
	public void withdraw(double amount) throws UserDefinedInsufficientFundsException {
		if (amount <= balance) {
			balance -= amount;
		} else {
			double needs = amount - balance;
			throw new UserDefinedInsufficientFundsException(needs);
		}
	}
	public double getBalance() {
		return balance;
	}
	public int getNumber() {
		return number;
	}
}