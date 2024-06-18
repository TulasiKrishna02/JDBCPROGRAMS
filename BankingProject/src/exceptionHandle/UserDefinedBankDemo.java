package exceptionHandle;

public class UserDefinedBankDemo {
	public static void main(String[] args) {
		UserDefinedCheckingAccount c = new UserDefinedCheckingAccount(101);
		System.out.println("Depositing $500...");
		c.deposit(500.00);
		try {
			System.out.println("Withdrawing $100...");
			c.withdraw(100.00);
			System.out.println("Withdrawing $600...");
			c.withdraw(600.00);
		} catch (UserDefinedInsufficientFundsException e) {
			System.out.println("Sorry, but you are short $" + e.getAmount());
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}
}