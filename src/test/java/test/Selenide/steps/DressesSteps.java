package test.Selenide.steps;

import io.cucumber.java.en.Then;
import test.Selenide.pages.Dresses;

public class DressesSteps {
    Dresses dresses = new Dresses();

    @Then("I am on dresses page")
    public void iAmOnDressesPage() {
        dresses.iAmOnDressesPage();
    }
}
