package com.junit.tutorial;

public class PaymentUtil {

	private PaymentUtil() {
	}

	public static double calcualteBonus(double ctc, int jobLevel) throws InvalidInputException {
		if (jobLevel >= 9) {
			return 0.05 * ctc;
		}
		if (jobLevel == 8) {
			return 0.07 * ctc;
		}
		if (jobLevel > 0 && jobLevel <= 7) {
			return 0.1 * ctc;
		}
		throw new InvalidInputException("Invalid jobLevel", "123");
	}
}
