package ca.amazon.search.steps;
import ca.amazon.search.actions.amazonSearchActions;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

	public class amazonSearchSteps {	
		@Steps
		amazonSearchActions searchActions;
	
@Given("I want to go Amazon Canada homepage")
public void iGoToHomepage() throws Throwable{
    searchActions.openHomepage();
}

@When("I will type Blue masks in Search box")
public void iTypedBlueMasksInsearchbox() throws Throwable {
   searchActions.searchMasks();
}
@Then("I will click on Search button")
public void iClickedOnSearchButton() throws Throwable {
    searchActions.search();
}

@Then("I will sort the result by price low to high")
public void iSortedByPriceLowToHigh() throws Throwable {
  searchActions.lowHigh();
}

@And("I will click on blue mask product")
public void iClickedOnBlueMaskProduct() throws Throwable {
searchActions.blueMask();
}
}
