package test.Selenide.steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import test.Selenide.pages.General;
import test.Selenide.pages.Main;

public class MainSteps {
    Main main = new Main();
    General general = new General();

    @Given("I am on main page")
    public void iAmOnMainPage() {
        main.open();
    }

    @When("I click {string} tab")
    public void iClickTab(String tabName) {
        general.openTab(tabName);
    }

}
