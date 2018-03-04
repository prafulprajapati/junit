package com.junit.tutorial;

public class TransactionService {

	public Account withdrawAmount(Account account, double amount) throws InvalidInputException {
		if (amount < 0) {
			throw new InvalidInputException("Amount can not negative", "420");
		}
		if (account.getAmount() > amount) {
			account.setAmount(account.getAmount() - amount);
			return account;
		}
		throw new InvalidInputException("Insufficient Balance", "420");
	}

	public Account depositeAmount(Account account, double amount) throws InvalidInputException {
		if (amount < 0) {
			throw new InvalidInputException("Amount can not negative", "420");
		}
		account.setAmount(account.getAmount() + amount);
		return account;
	}

}
