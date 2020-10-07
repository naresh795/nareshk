package ca.amazon.search.runners;

import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;


@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features= {"/src/test/resources/features/math/amazonSearch.feature"},glue = {"ca.amazon.search.steps"})
public class amazonSearchTest {}