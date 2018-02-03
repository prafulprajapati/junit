package com.junit.tutorial;
public class AccountUtils {

	private AccountUtils() {
	}

	public static double calculateInterestAmount(Account account) throws InvalidAccountTypeException {
		if (account.getAccountType() == Constant.SAVING) {
			return 0.04 * account.getAmount();
		}

		if (account.getAccountType() == Constant.CURRENT) {
			return 0.0;
		}

		if (account.getAccountType() == Constant.PREFERED) {
			return 0.05 * account.getAmount();
		}

		throw new InvalidAccountTypeException("AccountType is not valid, type = " + account.getAccountType(), "123");
	}
}
