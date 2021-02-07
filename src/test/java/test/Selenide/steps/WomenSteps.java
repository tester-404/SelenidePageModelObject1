package test.Selenide.steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import test.Selenide.pages.Women;

public class WomenSteps {
    Women women = new Women();

    @Then("I am on women page")
    public void iAmOnWomenPage() {
        women.iAmOnWomenPage();
    }

    @Given("I open women page")
    public void iOpenWomenPage() {
        women.open();
    }

    @Then("I see two subcategories")
    public void iSeeTwoSubcategories() {
        women.subCategories();
    }
}

