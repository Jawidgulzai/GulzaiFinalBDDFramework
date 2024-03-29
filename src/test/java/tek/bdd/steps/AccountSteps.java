package tek.bdd.steps;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import tek.bdd.pages.AccountPageObject;
import tek.bdd.utility.SeleniumUtilities;

import java.util.List;

public class AccountSteps extends SeleniumUtilities {

    @Then("validate table row count to be {int}")
    public void validateTableRowCountToBe(int expectedRows) {
        List<WebElement> tableRows = getElements(AccountPageObject.TABLE_ROW_ELEMENT);
        Assert.assertEquals("Validate table rows ", tableRows.size(), expectedRows);
    }

    @When("change items par page to {string}")
    public void changeItemsParPageTo(String itemPerPage) {
        selectFromDropDown(AccountPageObject.ITEM_PER_PAGE_SELECT, "Show " + itemPerPage);
    }
}
