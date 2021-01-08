package gradle.cucumber;
	
import org.steinko.bddwithcucumber.ApiStub;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class ChashWithDrawlSteps {
	
	@Given("I have deposit {int} NOK in my account")
	public void i_have_deposit_nok_in_my_account(Integer amount) {
		ApiStub.deposit(amount);
	    
	}

	@When("I withdraw {int} NOK")
	public void i_withdraw_nok(Integer amount) {
	    ApiStub.withdraw(amount);
	}

	@Then("{int} NOK should be dispensed")
	public void nok_should_be_dispensed(Integer expected) {
		 int actual = ApiStub.dispenced();
		 assertEquals(expected,actual);
	}

	@Then("balance of the account is {int} NOK")
	public void balance_of_the_account_is_nok(Integer expected) {
	    Integer actual = ApiStub.balance();
	    assertEquals(expected,actual);
	}


}
