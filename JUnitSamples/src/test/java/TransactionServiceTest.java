import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;

import com.junit.tutorial.Account;
import com.junit.tutorial.Constant;
import com.junit.tutorial.InvalidInputException;
import com.junit.tutorial.TransactionService;


@RunWith(BlockJUnit4ClassRunner.class)
public class TransactionServiceTest {

	
	private TransactionService transactionService = new TransactionService();
	Account account;
	
	@Before
	public void setup() {
		// Create input parameters
		account = new Account();
		account.setAccountHolderName("praful");
		account.setAccountNumber("213412");
		account.setAmount(550.00);
		account.setAccountType(Constant.DEBIT);
	}
	
	@Test
	public void  withdrawAmountTest() throws InvalidInputException {
		double amount = 100;
		// Target method call
		Account result = transactionService.withdrawAmount(account, amount);
		// Assert statements
		Assert.assertEquals(450.00, result.getAmount(), 0.00);
	}

	@Test(expected = InvalidInputException.class)
	public void  withdrawNegativeAmountTest() throws InvalidInputException {
		double amount = -100;
		// Target method call
		transactionService.withdrawAmount(account, amount);
	}
	
	@Test(expected = InvalidInputException.class)
	public void  withdrawMoreAmountTest() throws InvalidInputException {
		double amount = 1100;
		// Target method call
		transactionService.withdrawAmount(account, amount);
		
	}
	
	@Test(expected = InvalidInputException.class)
	public void  dipositeNegativeAmountTest() throws InvalidInputException {
		double amount = -100;
		// Target method call
		transactionService.depositeAmount(account, amount);
	}
	
	@Test
	public void  dipositeAmountTest() throws InvalidInputException {
		double amount = 100;
		// Target method call
		Account result = transactionService.depositeAmount(account, amount);
		// Assert statements
		Assert.assertEquals(650.00, result.getAmount(), 0.00);
	}
}
