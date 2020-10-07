package ca.amazon.search.pages;

import net.serenitybdd.core.pages.PageObject;
import org.junit.Assert;
import org.junit.Test;
import net.thucydides.core.annotations.DefaultUrl;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

@DefaultUrl ("https://www.amazon.ca/")

public class amazonSearchPage extends PageObject {
	public void maskSearch() {
		$ ("//input[@id='twotabsearchtextbox']").type("Blue Masks");
	}
	public void searchButton() {
		$ ("//div[@class='nav-search-submit nav-sprite']//input[@class='nav-input']").click();
	}
	

	public void lowPrice() {
		$("//SPAN[@class='a-dropdown-prompt'][text()='Featured']").click();
		
		$("//A[@id='s-result-sort-select_1']").click();
		
		String texto = $("//span[contains(text(),'Bluebluesky Red, White, Blue Microfiber Polyester ')]").getText();
		String actuaal = "Bluebluesky Red, White, Blue Microfiber Polyester Face Mask Mouth Cover Bandana Neck Gaiter Neckerchief Cool Lightweight";
		System.out.println(texto);
		Assert.assertEquals(texto, actuaal);
	
	}
		public void maskResult() {}
}
