package ca.amazon.search.actions;

import ca.amazon.search.pages.*;
import net.thucydides.core.annotations.Step;


public class amazonSearchActions {
	amazonSearchPage homepage;
	
@Step
public void openHomepage() {
	homepage.open();
}
@Step
public void searchMasks() {
	homepage.maskSearch();
}
@Step
public void search() {
	homepage.searchButton();
}
@Step
public void lowHigh() {
	homepage.lowPrice();	
}

@Step
public void blueMask() {
	homepage.maskResult();	
}
}