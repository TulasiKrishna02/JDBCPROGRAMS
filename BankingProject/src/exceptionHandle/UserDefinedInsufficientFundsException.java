package exceptionHandle;

public class UserDefinedInsufficientFundsException extends Exception {
	private double amount;

	public UserDefinedInsufficientFundsException(double amount) {
		super(""+amount); // super is required to set this message till Throwable class so that it can print in printStackTrace();
		this.amount = amount;
	}

	public double getAmount() {
		return amount;
	}
}

/*
 * Note : ## Make Exception as RuntimeException(extend RuntimeException instead of
 * Exception) then it will behave as Unchecked Exception 
 * ## extend Exception/Throwable class then it will behave as Checked Exception
 */