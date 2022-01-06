
package stepdefenitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import net.thucydides.core.annotations.Steps;
import pageobjectlibrary.LoginPage;

public class LoginPageStepDef {
    @Steps
    LoginPage loginpage;

    @Given("^Open Browser and Navigate to URL$")
    public void openBrowserAndNavigateToURL() {
      loginpage.open_and_navigate();
    }

    @Then("^Enter username \"([^\"]*)\"$")
    public void enterUsername(String arg0) throws Throwable {
        loginpage.Enter_Username(arg0);
    }

    @Then("^Enter Password \"([^\"]*)\"$")
    public void enterPassword(String arg0) throws Throwable {
        loginpage.Enter_Password(arg0);
    }

    @And("^Click Login Button$")
    public void clickLoginButton() {
        loginpage.Enter_Button();
    }
}
