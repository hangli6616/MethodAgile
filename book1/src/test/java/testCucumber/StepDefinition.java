package testCucumber;

import static org.junit.Assert.assertEquals;
import Agile_TP3.book1.Librairie;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinition {
    private Librairie librairie;
    private String name;
    private double price;
    
	@Given("a {string}")
	public void a(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    this.librairie = new Librairie(string);
	    //throw new io.cucumber.java.PendingException();
	}

	@When("customer ask for the price")
	public void customer_ask_for_the_price() {
	    // Write code here that turns the phrase above into concrete actions
	    this.name = this.librairie.getBook().getName();
	    this.price = this.librairie.getBook().getPrice().getPriceValue();
	    //throw new io.cucumber.java.PendingException();
	}
	@Then("give {string}")
	public void give(String string) {
		assertEquals("Le Petit Prince",this.name);
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
	}
	@Then("give {double}")
	public void give(Double double1) {
		assertEquals(7.9,this.price,0.001);
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
	}
}
